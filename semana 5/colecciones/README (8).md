# ☕️ Guía Esencial de Colecciones en Java

En Java, una **colección** es una estructura que nos permite **almacenar, organizar y manipular datos** de forma eficiente. Las colecciones son parte del paquete `java.util` y están basadas en **interfaces**, lo que permite flexibilidad y reutilización de código.

---

## 📦 ¿Qué es una Interface en Java?

Una **interface** en Java define un **contrato**: qué debe hacer una clase, pero **no cómo lo hace**.  
Las colecciones se definen como interfaces para que puedas elegir la implementación que mejor se ajuste a tu caso (`ArrayList`, `HashSet`, `TreeMap`, etc.).

🧠 **Analogía:**  
Imagina una interfaz como una "lista de funciones obligatorias" que debe tener un electrodoméstico (como "encender", "apagar", "mostrar estado"). Luego puedes tener un "microondas", "refrigerador" o "hervidor" que implementan ese contrato, cada uno a su manera.

---

## 🔎 Colecciones más usadas

| Tipo       | Subtipo (implementaciones comunes) | Características principales                                        |
|------------|-------------------------------------|---------------------------------------------------------------------|
| `Array`    | `int[]`, `String[]`, etc.           | Tamaño fijo, rápido, acceso directo por índice                     |
| `List`     | `ArrayList`, `LinkedList`           | Ordenada, permite duplicados, acceso por índice                    |
| `Set`      | `HashSet`, `TreeSet`                | No permite duplicados, sin orden garantizado                       |
| `Map`      | `HashMap`, `TreeMap`, `LinkedHashMap`| Pares clave-valor, claves únicas, acceso por clave                 |
| `Stream`   | `Stream<T>`                         | API funcional para recorrer, filtrar, transformar colecciones      |

---

## ✅ Conclusión

Este ejercicio muestra claramente:

| Técnica | Elimina duplicados | Ordena | Filtra | Modifica | Más limpio |
| ------- | ------------------ | ------ | ------ | -------- | ---------- |
| Array   | 🟡 Manual          | ✅     | ✅     | ✅       | ❌         |
| List    | 🟡 Manual          | ✅     | ✅     | ✅       | 🟡         |
| Set     | ✅ Automático      | ❌     | ✅     | ✅       | ✅         |
| Map     | ✅ Clave única     | 🟡     | ✅     | ✅       | ❌         |
| Stream  | ✅ Automático      | ✅     | ✅     | ✅       | ✅✅       |

---

## 🧠 Resumen de estructuras

| Estructura | Es una...                | Permite duplicados | Tamaño dinámico | Orden garantizado    | Acceso por índice | Útil para...                             |
| ---------- | ------------------------ | ------------------ | --------------- | -------------------- | ----------------- | ---------------------------------------- |
| `Array`    | Estructura básica        | ✅ Sí               | ❌ No            | ✅ Sí                 | ✅ Sí              | Datos fijos y simples                    |
| `List`     | Colección ordenada       | ✅ Sí               | ✅ Sí            | ✅ Sí                 | ✅ Sí              | Manejar listas de datos                  |
| `Set`      | Colección sin duplicados | ❌ No               | ✅ Sí            | ❌ Depende            | ❌ No              | Agrupar datos únicos                     |
| `Map`      | Pares clave-valor        | ❌ En claves        | ✅ Sí            | ❌ Depende            | ❌ No              | Asociar nombres, claves, configuraciones |
| `Stream`   | Flujo de procesamiento   | ✅/❌ depende        | —               | ✅ Si fuente lo tiene | ❌ No              | Filtrar, transformar, recolectar         |

---

## 🧪 Reglas rápidas para elegir

| Necesitas…                              | Usa…          |
|-----------------------------------------|---------------|
| Acceder por posición fija               | `Array`       |
| Agregar/quitar dinámicamente            | `List`        |
| Evitar valores repetidos                | `Set`         |
| Buscar por clave                        | `Map`         |
| Procesar datos de forma funcional       | `Stream`      |

---

## 🚀 Tips para recordar

- 🔢 **Array**: Tamaño fijo, acceso rápido.
- 📋 **List**: Lista ordenada y flexible.
- 🔒 **Set**: No repite elementos.
- 🗺️ **Map**: Clave → Valor, como un diccionario.
- 🌊 **Stream**: Ideal para procesar datos como en SQL o funciones lambda.

---

