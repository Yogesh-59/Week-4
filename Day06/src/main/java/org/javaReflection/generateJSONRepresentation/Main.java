package org.javaReflection.generateJSONRepresentation;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a sample object
            Person person = new Person();
            person.setName("Yogesh");
            person.setAge(25);
            person.setEmail("yogesh@gmail.com");

            // Convert the object to a JSON-like string
            String json = JsonConverter.toJson(person);

            // Print the JSON-like string
            System.out.println("JSON: " + json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
