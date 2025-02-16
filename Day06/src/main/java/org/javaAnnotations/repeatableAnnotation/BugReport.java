package org.javaAnnotations.repeatableAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class) // Reference the correctly defined BugReports annotation
@interface BugReport {
    String description();
}
