package org.JUnitTest.testingPasswordStrengthValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthValidatorTest {
    PasswordStrengthValidator validator = new PasswordStrengthValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Deepraj@2004"));
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("434324@ewre"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("weakpassword1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("fsdfsadfsds"));
    }

}