package semana5.bucles;

import java.util.*;

public class BucleForEach {
    public static void main(String[] args) {
        System.out.println("=== 🚀 EJEMPLOS DE BUCLE FOR-EACH ===\n");

        // Ejecutar todos los ejemplos
        ejemplo1_RecorrerArrays();
        ejemplo2_ProcesarColecciones();
    }

    public static void ejemplo1_RecorrerArrays() {
        System.out.println("📊 EJEMPLO 1: Recorrer Arrays");

        // Array de números enteros
        int[] numeros = {10, 25, 30, 45, 50, 65, 70, 85, 90};
        System.out.println("🔢 Array de números:");
        System.out.print("Elementos: ");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Calcular estadísticas usando for-each
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int numero : numeros) {
            suma += numero;
            if (numero > maximo) maximo = numero;
            if (numero < minimo) minimo = numero;
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("📈 Estadísticas:");
        System.out.println("   • Suma: " + suma);
        System.out.println("   • Promedio: " + String.format("%.2f", promedio));
        System.out.println("   • Máximo: " + maximo);
        System.out.println("   • Mínimo: " + minimo);
        System.out.println("   • Cantidad: " + numeros.length);

        System.out.println();

        // Array de strings
        String[] ciudades = {"Santiago", "Valparaíso", "Concepción", "La Serena", "Antofagasta"};
        System.out.println("🏙️ Ciudades de Chile:");

        for (String ciudad : ciudades) {
            System.out.println("   • " + ciudad + " (" + ciudad.length() + " caracteres)");
        }

        // Buscar ciudades con más de 8 caracteres
        System.out.println("\n🔍 Ciudades con más de 8 caracteres:");
        for (String ciudad : ciudades) {
            if (ciudad.length() > 8) {
                System.out.println("   ✅ " + ciudad);
            }
        }

        System.out.println();

        // Array bidimensional (matriz)
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("📋 Matriz 3x3:");
        for (int[] fila : matriz) {
            System.out.print("   ");
            for (int elemento : fila) {
                System.out.printf("%3d", elemento);
            }
            System.out.println();
        }

        System.out.println("─".repeat(50) + "\n");
    }

    public static void ejemplo2_ProcesarColecciones() {
        System.out.println("📚 EJEMPLO 2: Procesar Colecciones");

        // ArrayList de enteros
        List<Integer> numeros = Arrays.asList(15, 28, 33, 42, 57, 64, 71, 86, 99);
        System.out.println("📋 ArrayList de números:");

        // Filtrar números pares e impares
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.print("   Números pares: ");
        for (Integer par : pares) {
            System.out.print(par + " ");
        }
        System.out.println();

        System.out.print("   Números impares: ");
        for (Integer impar : impares) {
            System.out.print(impar + " ");
        }
        System.out.println("\n");

        // HashSet para eliminar duplicados
        Set<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Rojo");  // Duplicado
        colores.add("Azul");  // Duplicado

        System.out.println("🎨 Set de colores (sin duplicados):");
        for (String color : colores) {
            System.out.println("   🎨 " + color);
        }
        System.out.println("   Total de colores únicos: " + colores.size());

        System.out.println();

        // HashMap - usando entrySet()
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Carlos", 30);
        edades.put("María", 28);
        edades.put("Juan", 35);

        System.out.println("👥 Mapa de edades:");
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            String nombre = entrada.getKey();
            Integer edad = entrada.getValue();
            System.out.println("   👤 " + nombre + ": " + edad + " años");
        }

        // Calcular edad promedio
        int sumaEdades = 0;
        for (Integer edad : edades.values()) {
            sumaEdades += edad;
        }
        double promedioEdad = (double) sumaEdades / edades.size();
        System.out.printf("   📊 Edad promedio: %.1f años%n", promedioEdad);

        System.out.println("─".repeat(50) + "\n");
    }


}
