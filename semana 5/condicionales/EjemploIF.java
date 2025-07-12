package semana5.condicionales;

public class EjemploIF {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: IF Simple (Mayoría de edad) ===");
        ejemploIfSimple();

        System.out.println("\n=== Ejemplo 2: IF con Múltiples Condiciones (Aprobación) ===");
        ejemploIfComplejo();

        System.out.println("\n=== Ejemplo 3: IF sin Llaves (Una instrucción) ===");
        ejemploIfSinLlaves();
    }

    // Ejemplo 1: IF simple (sin else)
    public static void ejemploIfSimple() {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }

    // Ejemplo 2: IF con condiciones compuestas
    public static void ejemploIfComplejo() {
        int nota = 85;
        boolean asistencia = true;

        if (nota >= 70 && asistencia) {
            System.out.println("¡Aprobaste el curso!");
        }
    }

    // Ejemplo 3: IF sin llaves (solo una instrucción)
    public static void ejemploIfSinLlaves() {
        boolean esVerdadero = true;

        if (esVerdadero)
            System.out.println("La condición es verdadera");
    }
}
