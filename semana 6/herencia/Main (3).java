package semana6.herencia;

public class Main {

    public static void main(String[] args) {

        //Estudiante
        // Instancias es comunicarnos con una clase
        Estudiante estudiante1 = new Estudiante("Lucia", 23);
        EstudianteSecundaria estudiante2 = new EstudianteSecundaria("Jose", 24, "Matematicas");
        EstudianteUniversitario estudiante3 = new EstudianteUniversitario("Luis", 25, "Ingenieria", 10);


        estudiante1.estudiar();
        estudiante2.estudiar();
        estudiante3.estudiar();


    }

}
