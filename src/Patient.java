public class Patient {
    //Atributos de la clase Patient
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String typeBlood;

    //Declarando el metodo constructor. name y email son los datos minimos necesarios para crear una instancia de esta clase

    Patient (String name, String email){
        this.name = name;
        this.email = email;
    }
}
