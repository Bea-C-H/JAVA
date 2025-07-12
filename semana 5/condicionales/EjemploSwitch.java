package semana5.condicionales;

public class EjemploSwitch {

    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: Switch Básico (Días semana) ===");
        switchBasico();

        System.out.println("\n=== Ejemplo 2: Switch con Strings (Meses) ===");
        switchConString();

        System.out.println("\n=== Ejemplo 3: Switch Fall-Through (Calificaciones) ===");
        switchFallThrough();

        System.out.println("\n=== Ejemplo 4: Switch Expresión (Java 14+) ===");
        switchExpresion();
    }

    // Ejemplo 1: Switch básico con días de la semana
    public static void switchBasico() {
        int dia = 3;
        String nombreDia;

        switch (dia) {
            case 1: nombreDia = "Lunes"; break;
            case 2: nombreDia = "Martes"; break;
            case 3: nombreDia = "Miércoles"; break;
            case 4: nombreDia = "Jueves"; break;
            case 5: nombreDia = "Viernes"; break;
            case 6: nombreDia = "Sábado"; break;
            case 7: nombreDia = "Domingo"; break;
            default: nombreDia = "Día inválido"; break;
        }

        System.out.println("Hoy es: " + nombreDia);
    }

    // Ejemplo 2: Switch con Strings (meses del año)
    public static void switchConString() {
        String mes = "enero";
        int diasDelMes;

        switch (mes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                diasDelMes = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                diasDelMes = 30;
                break;
            case "febrero":
                diasDelMes = 28; // Sin considerar años bisiestos
                break;
            default:
                diasDelMes = 0;
                System.out.println("Mes inválido");
                break;
        }

        if (diasDelMes > 0) {
            System.out.println(mes + " tiene " + diasDelMes + " días");
        }
    }

    // Ejemplo 3: Switch con fall-through intencional
    public static void switchFallThrough() {
        char calificacion = 'B';

        switch (calificacion) {
            case 'A':
            case 'B':
                System.out.println("Excelente trabajo!");
                break;
            case 'C':
                System.out.println("Buen trabajo");
                break;
            case 'D':
                System.out.println("Necesitas estudiar más");
                break;
            case 'F':
                System.out.println("Reprobaste");
                break;
            default:
                System.out.println("Calificación inválida");
        }
    }

    // Ejemplo 4: Switch como expresión (Java 14+)
    public static void switchExpresion() {
        int dia = 5;

        // Switch expresión con flecha
        String tipoDia = switch (dia) {
            case 1, 2, 3, 4, 5 -> "Día laboral";
            case 6, 7 -> "Fin de semana";
            default -> "Día inválido";
        };
        System.out.println("Forma simple: " + tipoDia);

        // Switch con bloque y yield
        String mensaje = switch (dia) {
            case 1, 2, 3, 4, 5 -> {
                System.out.print("Es día de semana: ");
                yield "¡A trabajar!";
            }
            case 6, 7 -> {
                System.out.print("Es fin de semana: ");
                yield "¡A descansar!";
            }
            default -> "Día no válido";
        };
        System.out.println(mensaje);
    }
}