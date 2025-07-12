# 🚀 Funciones (Métodos) en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-17+-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📚 Índice de Contenidos

- [🔍 Introducción](#-introducción)
- [🏗️ Anatomía de un Método](#️-anatomía-de-un-método)
- [📋 Tipos de Métodos](#-tipos-de-métodos)
- [📦 Parámetros y Argumentos](#-parámetros-y-argumentos)
- [🔄 Valor de Retorno](#-valor-de-retorno)
- [🎯 Sobrecarga de Métodos](#-sobrecarga-de-métodos)
- [🔐 Modificadores de Acceso](#-modificadores-de-acceso)
- [💡 Buenas Prácticas](#-buenas-prácticas)
- [🚫 Errores Comunes](#-errores-comunes)

---

## 🔍 Introducción

Los **métodos** (también llamados funciones) en Java son bloques de código reutilizables que realizan tareas específicas. Son fundamentales para escribir código modular, mantenible y eficiente.

### ¿Por qué usar métodos?
- ✅ **Reutilización**: Evita duplicar código
- ✅ **Modularidad**: Divide problemas complejos en partes pequeñas
- ✅ **Mantenimiento**: Facilita actualizaciones y correcciones
- ✅ **Legibilidad**: Hace el código más fácil de entender
- ✅ **Testing**: Permite probar funciones individualmente

---

## 🏗️ Anatomía de un Método

### 📖 Estructura Básica

```java
[modificadorAcceso] [modificadorEstatico] tipoRetorno nombreMetodo(parametros) {
    // Cuerpo del método
    return valor; // Si no es void
}
```

### 📋 Componentes Principales

| Componente | Descripción | Ejemplo |
|------------|-------------|---------|
| **Modificador de Acceso** | Define quién puede acceder | `public`, `private`, `protected` |
| **Modificador Estático** | `static` para métodos de clase | `static` (opcional) |
| **Tipo de Retorno** | Qué tipo de dato devuelve | `int`, `String`, `void` |
| **Nombre del Método** | Identificador único | `calcularSuma`, `obtenerNombre` |
| **Parámetros** | Datos de entrada | `(int a, int b)` |
| **Cuerpo** | Lógica del método | Código entre `{}` |

### 💡 Ejemplo Completo

```java
public static int calcularSuma(int numero1, int numero2) {
    int resultado = numero1 + numero2;
    return resultado;
}
```

---

## 📋 Tipos de Métodos

### 1. **Métodos Static vs Instance**

#### 🔧 Métodos Estáticos (Static)
```java
public class Calculadora {
    // Método estático - pertenece a la clase
    public static int sumar(int a, int b) {
        return a + b;
    }
}

// Uso: No necesita instancia
int resultado = Calculadora.sumar(5, 3);
```

#### 🏠 Métodos de Instancia
```java
public class Persona {
    private String nombre;
    
    // Método de instancia - necesita objeto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

// Uso: Necesita crear objeto
Persona persona = new Persona();
persona.setNombre("Juan");
```

### 2. **Métodos con/sin Retorno**

#### 🔄 Con Retorno
```java
public int multiplicar(int a, int b) {
    return a * b;  // DEBE retornar un valor
}
```

#### ⚡ Sin Retorno (void)
```java
public void mostrarMensaje(String mensaje) {
    System.out.println(mensaje);  // No retorna nada
}
```

### 📊 Comparación de Tipos

| Tipo | Cuándo Usar | Ejemplo de Uso |
|------|-------------|----------------|
| **Static** | Utilidades, sin estado | `Math.abs()`, validaciones |
| **Instance** | Operaciones con estado del objeto | `persona.getNombre()` |
| **Con Retorno** | Cálculos, transformaciones | `calcular()`, `convertir()` |
| **Void** | Acciones, efectos secundarios | `imprimir()`, `guardar()` |

---

## 📦 Parámetros y Argumentos

### 📖 Conceptos Clave

- **Parámetro**: Variable en la definición del método
- **Argumento**: Valor real pasado al método

```java
// 'nombre' y 'edad' son PARÁMETROS
public void crearUsuario(String nombre, int edad) {
    // código
}

// "Juan" y 25 son ARGUMENTOS
crearUsuario("Juan", 25);
```

### 🎯 Tipos de Parámetros

#### 1. **Parámetros por Valor**
```java
public void modificarNumero(int numero) {
    numero = 100; // No afecta la variable original
}

int x = 5;
modificarNumero(x);
System.out.println(x); // Sigue siendo 5
```

#### 2. **Parámetros por Referencia (Objetos)**
```java
public void modificarLista(List<String> lista) {
    lista.add("Nuevo elemento"); // SÍ afecta la lista original
}

List<String> miLista = new ArrayList<>();
modificarLista(miLista);
System.out.println(miLista.size()); // Será 1
```

#### 3. **Parámetros Variables (Varargs)**
```java
public int sumarTodos(int... numeros) {
    int suma = 0;
    for (int numero : numeros) {
        suma += numero;
    }
    return suma;
}

// Uso flexible
int resultado1 = sumarTodos(1, 2, 3);
int resultado2 = sumarTodos(1, 2, 3, 4, 5);
```

### ⚠️ Reglas Importantes

| Regla | Descripción |
|-------|-------------|
| **Orden** | Los argumentos deben pasarse en el mismo orden |
| **Tipo** | Los tipos deben coincidir o ser compatibles |
| **Cantidad** | Debe coincidir el número (excepto varargs) |
| **Varargs** | Solo puede haber uno y debe ser el último |

---

## 🔄 Valor de Retorno

### 📖 Conceptos Básicos

El valor de retorno es el resultado que un método devuelve al código que lo llamó.

### 🎯 Tipos de Retorno

#### 1. **Tipos Primitivos**
```java
public int obtenerEdad() {
    return 25;
}

public boolean esValido() {
    return true;
}

public double calcularPromedio(int[] numeros) {
    // lógica de cálculo
    return promedio;
}
```

#### 2. **Objetos**
```java
public String obtenerNombreCompleto() {
    return nombre + " " + apellido;
}

public List<String> obtenerListaUsuarios() {
    return new ArrayList<>(usuarios);
}
```

#### 3. **Múltiples Puntos de Retorno**
```java
public String evaluarCalificacion(int nota) {
    if (nota >= 90) {
        return "Excelente";
    } else if (nota >= 70) {
        return "Bueno";
    } else {
        return "Necesita mejorar";
    }
}
```

### ⚠️ Reglas del Return

- **Tipo coincidente**: El valor retornado debe coincidir con el tipo declarado
- **Todos los caminos**: Todos los caminos de ejecución deben tener return (excepto void)
- **Inalcanzable**: No puede haber código después de return

---

## 🎯 Sobrecarga de Métodos

### 📖 Definición

La **sobrecarga** permite tener múltiples métodos con el mismo nombre pero diferentes parámetros.

### 🏗️ Formas de Sobrecargar

#### 1. **Diferente Número de Parámetros**
```java
public int sumar(int a, int b) {
    return a + b;
}

public int sumar(int a, int b, int c) {
    return a + b + c;
}
```

#### 2. **Diferentes Tipos de Parámetros**
```java
public void imprimir(String texto) {
    System.out.println("Texto: " + texto);
}

public void imprimir(int numero) {
    System.out.println("Número: " + numero);
}
```

#### 3. **Diferente Orden de Parámetros**
```java
public void configurar(String nombre, int edad) {
    // implementación
}

public void configurar(int edad, String nombre) {
    // implementación diferente
}
```

### 📋 Reglas de Sobrecarga

| ✅ Permitido | ❌ No Permitido |
|-------------|----------------|
| Diferente número de parámetros | Solo cambiar tipo de retorno |
| Diferentes tipos de parámetros | Solo cambiar nombres de parámetros |
| Diferente orden de parámetros | Solo cambiar modificadores |

### 💡 Ejemplo Práctico: Constructor de StringBuilder

```java
public class MiClase {
    // Sobrecarga útil para flexibilidad
    public String formatear(String texto) {
        return texto.toUpperCase();
    }
    
    public String formatear(String texto, boolean mayusculas) {
        return mayusculas ? texto.toUpperCase() : texto.toLowerCase();
    }
    
    public String formatear(String texto, String prefijo, String sufijo) {
        return prefijo + texto + sufijo;
    }
}
```

---

## 🔐 Modificadores de Acceso

### 📖 Niveles de Acceso

| Modificador | Acceso | Descripción |
|-------------|--------|-------------|
| **public** | 🌍 Todos | Accesible desde cualquier lugar |
| **protected** | 📦 Paquete + Herencia | Accesible en el paquete y subclases |
| **default** (sin modificador) | 📦 Paquete | Solo dentro del mismo paquete |
| **private** | 🏠 Clase | Solo dentro de la misma clase |

### 🎯 Ejemplos Prácticos

```java
public class Usuario {
    private String password;        // Solo esta clase
    protected String email;         // Paquete + herencia
    String nombre;                 // Solo paquete (default)
    public String apellido;        // Acceso universal
    
    // Método público para acceder a campo privado
    public boolean validarPassword(String input) {
        return this.password.equals(input);
    }
    
    // Método privado de utilidad
    private void logAcceso() {
        // Solo usado internamente
    }
}
```

### 💡 Principio de Encapsulación

```java
public class CuentaBancaria {
    private double saldo;  // Campo privado
    
    // Método público controlado
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo && cantidad > 0) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
    
    // Getter público
    public double getSaldo() {
        return saldo;
    }
}
```

---

## 💡 Buenas Prácticas

### 🎯 Nomenclatura

#### ✅ Nombres Descriptivos
```java
// ❌ Evitar
public int calc(int x, int y) { }

// ✅ Preferir
public int calcularAreaRectangulo(int ancho, int alto) { }
```

#### ✅ Convención camelCase
```java
// ✅ Correcto
public void enviarEmailConfirmacion() { }
public boolean esUsuarioValido() { }
public String obtenerNombreCompleto() { }
```

### 🔧 Diseño de Métodos

#### 1. **Principio de Responsabilidad Única**
```java
// ❌ Hace demasiado
public void procesarUsuario(String nombre, String email) {
    // validar datos
    // guardar en base de datos
    // enviar email
    // actualizar log
}

// ✅ Separar responsabilidades
public boolean validarDatos(String nombre, String email) { }
public void guardarUsuario(Usuario usuario) { }
public void enviarEmailBienvenida(String email) { }
```

#### 2. **Métodos Pequeños y Enfocados**
```java
// ✅ Método simple y claro
public boolean esMayorDeEdad(int edad) {
    return edad >= 18;
}

// ✅ Método que hace una cosa bien
public double calcularDescuento(double precio, double porcentaje) {
    return precio * (porcentaje / 100);
}
```

#### 3. **Evitar Efectos Secundarios**
```java
// ❌ Efecto secundario oculto
public int calcularTotal(List<Producto> productos) {
    int total = 0;
    for (Producto p : productos) {
        total += p.getPrecio();
        p.setVisitado(true);  // ❌ Efecto secundario
    }
    return total;
}

// ✅ Sin efectos secundarios
public int calcularTotal(List<Producto> productos) {
    return productos.stream()
                   .mapToInt(Producto::getPrecio)
                   .sum();
}
```

### 📝 Documentación

```java
/**
 * Calcula el área de un círculo dado su radio.
 * 
 * @param radio el radio del círculo (debe ser positivo)
 * @return el área del círculo
 * @throws IllegalArgumentException si el radio es negativo
 */
public double calcularAreaCirculo(double radio) {
    if (radio < 0) {
        throw new IllegalArgumentException("El radio no puede ser negativo");
    }
    return Math.PI * radio * radio;
}
```

---

## 🚫 Errores Comunes

### 1. **Métodos Demasiado Largos**
```java
// ❌ Método muy largo (>20-30 líneas)
public void procesarPedido() {
    // 50+ líneas de código
    // Difícil de entender y mantener
}

// ✅ Dividir en métodos más pequeños
public void procesarPedido() {
    validarPedido();
    calcularTotal();
    aplicarDescuentos();
    procesarPago();
    enviarConfirmacion();
}
```

### 2. **Demasiados Parámetros**
```java
// ❌ Demasiados parámetros
public void crearUsuario(String nombre, String apellido, String email, 
                        String telefono, String direccion, int edad, 
                        boolean activo, String departamento) { }

// ✅ Usar objetos para agrupar parámetros
public void crearUsuario(DatosPersonales datos, ConfiguracionUsuario config) { }
```

### 3. **Modificar Parámetros de Entrada**
```java
// ❌ Modificar lista de entrada
public List<String> procesarNombres(List<String> nombres) {
    nombres.sort(String::compareTo);  // ❌ Modifica la original
    return nombres;
}

// ✅ No modificar entrada
public List<String> procesarNombres(List<String> nombres) {
    List<String> copia = new ArrayList<>(nombres);
    copia.sort(String::compareTo);
    return copia;
}
```

### 4. **No Validar Parámetros**
```java
// ❌ Sin validación
public double dividir(double a, double b) {
    return a / b;  // ❌ ¿Qué pasa si b es 0?
}

// ✅ Con validación
public double dividir(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException("No se puede dividir por cero");
    }
    return a / b;
}
```

### 5. **Métodos Static Innecesarios**
```java
// ❌ Static innecesario
public class Calculadora {
    private double ultimoResultado;
    
    public static double sumar(double a, double b) {  // ❌ Debería ser instance
        return a + b;
    }
}

// ✅ Instance method cuando se necesita estado
public class Calculadora {
    private double ultimoResultado;
    
    public double sumar(double a, double b) {
        ultimoResultado = a + b;
        return ultimoResultado;
    }
}
```

---

## 🎓 Resumen para Bootcamp

### 📋 Checklist Esencial

**Al crear un método, pregúntate:**

- [ ] ¿El nombre es descriptivo y sigue camelCase?
- [ ] ¿Hace solo una cosa (responsabilidad única)?
- [ ] ¿Tiene menos de 20-30 líneas?
- [ ] ¿Los parámetros están validados?
- [ ] ¿El tipo de retorno es correcto?
- [ ] ¿El nivel de acceso es apropiado?
- [ ] ¿Está documentado si es complejo?

### 🎯 Reglas de Oro

1. **Un método = Una responsabilidad**
2. **Nombres descriptivos > Comentarios**
3. **Pequeño y enfocado > Grande y complejo**
4. **Validar entradas siempre**
5. **Preferir inmutabilidad**

### 🚀 Siguiente Nivel

Una vez domines los métodos básicos, explora:
- **Recursividad**: Métodos que se llaman a sí mismos
- **Programación Funcional**: Lambdas y Streams
- **Métodos Genéricos**: `<T>` para mayor flexibilidad
- **Patrones de Diseño**: Strategy, Factory, etc.

---

## 📚 Recursos Adicionales

- [Oracle Java Documentation - Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Clean Code by Robert Martin](https://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350884)
- [Effective Java by Joshua Bloch](https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997)

---

> **💡 Recuerda**: Los métodos son los bloques de construcción de tu aplicación. Invertir tiempo en escribirlos bien desde el principio te ahorrará horas de debugging y refactoring más adelante.