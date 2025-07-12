package map;


// 🧪 MapEjemplo.java
// Este archivo muestra cómo funciona un Map en Java: estructura clave-valor.

import java.util.HashMap;
import java.util.Map;

public class MapEjemplo {
    public static void main(String[] args) {
        // 🔹 DECLARACIÓN de un Map
        Map<String, Integer> inventario = new HashMap<>();

        // 🔹 AGREGAR pares clave-valor
        inventario.put("Lápiz", 10);
        inventario.put("Cuaderno", 5);
        inventario.put("Lápiz", 20); // Sobrescribe el valor anterior

        // 🔹 ACCEDER a un valor
        System.out.println("Cantidad de Lápices: " + inventario.get("Lápiz"));

        // 🔹 RECORRER el mapa
        System.out.println("Inventario completo:");
        for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
            System.out.println("- " + entrada.getKey() + ": " + entrada.getValue());
        }

        // 🔹 VERIFICAR existencia de clave
        System.out.println("¿Tiene 'Cuaderno'? " + inventario.containsKey("Cuaderno"));

        // 🔹 ELIMINAR un par
        inventario.remove("Cuaderno");

        // 🔹 TAMAÑO del Map
        System.out.println("Tamaño del Map: " + inventario.size());

        // 🔹 LIMPIAR el Map
        inventario.clear();
        System.out.println("¿Está vacío?: " + inventario.isEmpty());
    }
}
