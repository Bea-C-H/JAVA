package clase18_02.desafio1;
import java.util.Scanner;

public class Solucion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntas
        System.out.println("¿Cuál es tu nombre?");
        String nombre = sc.next();

        System.out.println("¿Cuál es tu comida favorita?");
        String comida = sc.next();

        System.out.println("¿Cuál es tu color favorito?");
        String color = sc.next();

        // Concatenación de respuestas con coherencia
        System.out.println("Hola " + nombre + ", a mí también me gusta " + comida + " y también es mi color favorito es el " + color + ".");

        sc.close();
    }
}




