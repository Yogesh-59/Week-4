package org.javaReflection.dynamicMethodInvocation;
import java.lang.reflect.Method;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Create an instance of MathOperations
            MathOperations mathOperations = new MathOperations();

            // Get the Class object for MathOperations
            Class<?> mathClass = mathOperations.getClass();

            // Read user input for method name and arguments
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Get the Method object for the specified method name and parameter types
            Method method = mathClass.getMethod(methodName, int.class, int.class);

            // Invoke the method on the MathOperations instance
            int result = (int) method.invoke(mathOperations, num1, num2);

            // Display the result
            System.out.println("Result of " + methodName + "(" + num1 + ", " + num2 + "): " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
