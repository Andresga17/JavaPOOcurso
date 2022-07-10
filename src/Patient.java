public class Patient extends User {
    //Atributos de la clase Patient

    private String birthday;
    private double weight;
    private double height;
    private String typeBlood;

    //Declarando el metodo constructor. name y email son los datos minimos necesarios para crear una instancia de esta clase

    Patient (String name, String email){
        super.(name,email);
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



}
