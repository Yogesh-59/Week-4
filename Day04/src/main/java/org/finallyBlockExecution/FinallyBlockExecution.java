package org.finallyBlockExecution;
import java.io.*;
import java.util.*;
public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num = scanner.nextInt();
            int num1 = scanner.nextInt();
            int result = num / num1;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error Cannot divide by zero.");
        } finally {
            System.out.println("Operation completed.");
            scanner.close();
        }
    }
}
