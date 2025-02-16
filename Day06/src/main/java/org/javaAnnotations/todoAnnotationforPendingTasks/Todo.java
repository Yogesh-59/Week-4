package org.javaAnnotations.todoAnnotationforPendingTasks;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
