package modelos;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Comparable<Persona>, Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona aComparar) {
        return this.getNombre().compareTo(aComparar.getNombre());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object aComparar) {
        if (aComparar != null && aComparar instanceof Persona) {
            return this.edad == ((Persona) aComparar).edad && this.getNombre().equals(((Persona) aComparar).getNombre());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}
