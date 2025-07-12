package semana5.condicionales;

public class EjemploOperadorTernario {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: Asignación Básica ===");
        ejemploBasico();

        System.out.println("\n=== Ejemplo 2: Ternario Múltiple (Calificaciones) ===");
        ejemploMultiple();

        System.out.println("\n=== Ejemplo 3: Uso en Métodos ===");
        ejemploEnMetodos();

        System.out.println("\n=== Ejemplo 4: Manejo de Objetos y Null ===");
        ejemploConObjetos();
    }

    // Ejemplo 1: Asignación básica
    public static void ejemploBasico() {
        int edad = 17;

        // Versión con operador ternario
        String estadoTernario = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("[Ternario] " + estadoTernario);

        // Versión equivalente con if-else (para comparación)
        String estadoIf;
        if (edad >= 18) {
            estadoIf = "Mayor de edad";
        } else {
            estadoIf = "Menor de edad";
        }
        System.out.println("[If-Else] " + estadoIf);
    }

    // Ejemplo 2: Múltiples operadores ternarios (else if equivalente)
    public static void ejemploMultiple() {
        int calificacion = 85;

        String grado = (calificacion >= 90) ? "A" :
                (calificacion >= 80) ? "B" :
                        (calificacion >= 70) ? "C" :
                                (calificacion >= 60) ? "D" : "F";

        System.out.println("Calificación: " + calificacion + " -> Grado: " + grado);
    }

    // Ejemplo 3: Uso en métodos
    public static void ejemploEnMetodos() {
        System.out.println("Máximo entre 15 y 20: " + maximo(15, 20));
        System.out.println("El número 7 es: " + parImpar(7));
    }

    public static int maximo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static String parImpar(int numero) {
        return (numero % 2 == 0) ? "Par" : "Impar";
    }

    // Ejemplo 4: Manejo de objetos y null
    public static void ejemploConObjetos() {
        String nombre = null;

        // Manejo seguro de null
        String saludo = (nombre != null) ? "Hola " + nombre : "Hola invitado";
        System.out.println("Saludo: " + saludo);

        // Validación más compleja
        String nombreCompleto = (nombre != null && !nombre.isEmpty())
                ? nombre
                : "Usuario Anónimo";
        System.out.println("Nombre completo: " + nombreCompleto);
    }
}