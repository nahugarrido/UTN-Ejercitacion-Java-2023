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
        return "DVD: " + super.getTitulo() + ", director: " + this.getDirector() + ", comentario: " + super.getComentario() + ", loTengo: " + super.isLoTengo();
    }
}
