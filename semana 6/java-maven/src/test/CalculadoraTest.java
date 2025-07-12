package com.cursojava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculadoraTest {

/*    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(2, 3);
        assertEquals(5, resultado, "La suma de 2 + 3 debe ser 5");
    }

    @Test
    void testDivisionPorCero(){
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10,0));
    }


    @Test
    void testConvertirAEnteroConTryCatch(){
        Calculadora calc = new Calculadora();
        try {
            int resultado = calc.convertirAEntero("3");
            assertEquals(3, resultado, "El valor 3 debe ser 3");
        }catch (NumberFormatException e){ // e es mi variable de referencia a NumberFormatException
            System.out.println("No se puede convertir a entero" + e.getMessage());
        }
    }*/
    //   Calculadora  calc = new Calculadora();
    Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora(); // Se crea antes de cada test
    }

    @Test
    void testSuma() {
        int resultado = calc.suma(2, 3);
        assertEquals(5, resultado, "La suma de 2 + 3 debe ser 5");
    }

    @Test
    void testDivisionPorCero(){
        assertThrows(ArithmeticException.class, () -> calc.dividir(10,0));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Fin del test");
    }




}
