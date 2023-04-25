package modelos;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private String direccion;
    private int cantidadOperativa;
    private List<Hangar> hangares;

    public Aeropuerto(String nombre, String codigoInternacional, String direccion, int cantidadOperativa) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.cantidadOperativa = cantidadOperativa;
        this.hangares = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoInternacional() {
        return codigoInternacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantidadOperativa() {
        return cantidadOperativa;
    }

    public List<Hangar> getHangares() {
        return hangares;
    }
}
