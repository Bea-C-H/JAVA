package set;

// 🧪 SetEjemplo.java
// Este archivo demuestra cómo funciona un Set en Java: colección sin duplicados.

import java.util.HashSet;
import java.util.Set;

public class SetEjemplo {
    public static void main(String[] args) {
        // 🔹 DECLARACIÓN de un Set
        Set<String> paises = new HashSet<>();

        // 🔹 AGREGAR elementos
        paises.add("Chile");
        paises.add("Argentina");
        paises.add("Chile"); // Duplicado: será ignorado automáticamente

        // 🔹 IMPRIMIR contenido
        System.out.println("Paises en el Set:");
        for (String pais : paises) {
            System.out.println("- " + pais);
        }

        // 🔹 VERIFICAR existencia con .contains()
        System.out.println("¿Contiene 'Chile'? " + paises.contains("Chile"));

        // 🔹 ELIMINAR elemento
        paises.remove("Argentina");
        System.out.println("Después de eliminar 'Argentina': " + paises);

        // 🔹 TAMAÑO del Set
        System.out.println("Tamaño del Set: " + paises.size());

        // 🔹 LIMPIAR el Set
        paises.clear();
        System.out.println("¿Está vacío?: " + paises.isEmpty());
    }
}
