# Java: Manejo de Excepciones y Test Unitarios con JUnit - Enfoque Teórico y Práctico

---

## 📋 Tabla de Contenidos

1. [🤖 ¿Cómo gestiona la memoria Java?](#🤖-memoria-y-recolección-de-basura-en-java)
2. [🤔 ¿Qué son los test o pruebas unitarias?](#🤔-qué-son-los-test-o-pruebas-unitarias)
3. [⚠️ ¿Qué son las excepciones en Java?](#⚠️-que-son-las-excepciones-en-java)
4. [⚙️ Pruebas unitarias en Java](#⚙️-pruebas-unitarias-en-java-y-uso-de-junit)
5. [🧪 ¿Qué es el Test Driven Development (TDD)?](#🧪-qué-es-test-driven-development-tdd)
6. [🧪 Escribiendo y realizando pruebas](#🧪-escribiendo-y-realizando-pruebas-en-java-con-junit)

---

## 🤖 Memoria y Recolección de Basura en Java

### ✅ Conceptos Teóricos

Comprender cómo Java administra la memoria es fundamental para escribir programas eficientes y detectar errores como el temido `OutOfMemoryError`. Cada vez que ejecutamos una aplicación Java, la JVM (Java Virtual Machine) crea distintos espacios en memoria que cumplen funciones específicas. Entender estas áreas nos permite razonar sobre el ciclo de vida de los objetos, cómo se comportan los métodos y qué ocurre cuando se pierde una referencia.

- **Stack**: Guarda variables locales y llamadas a métodos. Piensa en él como una pila de platos. Cada vez que llamas a un método, colocas un plato (frame), y al terminar el método, lo quitas.

> 🧠 Imagina una pila de platos: cuando se llama a un método, se coloca un nuevo plato (frame); cuando el método termina, se retira el plato.

- **Heap**: Contiene objetos creados en tiempo de ejecución. Es como una caja grande donde guardas objetos y los puedes referenciar desde cualquier parte del programa.

> 📦 Piensa en una gran caja donde se almacenan todos los objetos que se usan mientras el programa está vivo.

- **Metaspace**: Almacena metadatos de clases. Desde Java 8, reemplaza al PermGen.

> 🏷️ Es como un catálogo de lo que existe en la aplicación, desde Java 8 reemplazó al PermGen.

- **Garbage Collector (GC)**: El recolector de basura identifica objetos que ya no se usan (no tienen referencias) y libera su memoria.

> 🧹 Como un recolector que limpia la caja (Heap) cuando ve que ya no hay etiquetas apuntando a un objeto.

### 🔍 ¿Cómo funciona la recolección de basura?

La JVM cuenta con un mecanismo que permite liberar la memoria de instancias y métodos que ya no se estén referenciando. La recolección de basura o Garbage Collection permite a los desarrolladores centrarse en escribir código sin preocuparse por la gestión de la memoria, lo que convierte a Java en una opción popular para crear aplicaciones complejas y a gran escala.

### 📅 ¿Cuándo se elige un objeto para ser recolectado?

Un objeto es elegible para la recolección de basura cuando **ninguna parte del programa** mantiene una referencia a él. Es decir, el recolector de basura revisa periódicamente los objetos del heap y **elimina aquellos que ya no son accesibles** desde el código en ejecución. Esto ayuda a evitar pérdidas de memoria.

### 🧠 ¿Por qué es importante saber esto?

Como programadores no necesitamos liberar la memoria manualmente, pero sí debemos saber:

- Cuándo un objeto **ya no será recolectado si aún hay referencias**.
- Qué implica llenar el Heap (puede causar `OutOfMemoryError`).
- Cómo evitar **retener objetos innecesarios**, por ejemplo, guardándolos por error en colecciones globales.

### 🔄 Entonces, ¿cómo se libera la memoria automáticamente?

Java usa un **Garbage Collector (GC)** que identifica los objetos no utilizados y los elimina automáticamente del heap. Sin embargo, este mecanismo solo puede liberar memoria cuando **no existen más referencias activas** hacia el objeto.

#### 🧼 Buenas prácticas para ayudar al GC:

- Reemplaza referencias innecesarias por `null` si sabes que no se volverán a usar.
- Evita colecciones globales o estáticas que crecen indefinidamente sin limpieza.
- No mantengas referencias innecesarias en cachés o listas sin control.
- Usa `try-with-resources` para cerrar automáticamente recursos externos como archivos o streams.

Estas prácticas ayudan a que el GC haga su trabajo de forma más eficiente, evitando errores como `OutOfMemoryError` y mejorando el rendimiento general de tus aplicaciones.

### 📈 Imagen de flujo del Garbage Collector:

![Garbage Collection Execution Flow](https://img.notionusercontent.com/s3/prod-files-secure%2F5f72e359-3b8d-45ab-83ad-6cb8c2bcb54d%2F5f0b27a9-c508-48f2-895c-8c73bf10725e%2F1_lcGAPYaYNWoMj_6e3rJRuA.webp/size/w=1510?exp=1751074537&sig=ONn2OSV01H_hCMTNVSuB7c38SZU_SGujbtr2ToddIak&id=1f84db47-a255-81b7-a0d9-ec74cf1d72cc&table=block&userId=211d872b-594c-8193-bf6a-0002a7d1c1da)

Esta imagen muestra cómo un objeto es creado, monitoreado, marcado como no referenciado, limpiado y luego el heap es compactado. Vamos a ver este proceso representado en código.

### 🔹 Ejemplo práctico en código:

```java
public class CicloGC {

    static class ObjetoPesado {
        private int[] arreglo = new int[1_000_000];

        @Override
        protected void finalize() {
            System.out.println("🗑️ finalize() llamado. El objeto está siendo recolectado.");
        }
    }

    public static void main(String[] args) {
        System.out.println("🧱 Creando objeto...");
        ObjetoPesado obj = new ObjetoPesado();

        System.out.println("🔗 Referencia activa. No será recolectado aún.");
        obj = null;

        System.out.println("🧹 Solicitando recolección de basura...");
        System.gc();

        System.out.println("⏳ Esperando...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("✅ Fin del programa.");
    }
}
```

💡 **Explicación del código:**

- Creamos un objeto grande para ocupar memoria.
- Eliminamos su referencia (`obj = null;`).
- Llamamos a `System.gc()` para sugerir que lo limpie.
- `finalize()` es llamado si el objeto fue recolectado.

---

### 📎 ¿Y qué pasa con recursos externos como Scanner, archivos o conexiones?

El recolector de basura **solo puede limpiar objetos en memoria (Heap)** que ya no tienen referencias. Pero cuando usamos clases como `Scanner`, `File`, `Socket`, etc., **estamos abriendo recursos del sistema operativo** (como archivos o entrada estándar).

Estos recursos **no son limpiados automáticamente** por el Garbage Collector. Por eso, **es responsabilidad del programador cerrarlos manualmente** para evitar fugas de memoria o bloqueos de recursos.

#### 🔸 Ejemplo práctico:

```java
import java.util.Scanner;

public class ScannerEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Abre recurso de entrada estándar

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);

        scanner.close(); // ✅ Liberamos el recurso manualmente
    }
}
```

🧠 **Conclusión:**

> Aunque Java tiene Garbage Collector para limpiar memoria, **el manejo de recursos externos es nuestra responsabilidad**. Siempre que trabajes con clases que acceden a archivos, red o entradas del sistema, **usa `.close()` o `try-with-resources` para liberar correctamente el recurso.**

---

### 💥 ¿Qué significa OutOfMemoryError?

Un **`OutOfMemoryError`** ocurre cuando una aplicación intenta utilizar más memoria de la que la JVM tiene disponible. Este error indica que no hay suficiente espacio en el Heap para crear nuevos objetos. Cuando se lanza este error, **la aplicación generalmente se bloquea** si no se maneja adecuadamente.

#### 🧠 ¿Por qué es importante entender este error?

- Nos ayuda a **detectar fugas de memoria** o estructuras mal diseñadas.
- Permite **prevenir fallos catastróficos** en aplicaciones de larga duración.
- Ayuda a **optimizar el uso de memoria**, evitando acumulación innecesaria de objetos.

### 🔹 Ejemplo: crear un arreglo demasiado grande

```java
public class MemoriaInsuficiente {
    public static void main(String[] args) {
        int[] datos = new int[Integer.MAX_VALUE]; // 🚨 Demasiado grande para el heap
    }
}
```

🔴 Esto generará un `java.lang.OutOfMemoryError: Requested array size exceeds VM limit`

### 🔹 Ejemplo: simulando una fuga de memoria

```java
import java.util.ArrayList;
import java.util.List;

public class FugaMemoria {
    public static void main(String[] args) {
        List<int[]> lista = new ArrayList<>();
        while (true) {
            lista.add(new int[1_000_000]); // Acumula objetos grandes sin liberar
        }
    }
}
```

⚠️ Aquí el GC **no puede limpiar nada** porque la lista mantiene referencias activas a cada arreglo. Esto simula una **fuga de memoria**.

### ✅ Consejos para evitar `OutOfMemoryError`

- Libera objetos que ya no uses (poner referencias a `null` si es necesario).
- Cuidado con listas, mapas u otras colecciones que **siguen creciendo** sin limpieza.
- Usa herramientas como **VisualVM** o **Java Flight Recorder** para monitorear memoria en aplicaciones reales.

---

### 🧾 En resumen: 🤔 ¿Cómo gestiona la memoria Java?

Cuando hablamos de **memoria en Java**, nos referimos a cómo la **JVM organiza, usa y libera** los recursos mientras se ejecuta un programa. Básicamente:

- Hay diferentes áreas de memoria: `Stack`, `Heap`, `Metaspace`, cada una con una función.
- La **JVM maneja automáticamente la memoria** mediante el **Garbage Collector**, que elimina objetos que ya no se usan.
- Aun así, **los programadores deben escribir código que ayude al recolector**: no guardar referencias innecesarias, limpiar recursos externos y monitorear si hay fugas de memoria.
- Comprender esto nos ayuda a escribir programas más eficientes, evitar errores como `OutOfMemoryError` y prepararnos para construir aplicaciones robustas.

### ✨ Buenas prácticas (dicho en buenas palabras)

> 🧠 _"Escribir código limpio y responsable también significa ayudar a Java a hacer su trabajo. No se trata solo de que funcione, sino de que lo haga bien, sin desperdiciar recursos ni dejar basura acumulada."_

Aquí algunos consejos que todo buen programador Java debería seguir:

- 🗑️ **Suelta lo que ya no uses**: Si ya no necesitas un objeto, asegúrate de que no quede referenciado (por ejemplo, ponlo en `null` si es necesario).
- 🧺 **No llenes listas infinitamente**: Ten cuidado con estructuras como `ArrayList` o `Map` que pueden crecer sin control si no limpias lo que ya no necesitas.
- 📦 **Evita guardar cosas en campos estáticos “porque sí”**: Si guardas datos en variables globales o estáticas, puede que nunca se liberen.
- 🔐 **Cierra lo que abras**: Si usas recursos del sistema como archivos o entrada de datos (`Scanner`, `File`, etc.), ¡ciérralos! No los dejes abiertos.
- 🧪 **Mide y observa**: Usa herramientas como `VisualVM` o `Java Flight Recorder` para ver cómo se comporta tu aplicación en memoria.

## 🤔 ¿Qué son los test o pruebas unitarias?

### ✅ Concepto clave

El **testing unitario** es una técnica del desarrollo de software que permite **verificar que una pequeña parte del programa (una "unidad") funciona correctamente**. Una “unidad” puede ser:

- Un método
- Una función
- Una clase

Al probarla **de forma aislada**, aseguramos que hace lo que debe hacer, **sin depender del resto del sistema**.

### 🧠 Analogía para estudiantes

> Imagina que estás construyendo un robot. Antes de ensamblarlo todo, **pruebas cada brazo, pierna y sensor por separado**. Eso es hacer pruebas unitarias: verificar que cada parte funcione antes de unirlas.

### 🔺 La Pirámide de Testing

![Pirámide de Testing](attachment:/mnt/data/d1e5049c-b528-4c61-b8ff-6846b2331b15.png)

Esta pirámide representa el enfoque recomendado para pruebas:

| Capa                        | ¿Qué prueba?                          | Velocidad | Costo       |
| --------------------------- | ------------------------------------- | --------- | ----------- |
| **Unit**                    | Métodos o clases individuales         | 🚀 Alta   | 💰 Baja     |
| **Integration**             | Cómo interactúan entre sí             | 🐢 Media  | 💰💰 Media  |
| **Functional (End-to-End)** | Todo el sistema como un usuario lo ve | 🐌 Baja   | 💰💰💰 Alta |

✅ Por eso comenzamos desde abajo: es **más rápido, barato y seguro probar primero lo pequeño**.

### 🔎 ¿Qué es una unidad?

Una unidad es la **parte más pequeña del código que se puede probar en aislamiento**. Por ejemplo:

- El método `sumar()` en una clase `Calculadora`.
- Un método `validarLogin()` en un servicio.

En programación orientada a objetos, una unidad puede ser una **clase completa** o un **método** específico.

### 🌟 Ventajas de las pruebas unitarias

- 🔍 **Detección temprana de errores:** Detectas bugs en cuanto se escriben, no cuando ya está todo integrado.
- 💸 **Reducción de costos:** Corregir un error hoy cuesta menos que hacerlo mañana.
- 🚀 **Lanzamientos más rápidos:** Si todo lo pequeño está probado, puedes avanzar más seguro.
- 🔁 **Facilita refactorización:** Puedes cambiar el código sin miedo, porque los tests te dicen si algo se rompió.
- 🎯 **Menos incertidumbre:** Sabes que tu módulo hace lo que se espera, porque tienes pruebas que lo demuestran.

---

### 💡 Ejemplo práctico con JUnit

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado, "La suma de 2 + 3 debe ser 5");
    }
}
```

✅ Esta prueba **verifica que el método `sumar()` funciona correctamente**. Si alguna vez rompe, JUnit te avisará.

🧠 **Para los estudiantes:**

> Piensa que estás escribiendo un verificador automático que se asegura de que tu método siempre haga lo que prometiste.

---

## ⚠️ ¡Alerta para estudiantes Maven!

### 🧩 Proyecto actual sin Maven:

Si vienes trabajando con un proyecto clásico tipo:

```
CursoJava/
├── semana4/
├── semana5/
└── semana6/
```

Y activas Maven en IntelliJ sobre el proyecto global, podrías romper la estructura actual. IntelliJ reorganiza el proyecto para ajustarse al estándar Maven.

### ✅ Recomendación pedagógica

🛠️ **Crea una nueva carpeta llamada `semana7` como proyecto independiente Maven**. Así no modificas lo anterior y mantienes todo limpio y organizado.

---

## 🚀 Cómo crear el proyecto `semana7` correctamente

### 1. Estructura Maven esperada

```
java-maven/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/cursojava/Calculadora.java
│   └── test/
│       └── java/
│           └── com/cursojava/CalculadoraTest.java
```

### 2. Contenido de `pom.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.cursojava</groupId>
    <artifactId>semana7</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- JUnit Jupiter API + Engine -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Plugin para ejecutar pruebas con Maven -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.2.3</version>
            </plugin>
        </plugins>
    </build>

    <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
</project>
```

### 3. Crear las clases

📦 **Paquete `com.cursojava` dentro de `src/main/java`**:

```java
package com.cursojava;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

📦 **Paquete `com.cursojava` dentro de `src/test/java`** (misma estructura):

```java
package com.cursojava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado, "La suma de 2 + 3 debe ser 5");
    }
}
```

### 4. Ejecutar pruebas con Maven

Desde terminal, en la carpeta del proyecto `semana7`:

```bash
mvn test
```

Verás salida como esta:

```bash
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

✅ ¡Eso confirma que tu prueba pasó exitosamente!

---

## 🧪 ¿Por qué usar los **mismos paquetes** en `main` y `test`?

🎯 **No es obligatorio, pero sí una buena práctica**, por estas razones:

| Razón                    | Beneficio principal                                 |
| ------------------------ | --------------------------------------------------- |
| Acceso a métodos package | Puedes probar métodos sin `public`                  |
| Estándar Maven           | Facilita reconocimiento automático por herramientas |
| Organización             | Refleja claramente qué test prueba qué clase        |
| Navegación en el IDE     | IntelliJ enlaza fácilmente clases con sus pruebas   |

🔒 Si no coinciden los paquetes, **no podrás testear métodos `package-private`**.

---

## ⚠️ ¿Qué son las excepciones en Java?

### ❗ Entendiendo los errores como parte del desarrollo

Cuando un programa encuentra un problema en tiempo de ejecución (por ejemplo, intentar abrir un archivo que no existe o dividir por cero), **no debe colapsar sin avisar**. Java nos da una herramienta poderosa llamada **excepciones** para detectar, capturar y reaccionar ante esos errores de manera ordenada.

> 💬 Piensa en una excepción como una "alarma" que el sistema activa cuando algo no sale como se esperaba.

Gracias a las excepciones, **podemos escribir programas más robustos y preparados para lo inesperado**.

**Las excepciones** son eventos que ocurren durante la ejecución de un programa y que interrumpen el flujo normal de las instrucciones. Representan situaciones inesperadas o errores que pueden surgir, como:

- Intentar dividir por cero.
- Acceder a un índice fuera de los límites de un array.
- Intentar acceder a un archivo que no existe.
- Errores de red o base de datos.

Las excepciones en Java son objetos que representan estos errores y se lanzan (throw) cuando ocurre un error.

### ¿Qué tipo de excepciones existen?

- **Checked Exceptions**: Errores que el compilador obliga a manejar.
- **Unchecked Exceptions**: Errores en tiempo de ejecución.

### ¿Cómo se puede Manejar las Excepciones?

**El manejo de excepciones** es el mecanismo que permite a los programadores controlar el flujo de un programa cuando ocurre una excepción, para que el programa no termine abruptamente y pueda seguir funcionando o al menos finalizar de manera controlada.

En Java, el manejo de excepciones se realiza mediante bloques de código específicos:

1. **`try`**: Este bloque contiene el código que puede lanzar una excepción. Si ocurre una excepción dentro de este bloque, el flujo del programa se detiene y pasa al bloque `catch`.
2. **`catch`**: Este bloque captura y maneja la excepción lanzada en el bloque `try`. Puede haber múltiples bloques `catch` para manejar diferentes tipos de excepciones.
3. **`finally`**: Este bloque contiene código que se ejecuta siempre, independientemente de si se lanzó una excepción o no. Se utiliza para liberar recursos, como cerrar archivos o conexiones de base de datos.
4. **`throw`**: Se usa para lanzar una excepción de forma explícita.
5. **`throws`**: Se utiliza en la declaración de métodos para indicar que este método puede lanzar una excepción.

### 📌 Tabla de las 20 Excepciones más comunes en Java

| Excepción                        | Tipo      | Cuándo ocurre                                       |
| -------------------------------- | --------- | --------------------------------------------------- |
| `ArithmeticException`            | Unchecked | División por cero, operaciones aritméticas ilegales |
| `NullPointerException`           | Unchecked | Uso de referencias nulas                            |
| `ArrayIndexOutOfBoundsException` | Unchecked | Índice inválido en un array                         |
| `ClassCastException`             | Unchecked | Conversión de tipos incorrecta                      |
| `IllegalArgumentException`       | Unchecked | Argumento ilegal o inapropiado                      |
| `IllegalStateException`          | Unchecked | Estado del objeto no válido para una operación      |
| `NumberFormatException`          | Unchecked | Conversión inválida de `String` a número            |
| `InputMismatchException`         | Unchecked | Tipo de entrada no coincide con el esperado         |
| `IndexOutOfBoundsException`      | Unchecked | Índice fuera de rango (Listas, Strings)             |
| `UnsupportedOperationException`  | Unchecked | Operación no soportada en colecciones               |
| `IOException`                    | Checked   | Fallos al leer o escribir archivos                  |
| `FileNotFoundException`          | Checked   | Archivo no encontrado                               |
| `SQLException`                   | Checked   | Error al ejecutar operaciones con bases de datos    |
| `ParseException`                 | Checked   | Error al analizar fechas, números, etc.             |
| `InterruptedException`           | Checked   | Hilo interrumpido                                   |
| `MalformedURLException`          | Checked   | URL mal formada                                     |
| `URISyntaxException`             | Checked   | URI no válido                                       |
| `ClassNotFoundException`         | Checked   | Clase no encontrada en tiempo de ejecución          |
| `CloneNotSupportedException`     | Checked   | Clonación no permitida para la clase                |
| `NoSuchMethodException`          | Checked   | Método no encontrado mediante reflexión             |

🎓 **Conclusión para estudiantes:**

> Las excepciones permiten construir software más robusto, predecible y seguro. Manejar los errores con intención es una señal de profesionalismo en la programación.

🎓 **Este es el enfoque recomendado para enseñar buenas prácticas modernas de testing con Maven y JUnit.**

### 3. Crear las clases

📦 **Paquete `com.cursojava` dentro de `src/main/java`**:

```java
package com.cursojava;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public int convertirAEntero(String valor) {
        return Integer.parseInt(valor);
    }
}
```

📦 **Paquete `com.cursojava` dentro de `src/test/java`** (misma estructura):

```java
package com.cursojava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    @Test
    void testConversorEnteroConTryCatch() {
        Calculadora calc = new Calculadora();
        try {
            int resultado = calc.convertirAEntero("abc");
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error de conversión: " + e.getMessage());
        } finally {
            System.out.println("Fin del intento de conversión");
        }
    }
}
```

✅ Ahora los estudiantes ven:

- Excepciones lanzadas con `throw`
- Cómo capturar y manejar errores reales de uso
- Uso de `try/catch/finally` con otro tipo de excepción (`NumberFormatException`)

---

## 🧹 Buenas prácticas modernas con `try-with-resources`

Cuando usamos recursos como `Scanner`, `BufferedReader`, `FileReader`, etc., es recomendable usar el bloque `try-with-resources`. Esto permite que los recursos se cierren automáticamente, evitando errores o fugas.

### ✅ Ejemplo tradicional (con `finally`):

```java
Scanner scanner = new Scanner(System.in);
try {
    System.out.print("Ingresa un número para dividir 100: ");
    int numero = scanner.nextInt();
    int resultado = 100 / numero;
    System.out.println("Resultado: " + resultado);
} catch (ArithmeticException e) {
    System.out.println("❌ Error: No se puede dividir por cero.");
} catch (InputMismatchException e) {
    System.out.println("❌ Error: Debes ingresar un número entero válido.");
} finally {
    System.out.println("🧹 Cerrando recursos...");
    scanner.close();
}
```

### ✅ Ejemplo moderno (con `try-with-resources`):

```java
try (Scanner scanner = new Scanner(System.in)) {
    System.out.println("Ingresa un número para dividir 100: ");
    int numero = scanner.nextInt();
    int resultado = 100 / numero;
    System.out.println("Resultado: " + resultado);
} catch (ArithmeticException e) {
    System.out.println("❌ Error: No se puede dividir por cero.");
} catch (InputMismatchException e) {
    System.out.println("❌ Error: Debes ingresar un número entero válido.");
}
```

### 💡 Tips pedagógicos:

- Usa `try-with-resources` cuando trabajes con archivos, streams, sockets o cualquier objeto que **necesite cerrarse manualmente**.
- Enséñales que es una **alternativa más segura y elegante** al `finally`.
- Aplica solo si el recurso implementa la interfaz `AutoCloseable`.

## ⚙️ Pruebas unitarias en Java y uso de JUnit

### 🔍 ¿Qué es JUnit?

JUnit es un **framework de pruebas unitarias** para Java. Permite definir, organizar y automatizar tests para asegurar que cada unidad de tu aplicación haga lo que se espera.

📌 Actualmente, **JUnit 5** es la versión más moderna y utilizada.

### 📥 ¿Cómo instalar JUnit?

#### Opción 1: Proyecto Maven

La forma más sencilla es **usar Maven**. Solo necesitas agregar las siguientes dependencias en tu archivo `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

Luego, puedes correr los tests con el comando:

```bash
mvn test
```

#### Opción 2: Proyecto clásico sin Maven

1. Ve a la página oficial de JUnit:

   - [https://junit.org/](https://junit.org/)
   - O bien usa algún repositorio de librerías como:

     - [https://mvnrepository.com/](https://mvnrepository.com/)
     - [https://central.sonatype.com/](https://central.sonatype.com/)

   🌐 Otras páginas útiles para buscar librerías Java

   | Sitio Web                                            | Descripción                                                                                                                                                                  |
   | ---------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
   | [https://search.maven.org](https://search.maven.org) | 🔍 Sitio oficial del repositorio central de Maven. Ideal para buscar versiones actualizadas y ver el XML completo para copiar.                                               |
   | [https://javadoc.io](https://javadoc.io)             | 📚 Visualiza directamente la documentación Javadoc de casi cualquier librería publicada en Maven Central. Muy útil para ver cómo se usa una clase o API.                     |
   | [https://libraries.io](https://libraries.io)         | 🌐 Sitio que permite rastrear dependencias de proyectos en múltiples lenguajes, incluyendo Java. Ideal para explorar alternativas y tendencias.                              |
   | [https://github.com](https://github.com)             | 🐙 Muchos proyectos Java tienen sus librerías publicadas como open source. Busca con `"maven" + nombre del proyecto` para encontrar el repo oficial y el pom.xml de ejemplo. |
   | [https://jitpack.io](https://jitpack.io)             | 🚀 Permite importar directamente proyectos desde GitHub como dependencias Maven/Gradle. Muy útil si una librería no está en Maven Central.                                   |
   | [https://openliberty.io](https://openliberty.io)     | 💼 Especializado en microservicios y Java EE. Buen lugar para explorar frameworks modernos con integración de pruebas y JUnit.                                               |

   ✅ Recomendación para estudiantes:

   > Siempre busca en fuentes oficiales o verificadas. Asegúrate de que las versiones de las dependencias estén activamente mantenidas y bien documentadas.

2. Descarga los archivos `.jar` correspondientes a JUnit 5:

   - `junit-jupiter-api-x.x.x.jar`
   - `junit-jupiter-engine-x.x.x.jar`
   - `apiguardian-api-x.x.x.jar`

3. Colócalos en una carpeta `/lib` dentro de tu proyecto y configúralos como dependencias en el classpath.

✅ También puedes usar **atajos del IDE**. Por ejemplo, al usar `@Test`, IntelliJ puede ofrecerte importar automáticamente JUnit como dependencia.

---

## 🧪 ¿Cómo se ve una clase de prueba?

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiClaseTest {

    @Test
    public void pruebaMetodoSuma() {
        MiClase miObjeto = new MiClase();
        int resultado = miObjeto.sumar(2, 3);
        assertEquals(5, resultado);
    }
}
```

```java
public class MiClase {
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

### 🧠 Detalles importantes para estudiantes

| Elemento             | Explicación                                                         |
| -------------------- | ------------------------------------------------------------------- |
| `@Test`              | Indica que el método es una prueba.                                 |
| `import static ...`  | Permite usar `assertEquals()` sin anteponer `Assertions.` cada vez. |
| `assertEquals(a, b)` | Verifica que el resultado `a` sea igual a lo esperado `b`.          |

🔎 **Cuándo usar import estático:**

```java
// Normal
import org.junit.jupiter.api.Assertions;
Assertions.assertEquals(5, resultado);

// Estático (más limpio)
import static org.junit.jupiter.api.Assertions.*;
assertEquals(5, resultado);
```

✅ Se recomienda el uso de import estático cuando harás múltiples pruebas en una misma clase, por claridad y concisión.

---

🎯 **Conclusión pedagógica:**

Al integrar JUnit con Maven, los estudiantes aprenden no solo testing, sino también gestión de dependencias, estructuras estándar de proyecto y buenas prácticas profesionales. Esto mejora su perfil técnico desde el inicio.

---

## 🧪 ¿Qué es Test Driven Development TDD?

### 🧩 Definición

**Test Driven Development (TDD)** es una práctica de desarrollo donde **primero se escriben las pruebas** antes del código funcional. Es un ciclo corto de desarrollo basado en tres pasos: **Red - Green - Refactor**.

### 🔁 Ciclo de TDD explicado

1. **Red (Rojo):** Escribes una prueba que fallará porque la funcionalidad aún no existe.
2. **Green (Verde):** Escribes el código mínimo necesario para que la prueba pase.
3. **Refactor:** Limpias el código manteniendo el comportamiento.

### 💻 Ejemplo de TDD paso a paso

#### Paso 1 - RED: Escribimos la prueba

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void pruebaSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }
}
```

> En este momento la clase `Calculadora` aún no existe. El test **fallará**.

#### Paso 2 - GREEN: Implementamos lo mínimo para que pase

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}
```

✅ Ahora el test pasa correctamente.

#### Paso 3 - REFACTOR: (si es necesario)

```java
// Código ya limpio, no es necesario refactorizar en este ejemplo
```

### ✅ Beneficios de TDD

| Beneficio                  | Explicación                                         |
| -------------------------- | --------------------------------------------------- |
| Código más confiable       | Las pruebas se escriben antes del código.           |
| Previene sobrecodificación | Solo implementas lo necesario.                      |
| Facilita refactorizaciones | Puedes reestructurar sin miedo a romper algo.       |
| Diseño más limpio          | Escribes funciones pequeñas, enfocadas y testables. |

### 💡 Consejo para estudiantes:

> TDD obliga a pensar primero en **cómo se usará** tu código antes de escribirlo. Te ayuda a diseñar mejor desde el inicio.

✅ Aunque al principio parezca más lento, a largo plazo **ahorra tiempo, mejora la calidad y reduce errores**.

---

### 🧠 ¿Cómo pensar con mentalidad (TDD)?

> **TDD no se trata solo de escribir pruebas antes que el código**, sino de **cambiar la forma en la que pensamos el desarrollo.**

Cuando trabajamos con TDD:

- No escribimos código "a lo loco", esperando después probar si funciona.
- Primero **definimos lo que el código debe hacer** (escribimos la prueba).
- Luego escribimos **lo mínimo necesario para pasar esa prueba**.
- Y finalmente, **refactorizamos** si es necesario para mejorar el diseño.

🎯 **TDD es pensar desde el uso**, no desde la implementación.

Es como diseñar primero el control remoto antes de construir el televisor. Si sabes qué botones debe tener, es más fácil construir lo que esos botones controlarán.

---

### 💬 Analogía para estudiantes

> Imagina que vas a construir una puerta automática.
> Antes de construirla, diseñas un **control remoto con un botón rojo** que debería abrir la puerta.
> Luego, construyes **lo necesario para que al presionar ese botón, la puerta se abra**.
> Eso es TDD: **primero el botón (la prueba), después el mecanismo (el código).**

## 🧪 Escribiendo y realizando pruebas en Java con JUnit

Una vez que tienes configurado JUnit en tu proyecto (ya sea con Maven, Gradle o manualmente), puedes comenzar a crear **clases de prueba**. Estas clases nos permiten verificar que las funcionalidades de nuestro código se comportan como se espera.

### 🔧 ¿Qué herramientas ofrece JUnit?

#### ✅ Anotaciones

JUnit se basa en anotaciones para marcar **qué se va a ejecutar, cuándo y cómo** durante las pruebas. Las más comunes son:

| Anotación            | Descripción                                                                |
| -------------------- | -------------------------------------------------------------------------- |
| `@Test`              | Marca un método como una prueba unitaria.                                  |
| `@BeforeEach`        | Se ejecuta **antes de cada** método `@Test`. Ideal para inicializar datos. |
| `@AfterEach`         | Se ejecuta **después de cada** método `@Test`. Útil para limpiar recursos. |
| `@BeforeAll`         | Se ejecuta **una vez** antes de todas las pruebas (debe ser `static`).     |
| `@AfterAll`          | Se ejecuta **una vez** después de todas las pruebas (debe ser `static`).   |
| `@Disabled`          | Permite **deshabilitar** temporalmente una prueba.                         |
| `@ParameterizedTest` | Permite ejecutar un test con **múltiples valores**.                        |

#### ✅ Métodos `assert`

JUnit nos ofrece métodos de aserción (`asserts`) para comparar valores esperados vs reales:

| Método                                         | ¿Qué verifica?                            |
| ---------------------------------------------- | ----------------------------------------- |
| `assertEquals(expected, actual)`               | Que dos valores sean iguales.             |
| `assertNotEquals(expected, actual)`            | Que dos valores sean distintos.           |
| `assertTrue(condition)`                        | Que la condición sea verdadera.           |
| `assertFalse(condition)`                       | Que la condición sea falsa.               |
| `assertNull(object)`                           | Que el objeto sea `null`.                 |
| `assertNotNull(object)`                        | Que el objeto **no** sea `null`.          |
| `assertThrows(Exception.class, () -> { ... })` | Que una excepción específica sea lanzada. |

### 🚀 Ejemplo completo de clase de prueba

```java
public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }
}
```

```java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora(); // Se crea antes de cada test
    }

    @Test
    void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(10, 5));
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test finalizado.");
    }
}
```

### 💡 Consejos pedagógicos para estudiantes

- 🧠 **No memorices, comprende.** Cada anotación tiene un propósito muy claro en el flujo del test.
- 🧪 **Un test = un comportamiento a verificar.** Evita agrupar muchos `asserts` en el mismo test.
- 🧹 **Usa `@BeforeEach` y `@AfterEach` para reutilizar código y mantener pruebas limpias.**
- ⚠️ **Haz fallar tus pruebas al principio:** Así validas que realmente se están ejecutando.
- 🚫 **No ignores los errores de test.** Si una prueba falla, es una oportunidad para encontrar bugs temprano.
