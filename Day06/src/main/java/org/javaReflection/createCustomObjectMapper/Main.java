package org.javaReflection.createCustomObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a Map of properties
            Map<String, Object> properties = new HashMap<>();
            properties.put("name", "Deepraj");
            properties.put("age", 20);
            properties.put("email", "deepraj@CG.com");

            // Use the ObjectMapper to create a Person object
            Person person = ObjectMapper.toObject(Person.class, properties);

            // Print the populated Person object
            System.out.println("Person: " + person);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
