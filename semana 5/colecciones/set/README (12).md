# 🚀 Set en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📋 Tabla de Contenidos

1. [¿Qué es un conjunto en Java?](#1-qué-es-un-conjunto-en-java)
   - [¿Para qué sirve un conjunto?](#11-para-qué-sirve-un-conjunto)
   - [¿Qué significa sin duplicados?](#12-qué-significa-sin-duplicados)
   - [¿Qué es la interfaz `Set`?](#13-qué-es-la-interfaz-set)
   - [Ventajas de usar conjuntos](#14-ventajas-de-usar-conjuntos)
2. [¿Qué es un HashSet?](#2-qué-es-un-hashset)
   - [Características principales](#21-características-principales)
   - [¿Cuándo usar `HashSet`?](#22-cuándo-usar-hashset)
3. [Sintaxis y uso básico de un HashSet](#3-sintaxis-y-uso-básico-de-un-hashset)
   - [Declaración y creación](#31-declaración-y-creación)
   - [Agregar elementos (`.add()`)](#32-agregar-elementos-add)
   - [Verificar existencia (`.contains()`)](#33-verificar-existencia-contains)
   - [Eliminar elementos (`.remove()`)](#34-eliminar-elementos-remove)
   - [Tamaño del conjunto (`.size()`)](#35-tamaño-del-conjunto-size)
   - [Limpiar el conjunto (`.clear()`)](#36-limpiar-el-conjunto-clear)
4. [Ejemplo completo paso a paso](#4-ejemplo-completo-paso-a-paso)
5. [Errores comunes con conjuntos](#5-errores-comunes-con-conjuntos)
6. [Buenas prácticas con conjuntos](#6-buenas-prácticas-con-conjuntos)
7. [Otras implementaciones de `Set`](#7-otras-implementaciones-de-set)
   - [`LinkedHashSet`](#71-linkedhashset)
   - [`TreeSet`](#72-treeset)
8. [Comparativa entre implementaciones de Set](#8-comparativa-entre-implementaciones-de-set)
9. [Glosario técnico](#9-glosario-técnico)
10. [Preguntas frecuentes (FAQ)](#10-preguntas-frecuentes-faq)


# 🧮 1. ¿Qué es un conjunto en Java?

En Java, un **conjunto** es una colección **sin elementos duplicados**, modelada a través de la interfaz **`Set`**.  
A diferencia de las listas, **no se garantiza un orden específico** de los elementos y cada elemento debe ser **único**.

```java
Set<String> dias = new HashSet<>();
dias.add("Lunes");
dias.add("Martes");
dias.add("Lunes"); // Duplicado: se ignora
System.out.println(dias); // [Lunes, Martes] (el orden puede variar)
```

---

## 1.1 🎯 ¿Para qué sirve un conjunto?

Los conjuntos son útiles cuando necesitas:

- Evitar elementos repetidos automáticamente.
- Representar colecciones únicas: como **tags**, **nombres de usuarios**, **elementos seleccionados**, etc.
- Realizar operaciones de **conjuntos matemáticos**: unión, intersección, diferencia.

> 🧠 Úsalos cuando el **valor importa más que el orden o la posición**.

---

## 1.2 🚫 ¿Qué significa sin duplicados?

Un conjunto **no permite que un mismo valor exista más de una vez**.

```java
Set<Integer> numeros = new HashSet<>();
numeros.add(1);
numeros.add(2);
numeros.add(1); // No se agregará
```

| Acción            | Resultado                     |
|-------------------|-------------------------------|
| `add(1)`          | ✅ Se agrega                   |
| `add(2)`          | ✅ Se agrega                   |
| `add(1)` otra vez | ❌ Se ignora (ya está presente) |

> ✅ Esto lo convierte en una excelente herramienta para **filtrar automáticamente duplicados**.

---

## 1.3 🧩 ¿Qué es la interfaz `Set`?

`Set` es una **interfaz** del paquete `java.util` que extiende `Collection` y **representa una colección sin duplicados**.

```java
public interface Set<E> extends Collection<E> {
    // No permite duplicados
}
```

Sus implementaciones más comunes son:

- `HashSet`: sin orden garantizado
- `LinkedHashSet`: mantiene orden de inserción
- `TreeSet`: ordena automáticamente

> 💡 Se recomienda declarar usando `Set` y no directamente con la clase, para poder cambiar la implementación fácilmente.

---

## 1.4 ✅ Ventajas de usar conjuntos

| Ventaja                         | Descripción |
|----------------------------------|-------------|
| 🚫 Evita duplicados automáticamente | No necesitas verificar manualmente |
| 🔍 Búsqueda rápida (HashSet)     | Muy eficiente en validaciones (`contains()`) |
| ♻️ Operaciones matemáticas       | Permite aplicar lógica de conjuntos |
| 📦 Fácil de declarar y usar      | Implementaciones estándar de Java (`HashSet`, etc.) |
| 🔁 Iteración sin preocuparse del índice | Iteración directa con `for-each` |

> ✨ Úsalo cuando **no te importe el orden ni la posición**, pero sí **que cada elemento sea único**.


# 🧺 2. ¿Qué es un HashSet?

`HashSet` es una clase de Java que **implementa la interfaz `Set`** y se utiliza para almacenar **elementos únicos sin un orden específico**.  
Internamente, utiliza una **tabla hash** para garantizar que no haya duplicados y para acceder rápidamente a los elementos.

```java
Set<String> paises = new HashSet<>();
paises.add("Chile");
paises.add("Argentina");
paises.add("Chile"); // Duplicado ignorado

System.out.println(paises); // [Chile, Argentina] (orden no garantizado)
```

---

## 2.1 🧠 Características principales

| Característica                    | HashSet                                         |
|-----------------------------------|--------------------------------------------------|
| No permite duplicados             | ✅                                              |
| Orden garantizado                 | ❌ No mantiene ningún orden                     |
| Permite elementos `null`          | ✅ Solo uno                                     |
| Acceso rápido (`.contains()`)     | ✅ Muy eficiente (`O(1)` promedio)              |
| Iteración                         | ✅ Posible con `for-each` o iterator            |
| Sincronización                    | ❌ No es thread-safe (se requiere sincronizar manualmente) |
| Basado en                        | 🔗 Hash Table                                   |

> ⚠️ El orden de los elementos puede cambiar incluso después de ejecutar el mismo código varias veces.

---

## 2.2 ✅ ¿Cuándo usar `HashSet`?

Utiliza `HashSet` cuando:

- Necesitas **una colección sin duplicados**.
- El **orden no es importante**.
- Requieres **búsquedas eficientes** con `.contains()`.
- Quieres realizar **operaciones de conjuntos**: unión, intersección, diferencia.

> 🧠 **Ejemplos de uso comunes**:
> - Filtrar elementos únicos.
> - Validar existencia rápida (como nombres registrados).
> - Agrupar categorías sin repetir.

🎯 Si necesitas que se mantenga el orden de inserción, considera `LinkedHashSet`.  
🌳 Si necesitas que los elementos estén ordenados automáticamente, usa `TreeSet`.


# 🛠️ 3. Sintaxis y uso básico de un HashSet

Un `HashSet` es muy fácil de usar y te permite trabajar rápidamente con elementos únicos. A continuación, se detallan los métodos esenciales.

---

## 3.1 📝 Declaración y creación

```java
import java.util.HashSet;
import java.util.Set;

Set<String> lenguajes = new HashSet<>();
```

- Se importa `HashSet` desde `java.util`.
- Se declara una colección de tipo `Set` para permitir flexibilidad.
- Se instancia como un `HashSet`.

---

## 3.2 ➕ Agregar elementos (`.add()`)

```java
lenguajes.add("Java");
lenguajes.add("Python");
lenguajes.add("Java"); // Duplicado: será ignorado
```

- `.add(valor)` inserta un nuevo elemento si no existe.
- Si ya existe, **no se agrega y no lanza error**.

---

## 3.3 🔍 Verificar existencia (`.contains()`)

```java
boolean tieneJava = lenguajes.contains("Java");
System.out.println("¿Contiene Java? " + tieneJava);
```

- `.contains(valor)` devuelve `true` si el elemento está presente.
- Muy útil para validaciones rápidas.

---

## 3.4 ❌ Eliminar elementos (`.remove()`)

```java
lenguajes.remove("Python");
System.out.println(lenguajes); // Elimina "Python" si existe
```

- `.remove(valor)` elimina el elemento especificado si está presente.
- No lanza error si no existe.

---

## 3.5 📏 Tamaño del conjunto (`.size()`)

```java
System.out.println("Cantidad de elementos: " + lenguajes.size());
```

- `.size()` retorna el número de elementos únicos presentes en el conjunto.

---

## 3.6 🧼 Limpiar el conjunto (`.clear()`)

```java
lenguajes.clear();
System.out.println("Conjunto limpio: " + lenguajes);
```

- `.clear()` elimina **todos** los elementos del `HashSet`.

---

> 🧠 Consejo: Usa `HashSet` como herramienta para **filtrar datos duplicados** o **verificar existencia rápida** sin preocuparte del orden.


# 🧪 4. Ejemplo completo paso a paso

```java
import java.util.HashSet;
import java.util.Set;

public class DemoConjunto {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(10); // Duplicado ignorado

        System.out.println("Conjunto original: " + numeros);

        boolean contiene = numeros.contains(15);
        System.out.println("¿Contiene 15? " + contiene);

        numeros.remove(10);
        System.out.println("Después de eliminar 10: " + numeros);

        System.out.println("Tamaño: " + numeros.size());

        numeros.clear();
        System.out.println("Después de limpiar: " + numeros);
    }
}
```

---

# ⚠️ 5. Errores comunes con conjuntos

| Error | Descripción | Consecuencia |
|-------|-------------|--------------|
| ❌ Suponer que el orden es estable | `HashSet` no garantiza orden | Resultados impredecibles al imprimir |
| ❌ Intentar agregar duplicados y esperar error | Los duplicados simplemente se ignoran | Comportamiento silencioso |
| ❌ Usar estructuras tipo índice (`get(index)`) | Los conjuntos no tienen índice | Error de compilación |
| ❌ Comparar conjuntos con `==` | No compara contenidos | Resultado incorrecto |

---

# ✅ 6. Buenas prácticas con conjuntos

- Usa `Set` como tipo de referencia, no directamente `HashSet`.
- Siempre verifica duplicados con `contains()` si haces lógica condicional.
- Prefiere `Set` en lugar de `List` cuando la unicidad sea importante.
- No dependas del orden: si lo necesitas, usa `LinkedHashSet` o `TreeSet`.

---

# 🧬 7. Otras implementaciones de `Set`

## 7.1 🔗 `LinkedHashSet`

- Mantiene el **orden de inserción**.
- Ideal cuando necesitas unicidad **y** previsibilidad de orden.

```java
Set<String> ordenado = new LinkedHashSet<>();
```

## 7.2 🌳 `TreeSet`

- Ordena los elementos automáticamente (orden natural o con comparador).
- Útil para conjuntos que deben estar **ordenados sin duplicados**.

```java
Set<Integer> ordenadoNumerico = new TreeSet<>();
```

---

# ⚖️ 8. Comparativa entre implementaciones de `Set`

| Implementación   | Permite duplicados | Orden de elementos        | Rendimiento promedio | Ideal para...                  |
|------------------|--------------------|----------------------------|-----------------------|---------------------------------|
| `HashSet`        | ❌ No               | ❌ No garantiza orden      | ✅ Muy alto           | Validaciones rápidas, unicidad |
| `LinkedHashSet`  | ❌ No               | ✅ Mantiene orden inserción| ✅ Alto                | Listas únicas ordenadas        |
| `TreeSet`        | ❌ No               | ✅ Orden natural            | ⚠️ Más lento           | Datos únicos ordenados         |

---

# 📚 9. Glosario técnico

| Término          | Definición                                                       |
|------------------|------------------------------------------------------------------|
| `Set`            | Interfaz que representa una colección sin duplicados             |
| `HashSet`        | Implementación rápida y sin orden de `Set`                       |
| `LinkedHashSet`  | Implementación que mantiene el orden de inserción                |
| `TreeSet`        | Implementación que mantiene los elementos ordenados              |
| `.add()`         | Agrega un elemento si no está presente                           |
| `.contains()`    | Verifica si un elemento existe en el conjunto                    |
| `.remove()`      | Elimina un elemento del conjunto                                 |
| `.clear()`       | Elimina todos los elementos del conjunto                         |
| `.size()`        | Retorna la cantidad de elementos únicos en el conjunto           |

---

# ❓ 10. Preguntas frecuentes (FAQ)

### ❓ ¿Puedo agregar elementos duplicados a un `Set`?
> ❌ No. Los duplicados son ignorados.

### ❓ ¿Qué pasa si agrego el mismo valor dos veces?
> Solo se guarda una vez. El segundo intento se ignora silenciosamente.

### ❓ ¿Puedo acceder a los elementos por índice?
> ❌ No. Los conjuntos no están basados en posiciones.

### ❓ ¿Qué implementación debo usar?
> Usa `HashSet` por defecto, `LinkedHashSet` si importa el orden de inserción y `TreeSet` si necesitas orden automático.

### ❓ ¿`HashSet` permite `null`?
> ✅ Sí, pero solo un único valor `null`.

> 🧠 Consejo: usa conjuntos siempre que tu prioridad sea tener elementos **únicos** sin preocuparte del orden o de la posición.
