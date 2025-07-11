# 🚀 Arreglos (Arrays) en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📋 Tabla de Contenidos

1. [¿Qué es un arreglo en Java?](#1-qué-es-un-arreglo-en-java)
   - [¿Por qué son importantes?](#11-por-qué-son-importantes)
   - [Analogía simple](#12-analogía-simple)
   - [¿Qué significa que sean estáticos?](#13-qué-significa-que-sean-estáticos)
   - [Reglas de los arrays en Java](#14-reglas-de-los-arrays-en-java)
2. [Sintaxis de un arreglo](#📐-sintaxis-de-un-arreglo-en-java)
   - [Declaración](#21-📝-declaración)
   - [Inicialización](#22-🏗️-inicialización)
   - [Acceso por índice](#23-🎯-acceso-por-índice)
   - [Propiedad .length](#24-📏-propiedad-length)
   - [Ejemplo completo con explicación línea por línea](#25-🧪-ejemplo-completo-explicado-línea-por-línea)
3. [Errores comunes al usar arreglos](#3-⚠️-errores-comunes-al-usar-arreglos)
4. [Buenas prácticas](#4-✅-buenas-prácticas)
5. [Malas prácticas](#5-❌-malas-prácticas)
6. [¿Qué pasa si necesito un arreglo dinámico?](#6-🔄-qué-pasa-si-necesito-un-arreglo-dinámico)
   - [¿Qué es una colección?](#61-📦-qué-es-una-colección)
   - [ArrayList vs Array: ¿Cuál usar?](#62-⚖️-array-vs-arraylist-cuál-usar)
7. [Comparativa visual entre estructuras](#7-📊-comparativa-visual-entre-estructuras)
8. [Glosario técnico](#9-📚-glosario-técnico)
9. [Preguntas frecuentes (FAQ)](#10-❓-preguntas-frecuentes-faq)

# 📜 Arreglos en Java

## 1. ¿Qué es un arreglo en Java?

Los arreglos o arrays son **estructuras de datos** que permiten **almacenar elementos** de manera contigua en la memoria.  
En Java, los arrays son **estáticos**, es decir, tienen un **tamaño fijo** que se establece en el momento de su creación y **no puede modificarse después**.  
Además, sólo pueden contener el **mismo tipo de dato**.

```java
// Declaración e inicialización de un array de enteros con tamaño 5
int[] numeros = new int[5];

// Asignar valores a los elementos del array
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
numeros[3] = 40;
numeros[4] = 50;

// Ver la longitud del array
System.out.println(numeros.length);
```

En este ejemplo:

- `numeros` es un array de enteros con un tamaño fijo de 5.
- Cada elemento se accede mediante un **índice**, que **empieza desde 0**.
- La propiedad `length` permite saber la **longitud total del array**.

---

## 1.1 ¿Por qué son importantes?

Los arreglos son el **fundamento de muchas estructuras de datos más complejas** y permiten:

- Almacenar múltiples elementos bajo una sola variable.
- Acceder rápidamente a cualquier posición (índice).
- Iterar datos de forma ordenada.

> 🧠 Dominar los arrays te da la base para trabajar con colecciones, matrices, listas, pilas, colas y estructuras más avanzadas.

---

## 1.2 🧠 Analogía simple

> Imagina una **bandeja de cubetas de hielo** 🧊:
>
> - Cada cubeta es una posición (índice).
> - Solo puedes poner **agua** (un mismo tipo de dato).
> - No puedes cambiar el número de cubetas después de comprar la bandeja (tamaño fijo).
> - Puedes acceder a cada cubeta por su posición (`cubeta[0]`, `cubeta[1]`, etc.).

---

## 1.3 ¿Qué significa que sean estáticos?

- El tamaño de un array **no puede cambiar** después de ser declarado.
- Si creas un array de tamaño 10, tendrás 10 espacios. Ni uno más, ni uno menos.
- Para cambiar su tamaño, necesitas **crear un nuevo array** y copiar los datos manualmente.

> 📌 **Ejemplo de limitación:**

```java
int[] datos = new int[3];
datos[3] = 100; // ❌ Error en tiempo de ejecución: índice fuera de rango
```

> ⚠️ Error típico: `ArrayIndexOutOfBoundsException`.

---

## 1.4 📏 Reglas de los arrays en Java

| Regla                                                      | Descripción                                   |
| ---------------------------------------------------------- | --------------------------------------------- |
| ✅ Todos los elementos deben ser del mismo tipo            | No se puede mezclar `int` con `String`        |
| ✅ El índice comienza en 0                                 | El primer elemento está en la posición 0      |
| ✅ El tamaño es fijo                                       | No se puede modificar después de su creación  |
| ✅ Puede contener tipos primitivos o referencias a objetos | Ej. `int[]`, `String[]`, `Persona[]`          |
| ⚠️ Los valores se inicializan automáticamente              | `int = 0`, `boolean = false`, `Object = null` |

---

### 💬 ¿Y si quiero que sea dinámico?

Los arrays tradicionales pueden ser limitantes en situaciones donde se necesita una estructura de datos **flexible o cambiante**. En esos casos, se recomienda utilizar colecciones como:

```java
import java.util.ArrayList;

ArrayList<Integer> lista = new ArrayList<>();
lista.add(10);
lista.add(20);
System.out.println(lista.get(1)); // 20
```

> 🧪 Estas colecciones permiten agregar y eliminar elementos sin preocuparse por el tamaño fijo.

# 📐 Sintaxis de un Arreglo en Java

Aprender la sintaxis de un arreglo en Java es fundamental para poder declarar, inicializar y manipular múltiples valores de manera estructurada y eficiente.

---

## 2.1 📝 Declaración

La declaración de un array consiste en **decirle a Java** qué tipo de elementos contendrá el array y cómo se llamará.

### 🔤 Sintaxis general:

```java
tipo[] nombreDelArray;
```

### 🧩 Componentes explicados:

| Parte            | Significado                                                           |
| ---------------- | --------------------------------------------------------------------- |
| `tipo`           | Tipo de dato que contendrá el array (`int`, `String`, `double`, etc.) |
| `[]`             | Indica que es un arreglo (estructura de datos secuencial)             |
| `nombreDelArray` | Nombre (identificador) que le das al array                            |

### 🧪 Ejemplo:

```java
int[] edades;
String[] nombres;
```

> 📌 Aquí no se reserva aún memoria; solo se declara el nombre del array y el tipo de dato que contendrá.

---

## 2.2 🏗️ Inicialización

La inicialización permite **crear el array en memoria** y asignar su tamaño o sus valores.

### 🔤 Sintaxis para inicializar con tamaño fijo:

```java
tipo[] nombre = new tipo[tamaño];
```

### Ejemplo:

```java
int[] numeros = new int[5];
```

Esto crea un array de enteros llamado `numeros` con 5 espacios. Todos los valores por defecto serán `0`.

### 🔤 Inicialización con valores directamente:

```java
tipo[] nombre = {valor1, valor2, valor3};
```

### Ejemplo:

```java
String[] dias = {"Lunes", "Martes", "Miércoles"};
```

---

## 2.3 🎯 Acceso por índice

Los arrays utilizan **índices numéricos** para acceder a sus elementos.  
El índice comienza siempre en **0**.

### 🔤 Sintaxis:

```java
nombreDelArray[posicion];
```

### 🧪 Ejemplo:

```java
System.out.println(dias[0]); // Lunes
dias[1] = "Martes modificado";
```

| Acción             | Resultado                           |
| ------------------ | ----------------------------------- |
| `dias[0]`          | Accede al primer elemento ("Lunes") |
| `dias[1] = "Otro"` | Modifica el segundo elemento        |

> ⚠️ Cuidado con acceder a una posición fuera del rango (`dias[10]` si tiene solo 3 elementos): lanzará una `ArrayIndexOutOfBoundsException`.

---

## 2.4 📏 Propiedad `.length`

Cada array tiene una propiedad llamada `length` que indica cuántos elementos puede contener.

### 🔤 Sintaxis:

```java
nombreDelArray.length
```

> 🔍 Esta propiedad **no se escribe con paréntesis** como un método. No es `length()`.

### 🧪 Ejemplo:

```java
int[] edades = new int[4];
System.out.println("Tamaño: " + edades.length); // Imprime 4
```

---

## 2.5 🧪 Ejemplo completo explicado línea por línea

```java
public class EjemploArray {
    public static void main(String[] args) {
        int[] numeros = new int[3];             // 1. Declaración + inicialización de array de tamaño 3
        numeros[0] = 10;                         // 2. Asignar valor 10 a la posición 0
        numeros[1] = 20;                         // 3. Asignar valor 20 a la posición 1
        numeros[2] = 30;                         // 4. Asignar valor 30 a la posición 2

        System.out.println(numeros[0]);          // 5. Acceder e imprimir posición 0
        System.out.println("Tamaño: " + numeros.length); // 6. Imprimir tamaño total del array
    }
}
```

---

## 🧠 Reglas clave a recordar

- El primer índice siempre es `0`, el último es `length - 1`.
- No uses `length()` con paréntesis (no es un método).
- No accedas a un índice que no exista → lanza error.
- Los valores se inicializan automáticamente (`0`, `null`, `false`, etc.).

---

## 🧪 Ejercicio práctico sugerido

1. Declara un array de 5 números enteros.
2. Asigna valores manualmente a cada índice.
3. Imprime todos los valores usando un bucle `for`.
4. Muestra el valor de `length`.
5. Intenta acceder a `array[5]` y observa el error que ocurre.

# 🧩 Arreglos en Java: Errores, Buenas Prácticas y Alternativas Dinámicas

## 3. ⚠️ Errores comunes al usar arreglos

| Error                                 | Descripción                                                     | Consecuencia                     |
| ------------------------------------- | --------------------------------------------------------------- | -------------------------------- |
| ❌ Acceder fuera del rango            | Usar un índice mayor al permitido (`array[5]` en un array de 5) | `ArrayIndexOutOfBoundsException` |
| ❌ Usar `length()` en vez de `length` | `array.length()` no existe                                      | Error de compilación             |
| ❌ Declarar sin inicializar           | Solo declarar y luego acceder (`int[] x; x[0] = 1;`)            | `NullPointerException`           |
| ❌ Pensar que el índice comienza en 1 | Java comienza en 0                                              | Resultado inesperado o error     |
| ❌ Asignar un tipo incompatible       | `int[] numeros = {1, "dos"}`                                    | Error de compilación             |

---

## 4. ✅ Buenas prácticas

- Usa nombres descriptivos para los arreglos: `edades`, `notas`, `temperaturas`
- Utiliza `array.length` en bucles para evitar desbordamientos.
- Prefiere inicializar en el momento de declarar cuando los datos son conocidos.
- Usa constantes para representar tamaños si son usados repetidamente.
- Comenta tu código si los índices representan significados especiales.

---

## 5. ❌ Malas prácticas

- Usar valores mágicos (`numeros[4] = 100;`) sin justificar el índice.
- Copiar y pegar muchas líneas para llenar un array en vez de usar bucles.
- Ignorar `length` y asumir un tamaño fijo.
- Usar arrays en vez de colecciones cuando se necesita flexibilidad.

---

## 6. 🔄 ¿Qué pasa si necesito un arreglo dinámico?

### 6.1 📦 ¿Qué es una colección?

Una **colección** en Java es una estructura de datos más flexible que permite **agregar, eliminar y consultar elementos dinámicamente**. Son parte del paquete `java.util` y se utilizan ampliamente en el desarrollo profesional.

Ejemplo:

```java
import java.util.ArrayList;
ArrayList<String> frutas = new ArrayList<>();
frutas.add("Manzana");
frutas.add("Plátano");
```

### 6.2 ⚖️ Array vs ArrayList: ¿Cuál usar?

| Característica             | Array                   | ArrayList                                   |
| -------------------------- | ----------------------- | ------------------------------------------- |
| Tamaño                     | Fijo                    | Dinámico                                    |
| Sintaxis                   | `int[] x = new int[5];` | `ArrayList<Integer> x = new ArrayList<>();` |
| Métodos útiles             | No                      | Sí (`add`, `remove`, `contains`, etc.)      |
| Puede almacenar primitivos | Sí                      | No directamente (`int` → `Integer`)         |
| Pertenece a                | `java`                  | `java.util`                                 |
| Requiere importación       | No                      | Sí (`import java.util.*;`)                  |

> 📌 Usa `ArrayList` si necesitas crecer o reducir el número de elementos durante la ejecución.

---

## 7. 📊 Comparativa visual entre estructuras

| Estructura   | Tamaño   | Flexibilidad | Métodos útiles              | Ideal para                           |
| ------------ | -------- | ------------ | --------------------------- | ------------------------------------ |
| `Array`      | Fijo     | Baja         | Solo `.length`              | Datos fijos y simples                |
| `ArrayList`  | Dinámico | Alta         | `.add()`, `.remove()`, etc. | Listas que cambian con el tiempo     |
| `LinkedList` | Dinámico | Alta         | Acceso secuencial eficiente | Operaciones frecuentes al inicio/fin |
| `HashMap`    | Dinámico | Alta         | Asociar claves con valores  | Diccionarios y búsquedas rápidas     |

---

## 9. 📚 Glosario Técnico

| Término                              | Definición                                                                      |
| ------------------------------------ | ------------------------------------------------------------------------------- |
| **Array**                            | Estructura de datos de tamaño fijo y tipo homogéneo                             |
| **Índice**                           | Posición numérica dentro del array, comienza en 0                               |
| **ArrayList**                        | Clase de Java que representa una lista dinámica                                 |
| **Inicialización**                   | Proceso de crear un array y asignarle tamaño o valores                          |
| **`length`**                         | Propiedad que devuelve el tamaño del array                                      |
| **`ArrayIndexOutOfBoundsException`** | Error por acceder fuera del rango permitido                                     |
| **Colección**                        | Conjunto de estructuras de datos dinámicas en Java (`List`, `Set`, `Map`, etc.) |

---

## 10. ❓ Preguntas frecuentes (FAQ)

### ❓ ¿El índice de un array comienza en 1?

> ❌ No. Comienza en `0`.

### ❓ ¿Puedo cambiar el tamaño de un array?

> ❌ No. Debes crear uno nuevo.

### ❓ ¿Cuál es la diferencia entre `length` y `size()`?

> ✅ `length` se usa con arrays, `size()` con colecciones como `ArrayList`.

### ❓ ¿Puedo usar tipos primitivos con `ArrayList`?

> ❌ No directamente. Debes usar clases wrapper como `Integer`, `Double`, etc.

### ❓ ¿Cuándo usar array vs colección?

> ✅ Usa array para datos simples y de tamaño fijo. Usa colecciones para estructuras dinámicas.

---

> 🧠 **Consejo final:** Domina los arreglos primero para comprender el acceso por índice, luego avanza a colecciones dinámicas como `ArrayList` para mayor flexibilidad en proyectos reales.
