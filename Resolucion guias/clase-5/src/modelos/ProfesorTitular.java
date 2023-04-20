package modelos;

public class ProfesorTitular extends Profesor {
    public ProfesorTitular(String nombre, int edad) {
        super(nombre, edad);
    }

    public String toString() {
        return "ProfesorTitular{" + super.toString() + "} ";
    }
}
