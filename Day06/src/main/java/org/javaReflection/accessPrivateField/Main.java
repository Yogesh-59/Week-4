package org.javaReflection.accessPrivateField;
import java.lang.reflect.Field;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Create a Person object
            Person person = new Person(21);

            // Print the original age
            System.out.println("Original age via getAge: " + person.getAge());

            // Get the Class object for Person
            Class<?> personClass = person.getClass();

            // Get the private field 'age'
            Field ageField = personClass.getDeclaredField("age");

            // Make the private field accessible
            ageField.setAccessible(true);

            // Retrieve the value of the private field
            int ageValue = (int) ageField.get(person);
            System.out.println("Original age (via Reflection): " + ageValue);

            // Modify the value of the private field
            ageField.set(person, 25);

            // Print the updated age
            System.out.println("Updated age via getAge: " + person.getAge());
            System.out.println("Updated age via Reflection: " + ageField.get(person));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
