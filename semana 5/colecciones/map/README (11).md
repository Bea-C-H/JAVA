# 🚀 Map en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📋 Tabla de Contenidos

1. [¿Qué es un mapa en Java?](#1-qué-es-un-mapa-en-java)
   - [¿Para qué sirve un mapa?](#11-para-qué-sirve-un-mapa)
   - [¿Qué es un par clave-valor?](#12-qué-es-un-par-clave-valor)
   - [¿Por qué la clave debe ser única?](#13-por-qué-la-clave-debe-ser-única)
   - [Ventajas de usar `Map`](#14-ventajas-de-usar-map)
2. [¿Qué es un HashMap?](#2-qué-es-un-hashmap)
   - [Características principales](#21-características-principales)
   - [¿Por qué es la implementación más usada?](#22-por-qué-es-la-implementación-más-usada)
3. [Sintaxis y uso básico de un HashMap](#3-sintaxis-y-uso-básico-de-un-hashmap)
   - [Declaración y creación](#31-declaración-y-creación)
   - [Agregar pares (`.put()`)](#32-agregar-pares-put)
   - [Acceder a valores (`.get()`)](#33-acceder-a-valores-get)
   - [Verificar claves (`.containsKey()`)](#34-verificar-claves-containskey)
   - [Eliminar pares (`.remove()`)](#35-eliminar-pares-remove)
   - [Tamaño del mapa (`.size()`)](#36-tamaño-del-mapa-size)
   - [Limpiar el mapa (`.clear()`)](#37-limpiar-el-mapa-clear)
4. [Ejemplo completo paso a paso](#4-ejemplo-completo-paso-a-paso)
5. [Errores comunes con mapas](#5-errores-comunes-con-mapas)
6. [Buenas prácticas con mapas](#6-buenas-prácticas-con-mapas)
7. [Otras implementaciones de `Map`](#7-otras-implementaciones-de-map)
   - [`TreeMap`](#71-treemap)
   - [`LinkedHashMap`](#72-linkedhashmap)
8. [Comparativa entre implementaciones de Map](#8-comparativa-entre-implementaciones-de-map)
9. [Glosario técnico](#9-glosario-técnico)
10. [Preguntas frecuentes (FAQ)](#10-preguntas-frecuentes-faq)


# 🗺️ 1. ¿Qué es un mapa en Java?

Un **mapa** (`Map`) en Java es una **estructura de datos que almacena información en pares clave-valor**.  
Cada **clave** actúa como un identificador único para acceder rápidamente a su valor asociado. Los mapas **no permiten claves duplicadas**, pero sí valores duplicados.

```java
Map<String, Integer> mapa = new HashMap<>();
mapa.put("Edad", 30);
mapa.put("Altura", 175);
```

> 🔑 En este ejemplo, `"Edad"` y `"Altura"` son claves únicas. `30` y `175` son sus respectivos valores.

---

## 1.1 🎯 ¿Para qué sirve un mapa?

Los mapas son ideales cuando necesitas:

- Asociar identificadores con datos: como usuarios con sus contraseñas, nombres con edades, o productos con precios.
- Consultas rápidas por clave (como buscar un valor dado un identificador único).
- Organizar información en forma de diccionario o tabla.

> 📌 **Ejemplos del mundo real:**  
> - Diccionario (palabra = definición)  
> - Registro de notas (estudiante = nota)  
> - Carrito de compras (producto = cantidad)

---

## 1.2 🧩 ¿Qué es un par clave-valor?

Es la **unidad básica de almacenamiento** en un mapa.  
Cada entrada consiste en:

- Una **clave** (`key`): única dentro del mapa.
- Un **valor** (`value`): asociado a esa clave.

```java
mapa.put("Ciudad", "Santiago");
```

| Clave   | Valor     |
|---------|-----------|
| Ciudad  | Santiago  |

> 💡 Piensa en un mapa como una **tabla con dos columnas**: una para claves y otra para valores.

---

## 1.3 🔒 ¿Por qué la clave debe ser única?

- Las claves permiten **acceso directo** al valor.
- Si agregas una nueva entrada con una clave ya existente, **se sobrescribe el valor anterior**.

```java
mapa.put("Edad", 30);
mapa.put("Edad", 40); // Sobrescribe
System.out.println(mapa.get("Edad")); // 40
```

> ⚠️ Tener claves duplicadas **rompería la lógica de acceso eficiente**. Por eso están prohibidas.

---

## 1.4 💡 Ventajas de usar `Map`

| Ventaja                            | Descripción                                                  |
|------------------------------------|--------------------------------------------------------------|
| 🔎 Búsqueda rápida                 | Acceso directo al valor mediante la clave (`O(1)` en `HashMap`) |
| 🧼 Organización estructurada       | Cada dato está bien definido por su clave                    |
| 📌 Evita ambigüedades              | No hay claves repetidas                                       |
| 🎯 Versatilidad                    | Ideal para representar configuraciones, diccionarios, tablas, etc. |
| 🔁 Iteración eficiente             | Puedes recorrer claves, valores o ambos con facilidad        |

> 🧠 **Resumen:** Usa `Map` cuando necesites **asociar identificadores únicos con datos relacionados** y realizar búsquedas rápidas.


# 🔢 2. ¿Qué es un HashMap?

Un **`HashMap`** es una **clase de Java** que implementa la interfaz `Map`.  
Almacena los elementos como **pares clave-valor** y permite una **búsqueda muy rápida** gracias al uso de una **tabla hash**.

```java
Map<String, Integer> stock = new HashMap<>();
stock.put("Lápiz", 50);
stock.put("Cuaderno", 120);
```

> 🔍 Aquí `"Lápiz"` y `"Cuaderno"` son claves únicas. Los valores `50` y `120` representan su cantidad.

---

## 2.1 ⭐ Características principales

| Característica                   | HashMap                                           |
|----------------------------------|----------------------------------------------------|
| Claves únicas                    | ✅ No se permiten claves duplicadas                |
| Valores duplicados               | ✅ Sí se permiten                                  |
| Orden de los elementos           | ❌ No garantiza orden                              |
| Tiempo de acceso                 | ✅ Rápido (casi constante `O(1)`)                  |
| Permite `null` como clave        | ✅ Solo una clave `null`                           |
| Permite `null` como valor        | ✅ Sí, múltiples valores `null`                    |
| Sincronización (hilos)           | ❌ No es thread-safe (no seguro en multihilos)     |

> ⚠️ Si necesitas que los elementos estén ordenados, considera usar `TreeMap` o `LinkedHashMap`.

---

## 2.2 🚀 ¿Por qué es la implementación más usada?

`HashMap` es la implementación más común de `Map` por su:

- **Velocidad**: Acceso extremadamente rápido gracias al uso de hashing.
- **Flexibilidad**: Acepta cualquier tipo de objeto como clave y valor.
- **Facilidad de uso**: API clara y sencilla (`put()`, `get()`, `remove()`, `containsKey()`).
- **Uso general**: Funciona bien para la mayoría de los casos de uso cotidianos (almacenar configuraciones, contar elementos, manejar datos en pares).

> ✅ Es la opción por defecto cuando necesitas un `Map` y **no requieres orden específico** en los elementos.


# 🛠️ 3. Sintaxis y uso básico de un HashMap

Aprender a usar `HashMap` es esencial para trabajar con datos estructurados por clave. A continuación, te mostramos cómo declarar, crear y utilizarlo con sus métodos más comunes.

---

## 3.1 📝 Declaración y creación

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> edades = new HashMap<>();
```

- Declaras un `Map` con claves tipo `String` y valores tipo `Integer`.
- Se instancia como un `HashMap`, que es la implementación más común.

---

## 3.2 ➕ Agregar pares (`.put()`)

```java
edades.put("Ana", 25);
edades.put("Luis", 30);
edades.put("Ana", 28); // Sobrescribe el valor anterior
```

- `.put(clave, valor)` agrega o actualiza el par clave-valor.
- Si la clave ya existe, su valor es reemplazado.

---

## 3.3 🔍 Acceder a valores (`.get()`)

```java
int edadAna = edades.get("Ana");
System.out.println("Edad de Ana: " + edadAna);
```

- `.get(clave)` devuelve el valor asociado a esa clave.
- Si la clave no existe, devuelve `null`.

---

## 3.4 ✅ Verificar claves (`.containsKey()`)

```java
boolean tieneLuis = edades.containsKey("Luis");
System.out.println("¿Está Luis? " + tieneLuis);
```

- `.containsKey(clave)` devuelve `true` si el mapa contiene esa clave.
- Útil para evitar errores con `.get()` en claves inexistentes.

---

## 3.5 ❌ Eliminar pares (`.remove()`)

```java
edades.remove("Ana");
```

- Elimina el par clave-valor asociado a la clave `"Ana"`.

---

## 3.6 📏 Tamaño del mapa (`.size()`)

```java
System.out.println("Cantidad de elementos: " + edades.size());
```

- `.size()` devuelve cuántos pares hay actualmente en el mapa.

---

## 3.7 🧼 Limpiar el mapa (`.clear()`)

```java
edades.clear();
System.out.println("Mapa limpio: " + edades);
```

- `.clear()` elimina todos los elementos del mapa.

---

> 🧠 Consejo práctico: Usa `containsKey()` antes de `get()` si no estás seguro si la clave existe, para evitar valores nulos inesperados.


# 🧪 4. Ejemplo completo paso a paso

```java
import java.util.HashMap;
import java.util.Map;

public class DemoMapa {
    public static void main(String[] args) {
        Map<String, String> contactos = new HashMap<>();

        contactos.put("Carlos", "1234");
        contactos.put("Ana", "5678");
        contactos.put("Pedro", "9999");

        System.out.println("Contactos: " + contactos);

        String telefonoAna = contactos.get("Ana");
        System.out.println("Teléfono de Ana: " + telefonoAna);

        boolean tienePedro = contactos.containsKey("Pedro");
        System.out.println("¿Está Pedro? " + tienePedro);

        contactos.remove("Carlos");
        System.out.println("Después de eliminar a Carlos: " + contactos);

        System.out.println("Tamaño: " + contactos.size());

        contactos.clear();
        System.out.println("Vacío: " + contactos);
    }
}
```

---

# ⚠️ 5. Errores comunes con mapas

| Error | Descripción | Consecuencia |
|-------|-------------|--------------|
| ❌ Acceder a una clave inexistente con `.get()` | Devuelve `null` | Posibles `NullPointerException` |
| ❌ Confundir `put` con `replace` | `put` reemplaza sin advertencia | Se sobrescriben datos sin notificación |
| ❌ Usar `null` como clave con múltiples valores | Solo una clave `null` es permitida | Puede causar errores lógicos |
| ❌ Iterar sin usar métodos adecuados | Modificar mapa durante iteración directa | `ConcurrentModificationException` |

---

# ✅ 6. Buenas prácticas con mapas

- Declara el mapa usando la **interfaz `Map`**.
- Valida con `containsKey()` antes de usar `.get()`.
- Usa tipos de datos consistentes para clave y valor.
- Si los datos deben estar ordenados, considera `TreeMap` o `LinkedHashMap`.
- No uses `null` como clave salvo que sea estrictamente necesario.

---

# 🧬 7. Otras implementaciones de `Map`

## 7.1 🌳 `TreeMap`

- Mantiene las claves **ordenadas naturalmente** (por ejemplo, alfabéticamente).
- Basado en un **árbol rojo-negro**.
- Útil para mostrar datos en orden creciente de claves.

```java
Map<String, Integer> notas = new TreeMap<>();
```

## 7.2 🔗 `LinkedHashMap`

- Mantiene el **orden de inserción**.
- Ideal si quieres que los elementos se muestren tal como fueron agregados.
- Más rápida que `TreeMap`, pero más predecible que `HashMap`.

```java
Map<String, String> config = new LinkedHashMap<>();
```

---

# ⚖️ 8. Comparativa entre implementaciones de `Map`

| Implementación     | Orden de claves     | Permite `null` clave | Acceso rápido | Ideal para...                     |
|--------------------|----------------------|------------------------|---------------|-----------------------------------|
| `HashMap`          | ❌ No garantiza orden | ✅ Sí (una clave)      | ✅ Muy rápido  | Uso general sin necesidad de orden |
| `TreeMap`          | ✅ Orden natural      | ❌ No                  | ⚠️ Más lento   | Datos ordenados automáticamente   |
| `LinkedHashMap`    | ✅ Orden de inserción | ✅ Sí                  | ✅ Bueno       | Orden reproducible                |

---

# 📚 9. Glosario técnico

| Término           | Definición                                                  |
|------------------|-------------------------------------------------------------|
| `Map`            | Interfaz que define una estructura de pares clave-valor     |
| `HashMap`        | Implementación común de `Map` basada en tablas hash         |
| `put()`          | Inserta o actualiza un par clave-valor                      |
| `get()`          | Recupera el valor asociado a una clave                     |
| `containsKey()`  | Verifica si una clave existe                                |
| `remove()`       | Elimina un par clave-valor                                  |
| `size()`         | Devuelve la cantidad de pares                               |
| `clear()`        | Elimina todos los elementos del mapa                        |
| `TreeMap`        | Mapa ordenado por clave                                     |
| `LinkedHashMap`  | Mapa que mantiene el orden de inserción                     |

---

# ❓ 10. Preguntas frecuentes (FAQ)

### ❓ ¿Puedo tener claves repetidas en un `Map`?
> ❌ No. Cada clave debe ser única.

### ❓ ¿Qué pasa si hago `.get()` con una clave inexistente?
> Retorna `null`.

### ❓ ¿Qué pasa si agrego un valor con una clave ya existente?
> El valor anterior se sobrescribe sin advertencia.

### ❓ ¿Cuál implementación es mejor?
> Depende del caso:
- `HashMap` para velocidad sin orden.
- `TreeMap` para orden automático.
- `LinkedHashMap` para mantener orden de inserción.

### ❓ ¿Puedo usar tipos primitivos como clave?
> ❌ No directamente. Usa clases envoltorio como `Integer`, `Double`, etc.
