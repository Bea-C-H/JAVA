package semana4;

public class Constantes {
    // CONSTANTES DE CLASE (static final) - Valores que NUNCA cambian
    public static final double PI = 3.14159;
    public static final int DIAS_SEMANA = 7;
    public static final int MESES_ANO = 12;
    public static final String NOMBRE_APLICACION = "Sistema de Gestión";
    public static final int EDAD_MINIMA_TRABAJO = 18;
    public static final double IVA_CHILE = 0.19;

    public static void main(String[] args) {
        System.out.println("=== CONSTANTES EN JAVA ===");

        // USO DE CONSTANTES DE CLASE
        System.out.println("--- Constantes Matemáticas ---");
        System.out.println("Valor de PI: " + PI);

        System.out.println("\n--- Constantes de Tiempo ---");
        System.out.println("Días en la semana: " + DIAS_SEMANA);
        System.out.println("Meses en el año: " + MESES_ANO);

        System.out.println("\n--- Constantes de Aplicación ---");
        System.out.println("Nombre de la aplicación: " + NOMBRE_APLICACION);
        System.out.println("Edad mínima para trabajar: " + EDAD_MINIMA_TRABAJO + " años");
        System.out.println("IVA en Chile: " + (IVA_CHILE * 100) + "%");

        // CONSTANTES LOCALES (dentro del método)
        final int NUMERO_MAXIMO = 100;
        final String MENSAJE_BIENVENIDA = "¡Bienvenido al sistema!";
        final double DESCUENTO_VIP = 0.15;

        System.out.println("\n--- Constantes Locales ---");
        System.out.println("Número máximo permitido: " + NUMERO_MAXIMO);
        System.out.println(MENSAJE_BIENVENIDA);
        System.out.println("Descuento VIP: " + (DESCUENTO_VIP * 100) + "%");

        // EJEMPLO PRÁCTICO: Cálculos con constantes
        System.out.println("\n--- Ejemplos Prácticos ---");

        // Cálculo de área de círculo
        double radio = 5.0;
        double area = PI * radio * radio;
        System.out.println("Área de círculo con radio " + radio + ": " + area);

        // Cálculo de precio con IVA
        double precioSinIva = 10000;
        double iva = precioSinIva * IVA_CHILE;
        double precioFinal = precioSinIva + iva;
        System.out.println("Precio sin IVA: $" + precioSinIva);
        System.out.println("IVA: $" + iva);
        System.out.println("Precio final: $" + precioFinal);

        // Validación de edad
        int edadUsuario = 20;
        if (edadUsuario >= EDAD_MINIMA_TRABAJO) {
            System.out.println("Usuario de " + edadUsuario + " años puede trabajar");
        } else {
            System.out.println("Usuario muy joven para trabajar");
        }

        // IMPORTANTE: Las constantes NO se pueden modificar
        // PI = 3.14; // ¡ERROR de compilación!
        // NUMERO_MAXIMO = 200; // ¡ERROR de compilación!
    }
}
