package org.example;

import org.example.modelos.Local;
import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {

        /// inicializo locales
        Local local1 = new Local(1);
        Local local2 = new Local(2);
        Local local3 = new Local(3);

        /// Agrego los platos a los locales
        local1.agregarPlato("Jamon Serrano", 100);
        local1.agregarPlato("Jamon Iberico", 500);
        local1.agregarPlato("Jamon Argentino", 250);

        /// Agrego medios de pago a los locales
        local1.agregarMedioDePago("Contado", 0.00);
        local1.agregarMedioDePago("Uala", 0.03);
        local1.agregarMedioDePago("Mercado Pago", 0.12);

        /// Inicializo usuarios pruebas
        Usuario usuario1 = new Usuario(1);
        Usuario usuario2 = new Usuario(2);

        /// Agrego items a sus carritos
        usuario1.agregarAlCarrito(local1, "Jamon Serrano", 3);
        usuario1.agregarAlCarrito(local1, "Jamon Iberico", 1);
        usuario1.agregarAlCarrito(local1, "Jamon Argentino", 1);

        usuario2.agregarAlCarrito(local1, "Jamon Serrano", 1);
        usuario2.agregarAlCarrito(local1, "Jamon Argentino", 3);
        /// Agrego producto que no existe
        usuario2.agregarAlCarrito(local1, "Telettubie rojo", 1);


        /// Testeo entrega Take Away
        local1.agregarPedido(usuario2.generarCompra("Uala", "Take Away"));
        /// Testeo entrega con envio a domicilio
        local1.agregarPedido(usuario1.generarCompra("Mercado Pago", "Spreenfield 1234"));

        /// Testeando limpiar carrito
        usuario1.agregarAlCarrito(local1,"Jamon Serrano",2);
        local1.agregarPedido(usuario1.generarCompra("Contado", "Take Away"));


        System.out.println(local1.toString());

        local1.entregarPedido(1);

        System.out.println(local1.toString());


    }
}