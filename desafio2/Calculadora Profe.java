package clase18_02.desafio2;

import java.util.Scanner;

public class Calculadora {

    // Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir con control de división por cero
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;
        }
        return a / b;
    }

    // Método para obtener el módulo (resto de la división)
    public static double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede calcular el módulo con divisor 0.");
            return Double.NaN;
        }
        return a % b;
    }

    // Método para calcular la potencia
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Método para calcular la raíz cuadrada
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            return Double.NaN;
        }
        return Math.sqrt(numero);
    }

    // Método para formatear la salida según si el resultado es entero o decimal
    public static String formatoResultado(double resultado) {
        if (resultado % 1 == 0) {
            return String.valueOf((int) resultado);
        } else {
            return String.valueOf(resultado);
        }
    }

    // Método para leer un número y aceptar tanto punto como coma en decimales
    public static double leerNumero(Scanner scanner) {
        String input = scanner.next().replace(",", ".");
        return Double.parseDouble(input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Menú de opciones
            System.out.println("\n==== CALCULATODO ====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Módulo (resto)");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz Cuadrada");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion;

            try {
                String opcionStr = scanner.next();
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                continue;
            }

            double num1 = 0, num2 = 0, resultado = 0;
            boolean necesitaDosNumeros = opcion >= 1 && opcion <= 6;

            if (necesitaDosNumeros) {
                System.out.print("Ingrese el primer número: ");
                num1 = leerNumero(scanner);
                System.out.print("Ingrese el segundo número: ");
                num2 = leerNumero(scanner);
            } else if (opcion == 7) {
                System.out.print("Ingrese el número: ");
                num1 = leerNumero(scanner);
            }

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("\nLa suma es: " + formatoResultado(resultado));
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("\nLa resta es: " + formatoResultado(resultado));
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("\nLa multiplicación es: " + formatoResultado(resultado));
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    System.out.println("\nLa division es: " + formatoResultado(resultado));
                    break;
                case 5:
                    resultado = modulo(num1, num2);
                    System.out.println("\nEl modulo es: " + formatoResultado(resultado));
                    break;
                case 6:
                    resultado = potencia(num1, num2);
                    System.out.println("La potencia de " + formatoResultado(num1) + " elevado a " + formatoResultado(num2) + " es: " + formatoResultado(resultado));
                    break;
                case 7:
                    resultado = raizCuadrada(num1);
                    System.out.println("\nLa raíz cuadrada de " + formatoResultado(num1) + " es: " + formatoResultado(resultado));
                    break;
                case 8:
                    continuar = false;
                    System.out.println("\nSaliendo de la calculadora...");
                    break;
                default:
                    System.out.println("\nOpción no válida, por favor ingrese un número entre 1 y 8.");
            }
        }
        scanner.close();
    }
}
