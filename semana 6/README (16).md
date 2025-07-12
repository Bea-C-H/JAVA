# 🧪 Ejercicio guiado: Refugio Animal con herencia y paquetes

Este ejercicio demuestra cómo aplicar el concepto de **herencia** en Java utilizando una estructura de paquetes clara y separada. Ideal para estudiantes que comienzan a dominar la Programación Orientada a Objetos (POO).

---

## 👣 Paso 1: Crear el proyecto

📁 Nombre sugerido: `RefugioAnimal`

---

## 👣 Paso 2: Crear la estructura de paquetes

```
src/
├── app/         → contiene la clase principal con `main`
├── modelo/      → contiene la clase base `Animal`
└── animales/    → contendrá subclases como `Perro` y `Gato`
```

---

## 👣 Paso 3: Crear la clase base `Animal`

📄 `modelo/Animal.java`

```java
package modelo;

// Clase base que representa un animal genérico
public class Animal {

    // Atributos comunes a todos los animales
    protected String nombre;
    protected String especie;
    protected int edad;

    // Constructor
    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método genérico que puede ser sobrescrito
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico.");
    }
}
```

> 🔐 _Nota: Usamos `protected` para que los atributos puedan ser usados en subclases pero no accesibles directamente desde clases fuera del modelo._

---

## 👣 Paso 3.1: Verificar acceso desde otro paquete

📄 `app/Main.java`

```java
package app;

import modelo.Animal;

public class Main {
    public static void main(String[] args) {

        // Creamos un objeto de tipo Animal
        Animal animal1 = new Animal("Animal", "Perro", 1);
        animal1.mostrarInformacion();
        animal1.hacerSonido();

        /*
         * Salida esperada:
         * Nombre: Animal
         * Especie: Perro
         * Edad: 1 años
         * Animal hace un sonido genérico.
         */

        System.out.println("\n---\n");
    }
}
```

> ✅ Como podemos ver, no hay problema al acceder desde el paquete app a la clase Animal ubicada en el paquete modelo, porque:
>
> - La clase Animal está marcada como public.
> - Los métodos mostrarInformacion() y hacerSonido() también son public.
> - Y los atributos protected permiten su uso interno y por clases hijas.

> 🎯 Conclusión intermedia: Ya podemos trabajar con nuestra clase Animal desde distintos paquetes. Esto demuestra que los modificadores de acceso están correctamente aplicados para permitir reutilización en un proyecto estructurado.

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

---

## 👣 Paso 4: Crear clases hijas (Perro y Gato) usando herencia

📌 Para crear una subclase o clase hija en Java, usamos la palabra reservada `extends` seguida del nombre de la clase que queremos heredar.

📄 Estructura general:

```java
public class Hija extends Padre {
    // código adicional
}
```

> 🧠 En nuestro caso: Perro y Gato extienden de Animal para heredar sus atributos y métodos, y además pueden personalizar su comportamiento.

---

### 📄 `animales/Perro.java`

```java
package animales;

import modelo.Animal;

// Subclase que extiende de Animal
public class Perro extends Animal {

    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, "Perro", edad); // Llamamos al constructor del padre
    }

    // Método sobrescrito para sonido específico
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau! 🐶");
    }
}

```

---

### 📄 `animales/Gato.java`

```java
package animales;

import modelo.Animal;

// Subclase que extiende de Animal
public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, "Gato", edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau! 🐱");
    }
}

```

---

## 👣 Paso 5: Instanciar subclases y probar herencia

📄 `app/Main.java`

```java
package app;

import modelo.Animal;
import animales.Perro;
import animales.Gato;

public class Main {
    public static void main(String[] args) {

        // 5.1 Creamos un objeto de tipo Animal
        Animal animal1 = new Animal("Animal", "Perro", 1);
        animal1.mostrarInformacion();
        animal1.hacerSonido();

        /*
         * Salida esperada:
         * Nombre: Animal
         * Especie: Perro
         * Edad: 1 años
         * Animal hace un sonido genérico.
         */

        System.out.println("\n---\n");

        // 5.2 Creamos un objeto de tipo Gato
        Gato gato1 = new Gato("Michi", 3);
        gato1.mostrarInformacion(); // método heredado
        gato1.hacerSonido();        // método sobrescrito

        /*
         * Salida esperada:
         * Nombre: Michi
         * Especie: Gato
         * Edad: 3 años
         * Michi dice: ¡Miau! 🐱
         */

        System.out.println("\n---\n");

        // 5.3 Creamos un objeto de tipo Perro
        Perro perro1 = new Perro("Firulais", 5);
        perro1.mostrarInformacion(); // método heredado
        perro1.hacerSonido();        // método sobrescrito

        /*
         * Salida esperada:
         * Nombre: Firulais
         * Especie: Perro
         * Edad: 5 años
         * Firulais dice: ¡Guau! 🐶
         */
    }
}

```

---

## 📘 ¿Qué observamos?

✔️ Herencia clara: Perro y Gato heredan de Animal.
✔️ Reutilización de código con el constructor del padre vía super().
✔️ Acceso a atributos gracias a protected.
✔️ Polimorfismo a través de métodos sobrescritos (hacerSonido).

## ✅ Conclusiones

✔️ Reutilización de código mediante `extends`  
✔️ Encapsulamiento protegido con `protected`  
✔️ Uso de `super()` para inicializar  
✔️ Sobrescritura de métodos (`@Override`)  
✔️ Polimorfismo en acción

---



# 🧪 Ejercicio guiado: Refugio Animal - Parte 2: Encapsulamiento y métodos privados

En esta segunda parte del ejercicio, agregamos atributos `private` y métodos privados a las subclases `Perro` y `Gato`. Esto nos permitirá explorar más a fondo el **encapsulamiento**, el uso de **getters y setters**, y cómo los **métodos privados** protegen la lógica interna de una clase.

---

## 👣 Paso 6: Añadir atributos `private` y métodos controlados en las subclases

---

### 🎯 Objetivos

- Reforzar el uso de `private` para proteger atributos.
- Usar `getters` y `setters` para exponer información de forma segura.
- Diferenciar entre métodos públicos y privados.
- Mostrar cómo acceder a comportamientos internos desde el `main`.

---

### 🔧 Modificamos 🐶 `Perro.java` para agregar atributos privados y métodos públicos

```java
package animales;

import modelo.Animal;

public class Perro extends Animal {

    private boolean entrenado; // nuevo atributo privado

    public Perro(String nombre, int edad) {
        super(nombre, "Perro", edad);
        this.entrenado = false; // valor por defecto
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau! 🐶");
    }

    // Getter para saber si está entrenado
    public boolean isEntrenado() {
        return entrenado;
    }

    // Setter para cambiar su estado
    public void entrenar() {
        this.entrenado = true;
        System.out.println(nombre + " ha sido entrenado. 🐾");
    }

    // Método privado solo visible dentro de esta clase
    private void moverCola() {
        System.out.println(nombre + " mueve la cola de felicidad.");
    }

    // Método público que internamente usa el método privado
    public void saludar() {
        System.out.println(nombre + " se acerca...");
        moverCola(); // el método privado se llama desde aquí
    }
}

```

---

### 🔧 También modificamos 🐱 `Gato.java` con un atributo adicional

```java
package animales;

import modelo.Animal;

public class Gato extends Animal {

    private boolean cazador; // atributo privado

    public Gato(String nombre, int edad) {
        super(nombre, "Gato", edad);
        this.cazador = true; // valor por defecto
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau! 🐱");
    }

    // Getter
    public boolean esCazador() {
        return cazador;
    }

    // Setter
    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }
}

```

---

### 🧪 Probar en el main

📄 `app/Main.java`

```java
package app;

import modelo.Animal;
import animales.Perro;
import animales.Gato;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Animal", "Perro", 1);
        animal1.mostrarInformacion();
        animal1.hacerSonido();

        System.out.println("\n---\n");

        Gato gato1 = new Gato("Michi", 3);
        gato1.mostrarInformacion();
        gato1.hacerSonido();

        System.out.println("\n---\n");

        Perro perro1 = new Perro("Firulais", 5);
        perro1.mostrarInformacion();
        perro1.hacerSonido();

        System.out.println("\n---\n");

        // 6.1 Consultar estado privado a través de getters
        System.out.println("¿" + gato1.getNombre() + " es cazador? " + gato1.esCazador());
        System.out.println("¿" + perro1.getNombre() + " está entrenado? " + perro1.isEntrenado());

        // 6.2 Modificamos el estado
        perro1.entrenar();

        // 6.3 Repetimos la consulta
        System.out.println("¿" + perro1.getNombre() + " está entrenado ahora? " + perro1.isEntrenado());

        // 6.4 Invocar un método que internamente llama a uno privado
        perro1.saludar();

        /*
         * No podemos hacer esto directamente:
         * perro1.moverCola(); // ❌ Error: método privado
         */
    }
}
```

---

### ⚠️ ¡Alerta!

Para que esto funcione:

> 🧠 **Debes tener definidos los métodos `getNombre()` en la clase `Animal`**, ya que los atributos como `nombre` son `protected`.

🔧 Si no tienes estos métodos, verás un error cuando intentes hacer:

```java
gato1.getNombre(); // ❌ No se puede acceder si no existe el getter
```

---

### 🧱 Solución: Agregar getters en `Animal.java`

```java
public String getNombre() {
    return nombre;
}
```

Haz lo mismo si necesitas exponer `especie` o `edad`.



### 📘 ¿Qué reforzamos en este paso?

| Concepto            | Aplicación                                             |
| ------------------- | ------------------------------------------------------ |
| `private`           | Los atributos no pueden ser accedidos directamente.    |
| `getter` / `setter` | Permiten **leer/modificar** de forma controlada.       |
| `método privado`    | Útil para lógica interna **no accesible desde fuera**. |
| `método público`    | Actúa como **puente** para exponer comportamientos.    |


---

## ✅ Conclusiones

✔️ Aprendimos a encapsular información usando `private`  
✔️ Utilizamos `getters` y `setters` para exponer de forma segura  
✔️ Usamos métodos privados como lógica interna segura  
✔️ Comprendimos las limitaciones del acceso desde `main`

---




# 🧪 Ejercicio guiado: Refugio Animal - Parte 3: Polimorfismo en acción

En esta tercera parte, aplicamos el concepto de **polimorfismo** para demostrar cómo objetos de diferentes clases (`Perro`, `Gato`, etc.), que heredan de una clase común (`Animal`), pueden ser tratados de forma uniforme y comportarse de manera distinta.

---

## 👣 Paso 7: Aplicar polimorfismo con arreglos y llamadas dinámicas

📌 En lugar de llamar individualmente a `hacerSonido()` para cada tipo, ahora vamos a usar un arreglo o lista de tipo `Animal`, y veremos cómo cada objeto responde a su manera.

---

### 📄 `app/Main.java` (continuación)

```java
package app;

import modelo.Animal;
import animales.Perro;
import animales.Gato;

public class Main {
    public static void main(String[] args) {

        Animal[] animales = new Animal[4];
        animales[0] = new Perro("Max", 2);
        animales[1] = new Gato("Luna", 4);
        animales[2] = new Perro("Rex", 3);
        animales[3] = new Gato("Mila", 1);

        for (Animal a : animales) {
            a.mostrarInformacion();  // método heredado de Animal
            a.hacerSonido();         // comportamiento polimórfico
            System.out.println("---");
        }
    }
}
```

---

## 📘 ¿Qué es polimorfismo?

El **polimorfismo** es la capacidad de una **referencia de clase padre (`Animal`)** de adaptarse y comportarse como una **subclase (`Perro`, `Gato`)**, ejecutando la versión del método sobrescrito correspondiente.

### 💡 Ventajas:

- Reutilización de código.
- Menor acoplamiento.
- Mayor extensibilidad.
- Tratamiento uniforme a distintas clases hijas.

---

### 🧠 ¿Qué ocurre internamente?

Aunque el arreglo es de tipo `Animal[]`, cada elemento almacena un objeto real (`Perro`, `Gato`). Cuando llamamos a `hacerSonido()`, se ejecuta la versión **sobrescrita** en la clase concreta gracias a **ligado dinámico**.

---

### 🧪 Resultado esperado:

```
Nombre: Max
Especie: Perro
Edad: 2 años
Max dice: ¡Guau! 🐶
---
Nombre: Luna
Especie: Gato
Edad: 4 años
Luna dice: ¡Miau! 🐱
---
Nombre: Rex
Especie: Perro
Edad: 3 años
Rex dice: ¡Guau! 🐶
---
Nombre: Mila
Especie: Gato
Edad: 1 años
Mila dice: ¡Miau! 🐱
---
```

---

## ✅ Conclusiones de Polimorfismo

✔️ Usamos una sola referencia (`Animal`) para representar distintos tipos concretos  
✔️ Aplicamos polimorfismo a través de métodos sobrescritos (`@Override`)  
✔️ Reducimos código repetido y ganamos flexibilidad  
✔️ Demostramos cómo un sistema puede ser **extensible y mantenible**

---


# 🧪 Ejercicio guiado: Refugio Animal - Parte 4: Sobrecarga de métodos (Overloading)

En esta cuarta parte aplicamos **polimorfismo en tiempo de compilación**, también conocido como **sobrecarga de métodos** (`method overloading`). Utilizaremos nuestro sistema `RefugioAnimal` para demostrar cómo se pueden definir múltiples versiones de un mismo método en una clase, variando los parámetros.

---

## 👣 Paso 8: Aplicar sobrecarga de métodos

📌 En este ejemplo, agregamos varias versiones del método `alimentar()` dentro de la clase `Perro`. Todas tienen el mismo nombre, pero diferentes parámetros.

---

### 📄 `animales/Perro.java` (actualizado)

```java
package animales;

import modelo.Animal;

public class Perro extends Animal {

    private boolean entrenado;

    public Perro(String nombre, int edad) {
        super(nombre, "Perro", edad);
        this.entrenado = false;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau! 🐶");
    }

    // Sobrecarga 1: sin parámetros
    public void alimentar() {
        System.out.println(nombre + " está comiendo croquetas.");
    }

    // Sobrecarga 2: con tipo de comida
    public void alimentar(String comida) {
        System.out.println(nombre + " está comiendo " + comida + ".");
    }

    // Sobrecarga 3: con tipo de comida y cantidad
    public void alimentar(String comida, int cantidad) {
        System.out.println(nombre + " comió " + cantidad + " gramos de " + comida + ".");
    }
}
```

---

## 🧪 Probar en `Main.java`

Agrega esto en tu clase principal:

```java
Perro perro2 = new Perro("Rocky", 4);

perro2.alimentar();                        // sin argumentos
perro2.alimentar("pollo");                 // un argumento
perro2.alimentar("croquetas", 150);        // dos argumentos
```

---

### 🧠 ¿Qué logramos?

| Llamada                         | Método invocado                            |
|----------------------------------|---------------------------------------------|
| `alimentar()`                   | sin parámetros                              |
| `alimentar("pollo")`           | con un `String`                             |
| `alimentar("croquetas", 150)`  | con un `String` y un `int`                  |

> 🧠 A pesar de tener el mismo nombre, el compilador diferencia estos métodos por sus firmas (tipo y número de parámetros).

---

## 📘 ¿Qué es `method overloading`?

- Permite definir **múltiples métodos con el mismo nombre**.
- Se diferencian por la **cantidad y/o tipo de parámetros**.
- La **elección se hace en tiempo de compilación**, por eso es polimorfismo estático.

---

### ✅ Ventajas

✔️ Mejora la legibilidad del código.  
✔️ Permite comportamientos similares con diferentes entradas.  
✔️ Facilita la extensibilidad sin cambiar nombres de métodos.

---

## ✅ Conclusión

✔️ Aplicamos **polimorfismo en tiempo de compilación** mediante sobrecarga.  
✔️ Demostramos que múltiples métodos pueden coexistir con el mismo nombre.  
✔️ Completamos los dos tipos de polimorfismo en Java: sobrescritura (dinámico) y sobrecarga (estático).




# 🧪 Ejercicio guiado: Refugio Animal - Parte 5: Clases abstractas

En esta quinta parte del sistema `RefugioAnimal`, exploramos el uso de **clases abstractas** para estructurar mejor nuestro modelo. Este enfoque permite definir un comportamiento común en una clase base, y obligar a las subclases a implementar ciertos métodos.

---

## 👣 Paso 9: Transformar `Animal` en clase abstracta

📌 Vamos a hacer que `Animal` sea una **clase abstracta**, para que ya no se pueda instanciar directamente. Además, definiremos un **método abstracto obligatorio** que todas las subclases deben implementar.

---

### 📄 `modelo/Animal.java` (convertido en clase abstracta)

```java
package modelo;

// Clase abstracta: NO se puede instanciar directamente
public abstract class Animal {

    protected String nombre;
    protected String especie;
    protected int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método abstracto que DEBE ser implementado por cada subclase
    public abstract void hacerSonido();
}
```

---

## 🧱 Reglas clave sobre clases abstractas

| Regla | ¿Se cumple? |
|-------|-------------|
| No se puede instanciar directamente | ✅ |
| Puede contener métodos comunes (con código) | ✅ |
| Puede contener métodos abstractos (sin código) | ✅ |
| Obliga a las subclases a implementar esos métodos | ✅ |

---

### 📄 `Perro.java` y `Gato.java` siguen funcionando sin cambios

Estas clases ya implementaban `hacerSonido()`, por lo tanto **cumplen con el contrato** de la clase abstracta `Animal`.

---

## 🧪 Probar en `Main.java`

Reemplaza o elimina cualquier línea que intente hacer esto:

```java
Animal a = new Animal("X", "Desconocido", 0); // ❌ ya no permitido
```

Y mantén solo subclases concretas como `Perro` y `Gato`:

```java
Animal a = new Perro("Lobo", 6); // ✅ permitido
a.hacerSonido(); // Ejecuta la versión de Perro
```

---

## ✅ Ventajas del uso de clases abstractas

✔️ Define una estructura base común.  
✔️ Obliga a las subclases a implementar ciertos comportamientos.  
✔️ Mejora el diseño y legibilidad del sistema.  
✔️ Ideal para representar entidades genéricas como `Animal`.

---

## ✅ Conclusiones

✔️ Implementamos el principio de **abstracción** en OOP.  
✔️ Hicimos que `Animal` actúe como plantilla para sus subclases.  
✔️ Evitamos instancias inválidas y promovemos código más limpio.  
✔️ Todas las subclases ahora tienen una obligación clara de comportamiento.

---


# 🧪 Ejercicio guiado: Refugio Animal - Parte 6: Interfaces en acción

En esta sexta parte, integramos **interfaces** a nuestro proyecto `RefugioAnimal` para representar **capacidades o comportamientos adicionales** que ciertos animales pueden tener, sin afectar la jerarquía de herencia.

---

## 👣 Paso 10: Implementar interfaces en animales

### 🎯 ¿Por qué interfaces?

- Las clases en Java **solo pueden heredar de una clase padre**, pero pueden **implementar múltiples interfaces**.
- Una **interfaz define un contrato de comportamiento**, sin lógica, que puede ser compartido entre clases no relacionadas directamente.

---

## 📐 Diseño de ejemplo

Agregamos dos interfaces:

- `Entrenable`: define animales que pueden ser entrenados.
- `Adoptable`: define animales que pueden ser adoptados.

---

### 📄 `interfaces/Entrenable.java`

```java
package interfaces;

public interface Entrenable {
    void entrenando(); // NO CONFUNDIR CON EL ENTRENAR DEL INICIO
}
```

---

### 📄 `interfaces/Adoptable.java`

```java
package interfaces;

public interface Adoptable {
    String datosAdopcion();
}
```

---

## 🐶 `Perro.java` implementa ambas interfaces

```java
package animales;

import modelo.Animal;
import interfaces.Entrenable;
import interfaces.Adoptable;

public class Perro extends Animal implements Entrenable, Adoptable {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice ¡Guau!");
    }

    @Override
    public String tipoAlimentacion() {
        return "Croquetas y carne";
    }

    @Override
    public void entrenando() {
        System.out.println(nombre + " ha aprendido a sentarse. 🐾");
    }

    @Override
    public String datosAdopcion() {
        return "Perro " + nombre + " de " + edad + " años disponible para adopción.";
    }
}
```

---

## 🐱 `Gato.java` implementa solo `Adoptable`

```java
package animales;

import modelo.Animal;
import interfaces.Adoptable;

public class Gato extends Animal implements Adoptable {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice ¡Miau!");
    }

    @Override
    public String datosAdopcion() {
        return "Gato " + nombre + " de " + edad + " años listo para un hogar.";
    }
}
```

---

## 🧪 Probar en `Main.java`

```java
import animales.Perro;
import animales.Gato;
import interfaces.Adoptable;
import interfaces.Entrenable;

// Instancia por si no la tenemos 
Perro p = new Perro("Max", 3);
Gato g = new Gato("Michi", 2);

p.entrenando(); // método de interfaz Entrenable
System.out.println(p.datosAdopcion()); // método de interfaz Adoptable

System.out.println("---");

System.out.println(g.datosAdopcion()); // Gato también es Adoptable

// También podrías usar polimorfismo con interfaces:
Adoptable a1 = p;
System.out.println(a1.datosAdopcion());

Entrenable e1 = p;
e1.entrenando();
```

---

## 📘 ¿Qué aprendemos?

| Elemento     | Uso                          |
|--------------|-------------------------------|
| `implements` | Conecta clase con interfaz    |
| `interface`  | Define métodos sin lógica     |
| `@Override`  | Implementa el contrato        |
| `polimorfismo` | Podemos usar referencias de interfaz |

---

## 💬 Reflexión importante: ¿Por qué interfaces si "funcionaba sin ellas"?

Aunque podrías definir métodos como `entrenar()` directamente en tus clases (`Perro`, `Gato`), al usar interfaces:

✅ **Defines contratos formales** que pueden ser compartidos entre clases no relacionadas.  
✅ **Permites herencia múltiple de comportamiento** (algo que no puedes hacer con clases).  
✅ **Desacoplas el diseño**: puedes tratar a los objetos por su **capacidad** (`Adoptable`) en lugar de su tipo (`Perro`).  
✅ **Facilitas polimorfismo limpio**: trabajar con listas, filtros o métodos que aceptan interfaces es más flexible.

---

## 🐾 Ejemplo realista con extensión:

Si tienes una clase `Cachorro` que extiende de `Perro`, ya no puedes heredar otra clase concreta. Pero **sí puedes implementar interfaces** para sumar más comportamiento:

```java
public class Cachorro extends Perro implements Vacunable {
    public Cachorro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void vacunar() {
        System.out.println(nombre + " ha sido vacunado 💉");
    }
}
```

Así, accedes a `vacunar()` sin romper el límite de herencia de Java.

---

## ✅ Conclusión

✔️ Las interfaces permiten compartir comportamientos entre clases no relacionadas.  
✔️ Complementan la herencia con herencia múltiple de comportamientos.  
✔️ Son ideales para **modelar capacidades** como `Entrenable`, `Vacunable`, `Adoptable`.  
✔️ Favorecen sistemas extensibles, polimórficos y de bajo acoplamiento.

---

