package semana5.funciones.refactorizar;

public class Datos {
     // antes en el principal
 /*   public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int r = a + b;
        System.out.println("Resultado: " + r);
    }
*/

    // Después (refactorizado):
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
