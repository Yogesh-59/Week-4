package org.javaAnnotations.customAnnotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }
    }
}
