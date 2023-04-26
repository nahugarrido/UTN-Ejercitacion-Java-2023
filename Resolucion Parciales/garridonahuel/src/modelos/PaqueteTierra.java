package modelos;

import enums.TipoVehiculos;

import java.util.Objects;

public class PaqueteTierra extends Paquete {
    private double distanciaEnvio;
    private TipoVehiculos tipoVehiculo;

    public PaqueteTierra(int id, double peso, String destino, boolean seguroEnvios, boolean entregaMismoDia, double distanciaEnvio, TipoVehiculos tipoVehiculo) {
        super(id, peso, destino, seguroEnvios, entregaMismoDia);
        this.distanciaEnvio = distanciaEnvio;
        this.tipoVehiculo = tipoVehiculo;
        super.tarifaEnvio = this.calcularTarifaEnvio();
        super.costosAdicionales = this.calcularCostoAdicional();
        super.total = this.calcularTotalPaquete();
    }


    @Override
    public double calcularTarifaEnvio() {
        double distanciaExtra = 0;
        double recargoTipoVehiculo = 0;
        double recargoDistanciaExtra = 0;
        double subtotal = this.getPeso() * 25;

        /// calculos los subtotales
        if (TipoVehiculos.CAMION == this.getTipoVehiculo()) {
            recargoTipoVehiculo = subtotal * 0.1;
        }

        if (this.getDistanciaEnvio() > 100) {
            distanciaExtra = getDistanciaEnvio() - 100;
            recargoDistanciaExtra = distanciaExtra * 0.05 * subtotal;

        }

        /// calculo el total de la tarifa
        subtotal += recargoTipoVehiculo + recargoDistanciaExtra;

        return subtotal;
    }

    @Override
    public double calcularCostoAdicional() {
        double costoAdicional = 0;

        if (this.isSeguroEnvios()) {
            costoAdicional += 1500;
        }

        if (this.isEntregaMismoDia()) {
            costoAdicional += this.getTarifaEnvio() * 0.25;
        }
        return costoAdicional;
    }

    @Override
    public double calcularTotalPaquete() {
        double total = this.getTarifaEnvio() + this.getCostosAdicionales();

        return total;
    }

    @Override
    public String toString() {
        return "PaqueteTierra{" + super.toString() +
                " distanciaEnvio=" + distanciaEnvio +
                ", tipoVehiculo=" + tipoVehiculo +
                '}';
    }

    /// agrego un atributo propio de la clase PaqueteTierra para que el equals no tenga la misma logica de Paquete
    @Override
    public boolean equals(Object aComparar) {
        if (aComparar != null && aComparar instanceof PaqueteTierra) {
            return this.getId() == ((Paquete) aComparar).getId() && this.getDistanciaEnvio() == ((PaqueteTierra) aComparar).getDistanciaEnvio();
        } else {
            return false;
        }
    }

    public double getDistanciaEnvio() {
        return distanciaEnvio;
    }

    public TipoVehiculos getTipoVehiculo() {
        return tipoVehiculo;
    }
}
