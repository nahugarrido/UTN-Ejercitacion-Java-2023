package modelos;

import enums.TipoEnvio;
import enums.TipoVehiculos;

import java.util.Objects;

public class PaqueteAire extends Paquete {
    private String aerolinea;
    private TipoEnvio tipoEnvio;

    public PaqueteAire(int id, double peso, String destino, boolean seguroEnvios, boolean entregaMismoDia, String aerolinea, TipoEnvio tipoEnvio) {
        super(id, peso, destino, seguroEnvios, entregaMismoDia);
        this.aerolinea = aerolinea;
        this.tipoEnvio = tipoEnvio;
        super.tarifaEnvio = this.calcularTarifaEnvio();
        super.costosAdicionales = this.calcularCostoAdicional();
        super.total = this.calcularTotalPaquete();
    }

    @Override
    public boolean equals(Object aComparar) {
        if(aComparar != null && aComparar instanceof PaqueteAire) {
            return this.getId() == ((PaqueteAire) aComparar).getId() && this.getAerolinea().equals(((PaqueteAire) aComparar).getAerolinea());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "PaqueteAire{" + super.toString() +
                " aerolinea='" + aerolinea + '\'' +
                ", tipoEnvio=" + tipoEnvio +
                '}';
    }

    @Override
    public double calcularTarifaEnvio() {
        double recargoEnvio = 0;
        double recargoAerolinea = 0;
        double subtotal = this.getPeso() * 30;

        /// calculos los subtotales
        if (this.getAerolinea().equals("AA")) {
            recargoAerolinea = subtotal * 0.5;
        }

        if (this.getTipoEnvio() == TipoEnvio.EXPRESS) {
            recargoEnvio = 1000;

        }

        /// calculo el total de la tarifa
        subtotal += recargoEnvio + recargoAerolinea;

        return subtotal;
    }

    @Override
    public double calcularCostoAdicional() {
        double costoAdicional = 0;

        if (this.isSeguroEnvios()) {
            costoAdicional += 2500;
        }

        if (this.isEntregaMismoDia()) {
            costoAdicional += this.getTarifaEnvio() * 0.5;
        }
        return costoAdicional;
    }

    @Override
    public double calcularTotalPaquete() {
        double total = this.getTarifaEnvio() + this.getCostosAdicionales();
        return total;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

}
