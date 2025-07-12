package com.cursojava;

import java.util.Scanner;

public class ScannerEjemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + " ");
        scanner.close(); // <---------------- liberamos el recurso manualmente.
    }

}
