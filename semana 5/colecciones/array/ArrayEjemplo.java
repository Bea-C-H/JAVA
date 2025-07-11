
package array;

// 🧪 ArrayEjemplo.java
// Este archivo muestra cómo funcionan los arrays en Java, línea por línea con comentarios educativos.

public class ArrayEjemplo {
    public static void main(String[] args) {

        // 🔹 DECLARACIÓN de un array de enteros
        // Aquí usamos los corchetes [] para indicar que es un array.
        // La sintaxis es: tipo[] nombre;
        int[] numeros;

        // 🔹 INICIALIZACIÓN del array con tamaño fijo
        // Creamos un array con 5 elementos. Todos se inicializan a 0 por defecto.
        // Usamos 'new int[5]' para reservar espacio en memoria.
        numeros = new int[5];

        // 🔹 ASIGNACIÓN de valores a cada posición
        // Accedemos a cada índice con corchetes []. El índice comienza en 0.
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // 🔹 IMPRESIÓN de los elementos uno por uno
        System.out.println("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            // .length devuelve el tamaño del array (no lleva paréntesis porque es una propiedad, no un método).
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // 🔹 INICIALIZACIÓN RÁPIDA usando llaves {}
        // Esta es una forma concisa de crear e inicializar un array.
        // Las llaves {} permiten definir los valores directamente al momento de la declaración.
        String[] frutas = {"Manzana", "Pera", "Plátano"};

        System.out.println("\nArray de frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta " + i + ": " + frutas[i]);
        }

        // 🔹 ACCESO fuera del rango (comentado para evitar error)
        // System.out.println(numeros[5]); // ❌ Esto lanzaría un ArrayIndexOutOfBoundsException

        // 🔹 ARRAY DE BOOLEANOS
        boolean[] respuestas = new boolean[3]; // por defecto: false
        respuestas[0] = true;

        // : Se lee como "en" o "de". Indica que vamos a iterar sobre los elementos.
        System.out.println("\nRespuestas:");
        for (boolean r : respuestas) {
            System.out.println("Valor: " + r);
        }

        // Simulamos que el usuario respondió solo la primera pregunta
        // Mis respuestas serian : [true, false, false]
        
        // Verificamos cuáles fueron respondidas
        for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i]) {
                System.out.println("Pregunta " + (i + 1) + ": ✅ Respondida");
            } else {
                System.out.println("Pregunta " + (i + 1) + ": ❌ No respondida");
            }
        }


        // 🔹 ARRAY DE OBJETOS (Ej: String)
        String[] nombres = new String[2]; // por defecto: null
        nombres[0] = "Ana";
        nombres[1] = "Luis";

        System.out.println("\nNombres:");
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        // RECOMENDACIONES RECORRER UN ARRAY
        // Solo el valor : for-each
        // El valor y su posición : for clásico
        // Buscar por índice específico: for clásico o auxiliar index

    }
}
