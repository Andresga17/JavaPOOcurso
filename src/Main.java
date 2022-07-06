import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //Utilizado el objeto (METODO CONSTRUCTOR)
        //El metodo constructor nunca retorna un valor
        /*Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();


        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();*/

        //showMenu();
        //Creando un objeto tipo doctor con los parametros minimos necesarios asignados en el metodo constructor de la clase Doctor
        Doctor myDoctor = new Doctor("Andres Gonzalez", "Neurologia");
        System.out.println("Nombre del doctor: " + myDoctor.name);
        System.out.println("email: " + myDoctor.speciality);

        System.out.println();
//Creando un objeto de tipo patient
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
    }

}