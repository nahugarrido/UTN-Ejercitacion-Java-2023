package org.example.modelos;

public class Rectangulo {
    private double ancho = 1;
    private double alto = 1;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo() {

    }

    public double calcularPerimetro() {
        return (this.getAlto()*2) + (this.getAncho()*2);
    }

    public double calcularArea() {
        return this.getAncho() * this.getAlto();
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
