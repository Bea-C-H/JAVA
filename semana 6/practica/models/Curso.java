package semana6.practica.models;

import java.util.ArrayList;

public class Curso {
    String nombreCurso;
    String nombreProfesor;
    int año;
    ArrayList<Estudiante> estudiantesInscritos;

    // Constructor que inicializa los atributos
    public Curso(String nombreCurso, String nombreProfesor, int año) {
        this.nombreCurso = nombreCurso;
        this.nombreProfesor = nombreProfesor;
        this.año = año;
        this.estudiantesInscritos = new ArrayList<>();
    }

    // Método para inscribir a un estudiante
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
        System.out.println(estudiante.obtenerNombreCompleto() + " ha sido inscrito en el curso " + nombreCurso);
    }

    // Método para desinscribir a un estudiante
    public void desinscribirEstudiante(Estudiante estudiante) {
        if (estudiantesInscritos.remove(estudiante)) {
            System.out.println(estudiante.obtenerNombreCompleto() + " ha sido desinscrito del curso.");
        } else {
            System.out.println("El estudiante no se encuentra en el curso.");
        }
    }

    // Método para contar estudiantes inscritos
    public int contarEstudiantes() {
        return estudiantesInscritos.size();
    }

    // Método para obtener la mejor calificación del curso
    public int obtenerMejorCalificacion() {
        int mejor = 0;
        for (Estudiante estudiante : estudiantesInscritos) {
            if (estudiante.calificacion > mejor) {
                mejor = estudiante.calificacion;
            }
        }
        return mejor;
    }
}
