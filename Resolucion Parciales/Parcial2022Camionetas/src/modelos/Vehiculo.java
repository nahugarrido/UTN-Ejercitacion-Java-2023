package modelos;

import enums.TipoVehiculo;

import java.time.LocalDate;

public class Vehiculo {
    private int id;
    private String modelo;
    private double kilometraje;
    private String anio;
    private String codigoInterno;
    private double tarifaFijaDia;

    private TipoVehiculo tipoVehiculo;

    public Vehiculo(int id, String modelo, double kilometraje, String anio, String codigoInterno, double tarifaFijaDia, TipoVehiculo tipoVehiculo) {
        this.id = id;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.codigoInterno = codigoInterno;
        this.tarifaFijaDia = tarifaFijaDia;
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getAnio() {
        return anio;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public double getTarifaFijaDia() {
        return tarifaFijaDia;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setTarifaFijaDia(double tarifaFijaDia) {
        this.tarifaFijaDia = tarifaFijaDia;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}
