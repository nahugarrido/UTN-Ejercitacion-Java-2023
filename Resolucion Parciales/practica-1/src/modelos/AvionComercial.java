package modelos;

import interfaces.IServicios;

import java.util.ArrayList;
import java.util.List;

public class AvionComercial extends Avion implements IServicios {
    private int cantidadAzafatas;
    private List<String> servicios;

    public AvionComercial(int id, String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, int cantidadAzafatas) {
        super(id, modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = new ArrayList();
    }

    @Override
    public String servirComida() {
        return null;
    }

    @Override
    public String darMantas() {
        return null;
    }

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }
    
}
