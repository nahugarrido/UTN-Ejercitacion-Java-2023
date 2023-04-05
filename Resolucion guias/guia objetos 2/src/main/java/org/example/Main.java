package org.example;

import org.example.modelos.*;

public class Main {
    public static void main(String[] args) {
        //punto1();
        punto2();
        //punto3();
    }

    public static void punto1() {
        System.out.println("\nPunto 1:\n");
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(autor.mostrarAutor());

        Libro libro = new Libro("Effective Java", 450, 150);

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
        System.out.println("\nPunto 2:\n");
        Cliente cliente = new Cliente("John", "john@email.com", 0.20);
        System.out.println(cliente.detalleCliente());

        Factura factura = new Factura(cliente);
        System.out.println(factura.detalleFactura());

        ItemVenta item1 = new ItemVenta("vehiculo", "auto rojo", 100);
        ItemVenta item2 = new ItemVenta("vehiculo2", "auto azul", 350);

        factura.agregarItem(item1);
        factura.agregarItem(item2);
        factura.calcularMontoTotal();
        System.out.println(factura.detalleFactura());
    }

    public static void punto3() {
        Cliente cliente = new Cliente("John", "john@email.com", 0.20);
        System.out.println(cliente.detalleCliente());

        Cuenta cuenta = new Cuenta(10000, cliente);
        System.out.println(cuenta.detalleCuenta());
        System.out.println(cuenta.extraer(500));
        System.out.println(cuenta.depositar(3000));

        CuentaDeudora cuenta2 = new CuentaDeudora(10000, cliente);
        System.out.println(cuenta2.extraer(12000));

    }
}