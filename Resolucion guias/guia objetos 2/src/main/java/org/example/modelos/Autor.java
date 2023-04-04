package org.example.modelos;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero) {
        if(genero == 'M' || genero == 'F' ) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.genero = genero;
        } else {
            throw  new IllegalArgumentException("Genero no valido");
        }

    }

    public String mostrarAutor() {
        return "Autor: " + this.getNombre() + " " + this.getApellido() + ", " + this.getEmail() + ", " + this.getGenero();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }
}