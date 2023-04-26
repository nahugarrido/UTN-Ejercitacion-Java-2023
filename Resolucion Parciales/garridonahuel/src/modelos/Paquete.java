package modelos;

import interfaces.GestionarCostos;

public abstract class Paquete implements GestionarCostos {
    private int id;
    private double peso;
    private String destino;
    private boolean estaEnviado;

    private boolean seguroEnvios;
    private boolean entregaMismoDia;
    private boolean almacenamiento;
    private boolean recoleccion;
    private boolean seguimiento;
    protected double tarifaEnvio;
    protected double costosAdicionales;
    protected double total;

    public Paquete(int id, double peso, String destino, boolean seguroEnvios, boolean entregaMismoDia) {
        this.id = id;
        this.peso = peso;
        this.destino = destino;
        this.estaEnviado = false;
        this.seguroEnvios = seguroEnvios;
        this.entregaMismoDia = entregaMismoDia;
        this.tarifaEnvio = 0;
        this.costosAdicionales = 0;
        this.total = 0;
    }

    /// constructor vacio
    public Paquete() {

    }

    @Override
    public boolean equals(Object aComparar) {
        if (aComparar != null && aComparar instanceof Paquete) {
            return this.getId() == ((Paquete) aComparar).getId();
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", peso=" + peso +
                ", destino='" + destino + '\'' +
                ", estaEnviado=" + estaEnviado +
                ", seguroEnvios=" + seguroEnvios +
                ", entregaMismoDia=" + entregaMismoDia +
                ", tarifaEnvio=" + tarifaEnvio +
                ", costosAdicionales=" + costosAdicionales +
                ", total=" + total;
    }

    public abstract double calcularTarifaEnvio();
    public abstract double calcularCostoAdicional();
    public abstract double calcularTotalPaquete();

    public int getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public String getDestino() {
        return destino;
    }

    public boolean isEstaEnviado() {
        return estaEnviado;
    }

    public double getTarifaEnvio() {
        return tarifaEnvio;
    }

    public double getCostosAdicionales() {
        return costosAdicionales;
    }

    public double getTotal() {
        return total;
    }

    public boolean isSeguroEnvios() {
        return seguroEnvios;
    }

    public boolean isEntregaMismoDia() {
        return entregaMismoDia;
    }

    public void setEstaEnviado(boolean estaEnviado) {
        this.estaEnviado = estaEnviado;
    }
}
