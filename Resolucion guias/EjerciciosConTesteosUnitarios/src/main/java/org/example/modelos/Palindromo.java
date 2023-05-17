package org.example.modelos;

public class Palindromo {

    Palindromo() {

    }

    public boolean esPalindromo(String palabra) {
        boolean flag = true;
        palabra = palabra.toLowerCase();
        palabra = palabra.replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
