package org.JUnitTest.testingStringUtilityMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestUtilityMethodTest {
    public TestUtilityMethod stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new TestUtilityMethod();
    }

    @Test
    void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
    }

}