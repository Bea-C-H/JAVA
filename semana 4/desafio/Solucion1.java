package clase18_02.desafio1;


import java.util.Scanner;

public class Solucion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntas al usuario
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = sc.next();

        System.out.print("¿Cuál es tu primer apellido? ");
        String apellido1 = sc.next();

        System.out.print("¿Cuál es tu segundo apellido? ");
        String apellido2 = sc.next();

        // Concatenación Nombre Completo
        System.out.printf("Tu nombre completo es: %s %s %s%n", nombre, apellido1, apellido2);
        sc.close();

        //%s %s %s%n le dice a Java:  "Imprime tres cadenas separadas por espacios, y luego un salto de línea."

    }
}
