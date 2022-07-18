package model;
import java.util.Date;
import java.util.ArrayList;

public class Patient extends User {
    //Atributos de la clase model.Patient

    private String birthday;
    private double weight;
    private double height;
    private String typeBlood;
    //Atributos de tipo ArrayList para almacenar las citas del paciente, sean de tipo Doctor o Nurse
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();
    //Creando getters y setters de estos dos Array
    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    //Declarando el metodo constructor. name y email son los datos minimos necesarios para crear una instancia de esta clase

    public Patient (String name, String email){ //Este es el metodo constructor de la clase model.User
        super(name, email);
    }
    //Creando un metodo get y set
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + "kg.";
    }

    public String getHeight() {
        return height + "m";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() { //Aplicando el polimorfismo
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nType blood: " + typeBlood;
    }

    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}
