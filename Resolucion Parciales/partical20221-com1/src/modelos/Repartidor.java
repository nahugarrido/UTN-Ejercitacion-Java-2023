package modelos;

import interfaces.sueldos;

public class Repartidor implements sueldos {

    private double KmRecorridos;

    private double salarioPorKm;

    public Repartidor(double kmRecorridos, double salarioPorKm) {
        this.KmRecorridos = kmRecorridos;
        this.salarioPorKm = salarioPorKm;
    }

    @Override
    public double cobrarSueldo() {
        return this.getKmRecorridos() * this.getSalarioPorKm();
    }

    public double getKmRecorridos() {
        return KmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        KmRecorridos = kmRecorridos;
    }

    public double getSalarioPorKm() {
        return this.salarioPorKm;
    }

    public void setSalarioPorKm(double salarioPorKm) {
        this.salarioPorKm = salarioPorKm;
    }
}
