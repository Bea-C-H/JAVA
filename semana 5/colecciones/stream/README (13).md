# 🚀 Stream en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📋 Tabla de Contenidos

1. [¿Qué es un Stream en Java?](#1-qué-es-un-stream-en-java)
   - [¿Qué problemas resuelve?](#11-qué-problemas-resuelve)
   - [¿Por qué es declarativo y funcional?](#12-por-qué-es-declarativo-y-funcional)
   - [¿Qué colecciones pueden usar Streams?](#13-qué-colecciones-pueden-usar-streams)
2. [Conceptos clave de Streams](#2-conceptos-clave-de-streams)
   - [Stream como secuencia de datos](#21-stream-como-secuencia-de-datos)
   - [Operaciones intermedias](#22-operaciones-intermedias)
   - [Operaciones terminales](#23-operaciones-terminales)
3. [Sintaxis y uso básico de Streams](#3-sintaxis-y-uso-básico-de-streams)
   - [Crear un Stream desde una colección](#31-crear-un-stream-desde-una-colección)
   - [Filtrar elementos con `filter()`](#32-filtrar-elementos-con-filter)
   - [Transformar elementos con `map()`](#33-transformar-elementos-con-map)
   - [Ordenar con `sorted()`](#34-ordenar-con-sorted)
   - [Recolectar resultados con `collect()`](#35-recolectar-resultados-con-collect)
   - [Ejecutar acciones con `forEach()`](#36-ejecutar-acciones-con-foreach)
4. [Ejemplo completo paso a paso](#4-ejemplo-completo-paso-a-paso)
5. [Errores comunes al usar Streams](#5-errores-comunes-al-usar-streams)
6. [Buenas prácticas con Streams](#6-buenas-prácticas-con-streams)
7. [Comparación: Streams vs Bucles tradicionales](#7-comparación-streams-vs-bucles-tradicionales)
8. [Glosario técnico](#8-glosario-técnico)
9. [Preguntas frecuentes (FAQ)](#9-preguntas-frecuentes-faq)

# 🌊 1. ¿Qué es un Stream en Java?

Un **Stream** en Java es una **secuencia de elementos** que permite **procesar datos de forma declarativa y funcional**, sin necesidad de escribir bucles explícitos.

> 🧠 Introducido en Java 8 (`java.util.stream`), un `Stream` no almacena datos, sino que los **procesa al vuelo** desde fuentes como listas, arrays o sets.

---

## 1.1 🎯 ¿Qué problemas resuelve?

Antes de los Streams, manipular colecciones implicaba escribir bucles explícitos:

```java
List<String> nombres = Arrays.asList("Ana", "Luis", "Carlos");
List<String> filtrados = new ArrayList<>();

for (String nombre : nombres) {
    if (nombre.startsWith("A")) {
        filtrados.add(nombre.toUpperCase());
    }
}
```

Con Streams:

```java
List<String> filtrados = nombres.stream()
    .filter(n -> n.startsWith("A"))
    .map(String::toUpperCase)
    .collect(Collectors.toList());
```

✅ Ventajas:

- Menos código, más expresividad.
- Separación clara entre **qué se hace** y **cómo se hace**.
- Posibilidad de **procesamiento paralelo** (`parallelStream()`).

---

## 1.2 🧩 ¿Por qué es declarativo y funcional?

### ✨ Declarativo

Indicas **qué** quieres hacer, no **cómo** hacerlo paso a paso. Similar a SQL.

### 💡 Funcional

Utiliza **funciones lambda** y evita efectos secundarios.  
Los Streams son **inmutables**: cada operación genera un nuevo Stream.

```java
list.stream()
    .filter(x -> x > 10)
    .map(x -> x * 2)
    .forEach(System.out::println);
```

> 📌 Esto hace el código más legible, mantenible y conciso.

---

## 1.3 🔄 ¿Qué colecciones pueden usar Streams?

Cualquier clase que implemente la interfaz `Collection` puede crear un Stream:

| Colección | ¿Soporta `.stream()`? | Ejemplo de uso                         |
| --------- | --------------------- | -------------------------------------- |
| `List`    | ✅ Sí                 | `miLista.stream()`                     |
| `Set`     | ✅ Sí                 | `miSet.stream()`                       |
| `Queue`   | ✅ Sí                 | `miCola.stream()`                      |
| `Map`     | ❌ No directamente    | `miMapa.entrySet().stream()`           |
| `Array`   | ❌ No directamente    | `Arrays.stream(array)` (usando helper) |

> 🧠 Los Streams **no modifican la colección original**, operan sobre una copia fluida de sus datos.

---

¿Y qué pasa si quiero paralelizar?

```java
miLista.parallelStream().forEach(...); // procesamiento en múltiples hilos
```

> ⚠️ Usa `parallelStream()` con cuidado: no siempre es más rápido y puede tener efectos inesperados si hay estados compartidos.

# 🔍 2. Conceptos clave de Streams

Los Streams en Java siguen un modelo de procesamiento en **etapas**, compuesto por operaciones **intermedias** y una operación **terminal**.  
Esta estructura hace que los Streams sean **perezosos**, eficientes y expresivos.

---

## 2.1 🔁 Stream como secuencia de datos

Un Stream representa una **secuencia de datos fluida**, que se puede **transformar, filtrar o reducir**.

```java
Stream<String> stream = Stream.of("A", "B", "C");
```

> 📌 Un Stream **no almacena datos**, actúa como una **tubería de procesamiento**.

🎯 Ejemplo visual:

```
Lista → Stream → filter() → map() → collect()
```

---

## 2.2 🔧 Operaciones intermedias

Son operaciones que **devuelven otro Stream** y permiten encadenar múltiples pasos de transformación.

### Características:

- Son **perezosas** (no se ejecutan hasta que haya una operación terminal).
- No modifican los datos originales.
- Se pueden **encadenar libremente**.

### Ejemplos comunes:

| Método       | Descripción                              |
| ------------ | ---------------------------------------- |
| `filter()`   | Filtra elementos por condición           |
| `map()`      | Transforma cada elemento                 |
| `sorted()`   | Ordena los elementos del Stream          |
| `distinct()` | Elimina duplicados                       |
| `limit(n)`   | Devuelve solo los primeros `n` elementos |
| `skip(n)`    | Omite los primeros `n` elementos         |

```java
list.stream()
    .filter(n -> n > 10)
    .map(n -> n * 2)
    .sorted();
```

---

## 2.3 🏁 Operaciones terminales

Son las operaciones que **finalizan** el Stream y devuelven un resultado o efecto.

### Características:

- Disparan la ejecución real de todas las operaciones anteriores.
- **Solo puede haber una operación terminal por Stream**.
- Después de ejecutarla, el Stream queda **cerrado**.

### Ejemplos comunes:

| Método        | Descripción                                                   |
| ------------- | ------------------------------------------------------------- |
| `collect()`   | Recolecta el resultado en una colección (`List`, `Set`, etc.) |
| `forEach()`   | Aplica una acción a cada elemento                             |
| `reduce()`    | Reduce los elementos a un solo resultado                      |
| `count()`     | Cuenta cuántos elementos hay                                  |
| `anyMatch()`  | Devuelve `true` si algún elemento cumple una condición        |
| `findFirst()` | Devuelve el primer elemento (si existe)                       |

```java
List<String> resultado = list.stream()
    .filter(s -> s.length() > 3)
    .collect(Collectors.toList());
```

> 🧠 Las operaciones terminales son como **el grifo que abre la cañería**. Hasta que no se ejecutan, el Stream no hace nada.

---

> 🧪 Consejo: Combina operaciones intermedias y terminales para **encadenar transformaciones potentes con código limpio**.

# 🛠️ 3. Sintaxis y uso básico de Streams

A continuación, exploramos cómo crear y utilizar un Stream paso a paso, aplicando sus operaciones más comunes.

---

## 3.1 🧱 Crear un Stream desde una colección

```java
List<String> nombres = List.of("Ana", "Luis", "Carlos");
Stream<String> flujo = nombres.stream();
```

- Se obtiene un Stream desde una lista.
- También se puede usar `Set`, `Queue`, `Arrays.stream(array)`, etc.

---

## 3.2 🔍 Filtrar elementos con `filter()`

```java
List<String> resultado = nombres.stream()
    .filter(nombre -> nombre.startsWith("A"))
    .collect(Collectors.toList());
```

- `filter()` permite dejar pasar solo los elementos que cumplen cierta condición.

---

## 3.3 🔄 Transformar elementos con `map()`

```java
List<String> mayusculas = nombres.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
```

- `map()` transforma cada elemento del Stream en otro.

---

## 3.4 🧮 Ordenar con `sorted()`

```java
List<String> ordenados = nombres.stream()
    .sorted()
    .collect(Collectors.toList());
```

- `sorted()` ordena los elementos según orden natural o usando un comparador.

---

## 3.5 📦 Recolectar resultados con `collect()`

```java
List<String> resultado = nombres.stream()
    .filter(n -> n.length() > 3)
    .collect(Collectors.toList());
```

- `collect()` es una operación terminal que transforma el Stream en una colección.

---

## 3.6 🔁 Ejecutar acciones con `forEach()`

```java
nombres.stream()
    .forEach(nombre -> System.out.println(nombre));
```

- `forEach()` aplica una acción (efecto secundario) a cada elemento.

---

> 🧠 Consejo: Usa `.filter()` para condiciones, `.map()` para transformaciones, `.collect()` para devolver una colección, y `.forEach()` para imprimir o ejecutar tareas.

# 🧪 4. Ejemplo completo paso a paso

```java
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Luis", "Pedro", "Andrea", "Lucas");

        List<String> resultado = nombres.stream()
            .filter(n -> n.startsWith("A"))
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        resultado.forEach(System.out::println);
    }
}
```

### ¿Qué hace este ejemplo?

1. Crea un Stream desde una lista.
2. Filtra nombres que empiezan con `"A"`.
3. Convierte esos nombres a mayúsculas.
4. Ordena los nombres.
5. Los recolecta en una lista.
6. Imprime el resultado.

---

# ⚠️ 5. Errores comunes al usar Streams

| Error                                           | Descripción                            | Consecuencia              |
| ----------------------------------------------- | -------------------------------------- | ------------------------- |
| ❌ Usar un Stream más de una vez                | Los Streams no son reutilizables       | `IllegalStateException`   |
| ❌ Modificar la fuente dentro del Stream        | Genera efectos secundarios no deseados | Difícil de depurar        |
| ❌ Olvidar operación terminal                   | No se ejecuta nada                     | Resultado nulo            |
| ❌ Mezclar Streams con operaciones destructivas | Pérdida de datos o inconsistencias     | Comportamiento inesperado |

---

# ✅ 6. Buenas prácticas con Streams

- Declara las operaciones en línea para mayor legibilidad.
- Usa `filter` antes que `map` si vas a reducir el número de elementos.
- No uses Streams si necesitas acceso por índice → usa bucles normales.
- Evita efectos secundarios dentro de `.map()` o `.filter()` (como imprimir).
- Divide operaciones complejas en pasos intermedios con variables.

---

# 🔄 7. Comparación: Streams vs Bucles tradicionales

| Aspecto              | Stream                  | Bucle tradicional                  |
| -------------------- | ----------------------- | ---------------------------------- |
| Legibilidad          | ✅ Alta                 | ❌ Puede ser más verboso           |
| Mutabilidad          | ❌ Evita estado mutable | ✅ Puede modificar listas          |
| Declarativo          | ✅ Sí                   | ❌ No                              |
| Reutilización        | ❌ No                   | ✅ Sí                              |
| Paralelización fácil | ✅ `.parallelStream()`  | ❌ Requiere programación multihilo |
| Performance          | ✅ En ciertos casos     | ✅ Generalmente más controlado     |

---

# 📚 8. Glosario técnico

| Término           | Definición                                                      |
| ----------------- | --------------------------------------------------------------- |
| Stream            | Flujo de datos sobre el que se realizan operaciones funcionales |
| Intermedia        | Operación que transforma un Stream en otro                      |
| Terminal          | Operación que finaliza el Stream y produce un resultado         |
| `filter()`        | Filtra elementos según condición                                |
| `map()`           | Transforma cada elemento del Stream                             |
| `collect()`       | Convierte el Stream en una colección                            |
| `forEach()`       | Ejecuta una acción por cada elemento                            |
| `reduce()`        | Reduce el Stream a un único valor                               |
| `lazy evaluation` | Evaluación diferida: no ejecuta hasta operación terminal        |

---

# ❓ 9. Preguntas frecuentes (FAQ)

### ❓ ¿Un Stream reemplaza siempre a un bucle?

> ❌ No siempre. Es útil para colecciones, pero no para control estructurado o índice.

### ❓ ¿Puedo reutilizar un Stream?

> ❌ No. Una vez ejecutado, está cerrado.

### ❓ ¿Streams modifican la lista original?

> ❌ No. Los Streams operan sobre copias de los datos.

### ❓ ¿Qué diferencia hay entre `map()` y `forEach()`?

> `map()` transforma, `forEach()` actúa (imprime, guarda, etc.).

### ❓ ¿Cuándo usar `parallelStream()`?

> Solo cuando el procesamiento es costoso y no hay efectos secundarios.

> 🧠 Consejo final: Usa Streams para **procesar colecciones de forma limpia y funcional**, manteniendo el código declarativo y libre de efectos colaterales.
