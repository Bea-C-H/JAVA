package stream;
// 🧪 StreamEjemplo.java
// Este archivo muestra cómo usar Streams para procesar listas de forma funcional.

import java.util.List;
import java.util.stream.Collectors;

public class StreamEjemplo {
    public static void main(String[] args) {
        // 🔹 Crear una lista
        List<String> nombres = List.of("Ana", "Luis", "Pedro", "Andrea", "Lucía");

        // 🔹 Usar Stream para filtrar, transformar y recolectar
        List<String> resultado = nombres.stream()
                .filter(n -> n.startsWith("A"))           // Filtrar nombres que comienzan con "A"
                .map(String::toUpperCase)                 // Convertirlos a mayúsculas
                .sorted()                                 // Ordenar alfabéticamente
                .collect(Collectors.toList());            // Recolectar en nueva lista

        // 🔹 Imprimir resultados
        System.out.println("Nombres filtrados y transformados:");
        resultado.forEach(System.out::println);
    }
}
