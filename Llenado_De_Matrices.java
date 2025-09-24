import java.util.Scanner; // Miguel Angel Agustin Zuñiga Romo

class Llenado_de_matrices {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el número de filas y columnas
        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Ingrese el número de columnas (m): ");
        int m = scanner.nextInt();
        
        // Declarar la matriz con las dimensiones dadas
        int[][] matriz = new int[n][m];
        
        // Llenar la matriz con valores del usuario
        System.out.println("\nIngrese los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Mostrar la matriz
        System.out.println("\nLa matriz ingresada es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
