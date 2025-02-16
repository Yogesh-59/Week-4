package org.javaReflection.retrieveAnnotationsRuntime;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the Class object for MyClass
            Class<?> myClass = Class.forName("Annotations");

            // Check if the @Author annotation is present on the class
            if (myClass.isAnnotationPresent(Author.class)) {
                // Retrieve the @Author annotation
                Author authorAnnotation = myClass.getAnnotation(Author.class);

                // Display the annotation value
                System.out.println("Author of MyClass: " + authorAnnotation.name());
            } else {
                System.out.println("No @Author annotation found on MyClass.");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
