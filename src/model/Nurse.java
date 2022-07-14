package model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email) { //Metodo constructo de la clase Nurse
        super(name, email);
    }

    public String getSpeciality () {
        return speciality;
    }

    public void setSpeciality (String speciality) {
        this.speciality = speciality;
    }
}
