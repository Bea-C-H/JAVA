package list;

// 🧪 ListEjemplo.java
// Este archivo muestra cómo se usa List en Java, qué lo diferencia de los arrays, y cómo manipular sus elementos.

import java.util.ArrayList;
import java.util.List;

public class ListEjemplo {
    public static void main(String[] args) {

        // 🔹 DECLARACIÓN de una lista
        // Usamos la interfaz List para declarar y ArrayList como implementación.
        // Esto nos da flexibilidad para cambiar por otra implementación si lo deseamos (como LinkedList).
        List<String> frutas = new ArrayList<>();

        // 🔹 AGREGAR elementos con .add()
        // A diferencia de los arrays, List crece dinámicamente.
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Manzana"); // ✅ List permite duplicados

        // 🔹 IMPRIMIR usando bucle for-each
        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // 🔹 ACCEDER por índice con .get()
        System.out.println("\nFruta en posición 1: " + frutas.get(1)); // "Pera"

        // 🔹 MODIFICAR un valor con .set()
        frutas.set(1, "Durazno");
        System.out.println("Después de modificar la posición 1: " + frutas);

        // 🔹 ELIMINAR por índice con .remove()
        frutas.remove(0); // Elimina "Manzana" en índice 0
        System.out.println("Después de eliminar el índice 0: " + frutas);

        // 🔹 VERIFICAR si contiene un elemento con .contains()
        boolean tieneBanana = frutas.contains("Banana");
        System.out.println("¿Contiene 'Banana'? " + tieneBanana); // false

        // 🔹 TAMAÑO de la lista con .size()
        System.out.println("Tamaño de la lista: " + frutas.size());

        // 🔹 LIMPIAR la lista con .clear()
        frutas.clear();
        System.out.println("¿Lista vacía?: " + frutas.isEmpty()); // true
    }
}
