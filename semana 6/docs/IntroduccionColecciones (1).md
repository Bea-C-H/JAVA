# 📘 Colecciones en Java: Introducción Técnica

## 📌 Definición

La API de colecciones de Java forma parte del paquete `java.util` y proporciona un conjunto de **interfaces y clases que representan estructuras de datos dinámicas**. Su objetivo es facilitar el almacenamiento, recuperación, manipulación y transmisión de grupos de objetos de manera eficiente y genérica.

---

## 🔰 Interfaces clave

### 1. `Collection<E>`

- Es la **interfaz raíz** para la mayoría de las colecciones.
- Define operaciones básicas como `add()`, `remove()`, `size()`, `iterator()`, etc.
- Subinterfaces principales: `List`, `Set`, `Queue`.

### 2. `List<E>`

- Ordenada, permite elementos duplicados.
- Acceso posicional (`get(index)`).
- Implementaciones: `ArrayList`, `LinkedList`, `Vector`.

### 3. `Set<E>`

- No permite elementos duplicados.
- No garantiza orden, excepto `LinkedHashSet` o `TreeSet`.
- Implementaciones: `HashSet`, `LinkedHashSet`, `TreeSet`.

### 4. `Map<K, V>`

- Almacena **pares clave-valor**.
- Cada clave es única, los valores pueden repetirse.
- No extiende de `Collection`, pero forma parte del ecosistema.
- Implementaciones: `HashMap`, `TreeMap`, `LinkedHashMap`, `Hashtable`.

---

## 🔍 Comparación general de estructuras

| Estructura   | Permite duplicados | Ordenado                           | Claves únicas | Acceso por índice | Casos de uso                                 |
| ------------ | ------------------ | ---------------------------------- | ------------- | ----------------- | -------------------------------------------- |
| `ArrayList`  | ✅ Sí              | ✅ Sí                              | -             | ✅ Sí             | Listas dinámicas, procesamiento secuencial   |
| `LinkedList` | ✅ Sí              | ✅ Sí                              | -             | ✅ Sí             | Insertar/eliminar en extremos frecuentemente |
| `HashSet`    | ❌ No              | ❌ No                              | -             | ❌ No             | Garantizar unicidad                          |
| `TreeSet`    | ❌ No              | ✅ Sí (orden natural o comparator) | -             | ❌ No             | Elementos únicos ordenados                   |
| `HashMap`    | Claves: ❌ No      | ❌ No                              | ✅ Sí         | ❌ No             | Diccionarios, asociaciones                   |
| `TreeMap`    | Claves: ❌ No      | ✅ Sí                              | ✅ Sí         | ❌ No             | Diccionarios ordenados                       |

---

## 🧪 Tipos de uso más comunes

- **`List`**: Almacenar datos con orden, permitir duplicados (lista de compras, tareas).
- **`Set`**: Asegurar unicidad (usuarios únicos, emails no repetidos).
- **`Map`**: Asociar claves a valores (ID → nombre, email → usuario).

---

## 📦 Paquete de origen

Todas las clases de colecciones están ubicadas en el paquete:

```java
import java.util.*;
```

🔐 Sobre Generics <E>, <K, V>
Las colecciones modernas en Java son genéricas, lo que significa que puedes especificar el tipo de dato que almacenan para evitar errores de casting:

```java
List<String> nombres = new ArrayList<>();
Map<String, Integer> puntuaciones = new HashMap<>();
```

## 🧠 ¿Qué se espera que domines después de este módulo?

- Entender las diferencias entre `List`, `Set` y `Map`.
- Elegir la colección adecuada según el problema a resolver.
- Aplicar estructuras de datos dinámicas correctamente usando genéricos (`<E>`, `<K, V>`).
- Utilizar iteradores y métodos comunes como `add`, `remove`, `get`, `contains`, etc.

---

Este contenido está pensado para que los alumnos lo usen como **apunte técnico**: pueden imprimirlo o tenerlo en su repositorio como documentación de consulta.

---
