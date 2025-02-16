package org.javaReflection.methodExecutionTiming;
class SampleClass {
    public void method1() {
        try {
            Thread.sleep(100); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            // Measure the execution time of methods in the SampleClass
            MethodTimer.measureMethods(SampleClass.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}