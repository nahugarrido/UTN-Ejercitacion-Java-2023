package modelos;

public class ProfesorInterino extends Profesor{

    public ProfesorInterino(String nombre, int edad) {
        super(nombre, edad);
    }

    public String toString() {
        return "ProfesorInterino{" + super.toString() + "} ";
    }
}
