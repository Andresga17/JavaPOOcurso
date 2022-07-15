package model;

public class Patient extends User {
    //Atributos de la clase model.Patient

    private String birthday;
    private double weight;
    private double height;
    private String typeBlood;

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
