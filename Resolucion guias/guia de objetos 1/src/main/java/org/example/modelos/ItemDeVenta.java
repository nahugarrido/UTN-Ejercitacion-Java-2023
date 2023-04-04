package org.example.modelos;

public class ItemDeVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private double precio;

    public ItemDeVenta(int id, String descripcion, int cantidad, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double calcularPrecioTotal() {
        return this.getCantidad() * this.getPrecio();
    }

    public String mostrarItem() {
        return "ItemVenta[id: " + this.getId() + ", descripcion: " + this.getDescripcion() + ", cantidad: " + this.getCantidad() + ", pUnitario: " + this.getPrecio()+", pTotal:" + this.calcularPrecioTotal() + "]";
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}
