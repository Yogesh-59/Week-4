package org.JUnitTest.testingDateFormatter;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class TestingDateFormatterTest {
    TestingDateFormatter dateFormatter = new TestingDateFormatter();

    @Test
    void testValidDateFormat() throws ParseException {
        assertEquals("25-12-2023", dateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2000", dateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> dateFormatter.formatDate("25-12-2023"));
        assertThrows(ParseException.class, () -> dateFormatter.formatDate("2023/12/25"));
    }

}