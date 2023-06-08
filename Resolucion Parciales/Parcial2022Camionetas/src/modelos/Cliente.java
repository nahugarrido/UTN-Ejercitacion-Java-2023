package modelos;

public class Cliente {
    private String nombre;
    private String dni;
    private boolean tieneCarnet;

    public Cliente(String nombre, String dni, boolean tieneCarnet) {
        this.nombre = nombre;
        this.dni = dni;
        this.tieneCarnet = tieneCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public boolean isTieneCarnet() {
        return tieneCarnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTieneCarnet(boolean tieneCarnet) {
        this.tieneCarnet = tieneCarnet;
    }
}
