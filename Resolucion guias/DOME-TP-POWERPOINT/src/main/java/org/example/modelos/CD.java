package org.example.modelos;

public class CD extends Elemento {
    private String interprete;
    private int numeroDeTemas;

    public CD(String titulo, String duracion, String comentario, String interprete, int numeroDeTemas) {
        super(titulo, duracion, comentario);
        this.interprete = interprete;
        this.numeroDeTemas = numeroDeTemas;
    }

    public String getInterprete() {
        return interprete;
    }

    public int getNumeroDeTemas() {
        return numeroDeTemas;
    }

    @Override
    public String imprimir() {
        return "CD: " + ", titulo: " + this.getTitulo() + ", interprete: " + this.getInterprete() + ", numeroDeTemas: " + this.getNumeroDeTemas();
    }
}
