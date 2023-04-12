package org.example.modelos;

public class MedioDePago {
    private String nombre;
    private double recargo;

    public MedioDePago(String nombre, double recargo) {
        this.nombre = nombre;
        this.recargo = recargo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getRecargo() {
        return recargo;
    }

    public String toString() {
        return "[" + this.getNombre() +", " + this.getRecargo() + "]";
    }
}
