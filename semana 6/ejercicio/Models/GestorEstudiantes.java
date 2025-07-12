package semana6.ejercicio.Models;

import java.util.HashMap;
import java.util.Map;

public class GestorEstudiantes {
    private Map<Integer, Estudiante> estudiantes;

    public GestorEstudiantes() {
        estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.put(estudiante.getMatricula(), estudiante);
    }

    public void eliminarEstudiante(int matricula) {
        estudiantes.remove(matricula);
    }

    public Estudiante obtenerEstudiante(int matricula) {
        return estudiantes.get(matricula);
    }

    public void mostrarTodos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante e : estudiantes.values()) {
                System.out.println("Nombre: " + e.getNombreCompleto() + " | Matrícula: " + e.getMatricula());
            }
        }
    }
}
