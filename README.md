# Llenado de Matrices de Cualquier Tamaño

## Descripción

Este repositorio contiene un programa en Java que permite crear y llenar matrices de cualquier dimensión especificada por el usuario. El programa solicita al usuario las dimensiones de la matriz (filas y columnas) y luego permite ingresar los valores elemento por elemento, finalmente mostrando la matriz completa en formato tabular.

## Funcionalidad

El programa `Llenado_De_Matrices.java` implementa las siguientes características:

- ✅ **Entrada dinámica de dimensiones**: Permite al usuario especificar el número de filas (n) y columnas (m) de la matriz
- ✅ **Llenado interactivo**: Solicita al usuario ingresar cada valor de la matriz indicando la posición específica [fila][columna]
- ✅ **Visualización organizada**: Muestra la matriz resultante en formato tabular con separación por tabulaciones
- ✅ **Gestión de memoria**: Cierra correctamente el objeto Scanner para evitar memory leaks

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

2. **Compila el programa**:
   ```bash
   javac Llenado_De_Matrices.java
   ```

3. **Ejecuta el programa**:
   ```bash
   java Llenado_de_matrices
   ```

## Instrucciones de Uso

1. **Inicia el programa** ejecutando el comando mencionado arriba
2. **Ingresa las dimensiones**:
   - El programa te pedirá el número de filas (n)
   - Luego te pedirá el número de columnas (m)
3. **Llena la matriz**:
   - Para cada posición [i][j], ingresa el valor deseado
   - El programa te guiará posición por posición
4. **Visualiza el resultado**:
   - La matriz completa se mostrará en formato tabular

## Ejemplo de Ejecución

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

## Estructura del Proyecto

```
Llenado-de-matrices-de-cualquier-tamano/
├── Llenado_De_Matrices.java    # Archivo principal con el código fuente
└── README.md                   # Este archivo de documentación
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
- 🔄 Funciones adicionales (suma, multiplicación de matrices)
- 🔄 Interfaz gráfica de usuario

## Autor

**Miguel Angel Agustin Zuñiga Romo**

## Licencia

Este proyecto es de código abierto y está disponible bajo los términos que el autor especifique.

---

*Este README proporciona toda la información necesaria para entender, compilar y utilizar el programa de llenado de matrices.*