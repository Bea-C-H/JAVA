# Funciones en Java - Guia Paso a Paso

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)

> **📖 Basada en contenido visual educativo - Paso a paso con ejemplos prácticos**

## 📋 Tabla de Contenidos

1. [¿Qué es una función?](#1-qué-es-una-función)
   - [¿Cómo se ve en Java?](#cómo-se-ve-en-java)
   - [Sintaxis de una función](#11-sintaxis-de-una-función)
     - [Estructura general](#🧱-estructura-general)
     - [`tipo_retorno`](#110-tipo_retorno)
     - [`nombreDelMetodo`](#111-nombredelmetodo)
     - [`parametros`](#112-parametros)
     - [`cuerpo del método`](#113-cuerpo-del-método)
     - [`return` (opcional)](#114-return-opcional)
     - [Ejemplo completo detallado](#🧪-ejemplo-completo-detallado)
     - [Paso a paso para definir y utilizar una función](#115-📘-paso-a-paso-para-definir-y-utilizar-una-función-en-java)
     - [Analogía completa con receta](#🎨-analogía-completa-con-receta)
2. [Modificadores de Acceso en Java](#2-🔐-modificadores-de-acceso-en-java)
   - [¿Por qué son importantes?](#📚-por-qué-son-importantes)
   - [Tipos de modificadores de acceso](#🧱-tipos-de-modificadores-de-acceso-en-java)
   - [Tabla de acceso visual](#🔄-tabla-de-acceso-visual)
   - [Explicación con ejemplos y analogías](#🔍-explicación-con-ejemplos-y-analogías)
   - [Consejos para usar correctamente](#💡-consejos-para-usar-correctamente)
   - [Errores comunes](#🧠-errores-comunes)
   - [Ejemplo comparado entre clases](#👨‍🏫-ejemplo-comparado-entre-clases)
   - [Ejercicio sugerido](#🧪-ejercicio-sugerido)
3. [Funciones Estáticas y No Estáticas en Java](#3-⚙️-funciones-estáticas-y-no-estáticas-en-java)
   - [¿Qué son los métodos en Java?](#🔍-qué-son-los-métodos-en-java)
   - [¿Qué es un método estático?](#📌-qué-es-un-método-estático)
   - [¿Qué es un método no estático (de instancia)?](#📌-qué-es-un-método-no-estático-de-instancia)
   - [Comparativa resumida](#📊-comparativa-resumida)
   - [Buenas prácticas](#🧠-buenas-prácticas)
   - [Errores comunes](#⚠️-errores-comunes)
   - [Ejercicio práctico sugerido](#💻-ejercicio-práctico-sugerido)
4. [API de Java y sus métodos](#4-📚-api-de-java-y-sus-métodos-uso-práctico-y-explicado-desde-cero)
   - [Para la manipulación de textos con String](#🧵-para-la-manipulación-de-textos-con-string-javalang)
   - [Para operaciones matemáticas con Math](#➕-para-operaciones-matemáticas-con-math-javalang)
   - [Para estructuras de datos](#📦-para-estructuras-de-datos-javautil)
5. [La Refactorización en Java](#5-🔍-la-refactorización-en-java)

---

# 1. ¿Qué es una función?

Una **función** (también llamada **método** en Java) es un bloque de código que realiza una tarea específica y puede ser invocado o llamado desde otro lugar en el programa. Se usan para modularizar el código, evitar repeticiones y hacer que sea más fácil de mantener.

> 💡 **Analogía**: Una función es como una receta de cocina - tienes ingredientes (parámetros), sigues pasos (código), y obtienes un resultado (valor de retorno).

### ¿Cómo se ve en Java?

Las funciones en Java tienen **componentes específicos** que debemos entender:

```java
[modificadorAcceso] [static] tipoRetorno nombreMetodo(parametros) {
    // código que ejecuta la función
    return valor; // solo si retorna algo
}
```

## 1.1 Sintaxis de una función

Para escribir una función en Java, necesitas definir varios elementos en un orden específico. Vamos a verlos de manera sencilla, con ejemplos y analogías.

### 🧱 Estructura general:

```java
tipo_retorno nombreDelMetodo(parametros) {
    // Cuerpo del método
    return valor;
}
```

Ahora veamos qué significa cada parte:

---

### 1.1.0 `tipo_retorno`

Es el tipo de dato que la función devolverá como resultado.

- Si la función devuelve un número, será `int`, `double`, etc.
- Si devuelve un texto, será `String`.
- Si no devuelve nada, se usa `void`.

📌 **Ejemplos**:

```java
public int obtenerEdad() { return 25; }     // devuelve un entero
public String obtenerNombre() { return "Ana"; } // devuelve un texto
public void saludar() { System.out.println("Hola"); } // no devuelve nada
```

🎲 **Analogía**: El tipo de retorno es como el tipo de producto que hace una máquina: ¿devuelve una pizza? 🍕 ¿devuelve una factura? 🧾 ¿o simplemente hace ruido pero no devuelve nada? 📢

---

### 1.1.1 `nombreDelMetodo`

Es el nombre que le das a tu función. Debe ser representativo de lo que hace.

📌 **Ejemplos**:

```java
public void imprimirMensaje() { ... }
public int sumar() { ... }
```

🔤 **Consejo**: Usa nombres que empiecen con un verbo si realizan una acción (`calcularPromedio`, `mostrarAlerta`).

🎲 **Analogía**: Es como el nombre que le das a una receta para poder buscarla luego en tu recetario. Si la receta se llama "hacerPanqueques", sabes qué esperar.

---

### 1.1.2 `parametros`

Son los datos que le das a la función para que los use internamente.

📌 **Ejemplos**:

```java
public int sumar(int a, int b) { return a + b; } // recibe dos enteros
public void saludar(String nombre) { System.out.println("Hola " + nombre); } // recibe un texto
```

🎲 **Analogía**: Los parámetros son los ingredientes que le pasas a la receta para que funcione bien. Si quieres una pizza de champiñones, debes pasarle champiñones 🍄.

---

### 1.1.3 `cuerpo del método`

Es el conjunto de instrucciones que definen qué hace la función. Va entre llaves `{}` y puede tener una o muchas líneas de código.

📌 **Ejemplo**:

```java
public void saludar(String nombre) {
    System.out.println("Hola " + nombre);
}
```

🎲 **Analogía**: Es como el paso a paso dentro de una receta: mezcla, hornea, espera...

---

### 1.1.4 `return` (opcional)

La palabra `return` indica qué valor debe devolver la función cuando finaliza su ejecución.

📌 **Ejemplo**:

```java
public int cuadrado(int x) {
    return x * x;
}
```

🧠 Si el tipo de retorno es `void`, entonces no se necesita `return`, aunque puedes usar `return;` para salir anticipadamente.

🎲 **Analogía**: `return` es como decir "aquí tienes tu producto terminado". Si hiciste un pastel, `return` es cuando lo entregas 🎂.

---

### 🧪 Ejemplo completo detallado

```java
public class EjemploMetodo {

    // 1. Definición del método "sumar" con dos parámetros
    public static int sumar(int num1, int num2) {
        // 2. Operación: suma
        int resultado = num1 + num2;
        // 3. Devolver el resultado
        return resultado;
    }

    // 4. Método principal para ejecutar el programa
    public static void main(String[] args) {
        // 5. Llamada al método con valores 5 y 3
        int resultadoSuma = sumar(5, 3);
        // 6. Imprimir el resultado en consola
        System.out.println("La suma es: " + resultadoSuma);
    }
}
```

---

### 1.1.5 📘 Paso a paso para definir y utilizar una función en Java:

#### 🛠️ Para definirla:

1. Especifica el modificador de acceso (`public`).
2. Usa `static` si la función no requiere crear un objeto para usarse.
3. Define el tipo de retorno (`int`, `String`, etc.).
4. Asigna un nombre descriptivo (`sumar`).
5. Declara los parámetros que necesita (`int num1, int num2`).

#### 🧪 Para escribir su contenido:

1. Dentro de las llaves `{}`, escribe el bloque de código que realizará la tarea. Aquí es donde se escribe la lógica: operaciones matemáticas, condiciones `if`, ciclos `for`, llamadas a otros métodos, etc.

   - Este cuerpo puede ser tan simple como una línea o contener múltiples instrucciones.
   - Es buena práctica mantener el cuerpo claro y enfocado en una única responsabilidad.

2. Usa `return` si es necesario devolver un valor:

   - Es obligatorio usar `return` cuando el método tiene un tipo de retorno distinto de `void`.
   - También se puede usar para terminar la ejecución anticipadamente.
   - En funciones `void`, se puede usar simplemente `return;` sin valor, si se desea finalizar antes por alguna condición.

📌 **Ejemplo con múltiples instrucciones y retorno anticipado:**

```java
public int dividir(int a, int b) {
    if (b == 0) {
        System.out.println("No se puede dividir por cero");
        return -1; // retorno anticipado por error
    }
    int resultado = a / b;
    return resultado; // retorno final con el valor esperado
}
```

💡 **Consejo**: mantener el cuerpo del método claro y bien estructurado mejora la legibilidad y facilita la depuración del código.

🎲 **Analogía extendida**: Es como cuando cocinas: dentro de las llaves `{}` defines cada paso. Si algo falla (como que no hay huevos 🥚), puedes salir del proceso temprano (con `return`) sin continuar todo el procedimiento.

#### 📞 Para usar la función:

1. Llama a la función desde el método `main`, pasando los valores necesarios.
2. Guarda el resultado en una variable si hay retorno.

---

### 🎨 Analogía completa con receta:

- `tipo_retorno`: tipo de comida que prepararás (torta 🍰, jugo 🥤, nada ❌)
- `nombreDelMetodo`: el nombre de la receta (`hacerTorta`)
- `parametros`: ingredientes que se requieren (`harina`, `huevos`)
- `cuerpo del método`: pasos a seguir para cocinar
- `return`: cuando entregas el plato listo

Así como sigues una receta para cocinar, en programación sigues una estructura para definir y usar funciones correctamente 🍽️.

---

# 2. 🔐 Modificadores de Acceso en Java

Los modificadores de acceso en Java son **palabras clave** que controlan qué clases o métodos pueden acceder a otros elementos del programa. Son esenciales para **proteger la integridad del código**, evitar errores y mantener una buena organización.

---

## 📚 ¿Por qué son importantes?

- 🛡️ **Seguridad**: Evitan que otras clases accedan a información sensible.
- 🧩 **Encapsulamiento**: Son una parte clave de la Programación Orientada a Objetos.
- 📦 **Modularidad**: Permiten dividir bien la lógica entre lo interno y lo externo.

---

## 🧱 Tipos de modificadores de acceso en Java

| Modificador | ¿Dónde puede ser accedido?                                                       |
| ----------- | -------------------------------------------------------------------------------- |
| `public`    | Desde cualquier lugar del programa.                                              |
| `private`   | Solo desde dentro de la misma clase.                                             |
| `protected` | Desde la misma clase, el mismo paquete y también desde clases hijas (subclases). |
| _default_   | (Sin palabra clave) Solo desde el mismo paquete.                                 |

> 📌 _Nota:_ Si no se escribe ningún modificador, se aplica el **acceso por defecto** (default).

---

### 🔄 Tabla de acceso visual

| Modificador | Dentro de la clase | Mismo paquete | Subclases (otro paquete) | Desde cualquier parte |
| ----------- | ------------------ | ------------- | ------------------------ | --------------------- |
| `public`    | ✅                 | ✅            | ✅                       | ✅                    |
| `protected` | ✅                 | ✅            | ✅                       | ❌                    |
| `default`   | ✅                 | ✅            | ❌                       | ❌                    |
| `private`   | ✅                 | ❌            | ❌                       | ❌                    |

---

![Mod](https://img.notionusercontent.com/s3/prod-files-secure%2F5f72e359-3b8d-45ab-83ad-6cb8c2bcb54d%2F935ac168-7db7-4ef4-a3e3-b76d233646dc%2FAccess-Modifiers-in-Java-1-768.webp/size/w=1680?exp=1750300951&sig=dvF_9YXGvgqMQmjPe-BREkdabVXCXh68RHeGB9RjOSU&id=1f84db47-a255-8175-a990-d40269c5e854&table=block&userId=211d872b-594c-8193-bf6a-0002a7d1c1da)

## 🔍 Explicación con ejemplos y analogías

### 1. `public`: acceso total

```java
public class MiClase {
    public int variablePublica;
    public void metodoPublico() {
        // Código accesible desde cualquier parte
    }
}
```

🟢 **Se puede usar desde cualquier otra clase, archivo o paquete.**

🎲 **Analogía**: Como una puerta abierta al público: cualquier persona puede entrar sin restricciones.

---

### 2. `private`: acceso restringido solo a la clase

```java
public class MiClase {
    private int variablePrivada;
    private void metodoPrivado() {
        // Solo accesible dentro de esta clase
    }
}
```

🔒 **No se puede usar fuera de la clase.** Ni siquiera en subclases o desde el mismo paquete.

🎲 **Analogía**: Como una caja fuerte dentro de una oficina: solo quien está adentro conoce la clave.

---

### 3. `protected`: acceso extendido a hijos y mismo paquete

```java
public class MiClase {
    protected int variableProtegida;
    protected void metodoProtegido() {
        // Accesible desde la clase, subclases y clases del mismo paquete
    }
}
```

🟡 **Accesible desde:**

- La misma clase
- Cualquier clase del mismo paquete
- Subclases (hijas), incluso si están en otro paquete

🎲 **Analogía**: Como una habitación en una empresa donde pueden entrar empleados y supervisores, pero no personas externas.

---

### 4. `default`: acceso solo dentro del paquete

```java
class MiClase {
    int variableDefault;
    void metodoDefault() {
        // Accesible solo dentro del paquete
    }
}
```

⚠️ **Accesible solo desde clases que estén en el mismo paquete**.

🎲 **Analogía**: Como un grupo de WhatsApp donde solo los miembros actuales pueden ver los mensajes.

---

## 💡 Consejos para usar correctamente:

- Usa `private` para **ocultar** detalles internos de una clase.
- Usa `protected` para **compartir entre clases relacionadas** (herencia).
- Usa `public` para elementos que necesitas que estén **disponibles globalmente**.
- Deja sin modificador (`default`) si solo se usará **dentro del mismo paquete**.

---

## 🧠 Errores comunes

- ❌ Tratar de acceder a una variable `private` desde otra clase.
- ❌ Creer que `protected` permite acceso total como `public`.
- ❌ Suponer que `default` funciona entre paquetes.

---

## 👨‍🏫 Ejemplo comparado entre clases

📁 **Estructura de carpetas simulada**

```
src/
└── main/
    └── java/
        ├── bancoapp/
        │   ├── Banco.java
        │   └── Cliente.java
        └── externo/
            └── ClienteExterno.java
```

> Donde `bancoapp` y `externo` son paquetes distintos, ayudándonos a demostrar cómo afectan los modificadores de acceso según el contexto del paquete.

---

```java
package bancoapp;

public class Banco {
    public String nombre = "BancoSimple";
    private double saldo = 1000.0;
    protected String sucursal = "Centro";
    String ciudad = "Santiago"; // default
}
```

```java
package bancoapp; // Mismo paquete
public class Cliente {
    public void ver() {
        Banco b = new Banco();
        System.out.println(b.nombre);     // ✅ public
        // System.out.println(b.saldo);   // ❌ private
        System.out.println(b.sucursal);   // ✅ protected
        System.out.println(b.ciudad);     // ✅ default
    }
}
```

```java
package externo; // Otro paquete

import bancoapp.Banco;
public class ClienteExterno extends Banco {
    public void ver() {
        System.out.println(nombre);       // ✅ public
        // System.out.println(saldo);     // ❌ private
        System.out.println(sucursal);     // ✅ protected (por herencia)
        // System.out.println(ciudad);    // ❌ default
    }
}
```

## 🧪 Ejercicio sugerido

1. Crea una clase `Banco` con:

   - Un método `public` llamado `mostrarNombre()`
   - Una variable `private` llamada `saldo`
   - Un método `protected` llamado `verBalance()`
   - Un método sin modificador llamado `verSucursal()`

2. Luego, intenta acceder a esos elementos desde otra clase `Cliente` en:

   - El mismo paquete
   - Un paquete diferente

Esto te ayudará a **probar en la práctica** cómo se comportan los modificadores.

---

# 3. ⚙️ Funciones Estáticas y No Estáticas en Java

En Java, las funciones (también llamadas "métodos") pueden clasificarse en dos tipos principales según cómo se accede a ellas: **estáticas** y **no estáticas**.

---

## 🔍 ¿Qué son los métodos en Java?

Un **método** en Java es un bloque de código que realiza una tarea específica. Puede o no devolver un valor, y puede pertenecer a la clase como un todo o a un objeto particular.

### ¿Por qué son importantes?

- Organizan el código.
- Evitan duplicación de instrucciones.
- Permiten reutilización.
- Hacen que el código sea más legible y mantenible.

> 🧠 **Analogía inicial**: Piensa en una clase como una receta, y los métodos como las instrucciones. Algunas instrucciones (métodos estáticos) puedes leerlas desde el libro sin preparar nada. Otras (métodos de instancia), requieren que tengas los ingredientes preparados (una instancia).

---

## 📌 ¿Qué es un método estático?

### 🧷 Definición:

Un **método estático** es aquel que **pertenece directamente a la clase**, no a un objeto. Para llamarlo, **no necesitas crear una instancia** (objeto) de la clase.

Se declara usando la palabra clave `static`.

### 🧪 Ejemplo:

```java
// 1.- Declaración de la clase
public class Calculadora {

    // 2.- Método estático que suma dos enteros
    public static int sumar(int a, int b) {
        return a + b; // 3.- Retorna la suma de los parámetros
    } // 4.- Cierre del método sumar

    // 5.- Método main que ejecuta el programa
    public static void main(String[] args) {
        int resultado = Calculadora.sumar(5, 3); // 6.- Llama al método sumar y guarda el resultado
        System.out.println("Resultado: " + resultado); // 7.- Imprime el resultado por consola
    } // 8.- Cierre del método main

} // 9.- Cierre de la clase
```

### 🧾 Explicación paso a paso:

1. Se define una clase pública llamada `Calculadora`.
2. Dentro de la clase, se declara un método estático llamado `sumar` que recibe dos parámetros enteros.
3. El método retorna la suma de ambos parámetros usando `return a + b;`.
4. Se cierra el método `sumar`.
5. Luego, se define un método `main`, que es el punto de entrada para ejecutar el programa.
6. Dentro del `main`, se llama al método estático `sumar` usando el nombre de la clase, y se guarda el resultado en la variable `resultado`.
7. Se imprime el valor almacenado con `System.out.println(...)`.
8. Se cierra el método `main`.
9. Se cierra la clase `Calculadora`.

> 🧠 **Importante:** En Java, cualquier lógica que quieras ejecutar (como imprimir, asignar valores, o llamar métodos) debe estar dentro de un bloque válido, como `main()`. No puedes colocar código suelto fuera de métodos o bloques.

---

### ✅ Características:

- Se llama directamente con el nombre de la clase.
- No puede acceder a variables o métodos **no estáticos** directamente.
- Útil para **utilidades**, **funciones auxiliares**, o **constantes**.

### 🎲 Analogía:

Es como una **calculadora pública online**. No necesitas cuenta, ni preparativos: simplemente entras y haces una operación.

---

## 📌 ¿Qué es un método no estático (de instancia)?

### 🔓 Definición:

Un **método no estático** requiere que primero crees una **instancia (objeto)** de la clase. Estos métodos **pueden acceder a los atributos y otros métodos no estáticos**.

### 🧪 Ejemplo:

```java
// 1.- Declaración de clase
public class Persona {

    // 2.- Atributo privado de la clase
    private String nombre;

    // 3.- Constructor que inicializa el atributo nombre
    public Persona(String nombre) {
        this.nombre = nombre; // 4.- Asigna el valor recibido al atributo de instancia
    } // 5.- Fin del constructor

    // 6.- Método no estático que imprime un saludo
    public void saludar() {
        System.out.println("Hola, soy " + nombre); // 7.- Imprime el saludo usando el atributo
    } // 8.- Fin del método saludar

    // 9.- Método main para ejecutar
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan"); // 10.- Crea una instancia de Persona
        persona1.saludar(); // 11.- Llama al método saludar a través del objeto
    } // 12.- Fin del método main

} // 13.- Fin de la clase Persona
```

### 🧾 Explicación paso a paso:

1. Se define una clase llamada `Persona`.
2. Dentro de la clase, se declara un atributo `nombre`, que es privado.
3. Se crea un constructor con parámetro que recibe el nombre al instanciar el objeto.
4. Se usa `this.nombre = nombre` para distinguir entre el atributo de clase y el parámetro.
5. Se cierra el constructor.
6. Se define un método no estático llamado `saludar`, que accede al atributo `nombre`.
7. Dentro del método, se imprime un mensaje que incluye el nombre de la persona.
8. Se cierra el método `saludar`.
9. Se define el método `main`, que será el punto de entrada al ejecutar el programa.
10. Dentro del `main`, se crea una instancia de `Persona` con el nombre "Juan".
11. A través de esa instancia, se llama al método `saludar()`.
12. Se cierra el método `main`.
13. Se cierra la clase `Persona`.

> 📌 **Importante:** En Java, cualquier ejecución (como crear objetos o imprimir resultados) debe hacerse dentro de un método, y usualmente se hace dentro del `main(String[] args)`, que es el punto de inicio del programa.

---

### ✅ Características:

- Se llama a través de un objeto.
- Puede acceder a cualquier atributo o método no estático.
- Ideal para representar **comportamientos individuales** de objetos específicos.

### 🎲 Analogía:

Es como **una cuenta de Netflix**: necesitas iniciar sesión con una cuenta específica (objeto) para ver contenido.

---

## 📊 Comparativa resumida

| Característica       | Estático (`static`) | No Estático (Instancia)     |
| -------------------- | ------------------- | --------------------------- |
| Requiere objeto      | ❌ No               | ✅ Sí                       |
| Pertenece a la clase | ✅ Sí               | ❌ No (pertenece al objeto) |
| Accede a `this`      | ❌ No               | ✅ Sí                       |
| Ejemplo de uso       | `Math.pow(2, 3)`    | `persona.saludar()`         |

---

## 🧠 Buenas prácticas

✅ Usa **métodos estáticos** cuando:

- No necesitas acceder a variables de instancia.
- Quieres funciones utilitarias o herramientas comunes.

✅ Usa **métodos no estáticos** cuando:

- El comportamiento depende de valores únicos de cada objeto.
- Manipulas atributos específicos de una instancia.

---

## ⚠️ Errores comunes

- ❌ Intentar acceder a variables de instancia desde un método estático.
- ❌ Creer que todos los métodos deben ser estáticos porque se pueden llamar más fácil.
- ❌ Usar `static` como solución rápida sin pensar en diseño orientado a objetos.

---

## 💻 Ejercicio práctico sugerido

1. Crea una clase llamada `UtilidadesTexto`:

   - Un método **estático** `contarCaracteres(String texto)` que devuelva la cantidad de caracteres.

2. Crea una clase llamada `Libro`:

   - Tiene un atributo `titulo`.
   - Un método **no estático** `mostrarTitulo()` que imprime el título.

3. Desde clase `Main`, realiza ambas llamadas:

   - Llama a `UtilidadesTexto.contarCaracteres(...)` sin crear objeto.
   - Crea un objeto de `Libro` y llama a `mostrarTitulo()`.

---

# 4. 📚 API de Java y sus métodos (Uso práctico y explicado desde cero)

La **API de Java** (Application Programming Interface) es un **conjunto de clases, interfaces y métodos** ya disponibles en el lenguaje, que permiten a los desarrolladores usar funciones ya construidas sin tener que programarlas desde cero.

> 🧠 **Piensa en la API como una caja de herramientas que ya viene con Java**: tú solo necesitas saber qué herramienta usar y cómo.

---

## 🧵 Para la manipulación de textos con `String` (`java.lang`)

### 🔠 Clase `String`

Clase utilizada para representar cadenas de texto.

#### 🔍 Métodos destacados:

- `length()`: Devuelve el número de caracteres.
- `charAt(int index)`: Devuelve el carácter en una posición específica.
- `substring(int beginIndex, int endIndex)`: Devuelve una subcadena.
- `indexOf(String s)`: Devuelve la posición de un texto dentro de otro.
- `concat(String s)`: Une cadenas.
- `equals(String s)`: Compara si dos cadenas son iguales.
- `toUpperCase()`, `toLowerCase()`: Convierte el texto a mayúsculas o minúsculas.

### 🧪 Ejemplo práctico

```java
public class DemoString {
    public static void main(String[] args) {
        String mensaje = "Hola Mundo";

        System.out.println("Longitud: " + mensaje.length());           // 10
        System.out.println("Primera letra: " + mensaje.charAt(0));     // H
        System.out.println("Subcadena: " + mensaje.substring(0, 4));   // Hola
        System.out.println("¿Contiene 'Mundo'? " + mensaje.indexOf("Mundo")); // 5

        String saludo = "Hola ".concat("Persona");
        System.out.println(saludo); // Hola Persona

        String nombre = "Persona";
        System.out.println(nombre.equals("persona"));     // false
        System.out.println(nombre.equalsIgnoreCase("persona")); // true
        System.out.println(nombre.toUpperCase());        // PERSONA
        System.out.println(nombre.toLowerCase());        // persona
    }
}
```

---

## ➕ Para operaciones matemáticas con `Math` (`java.lang`)

### ➗ Clase `Math`

Contiene métodos matemáticos comunes. Todos sus métodos son **estáticos**, por lo que no necesitas crear una instancia para usarlos.

#### 🔍 Métodos destacados:

- `max(a, b)`: Devuelve el mayor.
- `min(a, b)`: Devuelve el menor.
- `pow(a, b)`: Eleva a la potencia.
- `round(x)`: Redondea.
- `floor(x)`: Redondea hacia abajo.
- `ceil(x)`: Redondea hacia arriba.

### 🧪 Ejemplo práctico

```java
public class DemoMath {
    public static void main(String[] args) {
        System.out.println("Máximo: " + Math.max(10, 20));     // 20
        System.out.println("Mínimo: " + Math.min(10, 20));     // 10
        System.out.println("Potencia: " + Math.pow(2, 3));     // 8.0

        double valor = 5.6;
        System.out.println("Redondeo: " + Math.round(valor));  // 6
        System.out.println("Piso: " + Math.floor(valor));      // 5.0
        System.out.println("Techo: " + Math.ceil(valor));      // 6.0
    }
}
```

> 🔧 Como todos los métodos son estáticos, **se llaman directamente con `Math.` sin crear objeto**.

---

## 📦 Para estructuras de datos (`java.util`)

### 📋 Clase `ArrayList`

Es una lista dinámica (puede crecer o reducir su tamaño).

#### 🔍 Métodos destacados:

- `add()`: Agrega un elemento.
- `get(index)`: Devuelve el elemento en la posición dada.
- `remove(index)`: Elimina el elemento.
- `size()`: Devuelve el tamaño.
- `isEmpty()`: Retorna si la lista está vacía.

### 🧪 Ejemplo práctico

```java
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Naranja");

        System.out.println("Primera fruta: " + frutas.get(0)); // Manzana
        System.out.println("Total: " + frutas.size());         // 3

        frutas.remove(1);
        System.out.println("Después de eliminar: " + frutas);   // [Manzana, Naranja]

        System.out.println("¿Está vacía? " + frutas.isEmpty()); // false
    }
}
```

---

### 🗺️ Clase `HashMap`

Es una estructura que almacena pares clave-valor (como un diccionario).

#### 🔍 Métodos destacados:

- `put(clave, valor)`: Inserta un elemento.
- `get(clave)`: Devuelve el valor asociado.
- `remove(clave)`: Elimina la entrada.
- `containsKey(clave)`: Verifica si existe la clave.
- `keySet()`: Devuelve todas las claves.

### 🧪 Ejemplo práctico

```java
import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();

        edades.put("Persona1", 30);
        edades.put("Persona2", 28);

        System.out.println("Edad de Persona1: " + edades.get("Persona1"));
        System.out.println("Contiene Persona2? " + edades.containsKey("Persona2"));

        edades.remove("Persona2");
        System.out.println("Claves restantes: " + edades.keySet());
    }
}
```

---

## ✅ Recomendaciones finales

- Siempre que necesites trabajar con texto, revisa los métodos de `String`, ¡hay más de 40!
- Para operaciones matemáticas básicas, no implementes tu propia lógica: usa `Math`.
- Cuando necesites colecciones dinámicas, `ArrayList` es ideal.
- Si trabajas con datos que necesitan asociar una clave a un valor, usa `HashMap`.

> 🧪 **Consejo:** Practica estos métodos en un entorno real (como Eclipse, IntelliJ o VS Code) e imprime resultados para ver cómo se comportan. ¡La práctica es la clave!

# 5. 🔍 La Refactorización en Java

**Refactorizar** consiste en **reestructurar y mejorar** el código fuente sin alterar su comportamiento externo. Es decir, el programa sigue funcionando igual, pero el **código detrás** se vuelve más **limpio, claro y eficiente**.

> 💡 **Analogía**: Es como ordenar tu habitación. No compraste nada nuevo ni cambiaste su función, solo hiciste que todo esté más limpio, ordenado y fácil de encontrar.

---

## 🎯 ¿Cuál es el objetivo de la refactorización?

- Mejorar la **calidad interna** del código.
- Hacerlo más **legible** para otros (o para ti en el futuro).
- Facilitar su **mantenimiento**.
- Permitir que sea **más fácil de escalar** o agregar nuevas funcionalidades.

> ⚠️ Importante: **Refactorizar no cambia lo que el programa hace**, solo **cómo está escrito internamente**.

---

## 📦 ¿Qué beneficios concretos obtengo?

| Beneficio             | ¿Por qué es útil?                                                |
| --------------------- | ---------------------------------------------------------------- |
| Legibilidad           | Facilita entender el código sin explicaciones adicionales        |
| Mantenibilidad        | Hace que otros puedan arreglar o mejorar el código más rápido    |
| Reutilización         | Permite extraer funciones útiles y reutilizarlas en otras partes |
| Prevención de errores | Un código limpio es más fácil de testear y menos propenso a bugs |

---

## 🧠 Buenas prácticas al refactorizar

- 🔁 **Evita duplicación**: si repites lógica, conviértela en un método reutilizable.
- 🧱 **Divide métodos largos**: si un método hace muchas cosas, divídelo en partes pequeñas.
- 🔍 **Usa nombres descriptivos**: tanto para variables como funciones.
- 🧼 **Elimina código muerto**: si no se usa, ¡fuera!
- 📦 **Organiza las clases**: por paquetes, funciones o capas de la aplicación.

---

## 🧪 Ejemplo práctico de refactorización

### 🛑 Código original:

```java
public class Usuario {
    public void mostrarInformacion() {
        System.out.println("Nombre: Persona");
        System.out.println("Edad: 30");
        System.out.println("Correo: persona@email.com");
    }
}
```

### ✅ Código refactorizado:

```java
public class Usuario {
    private String nombre = "Persona";
    private int edad = 30;
    private String correo = "persona@email.com";

    public void mostrarInformacion() {
        imprimirDato("Nombre", nombre);
        imprimirDato("Edad", String.valueOf(edad));
        imprimirDato("Correo", correo);
    }

    private void imprimirDato(String etiqueta, String valor) {
        System.out.println(etiqueta + ": " + valor);
    }
}
```

### 🎯 ¿Qué se mejoró?

- Se eliminaron los `System.out.println()` repetidos.
- Se reutilizó un método para imprimir cualquier dato.
- Los datos ahora están en atributos, no quemados dentro del método.

---

## 🔄 Herramientas que ayudan a refactorizar (en IDEs como IntelliJ o Eclipse)

- Renombrar variables/clases/métodos (`Shift + F6` en IntelliJ)
- Extraer métodos automáticamente
- Eliminar imports innecesarios
- Reorganizar código automáticamente
- Mostrar advertencias o sugerencias de limpieza

---

## ✅ Conclusión

Refactorizar no es opcional: es parte esencial del ciclo de vida del desarrollo profesional. No esperes a que el código sea inentendible para mejorarlo. ¡Hazlo a tiempo!

> ✨ Un buen desarrollador **no solo hace que el código funcione**, sino que lo hace **funcionar bien y con estilo**.
