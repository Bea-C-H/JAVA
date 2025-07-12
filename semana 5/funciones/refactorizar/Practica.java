package semana5.funciones.refactorizar;

/*
- Instrucciones para los alumnos:
- Renombra la clase y variables con nombres significativos.
- Extrae un metodo llamado mostrarDatos().
- Haz que ese metodo reciba nombre y edad como parámetros.
*/

public class Practica {

/*    public static void main(String[] args) {
        String n = "Ana";
        int e = 23;
        System.out.println("Nombre: " + n);
        System.out.println("Edad: " + e);
        System.out.println("Hola " + n + ", tienes " + e + " años.");
    }*/

    public static void main(String[] args) {
        // Llamamos al método de la clase Usuarios
        Usuarios.mostrarDatos("Ana", 23);
        Usuarios.mostrarDatos("Carlos", 30);
    }
}
