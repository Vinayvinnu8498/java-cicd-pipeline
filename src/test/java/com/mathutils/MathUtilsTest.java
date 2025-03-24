
package com.mathutils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils(); // Initialize before each test
    }

    @AfterEach
    void tearDown() {
        mathUtils = null; // Clean up after each test
    }

    @Test
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3), "2 + 3 should be 5");
        assertEquals(-1, mathUtils.add(-2, 1), "-2 + 1 should be -1");
    }

    @Test
    void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3), "5 - 3 should be 2");
        assertEquals(-3, mathUtils.subtract(2, 5), "2 - 5 should be -3");
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3), "2 * 3 should be 6");
        assertEquals(-10, mathUtils.multiply(-2, 5), "-2 * 5 should be -10");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), "6 / 3 should be 2.0");
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(5, 0), "Division by zero should throw an exception");
    }

    @Test
    void testIsEven() {
        assertTrue(mathUtils.isEven(4), "4 should be even");
        assertFalse(mathUtils.isEven(3), "3 should not be even");
    }

    @Test
    void testFactorial() {
        assertEquals(120, mathUtils.factorial(5), "5! should be 120");
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-3), "Negative numbers should throw an exception");
    }
}
