package semana6.practica.models;


public class Estudiante {
    String nombre;
    String apellido;
    int matricula;
    int calificacion;
    int año;

    // Constructor con todos los atributos
    public Estudiante(String nombre, String apellido, int matricula, int calificacion, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.año = año;
    }

    // Método que imprime el nombre completo del estudiante
    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Método que verifica si el estudiante está aprobado
    public boolean estaAprobado() {
        return calificacion >= 60;
    }

    // Método para cambiar al siguiente año si está aprobado
    public void avanzarDeAño() {
        if (estaAprobado()) {
            año++;
            System.out.println(obtenerNombreCompleto() + " ha avanzado al año " + año);
        } else {
            System.out.println(obtenerNombreCompleto() + " no ha aprobado para avanzar de año.");
        }
    }

    // Método adicional para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + obtenerNombreCompleto());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Año actual: " + año);
    }
}
