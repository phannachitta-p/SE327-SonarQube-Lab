package se327;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(4, 2), 0.01);
    }

    @Test
    void testThrowException() {
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(3, 0);
        });

        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}