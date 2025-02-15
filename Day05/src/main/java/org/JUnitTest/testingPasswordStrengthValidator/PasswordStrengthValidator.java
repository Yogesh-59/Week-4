package org.JUnitTest.testingPasswordStrengthValidator;

public class PasswordStrengthValidator {
    public boolean isValid(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*");
    }
}
