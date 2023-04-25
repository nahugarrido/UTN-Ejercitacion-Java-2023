package modelos;

public class Avion {
    private String modelo;
    private String marca;
    private double capacidadCombustible;
    private String tipoMotor;
    private int cantidadAsientos;
    private boolean isPrivado;

    private boolean isVolando;

    public Avion(String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, boolean isPrivado) {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
        this.isPrivado = isPrivado;
        this.isVolando = false;
    }

    public String despegar() {
        this.setVolando(true);
        return "El avion marca: " + this.getMarca() + " y modelo: " + this.getModelo() + " ha despegado correctamente";
    }

    public String aterrizar() {
        this.setVolando(false);
        return "El avion marca: " + this.getMarca() + " y modelo: " + this.getModelo() + " ha aterrizado correctamente";
    }

    public String volar() {
        return "Fiummmmm ¡Este avion esta volando!";
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

    public boolean isVolando() {
        return isVolando;
    }

    public void setVolando(boolean volando) {
        isVolando = volando;
    }
}
