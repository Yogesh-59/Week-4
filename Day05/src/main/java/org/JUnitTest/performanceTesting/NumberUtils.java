package org.JUnitTest.performanceTesting;

public class NumberUtils {
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }
}
