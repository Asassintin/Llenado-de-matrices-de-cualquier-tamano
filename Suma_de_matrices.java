import java.util.Scanner; // Miguel Angel Agustin Zuñiga Romo

public class Suma_de_matrices {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir las dimensiones de la primera matriz
        System.out.println("=== MATRIZ A ===");
        System.out.print("Ingrese el número de filas de la matriz A: ");
        int filasA = scanner.nextInt();
        
        System.out.print("Ingrese el número de columnas de la matriz A: ");
        int columnasA = scanner.nextInt();
        
        // Pedir las dimensiones de la segunda matriz
        System.out.println("\n=== MATRIZ B ===");
        System.out.print("Ingrese el número de filas de la matriz B: ");
        int filasB = scanner.nextInt();
        
        System.out.print("Ingrese el número de columnas de la matriz B: ");
        int columnasB = scanner.nextInt();
        
        // Validar que las matrices tengan las mismas dimensiones
        if (filasA != filasB || columnasA != columnasB) {
            System.out.println("\nERROR: Las matrices deben tener las mismas dimensiones para poder sumarse.");
            System.out.println("Matriz A: " + filasA + "x" + columnasA);
            System.out.println("Matriz B: " + filasB + "x" + columnasB);
            scanner.close();
            return;
        }
        
        System.out.println("\n¡Perfecto! Ambas matrices tienen dimensiones " + filasA + "x" + columnasA);
        
        // Declarar las matrices
        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[filasB][columnasB];
        int[][] matrizC = new int[filasA][columnasA]; // Matriz resultado
        
        // Llenar la primera matriz (A)
        System.out.println("\nLlenando la Matriz A:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print("Ingrese el valor para A[" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        
        // Llenar la segunda matriz (B)
        System.out.println("\nLlenando la Matriz B:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print("Ingrese el valor para B[" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }
        
        // Realizar la suma de matrices: C = A + B
        System.out.println("\nRealizando la suma A + B = C...");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        // Mostrar las matrices
        System.out.println("\nMatriz A:");
        mostrarMatriz(matrizA, filasA, columnasA);
        
        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB, filasB, columnasB);
        
        System.out.println("\nMatriz C (A + B):");
        mostrarMatriz(matrizC, filasA, columnasA);
        
        // Cerrar el scanner
        scanner.close();
    }
    
    // Método auxiliar para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            System.out.print("[ ");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
                if (j < columnas - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");
        }
    }
}
