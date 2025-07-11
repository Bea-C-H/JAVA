# Semana 4: Variables y Operadores en Java

## 📋 Tabla de Contenidos
- [Variables en Java](#variables-en-java)
    - [Tipos de Datos Primitivos](#tipos-de-datos-primitivos)
    - [Tipos de Datos de Referencia](#tipos-de-datos-de-referencia)
    - [Comparación entre Tipos](#comparación-entre-tipos)
- [Operadores en Java](#operadores-en-java)
    - [Operadores Aritméticos](#operadores-aritméticos)
    - [Operadores de Asignación](#operadores-de-asignación)
    - [Operadores Relacionales](#operadores-relacionales)
    - [Operadores Lógicos](#operadores-lógicos)
    - [Operadores Bit a Bit](#operadores-bit-a-bit)
    - [Operadores de Incremento/Decremento](#operadores-de-incrementodecremento)
- [Ejemplos Prácticos](#ejemplos-prácticos)

---

## Variables en Java


## Variables en Java

### Declaración vs Inicialización

**Declaración:** Define el tipo y nombre de la variable, reserva espacio en memoria.
**Inicialización:** Asigna un valor inicial a la variable.

```java
// DECLARACIÓN (solo se define, no tiene valor)
int edad;           // Variable declarada pero no inicializada
String nombre;      // Variable declarada pero no inicializada

// INICIALIZACIÓN (se asigna valor después)
edad = 25;          // Ahora se inicializa con valor 25
nombre = "Juan";    // Ahora se inicializa con "Juan"

// DECLARACIÓN E INICIALIZACIÓN EN UNA LÍNEA
int altura = 180;           // Declarada e inicializada al mismo tiempo
double salario = 1500.50;   // Declarada e inicializada al mismo tiempo
```

### Constantes con `final`

Las constantes son variables cuyo valor **NO puede cambiar** una vez asignado. Se declaran con la palabra clave `final`.

```java
// CONSTANTES - No pueden cambiar su valor
final double PI = 3.14159;          // Constante matemática
final int DIAS_SEMANA = 7;          // Constante de días
final String EMPRESA = "TechCorp";  // Constante de texto

// ERROR: No se puede modificar una constante
// PI = 3.14;  // ¡Esto causaría un error de compilación!
```

**Convenciones para constantes:**
- Se escriben en **MAYÚSCULAS**
- Las palabras se separan con **guión bajo (_)**
- Siempre se inicializan al declararlas


### Diferencias Clave

| Aspecto | Variables | Constantes |
|---------|-----------|------------|
| **Palabra clave** | No requiere | `final` |
| **Cambio de valor** | ✅ Permitido | ❌ Prohibido |
| **Convención de nombres** | camelCase | MAYUSCULAS_CON_GUION |
| **Inicialización** | Puede ser posterior | Debe ser inmediata |
| **Uso típico** | Datos que varían | Valores fijos (PI, IVA, etc.) |



### Tipos de Datos Primitivos

Los tipos de datos primitivos son los tipos básicos que Java proporciona para almacenar valores simples. Se almacenan directamente en la memoria stack.

| Tipo | Tamaño | Rango | Valor por Defecto | Ejemplo |
|------|--------|-------|-------------------|---------|
| `byte` | 8 bits | -128 a 127 | 0 | `byte edad = 25;` |
| `short` | 16 bits | -32,768 a 32,767 | 0 | `short temperatura = -10;` |
| `int` | 32 bits | -2³¹ a 2³¹-1 | 0 | `int poblacion = 1000000;` |
| `long` | 64 bits | -2⁶³ a 2⁶³-1 | 0L | `long distancia = 9876543210L;` |
| `float` | 32 bits | ±3.4E38 (6-7 dígitos) | 0.0f | `float pi = 3.14f;` |
| `double` | 64 bits | ±1.7E308 (15-16 dígitos) | 0.0d | `double precision = 3.141592653589793;` |
| `char` | 16 bits | 0 a 65,535 (Unicode) | '\u0000' | `char letra = 'A';` |
| `boolean` | 1 bit | true o false | false | `boolean activo = true;` |

#### Ejemplo de Declaración:
```java
// Declaración e inicialización de variables primitivas
byte numeroByte = 127;
short numeroShort = 32767;
int numeroInt = 2147483647;
long numeroLong = 9223372036854775807L;
float numeroFloat = 3.1416f;
double numeroDouble = 3.141592653589793;
char caracter = 'A';
boolean esVerdadero = true;
```

### Tipos de Datos de Referencia

Los tipos de referencia almacenan referencias a objetos en memoria heap. Incluyen clases, interfaces y arrays.

| Tipo | Descripción | Valor por Defecto | Ejemplo |
|------|-------------|-------------------|---------|
| `String` | Cadena de caracteres | null | `String nombre = "Juan";` |
| `Integer` | Clase envolvente de int | null | `Integer numero = 100;` |
| `Double` | Clase envolvente de double | null | `Double valor = 3.14;` |
| `Boolean` | Clase envolvente de boolean | null | `Boolean estado = true;` |
| Arrays | Estructura de datos | null | `int[] numeros = {1, 2, 3};` |

#### Ejemplo de Declaración:
```java
// Tipos de datos de referencia (Objetos)
String cadenaTexto = "Hola, mundo";
Integer numeroInteger = 100;
Double numeroDoubleObjeto = 3.14;
Boolean esBoolean = true;
```

### Comparación entre Tipos

| Característica | Tipos Primitivos | Tipos de Referencia |
|----------------|------------------|---------------------|
| **Almacenamiento** | Stack (valor directo) | Heap (referencia en stack) |
| **Valor por defecto** | Valores específicos (0, false, etc.) | null |
| **Comparación** | `==` compara valores | `==` compara referencias |
| **Métodos** | No tienen métodos | Tienen métodos |
| **Memoria** | Menos memoria | Más memoria |
| **Rendimiento** | Más rápido | Más lento |

---

## Operadores en Java

### Operadores Aritméticos

Realizan operaciones matemáticas básicas entre operandos numéricos.

| Operador | Descripción | Ejemplo | Resultado |
|----------|-------------|---------|-----------|
| `+` | Suma | `10 + 5` | 15 |
| `-` | Resta | `10 - 5` | 5 |
| `*` | Multiplicación | `10 * 5` | 50 |
| `/` | División | `10 / 5` | 2 |
| `%` | Módulo (resto) | `10 % 3` | 1 |

#### Ejemplo Práctico:
```java
int a = 10, b = 5;
System.out.println("Suma: " + (a + b));           // 15
System.out.println("Resta: " + (a - b));          // 5
System.out.println("Multiplicación: " + (a * b)); // 50
System.out.println("División: " + (a / b));       // 2
System.out.println("Módulo: " + (a % b));         // 0
```

### Operadores de Asignación

Asignan valores a variables y pueden combinar asignación con operaciones aritméticas.

| Operador | Descripción | Equivalente | Ejemplo |
|----------|-------------|-------------|---------|
| `=` | Asignación simple | - | `x = 5` |
| `+=` | Suma y asigna | `x = x + y` | `x += 3` |
| `-=` | Resta y asigna | `x = x - y` | `x -= 2` |
| `*=` | Multiplica y asigna | `x = x * y` | `x *= 4` |
| `/=` | Divide y asigna | `x = x / y` | `x /= 2` |
| `%=` | Módulo y asigna | `x = x % y` | `x %= 3` |

#### Ejemplo Práctico:
```java
int c = 10;
System.out.println("c = " + c);      // 10
c += 5;  // c = c + 5
System.out.println("c += 5 -> " + c); // 15
c -= 2;  // c = c - 2
System.out.println("c -= 2 -> " + c); // 13
c *= 3;  // c = c * 3
System.out.println("c *= 3 -> " + c); // 39
```

### Operadores Relacionales

Comparan dos valores y devuelven un resultado booleano (true o false).

| Operador | Descripción | Ejemplo | Resultado |
|----------|-------------|---------|-----------|
| `>` | Mayor que | `10 > 5` | true |
| `<` | Menor que | `10 < 5` | false |
| `>=` | Mayor o igual que | `10 >= 10` | true |
| `<=` | Menor o igual que | `5 <= 10` | true |
| `==` | Igual a | `10 == 10` | true |
| `!=` | Diferente de | `10 != 5` | true |

#### Ejemplo Práctico:
```java
int a = 10, b = 5;
System.out.println("a > b: " + (a > b));   // true
System.out.println("a < b: " + (a < b));   // false
System.out.println("a >= b: " + (a >= b)); // true
System.out.println("a == b: " + (a == b)); // false
System.out.println("a != b: " + (a != b)); // true
```

### Operadores Lógicos

Operan con valores booleanos y devuelven resultados booleanos.

| Operador | Descripción | Símbolo | Ejemplo | Resultado |
|----------|-------------|---------|---------|-----------|
| `&&` | AND lógico | Y | `true && false` | false |
| `\|\|` | OR lógico | O | `true \|\| false` | true |
| `!` | NOT lógico | NO | `!true` | false |

#### Tabla de Verdad:

| A | B | A && B | A \|\| B | !A |
|---|---|--------|----------|-----|
| true | true | true | true | false |
| true | false | false | true | false |
| false | true | false | true | true |
| false | false | false | false | true |

#### Ejemplo Práctico:
```java
boolean x = true, y = false;
System.out.println("x && y (AND): " + (x && y)); // false
System.out.println("x || y (OR): " + (x || y));  // true
System.out.println("!x (NOT): " + (!x));         // false
```

### Operadores Bit a Bit

Operan directamente sobre los bits de los números enteros.

| Operador | Descripción | Ejemplo | Resultado |
|----------|-------------|---------|-----------|
| `&` | AND bit a bit | `5 & 3` | 1 |
| `\|` | OR bit a bit | `5 \| 3` | 7 |
| `^` | XOR bit a bit | `5 ^ 3` | 6 |
| `~` | NOT bit a bit | `~5` | -6 |
| `<<` | Desplazamiento izquierda | `5 << 1` | 10 |
| `>>` | Desplazamiento derecha | `5 >> 1` | 2 |

#### Ejemplo con Representación Binaria:
```java
int d = 5, e = 3; // 5 = 101 binario, 3 = 011 binario
System.out.println("d & e: " + (d & e));  // 101 & 011 = 001 (1)
System.out.println("d | e: " + (d | e));  // 101 | 011 = 111 (7)
System.out.println("d ^ e: " + (d ^ e));  // 101 ^ 011 = 110 (6)
System.out.println("~d: " + (~d));        // ~101 = -6
```

### Operadores de Incremento/Decremento

Aumentan o disminuyen el valor de una variable en 1.

| Operador | Descripción | Cuándo se aplica | Ejemplo |
|----------|-------------|------------------|---------|
| `++x` | Pre-incremento | Antes de usar el valor | `int y = ++x;` |
| `x++` | Post-incremento | Después de usar el valor | `int y = x++;` |
| `--x` | Pre-decremento | Antes de usar el valor | `int y = --x;` |
| `x--` | Post-decremento | Después de usar el valor | `int y = x--;` |

#### Ejemplo Comparativo:
```java
int f = 10;
System.out.println("f = " + f);                    // 10
System.out.println("f++ (post): " + (f++));        // 10 (usa, luego incrementa)
System.out.println("Después de f++: " + f);        // 11
System.out.println("++f (pre): " + (++f));         // 12 (incrementa, luego usa)
System.out.println("f-- (post): " + (f--));        // 12 (usa, luego decrementa)
System.out.println("--f (pre): " + (--f));         // 10 (decrementa, luego usa)
```

---

## 🎯 Puntos Clave para Recordar

1. **Tipos Primitivos vs Referencia**: Los primitivos almacenan valores directamente, los de referencia almacenan direcciones de memoria.

2. **Precedencia de Operadores**: Los operadores tienen un orden de evaluación específico. Use paréntesis para claridad.

3. **Conversión de Tipos**: Java puede realizar conversiones automáticas (widening) pero requiere casting explícito para narrowing.

4. **Operadores de Corto Circuito**: `&&` y `||` no evalúan el segundo operando si no es necesario.

5. **Cuidado con División por Cero**: Puede causar excepciones en tiempo de ejecución.

---

## 📚 Recursos Adicionales

- [Documentación Oficial de Oracle - Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
- [Documentación Oficial de Oracle - Operadores](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
- [Java Primitives vs Objects](https://www.baeldung.com/java-primitives-vs-objects)

---
