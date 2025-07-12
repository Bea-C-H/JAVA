package animales;

import modelo.Animal;
import interfaces.Adoptable;

public class Gato extends Animal implements Adoptable {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice ¡Miau!");
    }

    @Override
    public String datosAdopcion() {
        return "Gato " + nombre + " de " + edad + " años listo para un hogar.";
    }
}
