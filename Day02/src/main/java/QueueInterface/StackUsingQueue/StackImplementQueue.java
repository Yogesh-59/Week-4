package QueueInterface.StackUsingQueue;
import java.util.*;
public class StackImplementQueue {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackImplementQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Method to Push element onto stack
    public void push(int num) {
        // Add new element to q2
        q2.offer(num);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Method Remove and return the top element
    public int pop() {
        if (q1.isEmpty()) {
            return 0;
        }
        return q1.poll();
    }

    // Method to Return the top element without removing it
    public int top() {
        if (q1.isEmpty()) {
            return 0;
        }
        return q1.peek();
    }

    // Method to Check if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}
