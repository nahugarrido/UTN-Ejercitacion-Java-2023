package modelos;

import interfaces.IServicios;

public class AvionPrivado extends Avion implements IServicios {
    private boolean tieneJacuzzi;

    private String claveWifi;

    public AvionPrivado(String modelo, String marca, double capacidadCombustible, String tipoMotor, int cantidadAsientos, boolean isPrivado, boolean tieneJacuzzi, String claveWifi) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos, isPrivado);
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
    }

    @Override
    public String servirComida() {
        return "Se sirve comida lujosa traida de Madagascar";
    }

    @Override
    public String darMantas() {
        return "Se dan mantas lujosas a los pasajeros";
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }
}
