package modelos;

import interfaces.Relaciones;

public class Numero implements Relaciones {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean esMayor(Object b) {

        if(b instanceof Numero) {
            int comparar = ((Numero) b).getNumero();
            return numero > comparar;
        }

        return false;
    }

    @Override
    public boolean esMenor(Object b ) {

        if(b instanceof Numero && b != null) {
            int comparar = ((Numero) b).getNumero();
            return numero < comparar;
        }

        return false;
    }

    @Override
    public boolean esIgual(Object b) {

        if(b instanceof Numero && b != null) {
            int comparar = ((Numero) b).getNumero();
            return numero == comparar;
        }

        return false;
    }

    public int getNumero() {
        return numero;
    }
}
