package org.javaAnnotations.annotationtoMarkMethods;

public class TaskHandler {
    @ImportantMethod
    public void completeTask() {
        System.out.println("Completing task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void reviewTask() {
        System.out.println("Reviewing task...");
    }

    public void deleteTask() {
        System.out.println("Deleting task...");
    }
}
