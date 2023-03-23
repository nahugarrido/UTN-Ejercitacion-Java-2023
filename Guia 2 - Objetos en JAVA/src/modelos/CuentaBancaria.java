package modelos;

/// PREGUNTA: Al trabajar con atributos privados no deberia escribir sus nombres de la forma: _saldo en vez de saldo?
public class CuentaBancaria {
    private double saldo;
    private String titular;
    public static double interes = 0.05;

    public CuentaBancaria(double saldo, String titular) {
        System.out.println("Constructor ejecutandose");
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void retirarSaldo(double saldo) {
        this.saldo -= saldo;
    }
    public void cargarSaldo(double saldo) {
        this.saldo += saldo;
    }
    public void establecerPlazoFijo() {
        System.out.println(" el monto total con (" + (this.interes) +
                "%) intereses que podremos retirar en 30 días es de $" + (this.saldo * (1+this.interes)));
    }

}
