package org.example.modelos;

import java.util.ArrayList;
import java.util.List;

public class Local {

    private int id;
    List<Plato> platos = new ArrayList();
    List<MedioDePago> mediosDePago = new ArrayList();

    List<Pedido> pedidos = new ArrayList();

    public Local(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Agregar un medio de pago nuevo
    public String agregarMedioDePago(String nombre, double recargo) {
        MedioDePago medioNuevo = new MedioDePago(nombre,recargo);
        for (MedioDePago medio : mediosDePago) {
            if (medio.getNombre().equals(medioNuevo.getNombre())) {
                return "El medio de pago ya existe";
            }
        }

        mediosDePago.add(medioNuevo);
        return "El medio de pago ha sido agregado con exito";
    }

    //    Agregar un plato nuevo
    public String agregarPlato(String nombre, double precio) {
        Plato platoNuevo = new Plato(nombre, precio);
        for (Plato plato : platos) {
            if (plato.getNombre().equals(platoNuevo.getNombre())) {
                return "El plato ya existe";
            }
        }

        platos.add(platoNuevo);
        return "El plato ha sido agregado con exito";
    }

    public String toString() {
        String text = "";
        text = text + "Local id = " + this.getId() + "\n";
        text = text + "Medios de pago = " + this.mostrarMediosDePago() + "\n";
        text = text + "Platos =  " + this.mostrarPlatos() + "\n";
        text = text + "Pedidos =  " + this.mostrarPedidos() + "\n";
        return text;
    }

    public String mostrarPlatos() {
        String text = "";

        for(Plato plato: platos) {
            text = text + plato.toString();
        }

        return text;
    }
    public String mostrarMediosDePago() {
        String text = "";

        for(MedioDePago medio: mediosDePago) {
            text = text + medio.toString();
        }

        return text;
    }

    public String mostrarPedidos() {
        String text = "";

        for(Pedido pedido : pedidos) {
            text = text + pedido.toString();
        }
        return text;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void agregarPedido(Pedido nuevoPedido) {
        double recargo = 0;

        for(MedioDePago medio: mediosDePago) {
            if(medio.getNombre().equals(nuevoPedido.getMedioDePago())) {
                recargo = medio.getRecargo();
            }
        }
        nuevoPedido.setTotal(nuevoPedido.getSubTotal() + (nuevoPedido.getSubTotal() * recargo));

        this.pedidos.add(nuevoPedido);
    }

    public String entregarPedido(int idUsuario) {
        for(Pedido pedido: pedidos) {
            if(idUsuario == pedido.getIdUsuario() && pedido.isEntregado() == false) {
                pedido.setEntregado(true);
                return "Pedido entregado con exito";
            }
        }
        return "No se ha podido entregar el pedido";
    }

    public List<MedioDePago> getMediosDePago() {
        return mediosDePago;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
