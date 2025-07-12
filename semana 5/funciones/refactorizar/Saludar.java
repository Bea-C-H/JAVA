package semana5.funciones.refactorizar;

public class Saludar {

    // Eliminar código duplicado


/*    public void mostrarSaludoJuan() {
        System.out.println("Hola, Juan");
    }

    public void mostrarSaludoMaria() {
        System.out.println("Hola, María");
    }*/

    public void mostrarSaludo(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static void main(String[] args) {
   /*     Saludar saludar1 = new Saludar();
        saludar1.mostrarSaludoJuan();
        saludar1.mostrarSaludoMaria();*/

        Saludar saludar = new Saludar();
        saludar.mostrarSaludo("Juan");
        saludar.mostrarSaludo("Maria");

    }
}
