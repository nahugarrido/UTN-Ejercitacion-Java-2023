package excepciones;

public class SaldoInsuficienteException extends Exception {
    private double saldo;
    private double monto;
    public SaldoInsuficienteException(double saldo, double monto) {
        this.saldo = saldo;
        this.monto = monto;
    }

    public String getMesagge() {
        return "El saldo es insuficiente " + "(" + this.getSaldo() + ") y el monto es de (" + this.getMonto() + ")";
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMonto() {
        return monto;
    }
}
