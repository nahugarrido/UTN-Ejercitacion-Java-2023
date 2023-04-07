package org.example.modelos;

public class DVD extends Elemento {
    private String director;

    public DVD(String titulo, String duracion, String comentario, String director) {
        super(titulo, duracion, comentario);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String imprimir() {
        return "DVD: " + this.getTitulo() + ", director: " + this.getDirector() + ", comentario: " + this.getComentario() + ", loTengo: " + this.isLoTengo();
    }
}
