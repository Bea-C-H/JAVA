package semana6.encapsulacion;

public class Alumno {

    //Atritutos privados: no se pueden acceder directamente desde fuera de la clase
    private String nombre;
    private int edad;

    // Constructor : se llama automaticamente al crear un nuevo objeto
    public Alumno(String nombre, int edad) {
        // 'this' se refiere al atributo de la clase
        this.nombre = nombre; // asignamos el parametro al atributo 'nombre'
        this.edad = edad;
    }

    // Getter : permite leer u obtener el valor de forma controlada
    public String getNombre() {
        return nombre;
    }

    // Setter : permite leer u cambiar el valor si lo necesitamos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
