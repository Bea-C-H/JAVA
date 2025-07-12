package semana6.poo;

// Clase Perro con modificadores de acceso y encapsulamiento básico
public class Perro {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String raza;
    private int edad;

    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para raza
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Setter para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que imprime información del perro
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
    }

    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }

    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.setNombre("Firulais");
        perro1.setRaza("Pitbull");
        perro1.setEdad(2);
        perro1.imprimirInformacion();
        perro1.ladrar();
    }
}
