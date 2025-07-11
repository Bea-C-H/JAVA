package semana5.bucles;

import java.util.Scanner;
import java.util.Random;

public class BucleWhile {

    public static void main(String[] args) {
        System.out.println("=== 🔁 EJEMPLOS DE BUCLE WHILE ===\n");

        // Ejecutar todos los ejemplos
        ejemplo1_ValidacionEntrada();
        ejemplo2_AdivinarNumero();
        ejemplo3_CalcularFactorial();
    }


    public static void ejemplo1_ValidacionEntrada() {
        System.out.println("✅ EJEMPLO 1: Validación de Entrada");
        Scanner scanner = new Scanner(System.in);

        int numero = -1;  // Valor inicial inválido

        System.out.println("Ingresa un número entre 1 y 100:");

        while (numero < 1 || numero > 100) {
            System.out.print("Número (1-100): ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();

                if (numero < 1 || numero > 100) {
                    System.out.println("❌ Error: El número debe estar entre 1 y 100");
                }
            } else {
                System.out.println("❌ Error: Debes ingresar un número válido");
                scanner.next(); // Limpiar entrada inválida
            }
        }

        System.out.println("✅ ¡Excelente! Ingresaste: " + numero);
        System.out.println("─".repeat(50) + "\n");
    }


    public static void ejemplo2_AdivinarNumero() {
        System.out.println("🎲 EJEMPLO 2: Juego de Adivinar Número");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(10) + 1;  // Número entre 1 y 10
        int intento;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Adivina el número secreto entre 1 y 10!");

        while (!adivinado) {
            System.out.print("Tu intento: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                adivinado = true;
                System.out.println("🎉 ¡FELICITACIONES! Adivinaste en " + intentos + " intentos");
            } else if (intento < numeroSecreto) {
                System.out.println("📈 El número es mayor. Intenta nuevamente.");
            } else {
                System.out.println("📉 El número es menor. Intenta nuevamente.");
            }
        }

        // Estadísticas del juego
        if (intentos == 1) {
            System.out.println("⭐ ¡Increíble! Lo lograste en el primer intento");
        } else if (intentos <= 3) {
            System.out.println("👏 ¡Muy bien! Eres bueno adivinando");
        } else {
            System.out.println("🤔 No está mal, pero puedes mejorar");
        }

        System.out.println("─".repeat(50) + "\n");
    }


    public static void ejemplo3_CalcularFactorial() {
        System.out.println("🧮 EJEMPLO 3: Calcular Factorial");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("❌ El factorial no está definido para números negativos");
            return;
        }

        // Calcular factorial usando while
        long factorial = 1;
        int contador = numero;

        System.out.print(numero + "! = ");

        // Mostrar el proceso de cálculo
        while (contador > 1) {
            System.out.print(contador + " × ");
            factorial *= contador;
            contador--;
        }

        if (numero > 0) {
            System.out.print("1");
            factorial *= 1;
        } else {
            System.out.print("1");  // 0! = 1
        }

        System.out.println(" = " + factorial);

        // Información adicional
        System.out.println();
        System.out.println("📊 Información del cálculo:");
        System.out.println("   • Número: " + numero);
        System.out.println("   • Factorial: " + factorial);
        System.out.println("   • Dígitos en el resultado: " + String.valueOf(factorial).length());

        // Comparación con otros factoriales
        System.out.println("\n📈 Comparación de factoriales:");
        int n = 1;
        long fact = 1;

        while (n <= Math.min(numero + 2, 12)) {  // Limitar para evitar overflow
            if (n > 1) {
                fact *= n;
            }

            String indicador = (n == numero) ? " ← Tu número" : "";
            System.out.printf("   %2d! = %,15d%s%n", n, fact, indicador);
            n++;
        }

        System.out.println("─".repeat(50) + "\n");
    }


    public static void ejemploCondicionCompleja() {
        System.out.println("🔄 EJEMPLO BONUS: Condición Compleja");

        Random random = new Random();
        int intentos = 0;
        int maxIntentos = 10;
        boolean exito = false;
        double probabilidadExito = 0.3;  // 30% de probabilidad de éxito

        System.out.println("Simulando proceso con múltiples condiciones...");

        while (intentos < maxIntentos && !exito) {
            intentos++;
            exito = random.nextDouble() < probabilidadExito;

            System.out.printf("Intento %d: %s%n",
                    intentos,
                    exito ? "✅ Éxito" : "❌ Fallo"
            );

            if (!exito) {
                // Simular espera entre intentos
                try {
                    Thread.sleep(500);  // 500ms de pausa
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        if (exito) {
            System.out.println("🎉 Proceso completado exitosamente en " + intentos + " intentos");
        } else {
            System.out.println("⏰ Se agotaron los intentos sin éxito");
        }

        System.out.println("─".repeat(50) + "\n");
    }
}