package semana4;

public class Operadores {

    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 10, b = 5;
        System.out.println("Operadores Aritméticos:");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo (resto): " + (a % b));

        // Operadores de Asignación
        int c = 10;
        System.out.println("\nOperadores de Asignación:");
        System.out.println("c = " + c);
        c += 5;  // c = c + 5
        System.out.println("c += 5 -> " + c);
        c -= 2;  // c = c - 2
        System.out.println("c -= 2 -> " + c);
        c *= 3;  // c = c * 3
        System.out.println("c *= 3 -> " + c);
        c /= 2;  // c = c / 2
        System.out.println("c /= 2 -> " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3 -> " + c);

        // Operadores Relacionales
        System.out.println("\nOperadores Relacionales:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Operadores Lógicos
        boolean x = true, y = false;
        System.out.println("\nOperadores Lógicos:");
        System.out.println("x && y (AND): " + (x && y));
        System.out.println("x || y (OR): " + (x || y));
        System.out.println("!x (NOT): " + (!x));

        // Operadores Bit a Bit
        int d = 5, e = 3; // 5 = 101 en binario, 3 = 011 en binario
        System.out.println("\nOperadores Bit a Bit:");
        System.out.println("d & e (AND): " + (d & e)); // 101 & 011 = 001 (1)
        System.out.println("d | e (OR): " + (d | e));  // 101 | 011 = 111 (7)
        System.out.println("d ^ e (XOR): " + (d ^ e)); // 101 ^ 011 = 110 (6)
        System.out.println("~d (NOT): " + (~d)); // Complemento de 5 en binario
        System.out.println("d << 1 (Desplazamiento Izq): " + (d << 1)); // 1010 (10)
        System.out.println("d >> 1 (Desplazamiento Der): " + (d >> 1)); // 10 (2)

        // Operador Ternario
        System.out.println("\nOperador Ternario:");
        int resultado = (a > b) ? 100 : 200;
        System.out.println("resultado = (a > b) ? 100 : 200 -> " + resultado);

        // Operador de Incremento y Decremento
        int f = 10;
        System.out.println("\nOperadores de Incremento y Decremento:");
        System.out.println("f = " + f);
        System.out.println("f++ (post-incremento): " + (f++)); // Usa el valor y luego incrementa
        System.out.println("Después de f++: " + f);
        System.out.println("++f (pre-incremento): " + (++f)); // Incrementa y luego usa el valor
        System.out.println("f-- (post-decremento): " + (f--)); // Usa el valor y luego decrementa
        System.out.println("Después de f--: " + f);
        System.out.println("--f (pre-decremento): " + (--f)); // Decrementa y luego usa el valor
    }
}

