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
        this.weight = 54.5;
        System.out.println(weight + "kg");
    }
}
