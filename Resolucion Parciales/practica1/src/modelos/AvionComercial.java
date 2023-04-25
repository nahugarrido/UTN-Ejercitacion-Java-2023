package modelos;

import interfaces.IServicios;

import java.util.ArrayList;
import java.util.List;

public class AvionComercial extends Avion implements IServicios {
    private int cantidadAzafatas;
    private List<String> servicios = new ArrayList();

    public AvionComercial(String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, boolean isPrivado, int cantidadAzafatas) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos, isPrivado);
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = new ArrayList();
    }

    public String agregarServicio(String servicio) {
        servicios.add(servicio);
        return "Servicio agregado con exito";
    }

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }

    public List<String> getServicios() {
        return servicios;
    }

    @Override
    public String servirComida() {
        return "Se reparte comida en clase turista";
    }

    @Override
    public String darMantas() {
        return "Se dan mantas de poliester";
    }
}
