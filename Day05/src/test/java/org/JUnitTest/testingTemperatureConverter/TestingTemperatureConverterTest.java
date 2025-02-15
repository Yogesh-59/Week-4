package org.JUnitTest.testingTemperatureConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTemperatureConverterTest {
    TestingTemperatureConverter converter = new TestingTemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.01);
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.01);
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.01);
    }
}