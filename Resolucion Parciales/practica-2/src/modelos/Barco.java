package modelos;

public abstract class Barco {
    private int id;
    private String marca;
    private String modelo;
    private double capacidadCombustible;
    private double capacidadCarga;
    private String patente;

    public Barco(int id, String marca, String modelo, double capacidadCombustible, double capacidadCarga, String patente) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCombustible = capacidadCombustible;
        this.capacidadCarga = capacidadCarga;
        this.patente = patente;
    }

    /// metodo abstracto pescar, retorna la cantidad pescada en kg
    public abstract double pescar(double horas);

    @Override
    public String toString() {
        return
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", patente='" + patente + '\'';
    }

    @Override
    public boolean equals(Object object) {
        if(object != null && object instanceof Barco) {
            return this.getId() == ((Barco) object).getId() && this.getPatente() == ((Barco) object).getPatente();
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getPatente() {
        return patente;
    }
}
