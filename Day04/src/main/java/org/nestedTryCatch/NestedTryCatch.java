package org.nestedTryCatch;
import java.util.*;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50};
        int index = scanner.nextInt();
        int divisor = scanner.nextInt();

        try {
            try {
                int element = array[index];
                int result = element / divisor;
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
