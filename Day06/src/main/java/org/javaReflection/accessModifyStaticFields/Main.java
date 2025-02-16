package org.javaReflection.accessModifyStaticFields;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            // Print the original value of API_KEY
            System.out.println("Original API_KEY: " + Configuration.getApiKey());

            // Get the Class object for Configuration
            Class<?> configClass = Configuration.class;

            // Get the private static field API_KEY
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Make the private static field accessible
            apiKeyField.setAccessible(true);

            // Retrieve the current value of the static field
            String currentApiKey = (String) apiKeyField.get(null); // null for static fields
            System.out.println("Current API_KEY via Reflection: " + currentApiKey);

            // Modify the value of the static field
            apiKeyField.set(null, "new_key"); // null for static fields

            // Print the updated value of API_KEY
            System.out.println("Updated API_KEY: " + Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
