package semana5.funciones.Ejemplo;

public class Persona {
    private String nombre;
    //Si el constructor no se llamara igual que la clase,
    // Java no lo reconocería como constructor y marcaría error.
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public void saludar() {
       System.out.println("Hola, soy " + nombre);
    }

    public static void main(String[] args) {
        // Necesito crear un objeto primero
        Persona p = new Persona("Soy un Constructor, pero no Bob el Constructor");
        p.saludar();
    }

}
