package semana6.poo_main;

import semana6.poo.Perro;

public class Mascota {
    public static void main(String[] args) {
        // Creamos un nuevo objeto de tipo Perro
        Perro miPerro = new Perro();

        // Usamos los métodos set para asignar valores (encapsulamiento)
        miPerro.setNombre("Rocky");
        miPerro.setRaza("Labrador");
        miPerro.setEdad(4);

        // Acciones del perro
        miPerro.ladrar();
        miPerro.imprimirInformacion();
    }
}
