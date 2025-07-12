package semana5.condicionales;

public class EjemploELSEIF {
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: IF-ELSE Básico (Temperatura) ===");
        ejemploIfElseBasico();

        System.out.println("\n=== Ejemplo 2: ELSE IF (Calificaciones) ===");
        ejemploElseIfAnidado();

        System.out.println("\n=== Ejemplo 3: Validación con ELSE (Credenciales) ===");
        ejemploValidacion();
    }

    // Ejemplo 1: IF-ELSE básico
    public static void ejemploIfElseBasico() {
        int temperatura = 15;
        if (temperatura > 20) {
            System.out.println("Hace calor");
        } else {
            System.out.println("Hace frío");
        }
    }

    // Ejemplo 2: ELSE IF con múltiples condiciones
    public static void ejemploElseIfAnidado() {
        int calificacion = 85;
        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) {
            System.out.println("Muy bueno");
        } else if (calificacion >= 70) {
            System.out.println("Bueno");
        } else {
            System.out.println("Necesita mejorar");
        }
    }

    // Ejemplo 3: Validación con ELSE
    public static void ejemploValidacion() {
        String usuario = "admin";
        String password = "12345";
        if (usuario.equals("admin") && password.equals("12345")) {
            System.out.println("¡Bienvenido al sistema!");
        } else {
            System.out.println("Credenciales incorrectas");
        }
    }
}