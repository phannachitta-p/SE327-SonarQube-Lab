package se327;

    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertThrows;

    import org.junit.jupiter.api.Test;

    class AdvancedCalculatorTest {
    @Test
    void testPower() {
        AdvancedCalculator calculator = new AdvancedCalculator();
            assertEquals(8.0, calculator.power(2, 3), 0.01);
        }

    @Test
    void testSqrt() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(2.0, calculator.sqrt(4), 0.01);
    }

    @Test
    void testThrowException() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.sqrt(-1);
        });

        assertEquals("Cannot calculate square root of a negative number.", exception.getMessage());
    }
}