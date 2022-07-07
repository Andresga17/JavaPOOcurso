import java.util.ArrayList;
import java.util.Date;
public class Doctor {
    //Atributos de la clase Doctor
    static int id = 0;//Siempre será autoincrementado
    private String name;
    private String email;
    private String speciality;

    //Declarando el metodo constructor dentro de la clase
    //se puede realizar un accion al llamar el metodo; como se muestra aqui.
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String speciality){//Sobrecarga de metodos. Agregando los argumentos minimos necesarios al metodo constructor para crear un objeto tipo Doctor
        id++;
        /*System.out.println("El nombre del doctor asignado es: " + name);*/
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos o metodos de la clase Doctor
    //Este metodo imprime el nombre del doctor
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);//metodo que imprime el id de cada doctor
    }
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();//Declarando un objeto de tipo ArrayList
    public void addAvailableAppointment(Date date, String time){//Metodo que asigna las nuevas citas a un array list
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() { //Devuelve la lista completa de las citas
        return availableAppointments;
    }

    //Definiendo set y get de name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Definiendo set y get de speciality
    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    //Clase anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        //Metodo constructor
        public AvailableAppointment(Date date, String time) { //Parametros minimos para que cree una cita disponible
            this.date = date;
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
        public Date getDate() {
            return date;
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

    }

}
