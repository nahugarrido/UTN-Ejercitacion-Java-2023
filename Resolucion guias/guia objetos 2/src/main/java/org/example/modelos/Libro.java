package org.example.modelos;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private List<Autor> autores = new ArrayList();

    public Libro(String titulo, double precio, int stock) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }

    public String mostrarLibro() {
        return "MOSTRAR LIBRO--------------------------\nTitulo: " + this.getTitulo() + "\nAutores: " + this.mostrarAutores() + "\nPrecio: " + this.getPrecio() + "\nStock: " + this.getStock();
    }

    public String textoPedido() {
        return "El libro, " + this.getTitulo() + " de " + this.mostrarAutores() + ". Se vende a $" + this.getPrecio() + " pesos.";
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public String mostrarAutores() {
        String text = "";
        for (Autor autor : autores) {
            text = text + autor.getNombre() + " " + autor.getApellido() + ", ";
        }

        text = text.substring(0, text.length() -2);

        return text;
    }

    public void aumentarCopias(int cantidad) {
        this.setStock(this.getStock() + cantidad);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public List<Autor> getAutor() {
        return this.autores;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
