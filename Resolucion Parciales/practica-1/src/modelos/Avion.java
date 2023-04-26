package modelos;

import java.util.Objects;

public class Avion {
    private int id;
    private String modelo;
    private String marca;
    private double capacidadCombustible;
    private String tipoMotor;
    private int cantidadAsientos;

    public Avion(int id, String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.tipoMotor = tipoMotor;
        this.cantidadAsientos = cantidadAsientos;
    }

    public String despegar() {
        return "El avion con id: " + this.getId() + " ha despegado correctamente";
    }

    public String volar() {
        return "El avion con id: " + this.getId() + " esta volando correctamente";
    }

    public String aterrizar() {
        return "El avion con id: " + this.getId() + " ha aterrizado correctamente";
    }

    @Override
    public boolean equals(Object object) {
        if(object != null && object instanceof Avion) {
            return this.getId() == ((Avion) object).getId();
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", cantidadAsientos=" + cantidadAsientos;
    }

    public int getId() {
        return id;
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
}
