public class Doctor {
    //Atributos de la clase Doctor
    int id;
    String name;
    String speciality;

    //Declarando el metodo constructor dentro de la clase
    //se puede realizar un accion al llamar el metodo; como se muestra aqui.
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    //Comportamientos o metodos de la clase Doctor
    //Este metodo imprime el nombre del doctor
    public void showName(){
        System.out.println(name);
    }
}
