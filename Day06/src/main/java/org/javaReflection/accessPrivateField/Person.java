package org.javaReflection.accessPrivateField;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    // method to get age
    public int getAge() {
        return age;
    }
}
