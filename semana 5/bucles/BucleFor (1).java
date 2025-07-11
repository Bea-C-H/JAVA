package semana5.bucles;


public class BucleFor {

    public static void main(String[] args) {
        System.out.println("=== EJEMPLOS DE BUCLE FOR ===\n");

        // Ejecutar todos los ejemplos
        ejemplo1_ContadorBasico();
        ejemplo2_TablaMultiplicar();
        ejemplo3_SumaNumerosPares();
    }

    public static void ejemplo1_ContadorBasico() {
        System.out.println("EJEMPLO 1: Contador Básico");
        System.out.println("Contando del 1 al 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Ejemplo con decremento
        System.out.println("Cuenta regresiva del 10 al 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + "─".repeat(20) + "\n");
    }


    public static void ejemplo2_TablaMultiplicar() {
        System.out.println("EJEMPLO 2: Tabla de Multiplicar");

        int numeroTabla = 7;
        System.out.println("Tabla del " + numeroTabla + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabla * i;
            System.out.printf("%d x %d = %d%n", numeroTabla, i, resultado);
        }

        System.out.println();

        // Tabla de multiplicar completa (ejemplo de bucles anidados)
        System.out.println("Mini tabla de multiplicar (1-5):");
        System.out.print("   ");

        // Encabezado
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Filas con resultados
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%2d:", i);
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        System.out.println("─".repeat(50) + "\n");
    }


    public static void ejemplo3_SumaNumerosPares() {
        System.out.println("Suma de Números Pares");

        int limite = 20;
        int suma = 0;
        int contador = 0;

        System.out.println("Números pares del 1 al " + limite + ":");

        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {  // Verificar si es par
                System.out.print(i + " ");
                suma += i;
                contador++;
            }
        }

        System.out.println("\n");
        System.out.println("Cantidad de números pares: " + contador);
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + (suma / (double) contador));

        System.out.println();

        System.out.println("Usando FOR con incremento de 2 (más eficiente):");
        suma = 0;
        contador = 0;

        for (int i = 2; i <= limite; i += 2) {  // Incremento de 2
            System.out.print(i + " ");
            suma += i;
            contador++;
        }

        System.out.println("\n");
        System.out.println("Suma total (método eficiente): " + suma);

        System.out.println("─".repeat(50) + "\n");
    }


    public static void ejemploMultiplesVariables() {
        System.out.println("🎯 EJEMPLO BONUS: FOR con Múltiples Variables");

        // Convergencia de dos números
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.printf("i = %d, j = %d, diferencia = %d%n", i, j, j - i);
           // System.out.println("i = " + i + ", j = " + j + ", diferencia = " + (j - i));

        }

        System.out.println("─".repeat(50) + "\n");
    }
}