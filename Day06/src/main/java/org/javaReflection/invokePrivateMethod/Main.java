package org.javaReflection.invokePrivateMethod;
import java.lang.reflect.Method;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            // Get the Class object for Calculator
            Class<?> calculatorClass = calculator.getClass();

            // Get the private method 'multiply' with two int parameters
            Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", int.class, int.class);

            // Make the private method accessible
            multiplyMethod.setAccessible(true);

            // Invoke the private method on the Calculator instance
            int result = (int) multiplyMethod.invoke(calculator, 5, 10);

            // Display the result
            System.out.println("Result of multiply(5, 10): " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
