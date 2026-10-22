package com.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(4, 5));
    }
}