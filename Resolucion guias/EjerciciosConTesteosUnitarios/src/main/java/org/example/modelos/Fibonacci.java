package org.example.modelos;

public class Fibonacci {

    Fibonacci() {

    }
    public int fibonacci(int numero) {

        if(numero <= 1) {
            return numero;
        }

        return fibonacci(numero - 1) + fibonacci(numero-2);
    }
}
