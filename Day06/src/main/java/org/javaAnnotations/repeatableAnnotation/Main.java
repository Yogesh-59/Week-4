package org.javaAnnotations.repeatableAnnotation;
import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("processBugs");

        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports reports = method.getAnnotation(BugReports.class);
            for (BugReport report : reports.value()) {
                System.out.println("Bug Description: " + report.description());
            }
        }
    }
}
