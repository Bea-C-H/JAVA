# 📚 Breve introducción a los Principios SOLID en Java

Una vez que dominamos los fundamentos de la Programación Orientada a Objetos (POO) —como clases, objetos, atributos, métodos, encapsulamiento, constructores y getters/setters—, es importante comenzar a pensar en cómo escribir código **limpio, mantenible y escalable**.

Ahí es donde entran los **principios SOLID**.

**SOLID** es un conjunto de 5 buenas prácticas que te ayudan a construir software más robusto. No necesitas dominarlos al 100% al inicio, pero sí comenzar a entender su propósito.

En la siguiente sección, exploraremos cada principio de forma **simple y con ejemplos en Java**, para que puedas aplicar estas ideas paso a paso a medida que avanzas como desarrollador.

Los principios **SOLID** son cinco reglas fundamentales de diseño en la programación orientada a objetos. Fueron definidos por Robert C. Martin ("Uncle Bob") y ayudan a escribir código más limpio, mantenible, escalable y fácil de entender.

A continuación, te presentamos una versión simplificada y didáctica de cada principio, con analogías reales y ejemplos en Java para que puedas comprenderlos fácilmente:

---

## ✅ S - Single Responsibility Principle (SRP)

**🧠 Explicación (simple):**
Una clase debe encargarse de **una sola cosa**. Si una clase hace muchas cosas, cambiar una parte puede romper otra.

**🪄 Analogía:**
Un sacapuntas sirve solo para afilar lápices, no para escribir ni para borrarlos.

**💻 Código de ejemplo:**

```java
class GeneradorReporte {
    public void generar() {
        System.out.println("Generando reporte...");
    }
}

class EnviadorEmail {
    public void enviar() {
        System.out.println("Enviando por email...");
    }
}
```

---

## ✅ O - Open/Closed Principle (OCP)

**🧠 Explicación (simple):**
Puedes **agregar** cosas nuevas sin tener que **modificar** lo que ya funciona.

**🪄 Analogía:**
Un enchufe múltiple permite agregar más aparatos sin modificar el enchufe de la pared.

**💻 Código de ejemplo:**

```java
interface Envio {
    void enviar(String mensaje);
}

class EnvioEmail implements Envio {
    public void enviar(String mensaje) {
        System.out.println("Email: " + mensaje);
    }
}

class EnvioSMS implements Envio {
    public void enviar(String mensaje) {
        System.out.println("SMS: " + mensaje);
    }
}
```

---

## ✅ L - Liskov Substitution Principle (LSP)

**🧠 Explicación (simple):**
Si una clase hija reemplaza a la madre, **todo debe seguir funcionando igual**.

**🪄 Analogía:**
Un control remoto universal debe poder reemplazar el control original sin cambiar la experiencia.

**💻 Código de ejemplo:**

```java
class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("Guau");
    }
}
```

---

## ✅ I - Interface Segregation Principle (ISP)

**🧠 Explicación (simple):**
Es mejor tener **interfaces pequeñas y específicas** que una muy grande que nadie use completa.

**🪄 Analogía:**
Un control remoto con solo los botones que usas es más útil que uno con 50 botones intil que uno con 50 botones in\u00fátiles.

**💻 Código de ejemplo:**

```java
interface Imprimible {
    void imprimir();
}

interface Escaneable {
    void escanear();
}

class Impresora implements Imprimible {
    public void imprimir() {
        System.out.println("Imprimiendo...");
    }
}
```

---

## ✅ D - Dependency Inversion Principle (DIP)

**🧠 Explicación (simple):**
Las clases deben depender de **interfaces (abstracciones)**, no de clases concretas.

**🪄 Analogía:**
Tu celular carga con cualquier cable USB (interfaz), no depende solo del cargador original.

**💻 Código de ejemplo:**

```java
interface Motor {
    void encender();
}

class MotorGasolina implements Motor {
    public void encender() {
        System.out.println("Motor a gasolina encendido");
    }
}

class Auto {
    private Motor motor;

    public Auto(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
    }
}
```

---

