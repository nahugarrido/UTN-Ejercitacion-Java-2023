package org.example.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {
    private int id;
    List<SubPedido> carrito = new ArrayList();

    public Usuario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void agregarAlCarrito(Local local, String nombrePlato, int cantidad) {
        for (Plato plato : local.getPlatos()) {
            if (plato.getNombre().equals(nombrePlato)) {
                carrito.add(new SubPedido(plato, cantidad));
                break;
            }
        }
    }

    public Pedido generarCompra(String medioDePago, String direccion) {
        Pedido nuevoPedido = new Pedido(this.getId(),medioDePago, direccion);

        for (SubPedido item : carrito) {
            nuevoPedido.agregarSubPedido(item);
        }

        nuevoPedido.calcularSubTotal();


        /// limpio la lista del usuario
        this.carrito.clear();

        return nuevoPedido;
    }


}
