package org.JUnitTest.testingExceptionHandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingExceptionHandlingTest {
    public TestingExceptionHandling mathOperations = new TestingExceptionHandling();

    @Test
    void testDivideByZeroException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> mathOperations.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testValidDivision() {
        assertEquals(5, mathOperations.divide(10, 2));
    }

}