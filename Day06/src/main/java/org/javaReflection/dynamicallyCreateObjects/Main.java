package org.javaReflection.dynamicallyCreateObjects;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the Class object for Student
            Class<?> studentClass = Class.forName("Student");

            // Create an instance using the parameterized constructor
            Constructor<?> constructor = studentClass.getDeclaredConstructor(String.class, int.class);
            Student stu = (Student) constructor.newInstance("Deepraj", 20);
            System.out.println("Student 2 (parameterized constructor): " + stu);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
