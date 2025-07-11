import java.util.Scanner;

class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.println("\nSelecciona la operación que deseas realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");

        System.out.print("Opción (1-5): ");
        int opcion = entrada.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 5:
                if (numero2 != 0) {
                    resultado = numero1 % numero2;
                    System.out.println("Resultado del módulo: " + resultado);
                } else {
                    System.out.println("Error: No se puede calcular el módulo con divisor cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }

        entrada.close();
    }
}
