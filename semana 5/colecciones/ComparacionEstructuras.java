package semana5.coleciones;

import java.util.*;

public class ComparacionEstructuras {
    public static void main(String[] args) {

        // 1. Array - tamaño fijo, permite duplicados, acceso por índice
        String[] array = {"Manzana", "Pera", "Manzana"};
        System.out.println("🔢 Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("- " + array[i]); // orden fijo, duplicados permitidos
        }

        // 2. List - colección dinámica, permite duplicados, mantiene orden
        List<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Manzana");
        System.out.println("\n📋 List:");
        for (String fruta : lista) {
            System.out.println("- " + fruta); // orden de inserción, duplicados permitidos
        }

        // 3. Set - colección sin duplicados, orden NO garantizado (HashSet)
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Pera");
        conjunto.add("Manzana"); // ignorado
        System.out.println("\n🔐 Set:");
        for (String fruta : conjunto) {
            System.out.println("- " + fruta); // sin duplicados, orden aleatorio
        }

        // 4. Map - pares clave-valor, claves únicas
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Pera", 5);
        mapa.put("Manzana", 20); // sobrescribe
        System.out.println("\n🗺️ Map:");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("- " + entrada.getKey() + ": " + entrada.getValue());
        }

        // 5. Stream - procesamiento funcional, ejemplo: filtrar y transformar lista
        System.out.println("\n🌊 Stream:");
        lista.stream()
                .filter(f -> f.startsWith("M"))
                .map(String::toUpperCase)
                .forEach(f -> System.out.println("- " + f));
    }
}