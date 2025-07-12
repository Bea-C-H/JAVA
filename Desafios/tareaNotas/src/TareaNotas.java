import java.util.*;

public class TareaNotas {
    private HashMap<String, ArrayList<Double>> calificaciones;
    private Scanner scanner;
    private final double NOTA_APROBACION = 4.0; // Nota mínima para aprobar
    private final double NOTA_MINIMA = 1.0;
    private final double NOTA_MAXIMA = 7.0;

    public TareaNotas() {
        calificaciones = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    // Método para validar que el número ingresado sea positivo
    private int validarEnteroPositivo(String mensaje) {
        int numero;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número entero válido.");
                System.out.print(mensaje);
                scanner.next();
            }
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Error: El número debe ser positivo.");
            }
        } while (numero <= 0);
        return numero;
    }

    // Método para validar que la nota esté en el rango válido
    private double validarNota(String mensaje) {
        double nota;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Ingrese un número válido.");
                System.out.print(mensaje);
                scanner.next();
            }
            nota = scanner.nextDouble();
            if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
                System.out.println("Error: La nota debe estar entre " + NOTA_MINIMA + " y " + NOTA_MAXIMA);
            }
        } while (nota < NOTA_MINIMA || nota > NOTA_MAXIMA);
        return nota;
    }

    // Método para ingresar datos de estudiantes y notas
    public void ingresarDatos() {
        System.out.println("=== INGRESO DE DATOS ===");

        int cantidadAlumnos = validarEnteroPositivo("Ingrese la cantidad de alumnos: ");
        int cantidadNotas = validarEnteroPositivo("Ingrese la cantidad de notas por alumno: ");

        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            String nombre = scanner.nextLine().trim();

            // Validar que el nombre no esté vacío
            while (nombre.isEmpty()) {
                System.out.print("Error: El nombre no puede estar vacío. Ingrese nuevamente: ");
                nombre = scanner.nextLine().trim();
            }

            ArrayList<Double> notas = new ArrayList<>();

            System.out.println("Ingrese las notas de " + nombre + ":");
            for (int j = 0; j < cantidadNotas; j++) {
                double nota = validarNota("Nota " + (j + 1) + ": ");
                notas.add(nota);
            }

            calificaciones.put(nombre, notas);
            System.out.println("Datos de " + nombre + " ingresados correctamente.\n");
        }
    }

    // Método para calcular el promedio de un estudiante
    private double calcularPromedio(ArrayList<Double> notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    // Método para encontrar la nota máxima
    private double encontrarNotaMaxima(ArrayList<Double> notas) {
        double maxima = notas.get(0);
        for (double nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        return maxima;
    }

    // Método para encontrar la nota mínima
    private double encontrarNotaMinima(ArrayList<Double> notas) {
        double minima = notas.get(0);
        for (double nota : notas) {
            if (nota < minima) {
                minima = nota;
            }
        }
        return minima;
    }

    // Método para calcular el promedio general del curso
    private double calcularPromedioGeneral() {
        double sumaTotal = 0;
        int cantidadTotal = 0;

        for (ArrayList<Double> notas : calificaciones.values()) {
            for (double nota : notas) {
                sumaTotal += nota;
                cantidadTotal++;
            }
        }

        return cantidadTotal > 0 ? sumaTotal / cantidadTotal : 0;
    }

    // Método para mostrar estadísticas de cada estudiante
    public void mostrarEstadisticas() {
        System.out.println("\n=== ESTADÍSTICAS POR ESTUDIANTE ===");

        for (Map.Entry<String, ArrayList<Double>> entry : calificaciones.entrySet()) {
            String nombre = entry.getKey();
            ArrayList<Double> notas = entry.getValue();

            double promedio = calcularPromedio(notas);
            double notaMaxima = encontrarNotaMaxima(notas);
            double notaMinima = encontrarNotaMinima(notas);

            System.out.println("Estudiante: " + nombre);
            System.out.println("  Promedio: " + String.format("%.2f", promedio));
            System.out.println("  Nota máxima: " + String.format("%.2f", notaMaxima));
            System.out.println("  Nota mínima: " + String.format("%.2f", notaMinima));
            System.out.println();
        }
    }

    // Opción 1: Mostrar promedio por estudiante
    private void mostrarPromedios() {
        System.out.println("\n=== PROMEDIO DE NOTAS POR ESTUDIANTE ===");

        for (Map.Entry<String, ArrayList<Double>> entry : calificaciones.entrySet()) {
            String nombre = entry.getKey();
            ArrayList<Double> notas = entry.getValue();
            double promedio = calcularPromedio(notas);

            System.out.println(nombre + ": " + String.format("%.2f", promedio));
        }
    }

    // Opción 2: Verificar si una nota es aprobatoria o reprobatoria
    private void verificarAprobacion() {
        System.out.println("\n=== VERIFICAR APROBACIÓN ===");
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine().trim();

        if (!calificaciones.containsKey(nombre)) {
            System.out.println("Error: El estudiante '" + nombre + "' no existe.");
            return;
        }

        double nota = validarNota("Ingrese la nota a evaluar: ");

        if (nota >= NOTA_APROBACION) {
            System.out.println("La nota " + String.format("%.2f", nota) + " de " + nombre + " es APROBATORIA.");
        } else {
            System.out.println("La nota " + String.format("%.2f", nota) + " de " + nombre + " es REPROBATORIA.");
        }
    }

    // Opción 3: Verificar si una nota está sobre o bajo el promedio del curso
    private void verificarPromedioGeneral() {
        System.out.println("\n=== COMPARAR CON PROMEDIO DEL CURSO ===");
        double promedioGeneral = calcularPromedioGeneral();
        System.out.println("Promedio general del curso: " + String.format("%.2f", promedioGeneral));

        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine().trim();

        if (!calificaciones.containsKey(nombre)) {
            System.out.println("Error: El estudiante '" + nombre + "' no existe.");
            return;
        }

        double nota = validarNota("Ingrese la nota a evaluar: ");

        if (nota > promedioGeneral) {
            System.out.println("La nota " + String.format("%.2f", nota) + " de " + nombre +
                    " está POR SOBRE el promedio del curso.");
        } else if (nota < promedioGeneral) {
            System.out.println("La nota " + String.format("%.2f", nota) + " de " + nombre +
                    " está POR DEBAJO del promedio del curso.");
        } else {
            System.out.println("La nota " + String.format("%.2f", nota) + " de " + nombre +
                    " es IGUAL al promedio del curso.");
        }
    }

    // Método para mostrar el menú
    private void mostrarMenu() {
        System.out.println("\n=== MENÚ DE OPCIONES ===");
        System.out.println("1. Mostrar el Promedio de Notas por Estudiante");
        System.out.println("2. Mostrar si la Nota es Aprobatoria o Reprobatoria por Estudiante");
        System.out.println("3. Mostrar si la Nota está por Sobre o por Debajo del Promedio del Curso");
        System.out.println("0. Salir del Menú");
        System.out.print("Seleccione una opción: ");
    }

    // Método para ejecutar el menú
    public void ejecutarMenu() {
        int opcion;

        do {
            mostrarMenu();

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                mostrarMenu();
                scanner.next();
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarPromedios();
                    break;
                case 2:
                    verificarAprobacion();
                    break;
                case 3:
                    verificarPromedioGeneral();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        TareaNotas libreta = new TareaNotas();

        System.out.println("=== SISTEMA DE EVALUACIÓN DE CALIFICACIONES ===");

        // Verificar que hay datos para trabajar
        libreta.ingresarDatos();

        if (libreta.calificaciones.isEmpty()) {
            System.out.println("No hay datos de estudiantes para evaluar.");
            return;
        }

        // Mostrar estadísticas iniciales
        libreta.mostrarEstadisticas();

        // Ejecutar el menú
        libreta.ejecutarMenu();

        System.out.println("¡Gracias por usar el Sistema de Evaluación!");
    }
}