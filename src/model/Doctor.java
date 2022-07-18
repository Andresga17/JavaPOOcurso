package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Doctor extends User {
    //Atributos de la clase model.Doctor

    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();//Declarando un objeto de tipo ArrayList

    //Declarando el metodo constructor dentro de la clase
    //se puede realizar una accion al llamar el metodo; como se muestra aqui.
    /*model.Doctor(){
        System.out.println("Construyendo el objeto model.Doctor");
    }*/

    public Doctor(String name, String email){//Sobrecarga de metodos. Agregando los argumentos minimos necesarios al metodo constructor para crear un objeto tipo model.Doctor
        /*System.out.println("El nombre del doctor asignado es: " + name);*/
        super(name, email);
        this.speciality = speciality; //Esta linea se puede borrar o generar un error!!!
    }

    //Comportamientos o metodos de la clase model.Doctor
    //Este metodo imprime el nombre del doctor
    public void showName(){
        System.out.println(getName());
    }

    public void showId(){
        System.out.println("ID model.Doctor: " + getId());//metodo que imprime el id de cada doctor
    }

    public void addAvailableAppointment(String date, String time){//Metodo que asigna las nuevas citas a un array list
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() { //Array que devuelve la lista completa de las citas
        return availableAppointments;
    }

    //Definiendo set y get de speciality
    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() { //Sobreescribiendo toString
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz roja");
        System.out.println("Departamento: Oncologia");
    }

    //Clase anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        //Instancia de la clase SimpleDateFormat que crea un formato para trbajar con fechas
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        //Metodo constructor
        public AvailableAppointment(String date, String time) { //Parametros minimos para que cree una cita disponible
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }
        //get y set de id
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        //get y set de Date
        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }
        //get y set de time
        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String toString() { //Sobreescribiendo toString (Este metodo no lleva el super porque tiene acceso a los atributos y metodos de la clase externa la cual ya está heredando de model.User)
            return "Available Appointment \nDate: " + date + "\nTime: " + time;
        }

    }

}
