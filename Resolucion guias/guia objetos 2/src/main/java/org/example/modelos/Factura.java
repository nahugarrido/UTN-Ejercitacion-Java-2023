package org.example.modelos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID id = UUID.randomUUID();
    private double montoTotal;
    private Cliente cliente;
    private LocalDateTime fecha = LocalDateTime.now();

    public Factura(double montoTotal, Cliente cliente) {
        this.montoTotal = montoTotal;
        this.cliente = cliente;
    }

    public double calcularMontoFinal() {
        return this.getMontoTotal() - (this.getMontoTotal() * this.getCliente().getDescuento());
    }

    public String detalleFactura() {
        return "Factura[id=" + this.getId() + ", fecha=" + this.getFecha() + ", monto=" + this.getMontoTotal() + ", montoDesc=" + this.calcularMontoFinal() + this.getCliente().detalleCliente() + "]";
    }

    public UUID getId() {
        return id;
    }


    public double getMontoTotal() {
        return montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}
