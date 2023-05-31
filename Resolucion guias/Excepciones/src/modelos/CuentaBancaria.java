package modelos;

import excepciones.SaldoInsuficienteException;

public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void retirarDinero(double monto) throws SaldoInsuficienteException {

        if(this.getSaldo() - monto < 0) {
            throw new SaldoInsuficienteException(this.getSaldo(), monto);
        }

        this.setSaldo(this.getSaldo() - monto);
    }

    public void depositardinero(double monto) {

    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
