package org.example.modelos;

import java.util.UUID;

public class Cuenta {
    private UUID id = UUID.randomUUID();
    private double balance;
    private Cliente cliente;

    public Cuenta(double balance, Cliente cliente) {
        this.balance = balance;
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String depositar(double cantidad) {
        this.setBalance(this.getBalance() + cantidad);

        return "El nuevo saldo es " + this.getBalance();
    }

    public String extraer(double cantidad) {
        if ((this.getBalance() - cantidad) > 0) {
            this.setBalance(this.getBalance() - cantidad);
        }
        return "El nuevo saldo es " + this.getBalance();
    }

    public String detalleCuenta() {
        return "Cuenta[id=" + this.getId() + ", balance=" + this.getBalance() + ", " + this.getCliente().detalleCliente() + "]";
    }
}
