package modelos;

/// PREGUNTA: Al trabajar con atributos privados no deberia escribir sus nombres de la forma: _saldo en vez de saldo?
/// RESPUESTA: No, por mas que sea una convencion en javascript no deberia hacerse en java.

public class CuentaBancaria {
    private double saldo;
    private String titular;
    private static double interes = 0.05;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getInteres() {return this.interes;}

    public void retirarSaldo(double saldo) {
        this.saldo -= saldo;
    }

    public void cargarSaldo(double saldo) {
        this.saldo += saldo;
    }

    public String establecerPlazoFijo() {
        return " el monto total con (" + (getSaldo()) + "%) intereses que podremos retirar en 30 días es de $" + (getSaldo() * (1 + getInteres()));
    }

}
