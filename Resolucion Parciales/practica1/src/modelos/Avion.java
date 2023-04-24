package modelos;

public class Avion {
    private String modelo;
    private String marca;
    private double capacidadCombustible;
    private String tipoMotor;
    private int cantidadAsientos;
    private boolean isPrivado;

    public Avion(String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, boolean isPrivado) {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
        this.isPrivado = isPrivado;
    }

    public String despegar() {
        return "El avion" + this.get
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public boolean isPrivado() {
        return isPrivado;
    }
}
