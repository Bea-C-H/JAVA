# 🧠 Programación Orientada a Objetos (POO) en Java - Parte 1: Fundamentos Básicos

---

## 🔎 ¿Qué es la Programación Orientada a Objetos?

La Programación Orientada a Objetos (POO) es una forma de programar en la que pensamos el código como si estuviéramos construyendo cosas del mundo real: objetos con **características** (estado) y **acciones** (comportamientos).

### 🍪 Analogía: Las galletas

- Una **clase** es el _molde_ de una galleta: define forma, sabor, color.
- Un **objeto** es la _galleta real_: tiene valores específicos.
- Los **atributos** son las propiedades: sabor, color, tamaño.
- Los **métodos** son las acciones: hornear, decorar, comer.

---

## 🚗 Ejemplo 1: Clase `Vehiculo` (archivo simple sin `package`)

Creamos una clase `Vehiculo` con atributos y un método, y luego una clase `Auto` que usa esa clase.

```java
// Vehiculo.java

// Declaramos la clase Vehiculo
public class Vehiculo {
    // Atributo que indica el tipo de vehículo (Auto, Camion, Bicicleta)
    String tipo;

    // Atributo que representa la cantidad de ruedas del vehículo
    int ruedas;

    // Atributo que indica el color del vehículo
    String color;

    // Método común que simula el movimiento del vehículo
    public void avanzar() {
        // Imprime un mensaje cuando el vehículo avanza
        System.out.println("El vehículo está avanzando.");
    }
}

// Clase Auto con el método main para ejecutar el programa
class Auto {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Vehiculo utilizando la palabra clave 'new'
        Vehiculo miAuto = new Vehiculo();

        // Asignamos valores a los atributos del objeto
        miAuto.tipo = "Auto";       // El tipo de vehículo es "Auto"
        miAuto.ruedas = 4;          // Tiene 4 ruedas
        miAuto.color = "Rojo";     // El color es rojo

        // Mostramos en consola los valores asignados
        System.out.println("Tipo: " + miAuto.tipo);
        System.out.println("Ruedas: " + miAuto.ruedas);
        System.out.println("Color: " + miAuto.color);

        // Llamamos al método 'avanzar' del objeto
        miAuto.avanzar(); // Esto imprimirá: El vehículo está avanzando.
    }
}
```

> 💡 Este ejemplo ayuda a comprender cómo crear y usar una clase, atributos, métodos e instancias.

---

## 📂 Ejemplo 2: Clase `Perro` usando `package` y modificadores de acceso

Ahora comenzamos a trabajar con **packages**, una forma profesional de organizar el código. También aplicamos **encapsulamiento** con atributos `private` y métodos `public` (semana 5).

### 📁 Estructura de carpetas sugerida

```
src/
├── semana6/
│   ├── poo/
│   │   └── Perro.java
│   └── poo_main/
│       └── Mascota.java
```

---

### 🐶 `Perro.java` (ubicado en `semana6.poo`)

```java
// Declaramos el paquete donde se encuentra esta clase
package semana6.poo;

// Declaramos la clase Perro y la hacemos pública para que otras clases puedan usarla
public class Perro {

    // Atributo privado: solo accesible desde esta clase
    private String nombre;

    // Otro atributo privado: la raza del perro
    private String raza;

    // Atributo privado: edad del perro
    private int edad;

    // Setter para asignar un nombre al perro desde otra clase
    public void setNombre(String nombre) {
        this.nombre = nombre; // usamos "this" para referirnos al atributo de la clase
    }

    // Setter para asignar la raza
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Setter para asignar la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para que el perro ladre
    public void ladrar() {
        System.out.println("\u00a1Guau! \u00a1Guau!");
    }

    // Método para imprimir toda la información del perro
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
    }
}
```

---

### 🐕 `Mascota.java` (ubicado en `semana6.poo_main`)

```java
// Declaramos el paquete de esta clase principal
package semana6.poo_main;

// Importamos la clase Perro desde el paquete semana6.poo
import semana6.poo.Perro;

// Clase principal con el método main
public class Mascota {
    public static void main(String[] args) {
        // Creamos un nuevo objeto de tipo Perro porque este será quien se comunique con nuestra Clase Perro que está en el package poo
        Perro miPerro = new Perro();

        // Establecemos los valores del objeto utilizando los métodos set (encapsulamiento)
        miPerro.setNombre("Rocky");       // Asignamos el nombre "Rocky"
        miPerro.setRaza("Labrador");      // Asignamos la raza "Labrador"
        miPerro.setEdad(4);                // Asignamos la edad 4

        // Hacemos que el perro realice una acción
        miPerro.ladrar(); // El perro ladra

        // Mostramos la información completa
        miPerro.imprimirInformacion();
    }
}
```

---

## 🧑‍🏫 Ejemplo adicional: Clase `Persona` generando automáticamente métodos con IntelliJ IDEA

En IntelliJ IDEA, podemos usar atajos para generar automáticamente código repetitivo como constructores, getters, setters y `toString()`.

### 📄 Clase `Persona`

```java
package semana6.poo;

public class Persona {
    private String nombre;
    private int edad;
    private String profesion;

    // Paso 1: Hacemos clic derecho dentro de la clase > Generate...
    // Paso 2: Seleccionamos "Constructor" y marcamos los campos deseados para inicializarlos

    public Persona(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    // Paso 3: Repetimos Generate... > Getter and Setter > Seleccionamos todos los campos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    // Paso 4: Generate... > toString() para representar el objeto como texto
    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", profesion='" + profesion + '\'' +
               '}';
    }
}
```

### 🧪 Uso en clase principal:

```java
Persona p = new Persona("Ana", 30, "Ingeniera");
System.out.println(p); // Usamos toString()
```

### 💬 ¿Para qué sirve cada uno?

| Método      | Uso                                                                  |
| ----------- | -------------------------------------------------------------------- |
| Constructor | Inicializa los atributos cuando se crea un nuevo objeto              |
| Getter      | Permite **leer** el valor de un atributo privado                     |
| Setter      | Permite **modificar** el valor de un atributo privado                |
| toString()  | Devuelve una representación en texto del objeto (útil para imprimir) |

---

## ℹ️ Información adicional: Constructor vacío (por defecto)

Un **constructor vacío** permite crear un objeto sin pasarle datos al inicio. Es útil cuando:

1. Quieres **crear el objeto primero y asignar valores después**:

```java
Persona p = new Persona();
p.setNombre("Laura");
p.setEdad(28);
```

2. Lo requieren herramientas como **Spring**, **Jackson** o **Hibernate**, que necesitan crear objetos por reflexión.

3. Buscas **flexibilidad** al crear objetos sin tener toda la información en el momento.

### 🧪 Ejemplo con constructor vacío:

```java
public class Persona {
    private String nombre;
    private int edad;

    // Constructor vacío
    public Persona() {
        // Se puede dejar vacío o establecer valores por defecto
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
```

Y su uso:

```java
Persona p = new Persona();
p.setNombre("Diego");
p.setEdad(32);
```

> 💡 Recomendación: si defines constructores con parámetros, agrega también el constructor vacío cuando sea necesario para compatibilidad o flexibilidad.

---

## 🧠 Glosario técnico

| Término             | Descripción                                                                 |
| ------------------- | --------------------------------------------------------------------------- |
| `class`             | Define una nueva clase (molde para objetos).                                |
| `object`            | Una instancia real de una clase.                                            |
| `new`               | Crea un nuevo objeto en memoria.                                            |
| `package`           | Agrupa clases relacionadas.                                                 |
| `import`            | Permite usar una clase ubicada en otro paquete.                             |
| `private`           | Restringe el acceso a un atributo o método solo dentro de su clase.         |
| `public`            | Permite el acceso desde cualquier parte del programa.                       |
| `this`              | Palabra clave que refiere al atributo de la instancia actual.               |
| `void`              | Indica que el método no devuelve ningún valor.                              |
| `constructor`       | Método especial que se llama al crear un objeto y sirve para inicializarlo. |
| `getter`            | Método público que devuelve el valor de un atributo privado.                |
| `setter`            | Método público que permite modificar un atributo privado.                   |
| `toString()`        | Representa el objeto como texto. Muy útil para debug o impresión.           |
| `constructor vacío` | Constructor sin parámetros, útil para inicialización flexible o frameworks. |

---

# 🧠 Programación Orientada a Objetos (POO) en Java - Parte 2: Herencia, Abstracción y Polimorfismo

---

## 📚 Principios esenciales de la Programación Orientada a Objetos

Antes de avanzar con los pilares avanzados, vamos a reforzar los principios fundamentales de la POO, especialmente el **encapsulamiento**, los **constructores**, los **getters y setters**, y el método especial `toString()`.

---

## 💊 Encapsulamiento en Java

El encapsulamiento permite **proteger los datos internos de un objeto** y controlar cómo se accede a ellos. En Java se logra usando:

- Atributos `private` (ocultos)
- Métodos `get` y `set` (públicos y controlados)

---

### 📄 Clase `Alumno` con explicación línea por línea

```java
// Definimos una clase llamada Alumno
public class Alumno {

    // Atributos privados: no se pueden acceder directamente desde fuera de la clase
    private String nombre;
    private int edad;

    // Constructor: se llama automáticamente al crear un nuevo objeto
    public Alumno(String nombre, int edad) {
        // 'this' se refiere al atributo de la clase
        this.nombre = nombre; // Asignamos el parámetro al atributo 'nombre'
        this.edad = edad;     // Asignamos el parámetro al atributo 'edad'
    }

    // Getter para el nombre: permite leer el valor de forma controlada
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre: permite cambiar el valor si lo necesitamos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    // Setter para la edad
    public void setEdad(int edad) {
        // Podemos agregar validaciones aquí si queremos controlar qué valores se permiten
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    // Método especial que representa al objeto como texto
    @Override
    public String toString() {
        // Devuelve una cadena con los valores del objeto
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
```

---

### 🧪 Clase principal para probar `Alumno`

```java
public class Main {
    public static void main(String[] args) {
        // Creamos un nuevo alumno con nombre y edad
        Alumno alumno1 = new Alumno("Lucía", 20);

        // Mostramos los valores usando el método toString()
        System.out.println(alumno1); // Salida: Alumno{nombre='Lucía', edad=20}

        // Cambiamos la edad usando el setter
        alumno1.setEdad(21);

        // Mostramos nuevamente los valores usando getters
        System.out.println("Nombre: " + alumno1.getNombre()); // Lucía
        System.out.println("Edad: " + alumno1.getEdad());     // 21
    }
}
```

---

## ✅ ¿Cuándo usamos getters y setters?

| Situación                         | ¿Por qué usar `get` y `set`?                               |
| --------------------------------- | ---------------------------------------------------------- |
| Encapsular información sensible   | Evita acceso directo y protege los datos.                  |
| Agregar validaciones              | Por ejemplo: no permitir edad negativa.                    |
| Permitir solo lectura o escritura | Puedes tener solo `get` o solo `set` según el caso.        |
| Facilitar mantenimiento           | Si cambias la lógica interna, no afecta el código externo. |

---

## 🧠 Constructor: ¿Qué es y para qué sirve?

- Se llama automáticamente cuando usamos `new` para crear un objeto.
- Permite inicializar los valores de los atributos desde el principio.
- Puede haber más de uno (constructores sobrecargados).

### 📌 Cuándo usar constructores

- Cuando quieres asegurar que un objeto **siempre** tenga valores válidos desde el inicio.
- Cuando el objeto necesita preparación especial (por ejemplo: calcular un ID, abrir una conexión, etc).

---

## 🧠 Método `toString()`: ¿Para qué sirve?

- Permite representar el objeto como texto.
- Se ejecuta automáticamente si usamos `System.out.println(objeto)`.

### 📌 Cuándo sobrescribir `toString()`

- Siempre que quieras ver los datos internos del objeto de forma legible.
- Útil para debug, logs, o visualización en interfaces.

| Instrucción                    | Equivalente interno                       | Resultado                            |
| ------------------------------ | ----------------------------------------- | ------------------------------------ |
| `System.out.println(alumno1);` | `System.out.println(alumno1.toString());` | Llama automáticamente a `toString()` |
| `toString()` no sobrescrito    | `Alumno@123abc`                           | Poco útil                            |
| `toString()` sobrescrito       | `Alumno{nombre='Lucía', edad=20}`         | Legible y útil para debugging        |

---

Hasta aquí hemos trabajado con clases, atributos, métodos, constructores, encapsulamiento y cómo generar `getters`, `setters` y `toString()` automáticamente. Ahora vamos a dar el siguiente gran paso: aplicar los **pilares avanzados de la POO**.

## 🧱 Pilares avanzados de la POO

A continuación damos el siguiente gran paso: aplicar los **pilares avanzados de la Programación Orientada a Objetos**.

Los pilares que veremos ahora son:

1. 🧬 **Herencia**
2. 🎭 **Polimorfismo**
3. 🧠 **Abstracción**

---

# 🧬 HERENCIA: Reutilizando código entre clases

La herencia es un principio clave que permite crear una nueva clase a partir de una existente. La clase original se llama **superclase** o **clase padre**, y la nueva se llama **subclase** o **clase hija**.

La subclase hereda los atributos y métodos de la superclase, pero puede agregar o sobrescribir comportamientos propios. Nos ayuda a **reutilizar código** y a representar jerarquías del mundo real.

### 🏗️ Ejemplo visual: Vehículo, Taxi y Autobús

**Superclase:** `Vehiculo`
**Subclases:** `Taxi` y `Autobus`

```java
// Superclase Vehiculo
public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected int potenciaCV;

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }
}
```

```java
// Subclase Taxi
public class Taxi extends Vehiculo {
    private String numeroLicencia;

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }
}
```

```java
// Subclase Autobus
public class Autobus extends Vehiculo {
    private int numeroPlazas;

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }
}
```

---

## 🧠 Sintaxis y buenas prácticas en herencia

### 🔑 Palabra clave `extends`

En Java, `extends` se utiliza para establecer la relación de herencia entre una subclase (clase hija) y una superclase (clase padre).

```java
class Subclase extends Superclase {
    // Cuerpo de la subclase
}
```

### 🧱 Superclase

La superclase es la clase principal de la cual se deriva otra clase. También se conoce como clase base o **clase padre**. Contiene **atributos y métodos comunes** que pueden ser heredados por las subclases.

### 📄 Clase base: `Animal`

```java
// Superclase o clase padre/base
public class Animal {
    protected String nombre; // Usamos 'protected' para que las subclases puedan acceder

    // Método visible desde fuera de la clase
    public void dormir() {
        System.out.println(nombre + " está durmiendo...");
    }

    // Método sin modificador (package-private)
    void comer() {
        System.out.println("El animal come");
    }
}
```

### 🧩 Subclase

La subclase es la clase que se deriva de otra clase (superclase). También se conoce como clase derivada o **clase hija**. Puede tener sus propios atributos y métodos.

### 🐶 Clase derivada: `Perro`

```java
// Subclase o clase derivada
public class Perro extends Animal {
    // Método propio del Perro
    public void ladrar() {
        System.out.println(nombre + " dice ¡Guau!");
    }

    // Sobrescritura opcional (si existiera en la superclase)
    void comer() {
        System.out.println("El perro come croquetas");
    }
}
```

---

### 🧪 Uso en `Main`

```java
public class Main {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.nombre = "Rocky";     // Acceso permitido por ser 'protected'
        p.dormir();              // Heredado de Animal
        p.ladrar();              // Propio de Perro
        p.comer();               // Método sobrescrito (override)
    }
}
```

> 🧠 Usamos `protected` para que el atributo `nombre` pueda ser heredado.

---

## 🧠 TIPS útiles para herencia

- ✅ Usa `protected` para atributos/métodos que quieras compartir entre superclase y subclases.
- ❌ No uses `private` si necesitas acceder desde las subclases.
- ✅ Métodos `public` pueden ser heredados y llamados desde cualquier parte.
- ⚠️ Métodos `void` se usan cuando **no se necesita retornar ningún valor**, solo ejecutar una acción.
- ✅ Métodos con `return` deben declarar su tipo (por ejemplo `int`, `String`, etc).

> 💡 Reglas prácticas:
>
> - Usa `void` si solo quieres que el método haga algo (ej: imprimir, guardar, mover).
> - Usa `return` cuando el método deba devolver un resultado.
> - Usa `protected` cuando un atributo o método deba ser heredado pero no expuesto públicamente.

### 🧪 Ejercicio práctico de herencia aplicado al contexto académico

Este ejercicio simula un sistema académico con estudiantes de distintos niveles y tipos de curso. Usaremos herencia para representar las variaciones.

> 📦 Ubicación sugerida: Puedes ubicar esto en el paquete `semana6.RefugioAnimal` para mantener tu código organizado.

---

#### 🧱 Clase base: Estudiante

```java
public class Estudiante {
    protected String nombre;
    protected int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void estudiar() {
        System.out.println("El estudiante está estudiando.");
    }

    public String getNombre() {
        return nombre;
    }
}
```

#### 🧩 Subclases: EstudianteSecundaria y EstudianteUniversitario

```java
public class EstudianteSecundaria extends Estudiante {
    private String especialidad;

    public EstudianteSecundaria(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void estudiar() {
        System.out.println(nombre + " estudia materias generales en secundaria.");
    }
}
```

```java
public class EstudianteUniversitario extends Estudiante {
    private String carrera;
    private int creditosAprobados;

    public EstudianteUniversitario(String nombre, int edad, String carrera, int creditosAprobados) {
        super(nombre, edad);
        this.carrera = carrera;
        this.creditosAprobados = creditosAprobados;
    }

    @Override
    public void estudiar() {
        System.out.println(nombre + " estudia la carrera de " + carrera + ".");
    }
}
```

Si no deseas agregar mas clases de ejemplo baja diracto al Main

---

#### 📘 Clase base: Curso

```java
public class Curso {
    protected String nombreCurso;
    protected String profesor;

    public Curso(String nombreCurso, String profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombreCurso + " | Profesor: " + profesor);
    }
}
```

#### 🧩 Subclases: CursoBachillerato y CursoPosgrado

```java
public class CursoBachillerato extends Curso {
    private String especialidad;

    public CursoBachillerato(String nombreCurso, String profesor, String especialidad) {
        super(nombreCurso, profesor);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[Bachillerato] " + nombreCurso + " | Prof: " + profesor + " | Especialidad: " + especialidad);
    }
}
```

```java
public class CursoPosgrado extends Curso {
    private int nivel;

    public CursoPosgrado(String nombreCurso, String profesor, int nivel) {
        super(nombreCurso, profesor);
        this.nivel = nivel;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[Posgrado] " + nombreCurso + " | Prof: " + profesor + " | Nivel: " + nivel);
    }
}
```

---

### 🧪 Clase `Main` con pruebas del sistema

```java
public class Main {
    public static void main(String[] args) {

        // Estudiantes
        EstudianteSecundaria est1 = new EstudianteSecundaria("Ana", 16, "Científica");
        EstudianteUniversitario est2 = new EstudianteUniversitario("Luis", 21, "Ingeniería", 150);

        est1.estudiar();
        est2.estudiar();

        // Cursos
        CursoBachillerato curso1 = new CursoBachillerato("Biología", "Dra. Martínez", "Ciencias Naturales");
        CursoPosgrado curso2 = new CursoPosgrado("Gestión de Proyectos", "Dr. Pérez", 2);

        curso1.mostrarInfo();
        curso2.mostrarInfo();
    }
}
```

✅ Este ejercicio refuerza los pilares de herencia, encapsulamiento y sobrescritura (`@Override`), además de ilustrar cómo organizar el código en clases reutilizables para escenarios reales como un sistema académico.

---

### 🧠 ¿Qué hace `@Override`?

La anotación `@Override` se utiliza cuando **queremos sobrescribir un método que viene de la clase padre**.

- Es una forma clara de indicar que el método redefine un comportamiento heredado.
- Si el método padre no existe o está mal escrito, el compilador mostrará un error.

#### Ejemplo:

```java
public class Animal {
    public void hablar() {
        System.out.println("El animal hace un sonido");
    }
}

public class Gato extends Animal {
    @Override
    public void hablar() {
        System.out.println("El gato dice miau");
    }
}
```

💡 **Tips prácticos:**

- Solo puedes sobrescribir métodos que no sean `private` ni `static`.
- El método sobrescrito debe tener **el mismo nombre, parámetros y tipo de retorno**.
- Siempre usa `@Override` para ayudar al compilador a detectar errores.

---


# 🎭 POLIMORFISMO: Una interfaz, muchas formas

El polimorfismo permite que una misma interfaz (método o clase) se comporte de distintas maneras según el tipo de objeto que la implemente. En Java, esto se logra de dos formas:

1. **Sobrecarga de métodos** (`Overloading`) → mismos nombres, diferentes parámetros.
2. **Sobrescritura de métodos** (`Overriding`) → redefinir un método heredado.

### 🧠 ¿Para qué sirve el polimorfismo?

* Reduce duplicación de código.
* Hace el sistema extensible.
* Permite tratar objetos distintos de forma uniforme.


### ✍️ Sobrescritura (override)

```java
class Animal {
    public void hablar() {
        System.out.println("El animal hace un sonido");
    }
}

class Gato extends Animal {
    @Override
    public void hablar() {
        System.out.println("El gato dice miau");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Animal a = new Gato(); // Polimorfismo
        a.hablar(); // Llama a Gato.hablar()
    }
}
```

### ➕ Sobrecarga (overload)

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(2, 3));       // 5
        System.out.println(calc.sumar(2.5, 3.1));   // 5.6
    }
}
```

---



# 🧠 ABSTRACCIÓN: Esconder lo innecesario, mostrar lo importante

La **abstracción** consiste en **representar solo los aspectos esenciales** de un objeto, ignorando los detalles irrelevantes para el propósito actual del programa. En Java, esto se logra principalmente con clases y métodos abstractos.

Una **clase abstracta** no se puede instanciar directamente y actúa como una **plantilla común** para otras clases que sí serán concretas. Puede contener:

* Métodos abstractos (sin implementación, obligan a implementarlos en subclases).
* Métodos concretos (con implementación).

---

### 📊 Ejemplo visual: Vehículo, Auto, Camión, Bicicleta

```java
// Clase abstracta Vehiculo
public abstract class Vehiculo {
    // Método concreto (tiene implementación común)
    public void arrancar() {
        System.out.println("El vehículo ha arrancado.");
    }

    // Método abstracto (obligatorio en las subclases)
    public abstract void conducir();
}
```

---

### 🚗 Subclases concretas

```java
// Subclase Auto
public class Auto extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El auto está en movimiento.");
    }
}
```

```java
// Subclase Camion
public class Camion extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }
}
```

```java
// Subclase Bicicleta
public class Bicicleta extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("La bicicleta está en movimiento.");
    }
}
```

---

### 🧪 Uso en clase `Main`

```java
public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto();
        Vehiculo camion = new Camion();
        Vehiculo bici = new Bicicleta();

        auto.arrancar();
        auto.conducir();

        camion.arrancar();
        camion.conducir();

        bici.arrancar();
        bici.conducir();
    }
}
```
Otro Ejemplo 

### 🛑 Clase abstracta: `Figura`

```java
public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarTipo() {
        System.out.println("Soy una figura geométrica.");
    }
}
```

### ⭕ Subclase concreta: `Circulo`

```java
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

### 🧪 Uso en `Main`

```java
public class Main {
    public static void main(String[] args) {
        Figura f = new Circulo(5);
        f.mostrarTipo();
        System.out.println("Área: " + f.calcularArea());
    }
}
```

> 📌 No puedes instanciar `Figura`, solo sus subclases. El método `calcularArea()` debe ser implementado.


---

## 🧠 ¿Por qué usar abstracción?

* 🔐 Obliga a las subclases a implementar métodos importantes.
* 📦 Centraliza lógica común en un solo lugar (la clase abstracta).
* 🧱 Mejora la arquitectura del sistema (principio de diseño SOLID: Liskov y Segregación).

---

### 💡 Tips importantes:

* Solo puedes usar `abstract` en clases y métodos.
* Si una clase tiene **al menos un método abstracto**, entonces **la clase también debe ser abstracta**.
* No puedes crear instancias de una clase abstracta (`new Vehiculo()` ❌).
* Las subclases deben **obligatoriamente** implementar todos los métodos abstractos de la clase padre, a menos que también sean abstractas.
* Puedes combinar métodos concretos y abstractos en la misma clase abstracta.




# 🎯 Interfaces en Java: una extensión del principio de Abstracción

## 📚 ¿Qué es una interfaz?

Una **interfaz** en Java es una colección de métodos **abstractos por definición**. Define **qué se debe hacer**, pero no cómo.

Se considera una forma pura de **abstracción** y permite a diferentes clases **compartir una misma forma de comportamiento** sin heredar implementación.

---

## 🤔 ¿Es parte de la POO?

✅ ¡Sí! Las interfaces **forman parte esencial de la programación orientada a objetos** y están directamente relacionadas con el principio de **abstracción**.

| Comparación        | Clase abstracta       | Interface                          |
| ------------------ | --------------------- | ---------------------------------- |
| Métodos sin cuerpo | ✅ Sí                  | ✅ Sí                               |
| Métodos con cuerpo | ✅ Sí                  | ✅ Desde Java 8 (`default`)         |
| Herencia múltiple  | ❌ No                  | ✅ Sí (puedes implementar varias)   |
| Palabra clave      | `extends`             | `implements`                       |
| Uso común          | Compartir lógica base | Definir contrato de comportamiento |

---

## 🧱 Ejemplo práctico de interfaces

### Paso 1: Definir las interfaces

```java
// Interfaz Conducible
public interface Conducible {
    void conducir();
}

// Interfaz Arrancable
public interface Arrancable {
    void arrancar();
}
```

---

### Paso 2: Clase abstracta que las implementa

```java
public abstract class Vehiculo implements Conducible, Arrancable {
    @Override
    public void arrancar() {
        System.out.println("El vehículo ha arrancado.");
    }
}
```

---

### Paso 3: Subclases concretas

```java
public class Auto extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El auto está en movimiento.");
    }
}

public class Camion extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }
}

public class Bicicleta extends Vehiculo {
    @Override
    public void conducir() {
        System.out.println("La bicicleta está en movimiento.");
    }
}
```

---

### 🧪 Clase `Main`

```java
public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto();
        auto.arrancar();
        auto.conducir();
    }
}
```
---
## 💡 Reglas, buenas prácticas y tips sobre interfaces

✅ **Cuándo usar interfaces:**

* Cuando varias clases no relacionadas deben compartir un comportamiento común.
* Cuando quieres permitir herencia múltiple de comportamiento (Java no permite herencia múltiple con clases, pero sí con interfaces).
* Cuando estás diseñando una API pública y quieres separar contrato de implementación.

⚠️ **Tips clave:**

* No puedes tener atributos con lógica en una interfaz (solo constantes `public static final`).
* A partir de Java 8 puedes usar `default` y `static` para incluir lógica en una interfaz.
* Una clase puede implementar múltiples interfaces, pero solo extender una clase.
* Prefiere interfaces cuando el comportamiento puede variar según la clase.



---

## 🎯 Mini ejercicio dinámico con Scanner e interfaces

```java
import java.util.Scanner;

interface Volable {
    void volar();
}

class Avion implements Volable {
    public void volar() {
        System.out.println("El avión está despegando a gran velocidad.");
    }
}

class Helicoptero implements Volable {
    public void volar() {
        System.out.println("El helicóptero está flotando en el aire.");
    }
}

public class MainVolador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué deseas volar? (avion/helicoptero): ");
        String opcion = sc.nextLine();

        Volable maquina;

        if (opcion.equalsIgnoreCase("avion")) {
            maquina = new Avion();
        } else {
            maquina = new Helicoptero();
        }

        maquina.volar();
        sc.close();
    }
}
```

✅ Con este ejercicio vemos polimorfismo aplicado a interfaces, selección de comportamiento en tiempo de ejecución y reutilización de código. ¡Ideal para entender cómo usar interfaces en la vida real!

---


## 🧠 Glosario unificado: Herencia, Polimorfismo y Abstracción


| Concepto          | Significado                                                                  |
| ----------------- | ---------------------------------------------------------------------------- |
| `extends`         | Permite heredar de otra clase                                                |
| `super`           | Llama al constructor o métodos de la clase padre                             |
| `abstract class`  | Clase que no puede instanciarse directamente                                 |
| `abstract method` | Método sin cuerpo que debe ser implementado en subclases                     |
| `@Override`       | Indica que se está sobrescribiendo un método heredado                        |
| `polimorfismo`    | Permite usar una clase base para representar múltiples formas                |
| `sobrecarga`      | Mismo método, diferentes parámetros                                          |
| `sobrescritura`   | Mismo método, redefinido en una subclase                                     |
| Clase concreta    | Clase normal que puede ser instanciada y debe implementar métodos abstractos |
| Plantilla base    | Papel que cumple la clase abstracta al definir una interfaz común            |



### 📘 Preguntas frecuentes (FAQ) por pilar de la POO

#### 🧬 Herencia

* **¿Puedo heredar múltiples clases en Java?**
  ❌ No. Java no permite herencia múltiple con clases (sí con interfaces).

* **¿Qué modificadores debo usar para que los atributos/métodos se hereden?**
  ✅ Usa `protected` para que puedan ser accedidos desde subclases.
  ❌ `private` no puede ser heredado directamente.

* **¿Puedo sobreescribir un método heredado?**
  ✅ Sí, si no es `private` ni `final`. Usa `@Override` para mayor claridad.

* **¿Para qué sirve `super`?**
  Permite llamar al constructor o métodos de la clase padre.

---

#### 🎭 Polimorfismo

* **¿Qué es polimorfismo en una frase?**
  👉 Es cuando una **misma referencia** puede tomar diferentes comportamientos según la clase que instancia.

* **¿Cuál es la diferencia entre sobreescritura y sobrecarga?**
  🔁 **Sobreescritura:** redefinir un método en la subclase (`@Override`).
  ➕ **Sobrecarga:** mismo nombre de método, pero con diferentes parámetros.

* **¿Siempre debo usar `@Override`?**
  ✅ Sí, es buena práctica. Ayuda al compilador a detectar errores si el método padre no existe.

* **¿Puedo usar polimorfismo con clases abstractas?**
  ✅ Sí, es muy común. Se define una clase abstracta y se usa su referencia para instanciar subclases.

---

#### ✨ Abstracción

* **¿Puedo tener métodos normales en una clase abstracta?**
  ✅ Sí. Puedes tener métodos con implementación (concretos) junto a métodos abstractos.

* **¿Todos los métodos abstractos deben ser `public`?**
  ❌ No obligatoriamente, pero:

  * ✅ Se recomienda `public` para que las subclases puedan sobrescribirlo.
  * ❌ No pueden ser `private`, porque no serían accesibles desde subclases.
  * ⚠️ Se puede usar `protected` si solo deben sobrescribirse dentro del mismo paquete jerárquico.

* **¿Puedo instanciar una clase abstracta?**
  ❌ No. Debes usar una subclase concreta.

* **¿Para qué usar abstracción si puedo usar herencia?**
  💡 Porque la abstracción **obliga a implementar comportamientos claves** y mejora la arquitectura.



✅ Esto cierra el recorrido por los **tres pilares avanzados de la POO**: Herencia, Polimorfismo y Abstracción.