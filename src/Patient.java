public class Patient {
    //Atributos de la clase Patient
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    String typeBlood;

    //Declarando el metodo constructor. name y email son los datos minimos necesarios para crear una instancia de esta clase

    Patient (String name, String email){
        this.name = name;
        this.email = email;
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

    public String getPhoneNumber() {
        return "Teléfono: " + phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El número telefónico debe ser de máximo 8 dígitos");
        }else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }

    }
}
