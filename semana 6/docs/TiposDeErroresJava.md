# Errores Típicos en Java

En Java, los errores pueden clasificarse en varios tipos, cada uno con sus propias características y causas. Aquí te presento los errores más comunes:

## Errores de Sintaxis (Syntax Errors)
- **Descripción**: Ocurren cuando el código no sigue las reglas del lenguaje Java.
- **Ejemplo**: Faltan puntos y coma, llaves no cerradas, palabras clave mal escritas.

## Errores de Tiempo de Ejecución (Runtime Errors)
- **Descripción**: Se producen mientras el programa está en ejecución.
- **Ejemplo**: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

## Errores de Lógica (Logical Errors)
- **Descripción**: El programa se ejecuta sin errores de sintaxis o tiempo de ejecución, pero no produce el resultado esperado.
- **Ejemplo**: Algoritmos incorrectos, condiciones mal planteadas.

## Errores de Tipo (Type Errors)
- **Descripción**: Ocurren cuando se intenta realizar una operación con un tipo de dato incompatible.
- **Ejemplo**: Asignar un valor `String` a una variable `int`.

## Errores de Nombre (Name Errors)
- **Descripción**: Se producen cuando se intenta usar una variable o método que no ha sido definido.
- **Ejemplo**: Llamar a un método que no existe.

## Errores de Semántica (Semantic Errors)
- **Descripción**: El código tiene una sintaxis correcta pero no hace lo que el programador espera que haga.
- **Ejemplo**: Usar un operador incorrecto (`+` en lugar de `*`).

## Errores de Compilación (Compilation Errors)
- **Descripción**: Se detectan durante la compilación del código fuente.
- **Ejemplo**: Errores de sintaxis o tipos que impiden la generación del bytecode.

## Errores de Enlace (Linkage Errors)
- **Descripción**: Ocurren cuando el compilador no puede enlazar correctamente diferentes partes del código.
- **Ejemplo**: Métodos o variables definidos en múltiples lugares.

## Excepciones No Controladas (Unchecked Exceptions)
- **Descripción**: Excepciones que no se verifican en tiempo de compilación.
- **Ejemplo**: `ArithmeticException`, `ClassCastException`.

## Excepciones Controladas (Checked Exceptions)
- **Descripción**: Excepciones que deben ser manejadas o declaradas en el método.
- **Ejemplo**: `IOException`, `SQLException`.

## Errores de Concurrencia (Concurrency Errors)
- **Descripción**: Problemas relacionados con la ejecución de múltiples hilos.
- **Ejemplo**: Condiciones de carrera, deadlocks.

## Errores de Manejo de Recursos (Resource Management Errors)
- **Descripción**: Problemas relacionados con la apertura y cierre de recursos.
- **Ejemplo**: No cerrar un `FileInputStream` o `Database Connection`.

## Errores de Serialización (Serialization Errors)
- **Descripción**: Problemas al convertir objetos en bytes o viceversa.
- **Ejemplo**: `NotSerializableException`.

## Errores de Dependencias (Dependency Errors)
- **Descripción**: Problemas relacionados con bibliotecas o dependencias externas.
- **Ejemplo**: `ClassNotFoundException`, `NoClassDefFoundError`.
