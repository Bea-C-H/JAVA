package app;

import modelo.Animal;
import animales.Perro;
import animales.Gato;

public class Main {
        public static void main(String[] args) {

                Animal[] animales = new Animal[4];
                animales[0] = new Perro("Max", 2);
                animales[1] = new Gato("Luna", 4);
                animales[2] = new Perro("Rex", 3);
                animales[3] = new Gato("Mila", 1);

                for (Animal a : animales) {
                        a.mostrarInformacion();  // método heredado de Animal
                        a.hacerSonido();         // comportamiento polimórfico
                        System.out.println("---");
                }
        }
}