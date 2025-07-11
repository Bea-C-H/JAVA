package semana5.bucles;

import java.util.Scanner;
import java.util.Random;


public class BucleDoWhile {

    public static void main(String[] args) {
        System.out.println("=== 🔄 EJEMPLOS DE BUCLE DO-WHILE ===\n");

        // Ejecutar todos los ejemplos
        ejemplo1_MenuInteractivo();
        ejemplo2_ValidacionRespuesta();
        ejemplo3_JuegoSimple();
    }


    public static void ejemplo1_MenuInteractivo() {
        System.out.println("📋 EJEMPLO 1: Menú Interactivo");
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("\n=== CALCULADORA BÁSICA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción (1-5): ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacion("suma", scanner);
                    break;
                case 2:
                    realizarOperacion("resta", scanner);
                    break;
                case 3:
                    realizarOperacion("multiplicacion", scanner);
                    break;
                case 4:
                    realizarOperacion("division", scanner);
                    break;
                case 5:
                    System.out.println("👋 ¡Gracias por usar la calculadora!");
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intenta nuevamente.");
            }

        } while (opcion != 5);

        System.out.println("─".repeat(50) + "\n");
    }


    private static void realizarOperacion(String operacion, Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        String simbolo = "";

        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                simbolo = "+";
                break;
            case "resta":
                resultado = num1 - num2;
                simbolo = "-";
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                simbolo = "×";
                break;
            case "division":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    simbolo = "÷";
                } else {
                    System.out.println("❌ Error: No se puede dividir por cero");
                    return;
                }
                break;
        }

        System.out.printf("✅ Resultado: %.2f %s %.2f = %.2f%n", num1, simbolo, num2, resultado);
    }

    public static void ejemplo2_ValidacionRespuesta() {
        System.out.println("✅ EJEMPLO 2: Validación de Respuesta");
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        // Pregunta con validación estricta
        do {
            System.out.print("¿Te gusta programar en Java? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase().trim();

            if (!respuesta.equals("sí") && !respuesta.equals("si") &&
                    !respuesta.equals("no") && !respuesta.equals("sí")) {
                System.out.println("❌ Por favor, responde solo 'sí' o 'no'");
            }

        } while (!respuesta.equals("sí") && !respuesta.equals("si") && !respuesta.equals("no"));

        // Respuesta personalizada
        if (respuesta.equals("sí") || respuesta.equals("si")) {
            System.out.println("🎉 ¡Excelente! Java es un lenguaje muy poderoso");

            // Segunda pregunta con validación
            String nivel;
            do {
                System.out.print("¿Cuál es tu nivel? (principiante/intermedio/avanzado): ");
                nivel = scanner.nextLine().toLowerCase().trim();

                if (!nivel.equals("principiante") && !nivel.equals("intermedio") && !nivel.equals("avanzado")) {
                    System.out.println("❌ Opciones válidas: principiante, intermedio, avanzado");
                }

            } while (!nivel.equals("principiante") && !nivel.equals("intermedio") && !nivel.equals("avanzado"));

            // Mensaje personalizado según el nivel
            switch (nivel) {
                case "principiante":
                    System.out.println("🌱 ¡Genial! Todos empezamos por algún lugar. ¡Sigue practicando!");
                    break;
                case "intermedio":
                    System.out.println("🚀 ¡Muy bien! Ya tienes buenas bases. ¡A seguir mejorando!");
                    break;
                case "avanzado":
                    System.out.println("⭐ ¡Impresionante! Seguro puedes ayudar a otros a aprender");
                    break;
            }
        } else {
            System.out.println("🤔 No te preocupes, hay muchos otros lenguajes interesantes");
        }

        System.out.println("─".repeat(50) + "\n");
    }


    public static void ejemplo3_JuegoSimple() {
        System.out.println("🎮 EJEMPLO 3: Juego de Dados");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String jugarDeNuevo;
        int partidasJugadas = 0;
        int partidasGanadas = 0;

        do {
            partidasJugadas++;
            System.out.println("\n🎲 PARTIDA #" + partidasJugadas);
            System.out.println("¡Vamos a jugar a los dados!");
            System.out.println("Necesitas sacar 4, 5 o 6 para ganar");

            System.out.print("Presiona ENTER para lanzar el dado...");
            scanner.nextLine();

            // Simular lanzamiento con animación
            System.out.print("🎲 Lanzando");
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(500);
                    System.out.print(".");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            int dado = random.nextInt(6) + 1;  // Número entre 1 y 6
            System.out.println("\n🎲 ¡Salió un " + dado + "!");

            if (dado >= 4) {
                System.out.println("🎉 ¡GANASTE! Sacaste " + dado);
                partidasGanadas++;
            } else {
                System.out.println("😞 Perdiste... Necesitabas 4 o más");
            }

            // Mostrar estadísticas actuales
            double porcentajeVictorias = (double) partidasGanadas / partidasJugadas * 100;
            System.out.printf("📊 Estadísticas: %d ganadas de %d partidas (%.1f%%)%n",
                    partidasGanadas, partidasJugadas, porcentajeVictorias);

            // Preguntar si quiere jugar de nuevo
            do {
                System.out.print("\n¿Quieres jugar otra partida? (s/n): ");
                jugarDeNuevo = scanner.nextLine().toLowerCase().trim();

                if (!jugarDeNuevo.equals("s") && !jugarDeNuevo.equals("n") &&
                        !jugarDeNuevo.equals("si") && !jugarDeNuevo.equals("no")) {
                    System.out.println("❌ Por favor, responde 's' para sí o 'n' para no");
                }

            } while (!jugarDeNuevo.equals("s") && !jugarDeNuevo.equals("n") &&
                    !jugarDeNuevo.equals("si") && !jugarDeNuevo.equals("no"));

        } while (jugarDeNuevo.equals("s") || jugarDeNuevo.equals("si"));

        // Resumen final del juego
        System.out.println("\n🏁 RESUMEN FINAL DEL JUEGO");
        System.out.println("━".repeat(30));
        System.out.println("Total de partidas jugadas: " + partidasJugadas);
        System.out.println("Partidas ganadas: " + partidasGanadas);
        System.out.println("Partidas perdidas: " + (partidasJugadas - partidasGanadas));

        if (partidasJugadas > 0) {
            double porcentajeFinal = (double) partidasGanadas / partidasJugadas * 100;
            System.out.printf("Porcentaje de victorias: %.1f%%%n", porcentajeFinal);

            if (porcentajeFinal >= 70) {
                System.out.println("🏆 ¡Excelente rendimiento!");
            } else if (porcentajeFinal >= 50) {
                System.out.println("👍 ¡Buen trabajo!");
            } else {
                System.out.println("🍀 ¡La suerte mejorará la próxima vez!");
            }
        }

        System.out.println("👋 ¡Gracias por jugar!");
        System.out.println("─".repeat(50) + "\n");
    }

    public static void ejemploConfirmacionSalida() {
        System.out.println("🔄 EJEMPLO BONUS: Confirmación de Salida");
        Scanner scanner = new Scanner(System.in);
        String confirmacion;

        System.out.println("Simulando cierre de aplicación...");

        do {
            System.out.print("¿Estás seguro de que quieres salir? (s/n): ");
            confirmacion = scanner.nextLine().toLowerCase().trim();

            if (confirmacion.equals("s") || confirmacion.equals("si")) {
                System.out.println("👋 ¡Hasta la vista!");
                break;
            } else if (confirmacion.equals("n") || confirmacion.equals("no")) {
                System.out.println("😊 ¡Perfecto! Continuamos...");
                break;
            } else {
                System.out.println("❌ Respuesta no válida. Usa 's' para sí o 'n' para no");
            }

        } while (true);  // Se rompe con break interno

        System.out.println("─".repeat(50) + "\n");
    }
}