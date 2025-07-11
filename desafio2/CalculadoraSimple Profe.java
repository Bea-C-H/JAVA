import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        // Crear el objeto Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);
        
        // Variables para almacenar los números y la opción
        double numero1, numero2, resultado;
        int opcion;
        
        // Mostrar título de la calculadora
        System.out.println("=== CALCULADORA SIMPLE ===\n");
        
        // Solicitar el primer número
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();
        
        // Solicitar el segundo número
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();
        
        // Mostrar menú de operaciones
        System.out.println("\nSeleccione una operación:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.println("5. Módulo (%)");
        
        // Solicitar la opción
        System.out.print("\nIngrese su opción (1-5): ");
        opcion = scanner.nextInt();
        
        // Procesar la operación seleccionada usando if-else
        if (opcion == 1) { // Suma
            resultado = numero1 + numero2;
            System.out.printf("\nResultado: %.2f + %.2f = %.2f%n", numero1, numero2, resultado);
            
        } else if (opcion == 2) { // Resta
            resultado = numero1 - numero2;
            System.out.printf("\nResultado: %.2f - %.2f = %.2f%n", numero1, numero2, resultado);
            
        } else if (opcion == 3) { // Multiplicación
            resultado = numero1 * numero2;
            System.out.printf("\nResultado: %.2f * %.2f = %.2f%n", numero1, numero2, resultado);
            
        } else if (opcion == 4) { // División
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.printf("\nResultado: %.2f / %.2f = %.2f%n", numero1, numero2, resultado);
            } else {
                System.out.println("\nError: No se puede dividir por cero.");
            }
            
        } else if (opcion == 5) { // Módulo
            if (numero2 != 0) {
                resultado = numero1 % numero2;
                System.out.printf("\nResultado: %.2f %% %.2f = %.2f%n", numero1, numero2, resultado);
            } else {
                System.out.println("\nError: No se puede calcular el módulo con divisor cero.");
            }
            
        } else {
            System.out.println("\nError: Opción no válida. Por favor, seleccione una opción entre 1 y 5.");
        }
        
        // Cerrar el scanner
        scanner.close();
        
        System.out.println("\n¡Gracias por usar la calculadora!");
    }
}