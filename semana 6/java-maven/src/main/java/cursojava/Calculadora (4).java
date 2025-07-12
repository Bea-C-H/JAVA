package com.cursojava;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if( b == 0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return a / b;
    }
    // "3" ahora es 3
    public int convertirAEntero(String valor) {
        return Integer.parseInt(valor);
    }
}
