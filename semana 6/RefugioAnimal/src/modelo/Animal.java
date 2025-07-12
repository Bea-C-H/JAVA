package modelo;

// Clase abstracta: NO se puede instanciar directamente
public abstract class Animal {

    protected String nombre;
    protected String especie;
    protected int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Animal(String nombre, int edad) {
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método abstracto que DEBE ser implementado por cada subclase
    public abstract void hacerSonido();
}