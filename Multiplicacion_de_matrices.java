import java.util.Scanner; // Miguel Angel Agustin Zuñiga Romo

class Multiplicacion_de_matrices {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar las dimensiones de la primera matriz
        System.out.println("=== MULTIPLICACIÓN DE MATRICES ===");
        System.out.println("\n--- Primera Matriz ---");
        System.out.print("Ingrese el número de filas de la primera matriz: ");
        int filas1 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz: ");
        int columnas1 = scanner.nextInt();
        
        // Solicitar las dimensiones de la segunda matriz
        System.out.println("\n--- Segunda Matriz ---");
        System.out.print("Ingrese el número de filas de la segunda matriz: ");
        int filas2 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        int columnas2 = scanner.nextInt();
        
        // Verificar si las matrices se pueden multiplicar
        if (columnas1 != filas2) {
            System.out.println("\nERROR: No se pueden multiplicar estas matrices.");
            System.out.println("Las columnas de la primera matriz (" + columnas1 + ") deben ser iguales a las filas de la segunda matriz (" + filas2 + ").");
            scanner.close();
            return;
        }
        
        System.out.println("\n¡Las matrices SÍ se pueden multiplicar!");
        System.out.println("Matriz resultante será de " + filas1 + " x " + columnas2);
        
        // Declarar las matrices
        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        int[][] resultado = new int[filas1][columnas2];
        
        // Llenar la primera matriz
        System.out.println("\n=== LLENANDO LA PRIMERA MATRIZ ===");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "] de la primera matriz: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        
        // Llenar la segunda matriz
        System.out.println("\n=== LLENANDO LA SEGUNDA MATRIZ ===");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "] de la segunda matriz: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        
        // Realizar la multiplicación usando ciclos for anidados
        System.out.println("\n=== REALIZANDO LA MULTIPLICACIÓN ===");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                resultado[i][j] = 0; // Inicializar en 0
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        
        // Mostrar la primera matriz
        System.out.println("\n=== PRIMERA MATRIZ ===");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Mostrar la segunda matriz
        System.out.println("\n=== SEGUNDA MATRIZ ===");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Mostrar la matriz resultado
        System.out.println("\n=== MATRIZ RESULTADO (Primera × Segunda) ===");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Cerrar el scanner
        scanner.close();
        System.out.println("\n¡Multiplicación completada exitosamente!");
    }
}