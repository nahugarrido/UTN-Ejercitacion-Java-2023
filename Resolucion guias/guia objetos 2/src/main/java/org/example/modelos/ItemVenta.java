package org.example.modelos;

import java.util.UUID;

public class ItemVenta {
    private UUID id = UUID.randomUUID();
    private String nombre;
    private String descripcion;
    private double precioUnitario;

    public ItemVenta(String nombre, String descripcion, double precioUnitario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
