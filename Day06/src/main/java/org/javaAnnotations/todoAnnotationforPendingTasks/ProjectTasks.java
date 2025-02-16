package org.javaAnnotations.todoAnnotationforPendingTasks;

public class ProjectTasks {
    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {
        System.out.println("Login functionality in progress...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob") // Default priority MEDIUM
    public void optimizeDatabase() {
        System.out.println("Optimizing database queries...");
    }
}
