package org.example.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// ahora mismo la fecha aparece de la forma: fecha=2023-04-04T21:26:32.777517600 este formato es correcto o deberia transformarlo?
public class Factura {
    private UUID id = UUID.randomUUID();
    private List<ItemVenta> ventas = new ArrayList();
    private double montoTotal;
    private Cliente cliente;
    private LocalDateTime fecha = LocalDateTime.now();

    public Factura(Cliente cliente) {
        calcularMontoTotal();
        this.cliente = cliente;
    }

    public void agregarItem(ItemVenta item) {
        ventas.add(item);
    }

    public void calcularMontoTotal() {
        double acumulador = 0;
        for(ItemVenta item : ventas) {
            acumulador += item.getPrecioUnitario();
        }

        this.setMontoTotal(acumulador);
    }


    public double calcularMontoFinal() {
        return this.getMontoTotal() - (this.getMontoTotal() * this.getCliente().getDescuento());
    }

    public String detalleFactura() {
        return "Factura[id=" + this.getId() + ", fecha=" + this.getFecha() + ", monto=" + this.getMontoTotal() + ", montoDesc=" + this.calcularMontoFinal() + ", "+ this.getCliente().detalleCliente() + "]";
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

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
}
