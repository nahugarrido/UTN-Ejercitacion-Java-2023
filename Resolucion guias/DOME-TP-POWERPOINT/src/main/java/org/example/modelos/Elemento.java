package org.example.modelos;

import java.util.UUID;

public abstract class Elemento {
    private UUID id;
    private String titulo;
    private String duracion;
    private boolean loTengo;
    private String comentario;

    public Elemento(String titulo, String duracion, String comentario) {
        this.id = id = UUID.randomUUID();
        this.titulo = titulo;
        this.duracion = duracion;
        this.loTengo = true;
        this.comentario = comentario;
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public boolean isLoTengo() {
        return loTengo;
    }

    public void setLoTengo(boolean loTengo) {
        this.loTengo = loTengo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public abstract String imprimir();
}
