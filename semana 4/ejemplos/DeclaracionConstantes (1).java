package semana4.ejemplos;

public class DeclaracionConstantes {
    public static void main(String[] args) {
        // CONSTANTES (valores que no cambian)
        final double IVA = 0.19;                    // 19% de IVA
        final int EDAD_MINIMA_TRABAJO = 18;         // Edad mínima legal
        final String MONEDA = "CLP";                // Peso chileno

        // VARIABLES (valores que pueden cambiar)
        String nombreEmpleado;      // Declaración
        int edadEmpleado;          // Declaración
        double sueldoBruto;        // Declaración

        // Inicialización de variables
        nombreEmpleado = "María González";
        edadEmpleado = 28;
        sueldoBruto = 800000.0;

        // Variables calculadas usando constantes
        double impuestoIVA = sueldoBruto * IVA;
        double sueldoNeto = sueldoBruto - impuestoIVA;
        boolean puedeTrabajar = edadEmpleado >= EDAD_MINIMA_TRABAJO;

        // Mostrar resultados
        System.out.println("=== INFORMACIÓN DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Edad: " + edadEmpleado + " años");
        System.out.println("Puede trabajar: " + puedeTrabajar);
        System.out.println("\n=== CÁLCULO DE SUELDO ===");
        System.out.println("Sueldo bruto: " + sueldoBruto + " " + MONEDA);
        System.out.println("IVA (" + (IVA * 100) + "%): " + impuestoIVA + " " + MONEDA);
        System.out.println("Sueldo neto: " + sueldoNeto + " " + MONEDA);
    }
}
