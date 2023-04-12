package org.example.modelos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    /// a falta de una forma de crear un id autoincremental y no pudiendo usar ids randoms
    // la unica forma de relacionar un pedido con un usuario es a traves del id del usuario
    private List<SubPedido> subPedidos = new ArrayList();
    private String medioDePago;
    private double subTotal;
    private String tipoDeEntrega;

    private String direccionEntrega;

    private double Total;
    private int idUsuario;
    private boolean isEntregado;

    public Pedido(int idUsuario, String medioDePago, String direccionEntrega) {
        this.isEntregado = false;
        this.medioDePago = medioDePago;
        this.subTotal = 0;
        this.idUsuario = idUsuario;

        if(direccionEntrega.equals("Take Away")) {
            this.direccionEntrega = "Local";
            this.tipoDeEntrega = "Take Away";
        } else {
            this.direccionEntrega = direccionEntrega;
            this.tipoDeEntrega = "Envio a domicilio";
        }

    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public String getTipoDeEntrega() {
        return tipoDeEntrega;
    }

    public double getTotal() {
        return Total;
    }

    public boolean isEntregado() {
        return isEntregado;
    }

    public void setEntregado(boolean entregado) {
        isEntregado = entregado;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String toString() {
        return "["+ "idUsuario: "+ this.getIdUsuario() + ", subtotal: " + this.getSubTotal() + ", medioDePago: " + this.getMedioDePago() + ", total: " + this.getTotal() + ", tipoDeEntrega: " + this.getTipoDeEntrega() + ", direccion: " + this.getDireccionEntrega() + ", isEntregado: " + this.isEntregado + "] \n";
    }

    public void agregarSubPedido(SubPedido item) {
        subPedidos.add(item);
    }

    public void calcularSubTotal() {
        double acumulador = 0;

        for(SubPedido item : subPedidos) {
            acumulador += ( item.getPlato().getPrecio() * item.getCantidad());
        }

        this.setSubTotal(acumulador);
    }

}
