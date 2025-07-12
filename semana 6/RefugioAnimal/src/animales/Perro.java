package animales;

import modelo.Animal;
import interfaces.Entrenable;
import interfaces.Adoptable;

public class Perro extends Animal implements Entrenable, Adoptable {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice ¡Guau!");
    }

    @Override
    public String tipoAlimentacion() {
        return "Croquetas y carne";
    }

    @Override
    public void entrenando() {
        System.out.println(nombre + " ha aprendido a sentarse. 🐾");
    }

    @Override
    public String datosAdopcion() {
        return "Perro " + nombre + " de " + edad + " años disponible para adopción.";
    }
}
