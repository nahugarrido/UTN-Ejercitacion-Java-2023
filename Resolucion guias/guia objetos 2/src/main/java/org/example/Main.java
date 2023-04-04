package org.example;

import org.example.modelos.Autor;
import org.example.modelos.Cliente;
import org.example.modelos.Factura;
import org.example.modelos.Libro;

public class Main {
    public static void main(String[] args) {
        //punto1();
        punto2();
    }

    public static void punto1() {
        System.out.println("\nPunto 1:\n");
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(autor.mostrarAutor());

        Libro libro = new Libro("Effective Java", 450,150);

        System.out.println(libro.mostrarLibro());
        libro.aumentarCopias(50);
        libro.setPrecio(500);
        System.out.println(libro.mostrarLibro());
        libro.agregarAutor(autor);
        libro.agregarAutor(autor);
        libro.agregarAutor(autor);
        System.out.println(libro.textoPedido());
    }

    public static void punto2() {
        Cliente cliente = new Cliente("John", "john@email.com", 0.20);
        System.out.println(cliente.detalleCliente());

        Factura factura = new Factura()
    }
}