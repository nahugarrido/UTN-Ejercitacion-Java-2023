package modelos;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(String nombre, String telefono, String direccion) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

