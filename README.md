# Llenado de Matrices de Cualquier Tamaño

## Descripción

Este repositorio contiene programas en Java para operaciones con matrices de cualquier dimensión especificada por el usuario. Incluye dos programas principales:

1. **Llenado de Matrices**: Permite crear y llenar matrices de cualquier dimensión, solicitando al usuario las dimensiones y valores elemento por elemento.
2. **Multiplicación de Matrices**: Permite realizar la multiplicación de dos matrices con validación de compatibilidad dimensional.

## Funcionalidad

### Llenado de Matrices (`Llenado_De_Matrices.java`)

- ✅ **Entrada dinámica de dimensiones**: Permite al usuario especificar el número de filas (n) y columnas (m) de la matriz
- ✅ **Llenado interactivo**: Solicita al usuario ingresar cada valor de la matriz indicando la posición específica [fila][columna]
- ✅ **Visualización organizada**: Muestra la matriz resultante en formato tabular con separación por tabulaciones
- ✅ **Gestión de memoria**: Cierra correctamente el objeto Scanner para evitar memory leaks

### Multiplicación de Matrices (`Multiplicacion_de_matrices.java`)

- ✅ **Validación de compatibilidad**: Verifica que las matrices puedan multiplicarse (columnas de la primera = filas de la segunda)
- ✅ **Entrada de dos matrices**: Permite ingresar las dimensiones y valores de dos matrices independientes
- ✅ **Algoritmo de multiplicación**: Implementa la multiplicación de matrices usando ciclos for anidados
- ✅ **Visualización completa**: Muestra las matrices originales y el resultado de la multiplicación
- ✅ **Manejo de errores**: Informa al usuario si las matrices no son compatibles para multiplicación

## Requisitos del Sistema

- **Java Development Kit (JDK)** versión 8 o superior
- **Sistema operativo**: Windows, macOS, o Linux
- **Terminal o línea de comandos** para compilar y ejecutar el programa

## Instalación y Compilación

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/Asassintin/Llenado-de-matrices-de-cualquier-tamano.git
   cd Llenado-de-matrices-de-cualquier-tamano
   ```

2. **Compila los programas**:
   ```bash
   javac Llenado_De_Matrices.java
   javac Multiplicacion_de_matrices.java
   ```

3. **Ejecuta el programa deseado**:
   
   Para llenado de matrices:
   ```bash
   java Llenado_de_matrices
   ```
   
   Para multiplicación de matrices:
   ```bash
   java Multiplicacion_de_matrices
   ```

## Instrucciones de Uso

### Para Llenado de Matrices

1. **Inicia el programa** ejecutando `java Llenado_de_matrices`
2. **Ingresa las dimensiones**:
   - El programa te pedirá el número de filas (n)
   - Luego te pedirá el número de columnas (m)
3. **Llena la matriz**:
   - Para cada posición [i][j], ingresa el valor deseado
   - El programa te guiará posición por posición
4. **Visualiza el resultado**:
   - La matriz completa se mostrará en formato tabular

### Para Multiplicación de Matrices

1. **Inicia el programa** ejecutando `java Multiplicacion_de_matrices`
2. **Ingresa las dimensiones de la primera matriz**:
   - El programa te pedirá las filas y columnas de la primera matriz
3. **Ingresa las dimensiones de la segunda matriz**:
   - El programa te pedirá las filas y columnas de la segunda matriz
   - Se validará automáticamente si las matrices son compatibles
4. **Llena ambas matrices**:
   - Ingresa los valores para la primera matriz
   - Luego ingresa los valores para la segunda matriz
5. **Visualiza el resultado**:
   - Se mostrarán ambas matrices originales y la matriz resultado

## Ejemplo de Ejecución

### Llenado de Matrices

```
Ingrese el número de filas (n): 2
Ingrese el número de columnas (m): 3

Ingrese los valores de la matriz:
Ingrese el valor para la posición [0][0]: 1
Ingrese el valor para la posición [0][1]: 2
Ingrese el valor para la posición [0][2]: 3
Ingrese el valor para la posición [1][0]: 4
Ingrese el valor para la posición [1][1]: 5
Ingrese el valor para la posición [1][2]: 6

La matriz ingresada es:
1	2	3	
4	5	6	
```

### Multiplicación de Matrices

```
=== MULTIPLICACIÓN DE MATRICES ===

--- Primera Matriz ---
Ingrese el número de filas de la primera matriz: 2
Ingrese el número de columnas de la primera matriz: 3

--- Segunda Matriz ---
Ingrese el número de filas de la segunda matriz: 3
Ingrese el número de columnas de la segunda matriz: 2

¡Las matrices SÍ se pueden multiplicar!
Matriz resultante será de 2 x 2

=== LLENANDO LA PRIMERA MATRIZ ===
Ingrese el valor para la posición [0][0] de la primera matriz: 1
Ingrese el valor para la posición [0][1] de la primera matriz: 2
Ingrese el valor para la posición [0][2] de la primera matriz: 3
Ingrese el valor para la posición [1][0] de la primera matriz: 4
Ingrese el valor para la posición [1][1] de la primera matriz: 5
Ingrese el valor para la posición [1][2] de la primera matriz: 6

=== LLENANDO LA SEGUNDA MATRIZ ===
Ingrese el valor para la posición [0][0] de la segunda matriz: 1
Ingrese el valor para la posición [0][1] de la segunda matriz: 2
Ingrese el valor para la posición [1][0] de la segunda matriz: 3
Ingrese el valor para la posición [1][1] de la segunda matriz: 4
Ingrese el valor para la posición [2][0] de la segunda matriz: 5
Ingrese el valor para la posición [2][1] de la segunda matriz: 6

=== PRIMERA MATRIZ ===
1	2	3	
4	5	6	

=== SEGUNDA MATRIZ ===
1	2	
3	4	
5	6	

=== MATRIZ RESULTADO (Primera × Segunda) ===
22	28	
49	64	

¡Multiplicación completada exitosamente!
```

## Estructura del Proyecto

```
Llenado-de-matrices-de-cualquier-tamano/
├── Llenado_De_Matrices.java       # Programa para llenado de matrices
├── Multiplicacion_de_matrices.java # Programa para multiplicación de matrices
└── README.md                       # Este archivo de documentación
```

## Características Técnicas

- **Lenguaje**: Java
- **Paradigma**: Programación imperativa/procedural
- **Entrada**: Scanner para lectura desde consola
- **Tipo de datos**: Matrices de enteros (int[][])
- **Complejidad**: O(n*m) para el llenado y visualización

## Posibles Mejoras

- 🔄 Validación de entrada para evitar valores no numéricos
- 🔄 Soporte para diferentes tipos de datos (double, String, etc.)
- 🔄 Opciones de formato de salida (CSV, JSON, etc.)
- ✅ **Funciones adicionales**: Suma y multiplicación de matrices *(multiplicación ya implementada)*
- 🔄 Interfaz gráfica de usuario
- 🔄 Operaciones adicionales (determinante, matriz inversa, transpuesta)
- 🔄 Lectura de matrices desde archivos

## Autor

**Miguel Angel Agustin Zuñiga Romo**

## Licencia

Este proyecto es de código abierto y está disponible bajo los términos que el autor especifique.

---

*Este README proporciona toda la información necesaria para entender, compilar y utilizar ambos programas de operaciones con matrices.*