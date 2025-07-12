package semana4;

public class Variables {
    public static void main(String[] args) {
        // Tipos de datos primitivos
        byte numeroByte = 127; // Rango: -128 a 127
        short numeroShort = 32767; // Rango: -32,768 a 32,767
        int numeroInt = 2147483647; // Rango: -2^31 a 2^31-1
        long numeroLong = 9223372036854775807L; // Rango: -2^63 a 2^63-1
        float numeroFloat = 3.1416f; // Punto flotante de precisión simple (32 bits)
        double numeroDouble = 3.141592653589793; // Punto flotante de precisión doble (64 bits)
        char caracter = 'A'; // Almacena un solo carácter
        boolean esVerdadero = true; // Puede ser true o false

        // Tipos de datos de referencia ( Objetos )
        String cadenaTexto = "Hola, mundo"; // Objeto de tipo String
        Integer numeroInteger = 100; // Clase envolvente de int
        Double numeroDoubleObjeto = 3.14; // Clase envolvente de double
        Boolean esBoolean = true; // Clase envolvente de boolean

        // Impresión de valores
        System.out.println("Tipos de datos primitivos:");
        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);
        System.out.println("char: " + caracter);
        System.out.println("boolean: " + esVerdadero);

        System.out.println("\nTipos de datos de referencia( Objetos ):");
        System.out.println("String: " + cadenaTexto);
        System.out.println("Integer: " + numeroInteger);
        System.out.println("Double: " + numeroDoubleObjeto);
    }
}
