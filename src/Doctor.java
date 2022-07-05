public class Doctor {
    //Atributos de la clase Doctor
    static int id = 0;//Siempre será autoincrementado
    String name;
    String speciality;

    //Declarando el metodo constructor dentro de la clase
    //se puede realizar un accion al llamar el metodo; como se muestra aqui.
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String speciality){//Sobrecarga de metodos. Agregando los argumentos minimos necesarios al metodo constructor para crear un objeto tipo Doctor
        id++;
        System.out.println("El nombre del doctor asignado es: " + name);
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
}
