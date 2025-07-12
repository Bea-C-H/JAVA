package semana6.ejercicio.Models;

import java.util.HashMap;
import java.util.Map;

public class GestorNotas {
    private Map<Integer, Estudiante> estudiantes;

    public GestorNotas() {
        estudiantes = new HashMap<>();
    }

    public void agregar(Estudiante e) {
        estudiantes.put(e.getMatricula(), e);
    }

    public void actualizarNota(int matricula, int nuevaNota) {
        Estudiante e = estudiantes.get(matricula);
        if (e != null) {
            e.setCalificacion(nuevaNota);
        }
    }

    public void mostrarNota(int matricula) {
        Estudiante e = estudiantes.get(matricula);
        if (e != null) {
            System.out.println("Nota de " + e.getNombreCompleto() + ": " + e.getCalificacion());
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}

