package org.example.modelos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void test1TwentyEightShouldEquals196418() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(317811,fibonacci.fibonacci(28));
    }
    @Test
    void test2TenShouldEquals34() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(55,fibonacci.fibonacci(10));
    }
    @Test
    void test2NineShouldEquals21() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(34,fibonacci.fibonacci(9));
    }
}