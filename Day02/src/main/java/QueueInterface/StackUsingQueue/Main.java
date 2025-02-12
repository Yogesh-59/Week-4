package QueueInterface.StackUsingQueue;

public class Main {
    public static void main(String[] args) {
        StackImplementQueue stack = new StackImplementQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
    }
}
