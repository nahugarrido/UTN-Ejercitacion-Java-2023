package org.example.modelos;

import java.util.UUID;

public class Cliente {
    private UUID id = UUID.randomUUID();
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(String nombre, String email, double descuento) {
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public String detalleCliente() {
        return "Cliente[id=" + this.getId() + ", nombre=" + this.getNombre() + ", email=" + this.getEmail() + ", descuento=" + this.getDescuento() + "]";
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public double getDescuento() {
        return descuento;
    }
}
