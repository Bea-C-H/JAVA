# 🚀 List en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📋 Tabla de Contenidos

1. [¿Qué es una lista en Java?](#1-qué-es-una-lista-en-java)
   - [¿Para qué sirve una lista?](#11-para-qué-sirve-una-lista)
   - [¿Qué es una interfaz `List`?](#12-qué-es-una-interfaz-list)
   - [¿Qué significa que acepte elementos duplicados?](#13-qué-significa-que-acepte-elementos-duplicados)
   - [Ventajas frente a un array](#14-ventajas-frente-a-un-array)
2. [¿Qué es un ArrayList?](#2-qué-es-un-arraylist)
   - [¿Por qué es tan utilizado?](#21-por-qué-es-tan-utilizado)
   - [Diferencias entre `ArrayList` y `List`](#22-diferencias-entre-arraylist-y-list)
3. [Sintaxis y uso básico de un ArrayList](#3-sintaxis-y-uso-básico-de-un-arraylist)
   - [Declaración y creación](#31-declaración-y-creación)
   - [Agregar elementos (`.add()`)](#32-agregar-elementos-add)
   - [Acceder a elementos (`.get()`)](#33-acceder-a-elementos-get)
   - [Modificar elementos (`.set()`)](#34-modificar-elementos-set)
   - [Eliminar elementos (`.remove()`)](#35-eliminar-elementos-remove)
   - [Verificar existencia (`.contains()`)](#36-verificar-existencia-contains)
   - [Obtener tamaño (`.size()`)](#37-obtener-tamaño-size)
4. [Ejemplo completo paso a paso](#4-ejemplo-completo-paso-a-paso)
5. [Errores comunes con listas](#5-errores-comunes-con-listas)
6. [Buenas prácticas con listas](#6-buenas-prácticas-con-listas)
7. [Comparativa entre `ArrayList` y otras colecciones](#7-comparativa-entre-arraylist-y-otras-colecciones)
   - [`ArrayList` vs `LinkedList`](#71-arraylist-vs-linkedlist)
   - [`List` vs `Set`](#72-list-vs-set)
8. [Glosario técnico](#8-glosario-técnico)
9. [Preguntas frecuentes (FAQ)](#9-preguntas-frecuentes-faq)

# 📚 1. ¿Qué es una lista en Java?

En Java, una **lista** es una **estructura de datos dinámica** que representa una **secuencia ordenada de elementos**. Se define a través de la **interfaz `List`** del paquete `java.util`.  
Las listas permiten el **acceso por índice**, **pueden contener elementos duplicados** y ofrecen métodos muy útiles para **agregar, eliminar, buscar y modificar elementos**.

```java
import java.util.List;
import java.util.ArrayList;

List<String> nombres = new ArrayList<>();
nombres.add("Ana");
nombres.add("Luis");
nombres.add("Ana"); // permitido: elementos duplicados
```

---

## 1.1 🛠️ ¿Para qué sirve una lista?

Una lista sirve para almacenar **una colección ordenada de elementos** en la que:

- Se requiere **acceso directo por índice**.
- Se necesita mantener el **orden de inserción**.
- Se permite tener **valores repetidos**.
- Se espera agregar y eliminar elementos **durante la ejecución** del programa.

> 📌 Ideal para representar listas de tareas, nombres de usuarios, productos en un carrito, etc.

---

## 1.2 🧩 ¿Qué es una interfaz `List`?

`List` es una **interfaz genérica** de la biblioteca estándar de Java ubicada en `java.util`.  
Define el **contrato que deben seguir todas las clases que implementen listas**: `ArrayList`, `LinkedList`, etc.

```java
public interface List<E> extends Collection<E> {
    // Métodos que define la interfaz
    void add(E e);
    E get(int index);
    E remove(int index);
    int size();
    boolean contains(Object o);
    ...
}
```

### 🧠 ¿Por qué usar la interfaz en vez de una clase directamente?

```java
List<String> frutas = new ArrayList<>();
```

- Permite **cambiar la implementación** fácilmente (por ejemplo, a `LinkedList`).
- Fomenta la **programación orientada a interfaces** (más flexible y escalable).

> 💡 Piensa en `List` como un **control remoto universal** que puede funcionar con cualquier “televisor” compatible (`ArrayList`, `LinkedList`...).

---

## 1.3 ♻️ ¿Qué significa que acepte elementos duplicados?

Una de las características principales de una `List` es que **permite elementos repetidos**.

```java
List<String> nombres = new ArrayList<>();
nombres.add("Maria");
nombres.add("Maria"); // permitido
```

Esto es útil cuando:

- Necesitas representar datos **reales** que pueden repetirse (usuarios que votan por la misma opción, productos duplicados, etc.)
- Quieres **preservar la historia** u orden exacto de inserción

> ⚠️ Si necesitas una estructura sin duplicados, deberías considerar usar `Set`.

---

## 1.4 ⚖️ Ventajas frente a un array

| Característica                 | `List` (ArrayList)                      | Array (`int[]`)               |
| ------------------------------ | --------------------------------------- | ----------------------------- |
| Tamaño dinámico                | ✅ Puede crecer o reducirse             | ❌ Fijo al momento de crearse |
| Métodos integrados             | ✅ `.add()`, `.remove()`, `.contains()` | ❌ Solo `.length`             |
| Tipos soportados               | Objetos (`Integer`, `String`, ...)      | Primitivos y objetos          |
| Lectura y escritura por índice | ✅ `get(index)`, `set(index, valor)`    | ✅ `array[index] = valor`     |
| Permite duplicados             | ✅ Sí                                   | ✅ Sí                         |
| Necesita importar              | ✅ Sí (`java.util`)                     | ❌ No                         |

> 🎯 **Resumen**: Usa `List` si necesitas una estructura **flexible y poderosa**. Usa `Array` si buscas algo **ligero y fijo**.

# 📦 2. ¿Qué es un ArrayList?

Un **`ArrayList`** en Java es una clase que **implementa** la interfaz `List` y representa una lista **dinámica**, respaldada por un array redimensionable.  
A diferencia de los arrays tradicionales (`int[]`), los `ArrayList` pueden **cambiar su tamaño automáticamente** cuando se agregan o eliminan elementos.

```java
import java.util.ArrayList;

ArrayList<String> animales = new ArrayList<>();
animales.add("Perro");
animales.add("Gato");
animales.add("Perro"); // Permite duplicados
System.out.println(animales); // [Perro, Gato, Perro]
```

---

## 2.1 🚀 ¿Por qué es tan utilizado?

El `ArrayList` es una de las colecciones más utilizadas en Java porque:

- ✅ **Cambia de tamaño automáticamente**.
- ✅ Permite **acceso rápido por índice** como un array.
- ✅ Contiene **métodos prácticos** como `.add()`, `.remove()`, `.contains()`, `.size()`, `.clear()`.
- ✅ Es fácil de declarar e inicializar.
- ✅ Puede contener objetos de cualquier tipo.
- ✅ Preserva el **orden de inserción**.

> 📌 Es ideal para **listas de tareas**, **elementos de un carrito**, **resultados de búsqueda**, etc.

---

## 2.2 🔍 Diferencias entre `ArrayList` y `List`

Aunque en código usamos muchas veces:

```java
List<String> nombres = new ArrayList<>();
```

Hay una diferencia importante entre **interfaz (`List`)** y **clase concreta (`ArrayList`)**:

| Aspecto               | `List` (interfaz)                          | `ArrayList` (implementación)        |
| --------------------- | ------------------------------------------ | ----------------------------------- |
| Tipo                  | Interfaz                                   | Clase que implementa `List`         |
| Importación           | `java.util.List`                           | `java.util.ArrayList`               |
| Instanciación directa | ❌ No se puede instanciar                  | ✅ Sí se puede usar con `new`       |
| Flexibilidad          | ✅ Alta (puedes cambiar la implementación) | ❌ Limitada                         |
| Uso recomendado       | En el lado izquierdo (declaración)         | En el lado derecho (inicialización) |

> 💡 **Recomendación profesional:** siempre declara con la interfaz (`List`) y usa la implementación (`ArrayList`) en el `new`, así tu código será más flexible y escalable.

```java
List<Integer> numeros = new ArrayList<>();
```

---

> 🧠 Piensa en `List` como una receta (interfaz) y `ArrayList` como una marca específica (implementación). Puedes cambiar de marca (`LinkedList`, `Vector`) pero la receta (`List`) sigue siendo la misma.

# 🛠️ 3. Sintaxis y uso básico de un ArrayList

Aquí aprenderás a utilizar los métodos esenciales de un `ArrayList` paso a paso, como si fuera una caja de herramientas lista para tus estructuras dinámicas en Java.

---

## 3.1 📥 Declaración y creación

```java
import java.util.ArrayList;
import java.util.List;

List<String> frutas = new ArrayList<>();
```

- Se importa `ArrayList` desde `java.util`.
- Se declara la variable `frutas` como una lista de `String`.
- Se instancia un nuevo `ArrayList` vacío.

> 💡 **Recomendación**: siempre declara usando la interfaz `List` para mayor flexibilidad.

---

## 3.2 ➕ Agregar elementos (`.add()`)

```java
frutas.add("Manzana");
frutas.add("Pera");
frutas.add("Banana");
```

- `.add(elemento)` agrega el elemento al **final de la lista**.
- Puedes agregar duplicados o nulos (`null`).

---

## 3.3 👁️ Acceder a elementos (`.get()`)

```java
String primera = frutas.get(0);
System.out.println("Primera fruta: " + primera);
```

- `.get(indice)` te da el valor en la posición dada.
- Recuerda que los índices empiezan en **0**.

> ⚠️ Si accedes a una posición que no existe, se lanza `IndexOutOfBoundsException`.

---

## 3.4 ✏️ Modificar elementos (`.set()`)

```java
frutas.set(1, "Durazno");
System.out.println(frutas); // [Manzana, Durazno, Banana]
```

- `.set(indice, nuevoValor)` reemplaza el elemento en la posición indicada.
- Útil cuando necesitas actualizar información en una posición específica.

---

## 3.5 ❌ Eliminar elementos (`.remove()`)

```java
frutas.remove("Banana"); // Por valor
frutas.remove(0);        // Por índice
```

- `.remove(valor)` elimina la primera aparición del valor.
- `.remove(indice)` elimina el elemento en esa posición.

---

## 3.6 🔍 Verificar existencia (`.contains()`)

```java
boolean tienePera = frutas.contains("Pera");
System.out.println("¿Contiene Pera? " + tienePera);
```

- `.contains(valor)` devuelve `true` si el valor está en la lista.
- Es útil para validaciones o filtros.

---

## 3.7 📏 Obtener tamaño (`.size()`)

```java
int cantidad = frutas.size();
System.out.println("Total de frutas: " + cantidad);
```

- `.size()` devuelve el número de elementos actuales en el `ArrayList`.
- **No confundir con `length`** que se usa para arrays.

---

> 🧪 **Consejo práctico:** usa un bucle `for` con `.size()` y `.get(i)` para recorrer toda la lista.

# 🧪 4. Ejemplo completo paso a paso

```java
import java.util.ArrayList;
import java.util.List;

public class ListaDemo {
    public static void main(String[] args) {
        List<String> tareas = new ArrayList<>();

        // Agregar tareas
        tareas.add("Estudiar Java");
        tareas.add("Hacer ejercicios");
        tareas.add("Estudiar Java"); // Duplicado permitido

        // Mostrar tareas
        System.out.println("Tareas: " + tareas);

        // Acceder por índice
        System.out.println("Primera tarea: " + tareas.get(0));

        // Modificar tarea
        tareas.set(1, "Practicar estructuras");
        System.out.println("Después de modificar: " + tareas);

        // Eliminar tarea por valor
        tareas.remove("Estudiar Java"); // solo elimina la primera ocurrencia
        System.out.println("Después de eliminar una: " + tareas);

        // Verificar existencia
        System.out.println("¿Contiene 'Practicar estructuras'? " + tareas.contains("Practicar estructuras"));

        // Tamaño de la lista
        System.out.println("Tamaño total: " + tareas.size());
    }
}
```

> ✅ Este ejemplo muestra cómo manejar elementos desde cero, paso a paso, tal como se haría en una aplicación real.

---

# ⚠️ 5. Errores comunes con listas

| Error                                     | Descripción                             | Ejemplo                                             | Consecuencia                      |
| ----------------------------------------- | --------------------------------------- | --------------------------------------------------- | --------------------------------- |
| ❌ Acceder a un índice inexistente        | Índice fuera de rango                   | `lista.get(10)` en una lista de tamaño 3            | `IndexOutOfBoundsException`       |
| ❌ Olvidar importar `java.util`           | No se reconoce `List` o `ArrayList`     | `List<String> l = ...`                              | Error de compilación              |
| ❌ Confundir `add` con `set`              | `set` sobrescribe, no agrega            | `lista.set(0, "nuevo")`                             | No añade, reemplaza               |
| ❌ Modificar la lista en bucle `for-each` | No permitido eliminar mientras se itera | `for (String item : lista) { lista.remove(item); }` | `ConcurrentModificationException` |

---

# ✅ 6. Buenas prácticas con listas

- Declara listas como `List<Tipo>` y no como `ArrayList<Tipo>`.
- Usa nombres descriptivos: `productos`, `clientes`, `notas`.
- Verifica el índice antes de acceder (`if (index < lista.size())`).
- Usa bucles `for-each` cuando no necesites índice.
- Evita usar `null` como elementos, a menos que sea necesario.

---

# 🔄 7. Comparativa entre `ArrayList` y otras colecciones

## 7.1 📊 `ArrayList` vs `LinkedList`

| Característica      | `ArrayList`                | `LinkedList`                |
| ------------------- | -------------------------- | --------------------------- |
| Implementación      | Basado en array            | Basado en nodos enlazados   |
| Acceso por índice   | ✅ Muy rápido (`O(1)`)     | ❌ Más lento (`O(n)`)       |
| Inserción al inicio | ❌ Costosa (`O(n)`)        | ✅ Rápida (`O(1)`)          |
| Consumo de memoria  | Menor                      | Mayor                       |
| Uso ideal           | Acceso aleatorio frecuente | Muchas inserciones/borrados |

## 7.2 🔁 `List` vs `Set`

| Característica     | `List`                              | `Set`                         |
| ------------------ | ----------------------------------- | ----------------------------- |
| Permite duplicados | ✅ Sí                               | ❌ No                         |
| Mantiene orden     | ✅ Sí (orden de inserción)          | ❌ No garantizado (`HashSet`) |
| Acceso por índice  | ✅ Sí                               | ❌ No                         |
| Uso ideal          | Colecciones ordenadas con repetidos | Conjuntos únicos              |

> 🧠 Usa `ArrayList` si necesitas orden y acceso por índice. Usa `Set` si necesitas evitar elementos duplicados.

# 📚 8. Glosario técnico

| Término                     | Definición                                                               |
| --------------------------- | ------------------------------------------------------------------------ |
| `List`                      | Interfaz de Java que representa una colección ordenada de elementos.     |
| `ArrayList`                 | Clase que implementa la interfaz `List` usando un array redimensionable. |
| `.add()`                    | Método para agregar un elemento a la lista.                              |
| `.get()`                    | Devuelve el elemento en una posición específica.                         |
| `.set()`                    | Reemplaza el valor en una posición determinada.                          |
| `.remove()`                 | Elimina un elemento por índice o valor.                                  |
| `.contains()`               | Verifica si un valor está presente en la lista.                          |
| `.size()`                   | Devuelve la cantidad de elementos en la lista.                           |
| Índice                      | Posición numérica del elemento, comenzando desde 0.                      |
| `IndexOutOfBoundsException` | Error al intentar acceder a una posición inexistente en la lista.        |
| `null`                      | Valor que representa "ningún objeto" o "sin valor asignado".             |

---

# ❓ 9. Preguntas frecuentes (FAQ)

### ❓ ¿Qué diferencia hay entre `ArrayList` y `List`?

> `List` es una interfaz, `ArrayList` es una implementación. Se recomienda declarar como `List` para mayor flexibilidad.

### ❓ ¿Las listas permiten elementos duplicados?

> ✅ Sí. A diferencia de `Set`, las listas permiten almacenar valores repetidos.

### ❓ ¿Qué pasa si accedo a un índice que no existe?

> Se lanza una excepción `IndexOutOfBoundsException`.

### ❓ ¿Puedo almacenar `null` en una lista?

> ✅ Sí, aunque no se recomienda si puedes evitarlo.

### ❓ ¿Qué tamaño tiene una lista al crearla?

> `0`. El tamaño crece a medida que agregas elementos con `.add()`.

### ❓ ¿Las listas son seguras para múltiples hilos (thread-safe)?

> ❌ No por defecto. Debes usar `Collections.synchronizedList(...)` o estructuras como `CopyOnWriteArrayList`.

### ❓ ¿Puedo usar tipos primitivos en una lista?

> ❌ No directamente. Debes usar sus equivalentes en clases envoltorio (`int` → `Integer`, `double` → `Double`, etc.).

> 🧠 **Consejo final:** Siempre que trabajes con listas, recuerda usar validaciones, conocer sus límites y aprovechar los métodos integrados.
