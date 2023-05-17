package modelos;

import java.util.Objects;

public class Contacto {
    private int numeroTelefono;
    private String direccion;
    private String apodo;

    public Contacto(){

    }

    public Contacto(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.apodo = null;
        this.direccion = null;
    }

    public Contacto(int numeroTelefono, String direccion) {
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.apodo = null;

    }

    public Contacto(int numeroTelefono, String direccion, String apodo) {
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.apodo = apodo;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getApodo() {
        return apodo;
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof Contacto) {
            return this.getApodo().equals(((Contacto) aComparar).getApodo()) && this.getDireccion().equals(((Contacto) aComparar).getDireccion()) && this.getNumeroTelefono() == ((Contacto) aComparar).getNumeroTelefono();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if(this instanceof  Contacto) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return
                "numeroTelefono=" + numeroTelefono +
                ", direccion='" + direccion + '\'' +
                ", apodo='" + apodo + '\'';
    }
}
