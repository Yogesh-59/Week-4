package org.javaAnnotations.repeatableAnnotation;

public class BugTracker {
    @BugReport(description = "Null pointer exception occurs when input is null")
    @BugReport(description = "Array index out of bounds exception in edge cases")
    public void processBugs() {
        System.out.println("Processing bugs...");
    }
}
