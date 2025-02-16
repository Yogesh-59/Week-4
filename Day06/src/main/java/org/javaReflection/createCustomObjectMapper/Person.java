package org.javaReflection.createCustomObjectMapper;

public class Person {
    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}
