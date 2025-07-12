package com.cursojava;

import java.util.Scanner;

public class TryEjemplo {

    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Ingresa tu nombre");
            String nombre = scanner.nextLine();
            System.out.println("Hola " + nombre + " ");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            scanner.close();
        }*/

     /*
        // El try/catch es un manejador de errores
        try{
            //cuerpo

        }catch (Exception e){

        }

        */


        // try-witch-resources
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Ingresa tu nombre");
            String nombre = scanner.nextLine();
            System.out.println("Hola " + nombre + " ");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
