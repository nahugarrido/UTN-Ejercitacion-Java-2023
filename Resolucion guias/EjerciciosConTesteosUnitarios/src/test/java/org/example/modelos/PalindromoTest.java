package org.example.modelos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    @Test
    void test1() {
        Palindromo pal = new Palindromo();
        assertFalse(pal.esPalindromo("Coche Electrico"));
    }

    @Test
    void test2() {
        Palindromo pal = new Palindromo();
        assertTrue(pal.esPalindromo("Menem"));
    }

    @Test
    void test3() {
        Palindromo pal = new Palindromo();
        assertTrue(pal.esPalindromo("Amor a roma"));
    }

    @Test
    void test4() {
        Palindromo pal = new Palindromo();
        assertFalse(pal.esPalindromo("Amor al Cesar"));
    }

}