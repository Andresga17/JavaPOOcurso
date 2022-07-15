import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Utilizado el objeto (METODO CONSTRUCTOR)
        //El metodo constructor nunca retorna un valor
        /*model.Doctor myDoctor = new model.Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();


        model.Doctor myDoctorAnn = new model.Doctor();
        myDoctor.showId();*/

        //showMenu();
        //Creando un objeto tipo doctor con los parametros minimos necesarios asignados en el metodo constructor de la clase model.Doctor
        Doctor myDoctor = new Doctor("Andres Gonzalez", "yomero@gmail.com");
        myDoctor.addAvailableAppointment(new Date(),"4:00 p.m"); //Añadiendo nuevas citas a este doctor
        myDoctor.addAvailableAppointment(new Date(),"10:00 a.m");//Esto NO es una instancias de AvailableAppointment porque esta es una clase anidada estatica
        myDoctor.addAvailableAppointment(new Date(),"1:00 p.m");

        System.out.println(myDoctor);

        User user = new Doctor("Andres Gonzalez", "yomero@gmail.com");
        user.showDataUser();

        User userPa = new Patient("Homero Jimeno", "Douh@gmail.com");
        userPa.showDataUser();
        //Instanciando una Clase abstracta a partir de un metodo anonimo
        User user1 = new User("Cosme Fulanito", "unfulano@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departmaento: Geriatria");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        /*for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        System.out.println("Nombre del doctor: " + myDoctor.getName());
        System.out.println("email: " + myDoctor.getSpeciality());

        System.out.println();

//Creando un objeto de tipo patient
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

//Usando get y set para asignar y validar las variables de la clase patient
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
        System.out.println(patient);*/
    }

}