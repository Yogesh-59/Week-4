package org.javaAnnotations.annotationtoMarkMethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            // Get the Class object for TaskHandler
            Class<?> taskManagerClass = TaskHandler.class;

            // Get all declared methods in the class
            Method[] methods = taskManagerClass.getDeclaredMethods();

            // Iterate over the methods
            for (Method method : methods) {
                // Check if the @ImportantMethod annotation is present on the method
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    // Retrieve the @ImportantMethod annotation
                    ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);

                    // Print the method name and annotation details
                    System.out.println("Method: " + method.getName());
                    System.out.println("Importance Level: " + importantMethod.level());
                    System.out.println();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
