package semana6.ejercicio.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorCursos {
    private Map<String, ArrayList<Estudiante>> cursos;

    public GestorCursos() {
        cursos = new HashMap<>();
    }

    public void agregarEstudianteACurso(String curso, Estudiante estudiante) {
        cursos.putIfAbsent(curso, new ArrayList<>());
        cursos.get(curso).add(estudiante);
    }

    public void mostrarEstudiantesDeCurso(String curso) {
        ArrayList<Estudiante> lista = cursos.get(curso);
        if (lista != null && !lista.isEmpty()) {
            System.out.println("Estudiantes en el curso \"" + curso + "\":");
            for (Estudiante e : lista) {
                System.out.println("- " + e.getNombreCompleto() + " (Matrícula: " + e.getMatricula() + ")");
            }
        } else {
            System.out.println("No hay estudiantes registrados en ese curso.");
        }
    }

    public void removerEstudianteDeCurso(String curso, int matricula) {
        ArrayList<Estudiante> lista = cursos.get(curso);
        if (lista != null) {
            lista.removeIf(e -> e.getMatricula() == matricula);
        }
    }
}
