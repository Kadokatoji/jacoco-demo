package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addShouldReturnSum() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractShouldReturnDifference() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void multiplyShouldReturnProduct() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divideShouldReturnQuotient() {
        assertEquals(2.5, calculator.divide(5, 2), 0.0001);
    }

    @Test
    void divideByZeroShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    void isEvenShouldWork() {
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(7));
    }

    @Test
    void factorialShouldWork() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void factorialOfNegativeShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
    }
}
