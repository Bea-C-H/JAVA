package semana6.ejercicio.Models;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int matricula;
    private int calificacion;
    private int año;

    public Estudiante(String nombre, String apellido, int matricula, int calificacion, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.año = año;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

}

