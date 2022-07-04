public class Main {
    public static void main(String[] args) {
        //Utilizado el objeto (METODO CONSTRUCTOR)
        //El metodo constructor nunca retorna un valor
        Doctor myDoctor = new Doctor("Andres Gonzalez");
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
    }
}