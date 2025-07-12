# 🎯 Estructuras de Control Condicionales en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📚 Índice de Contenidos

- [🔍 Introducción](#-introducción)
- [🎪 Estructura IF](#-estructura-if)
- [🔄 Estructura ELSE](#-estructura-else)
- [🏗️ IF Anidados](#️-if-anidados)
- [⚡ Operador Ternario](#-operador-ternario)
- [🎛️ Estructura SWITCH](#️-estructura-switch)
- [📊 Tabla Comparativa](#-tabla-comparativa)
- [💡 Buenas Prácticas](#-buenas-prácticas)
- [🔗 Referencias](#-referencias)

---

## 🔍 Introducción

Las **estructuras de control condicionales** en Java permiten que un programa tome decisiones basadas en condiciones específicas. Estas estructuras son fundamentales para crear lógica de programación dinámica y responsive.

### ¿Por qué son importantes?
- ✅ Permiten la toma de decisiones en tiempo de ejecución
- ✅ Hacen que el código sea más dinámico e interactivo
- ✅ Controlan el flujo de ejecución del programa
- ✅ Implementan lógica condicional compleja

---

## 🎪 Estructura IF

### 📖 Descripción

La estructura `if` es la forma más básica de control condicional. Ejecuta un bloque de código **solo si** la condición especificada es verdadera (`true`).

### 🏗️ Sintaxis Básica

```java
if (condición) {
    // Código a ejecutar si la condición es verdadera
}
```

### 📋 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Condición** | Debe ser una expresión booleana |
| **Llaves {}** | Opcionales para una sola instrucción |
| **Evaluación** | Se evalúa de izquierda a derecha |
| **Tipo de dato** | La condición debe retornar `boolean` |



### ⚠️ Consideraciones Importantes

- La condición debe ser de tipo `boolean`
- Las llaves `{}` son recomendables incluso para una sola instrucción
- Se puede usar con operadores lógicos (`&&`, `||`, `!`)

---

## 🔄 Estructura ELSE

### 📖 Descripción

La estructura `else` se utiliza junto con `if` para especificar un bloque de código que se ejecuta cuando la condición del `if` es falsa (`false`). Proporciona una alternativa de ejecución.

### 🏗️ Sintaxis Básica

```java
if (condición) {
    // Código si la condición es verdadera
} else {
    // Código si la condición es falsa
}
```

### 📋 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Dependencia** | Siempre debe ir después de un `if` |
| **Ejecución** | Se ejecuta solo si la condición del `if` es falsa |
| **Obligatorio** | No es obligatorio usar `else` |
| **Alternativa** | Proporciona una ruta alternativa de ejecución |



### 🎯 Ventajas del ELSE

- ✅ Garantiza que siempre se ejecute una acción
- ✅ Mejora la legibilidad del código
- ✅ Evita condiciones redundantes
- ✅ Proporciona rutas de ejecución claras

---

## 🏗️ IF Anidados

### 📖 Descripción

Los **IF anidados** son estructuras `if` que se encuentran dentro de otras estructuras `if`. Permiten crear lógica condicional más compleja y detallada, evaluando múltiples niveles de condiciones.

### 🏗️ Sintaxis Básica

```java
if (condición1) {
    if (condición2) {
        // Código si ambas condiciones son verdaderas
    } else {
        // Código si condición1 es verdadera pero condición2 es falsa
    }
} else {
    // Código si condición1 es falsa
}
```

### 📋 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Niveles** | Pueden tener múltiples niveles de anidación |
| **Evaluación** | Se evalúan de afuera hacia adentro |
| **Legibilidad** | Pueden hacer el código más difícil de leer |
| **Alternativa** | Se pueden reemplazar con operadores lógicos |



### ⚠️ Consideraciones sobre IF Anidados

#### Ventajas ✅
- Permiten lógica compleja y detallada
- Control granular de condiciones
- Evaluación paso a paso

#### Desventajas ❌
- Pueden hacer el código difícil de leer
- Mayor probabilidad de errores
- Dificultan el mantenimiento

#### Alternativas Recomendadas
- Usar operadores lógicos (`&&`, `||`)
- Métodos auxiliares para simplificar la lógica
- Patrones de diseño como Strategy

---

## ⚡ Operador Ternario

### 📖 Descripción

El **operador ternario** (`? :`) es una forma concisa de escribir una estructura `if-else` simple. Es el único operador en Java que toma tres operandos y es muy útil para asignaciones condicionales.

### 🏗️ Sintaxis Básica

```java
variable = (condición) ? valorSiVerdadero : valorSiFalso;
```

### 📋 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Operandos** | Requiere exactamente 3 operandos |
| **Tipo** | Ambos valores deben ser del mismo tipo |
| **Retorno** | Siempre retorna un valor |
| **Concisión** | Más compacto que if-else |



### 📊 Comparación IF-ELSE vs Ternario

| Aspecto | IF-ELSE | Operador Ternario |
|---------|---------|-------------------|
| **Líneas de código** | 5-7 líneas | 1 línea |
| **Legibilidad** | Más clara para lógica compleja | Más clara para casos simples |
| **Performance** | Misma performance | Misma performance |
| **Uso recomendado** | Lógica compleja | Asignaciones simples |

### ⚠️ Buenas Prácticas con Ternario

#### ✅ Usar cuando:
- La lógica es simple y clara
- Se necesita asignar un valor basado en una condición
- Se quiere código más conciso

#### ❌ Evitar cuando:
- La lógica es compleja
- Se necesitan múltiples declaraciones
- Reduce la legibilidad del código

---

## 🎛️ Estructura SWITCH

### 📖 Descripción

La estructura `switch` es una alternativa al `if-else` cuando se necesita comparar una variable con múltiples valores posibles. Es especialmente útil cuando se tienen muchas condiciones basadas en el mismo valor.

### 🏗️ Sintaxis Básica

```java
switch (variable) {
    case valor1:
        // Código para valor1
        break;
    case valor2:
        // Código para valor2
        break;
    default:
        // Código por defecto
        break;
}
```

### 📋 Características Principales

| Característica | Descripción |
|---------------|-------------|
| **Tipos soportados** | byte, short, int, char, String, enum |
| **Break** | Necesario para evitar fall-through |
| **Default** | Opcional, se ejecuta si no hay coincidencias |
| **Case** | Los valores deben ser constantes |



### 🆚 SWITCH vs IF-ELSE

| Aspecto | SWITCH | IF-ELSE |
|---------|--------|---------|
| **Legibilidad** | Mejor para múltiples valores | Mejor para condiciones complejas |
| **Performance** | Más eficiente con muchos casos | Similar performance |
| **Flexibilidad** | Solo igualdad | Cualquier condición booleana |
| **Tipos** | Limitado a ciertos tipos | Cualquier expresión booleana |

---

## 📊 Tabla Comparativa

### Comparación de Todas las Estructuras

| Estructura | Casos de Uso | Ventajas | Desventajas |
|------------|--------------|----------|-------------|
| **IF** | Condiciones simples | Fácil de entender | Puede volverse repetitivo |
| **IF-ELSE** | Dos alternativas | Clara dicotomía | Limitado a dos opciones |
| **IF Anidados** | Lógica compleja | Control granular | Difícil de leer |
| **Ternario** | Asignaciones condicionales | Muy conciso | Limitado a expresiones simples |
| **SWITCH** | Múltiples valores fijos | Eficiente y claro | Solo para igualdades |

### Rendimiento y Eficiencia

| Estructura | Complejidad | Recomendación |
|------------|-------------|---------------|
| **IF simple** | O(1) | Para 1-2 condiciones |
| **IF-ELSE múltiple** | O(n) | Para 3-5 condiciones |
| **SWITCH** | O(1) - O(log n) | Para 6+ valores fijos |
| **Ternario** | O(1) | Para asignaciones simples |

---

## 💡 Buenas Prácticas

### 🎯 Principios Generales

#### 1. **Claridad sobre Brevedad**
```java
// ❌ Evitar: Difícil de leer
String resultado = (x > 0) ? (y > 0) ? "Ambos positivos" : "X positivo" : "X no positivo";

// ✅ Preferir: Más claro
String resultado;
if (x > 0 && y > 0) {
    resultado = "Ambos positivos";
} else if (x > 0) {
    resultado = "X positivo";
} else {
    resultado = "X no positivo";
}
```

#### 2. **Usar Llaves Siempre**
```java
// ❌ Evitar
if (condicion)
    hacerAlgo();

// ✅ Preferir
if (condicion) {
    hacerAlgo();
}
```

#### 3. **Condiciones Positivas**
```java
// ❌ Evitar dobles negaciones
if (!esInvalido) {
    // código
}

// ✅ Preferir condiciones positivas
if (esValido) {
    // código
}
```

### 🔧 Optimizaciones

#### 1. **Ordenar Condiciones por Probabilidad**
```java
// ✅ Condiciones más probables primero
if (esUsuarioComun) {
    // 80% de los casos
} else if (esUsuarioVIP) {
    // 15% de los casos
} else if (esAdministrador) {
    // 5% de los casos
}
```

#### 2. **Usar SWITCH para Múltiples Valores**
```java
// ❌ Múltiples IF para el mismo valor
if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5) {
    System.out.println("Día laboral");
}

// ✅ SWITCH es más claro
switch (dia) {
    case 1, 2, 3, 4, 5 -> System.out.println("Día laboral");
    case 6, 7 -> System.out.println("Fin de semana");
}
```

### 🚫 Errores Comunes

#### 1. **Olvidar Break en SWITCH**
```java
// ❌ Error: Fall-through no intencional
switch (opcion) {
    case 1:
        System.out.println("Opción 1");
        // Falta break - continuará al siguiente case
    case 2:
        System.out.println("Opción 2");
        break;
}
```

#### 2. **Condiciones Redundantes**
```java
// ❌ Redundante
if (edad >= 18) {
    if (edad >= 18) {  // Condición repetida
        // código
    }
}

// ✅ Simplificado
if (edad >= 18) {
    // código
}
```

---

## 🔗 Referencias

### 📚 Documentación Oficial
- [Oracle Java Documentation - Control Flow](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)

### 🎓 Recursos de Aprendizaje
- [Java Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)
- [Effective Java by Joshua Bloch](https://www.pearson.com/store/p/effective-java/P100000149326)


---

## 📝 Notas Finales

> **Recuerda**: Las estructuras de control son la base de la lógica de programación. La elección correcta de la estructura apropiada hace que tu código sea más legible, mantenible y eficiente.


