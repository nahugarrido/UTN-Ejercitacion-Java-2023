package org.example.modelos;

/// Duda: this.setBalance era un metodo privado de la clase padre pero no me permitia utilizarlo en la clase hijo por lo que lo hice publico, como podria utilizarlo en la clase hijo?
/// Respuesta: se puede utilizar protected que a diferencia de privado pasa el metodo a las clases hijo.
public class CuentaDeudora extends Cuenta{
    public CuentaDeudora(double balance, Cliente cliente) {
        super(balance, cliente);
    }

    public String extraer(double cantidad) {
        if ((this.getBalance() - cantidad) >= -2000) {
            this.setBalance(this.getBalance() - cantidad);
        }
        return "El nuevo saldo es " + this.getBalance();
    }
}
