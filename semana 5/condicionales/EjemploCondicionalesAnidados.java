package semana5.condicionales;

public class EjemploCondicionalesAnidados {
    public static void main(String[] args) {
        System.out.println("========== SISTEMA DE VALIDACIÓN ==========");
        validarAcceso();

        System.out.println("\n========== CLASIFICACIÓN ACADÉMICA ==========");
        clasificarEstudiante();

        System.out.println("\n========== SISTEMA DE DESCUENTOS ==========");
        calcularDescuento();
    }

    // Ejemplo 1: Validación de acceso por niveles
    public static void validarAcceso() {
        boolean usuarioValido = true;
        boolean passwordCorrecto = true;
        boolean cuentaActiva = false;

        if (usuarioValido) {
            if (passwordCorrecto) {
                if (cuentaActiva) {
                    System.out.println("¡Acceso concedido!");
                } else {
                    System.out.println("Cuenta inactiva. Contacte al administrador.");
                }
            } else {
                System.out.println("Password incorrecto");
            }
        } else {
            System.out.println("Usuario no válido");
        }
    }

    // Ejemplo 2: Clasificación de estudiantes
    public static void clasificarEstudiante() {
        int edad = 20;
        double promedio = 8.5;
        boolean becado = true;

        if (edad >= 18) {
            System.out.println("Estudiante universitario");

            if (promedio >= 9.0) {
                System.out.println("Estudiante destacado");

                if (becado) {
                    System.out.println("Elegible para beca de excelencia");
                } else {
                    System.out.println("Puede aplicar para beca académica");
                }
            } else if (promedio >= 7.0) {
                System.out.println("Estudiante regular");
            } else {
                System.out.println("Estudiante en riesgo académico");
            }
        } else {
            System.out.println("Estudiante de preparatoria");
        }
    }

    // Ejemplo 3: Sistema de descuentos
    public static void calcularDescuento() {
        boolean esCliente = true;
        int tiempoCliente = 3; // años
        double montoCompra = 1500.0;

        if (esCliente) {
            if (tiempoCliente >= 5) {
                if (montoCompra >= 1000) {
                    System.out.println("Descuento VIP: 20%");
                } else {
                    System.out.println("Descuento cliente antiguo: 15%");
                }
            } else if (tiempoCliente >= 1) {
                if (montoCompra >= 500) {
                    System.out.println("Descuento cliente: 10%");
                } else {
                    System.out.println("Descuento básico: 5%");
                }
            } else {
                System.out.println("Cliente nuevo: Sin descuento");
            }
        } else {
            System.out.println("Regístrese para obtener descuentos");
        }
    }
}