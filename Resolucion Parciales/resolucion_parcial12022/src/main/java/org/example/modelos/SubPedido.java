package org.example.modelos;

public class SubPedido {
    private Plato plato;
    private int cantidad;

    public SubPedido(Plato plato, int cantidad) {
        this.plato = plato;
        this.cantidad = cantidad;
    }

    public Plato getPlato() {
        return plato;
    }

    public int getCantidad() {
        return cantidad;
    }
}
