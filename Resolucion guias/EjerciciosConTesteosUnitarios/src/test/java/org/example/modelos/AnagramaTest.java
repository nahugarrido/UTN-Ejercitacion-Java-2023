package org.example.modelos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramaTest {

    @Test
    void test1Anagrama() {
        Anagrama anam = new Anagrama();
        assertTrue(anam.esAnagrama("asdasdasd","dsdsdsaaa"));
    }

    @Test
    void test2Anagrama() {
        Anagrama anam = new Anagrama();
        assertFalse(anam.esAnagrama("asasdasd","dsdsdsaaa"));
    }

    @Test
    void test3Anagrama() {
        Anagrama anam = new Anagrama();
        assertTrue(anam.esAnagrama("asdttasdasda","dsadsdttsaaa"));
    }

    @Test
    void test4Anagrama() {
        Anagrama anam = new Anagrama();
        assertTrue(anam.esAnagrama("",""));
    }

    @Test
    void test5Anagrama() {
        Anagrama anam = new Anagrama();
        assertTrue(anam.esAnagrama("asdttaszdasda","dsadsdsttsaaa"));
    }



}