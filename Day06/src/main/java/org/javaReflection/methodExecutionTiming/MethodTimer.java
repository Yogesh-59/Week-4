package org.javaReflection.methodExecutionTiming;

import java.lang.reflect.Method;

public class MethodTimer {
    public static void measureMethods(Class<?> clazz) throws Exception {
        // Create an instance of the class
        Object instance = clazz.getDeclaredConstructor().newInstance();

        // Get all declared methods in the class
        Method[] methods = clazz.getDeclaredMethods();

        // Iterate over the methods
        for (Method method : methods) {
            // Skip methods with parameters or non-void return types for simplicity
            if (method.getParameterCount() > 0 || !method.getReturnType().equals(void.class)) {
                continue;
            }

            // Make the method accessible (in case it's private)
            method.setAccessible(true);

            // Measure the execution time
            long startTime = System.nanoTime();
            method.invoke(instance); // Invoke the method
            long endTime = System.nanoTime();

            // Calculate and print the execution time
            long duration = endTime - startTime;
            System.out.println("Method '" + method.getName() + "' took " + duration + " ns to execute.");
        }
    }
}
