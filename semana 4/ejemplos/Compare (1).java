package semana4.ejemplos;

public class Compare {

    public static void main(String[] args) {
        String str1 = "H";
        String str2 = "M";

        boolean sonIguales = str1.compareTo(str2) == 0; // true si son iguales
        System.out.println(sonIguales); // false
    }
}

// Segun "Hola".compareTo("Mundo") devuelve un valor negativo porque 'H' (72 en ASCII) es menor que 'M' (77 en ASCII).