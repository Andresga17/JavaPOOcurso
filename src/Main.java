import java.util.Date;

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
        myDoctor.addAvailableAppointment(new Date(),"4:00 p.m"); //Añadiendo nuevas citas a este doctor
        myDoctor.addAvailableAppointment(new Date(),"10:00 a.m");
        myDoctor.addAvailableAppointment(new Date(),"1:00 p.m");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        System.out.println("Nombre del doctor: " + myDoctor.getName());
        System.out.println("email: " + myDoctor.getSpeciality());

        System.out.println();

//Creando un objeto de tipo patient
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

//Usando get y set para asignar y validar las variables
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
    }

}