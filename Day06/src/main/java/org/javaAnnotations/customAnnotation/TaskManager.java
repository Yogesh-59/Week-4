package org.javaAnnotations.customAnnotation;

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "John Doe")
    public void completeTask() {
        System.out.println("Task completed!");
    }
}
