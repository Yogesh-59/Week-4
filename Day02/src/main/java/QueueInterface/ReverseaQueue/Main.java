package QueueInterface.ReverseaQueue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(Arrays.asList(10,20,30));
        ReverseQueue reverse=new ReverseQueue(q);
        System.out.println(reverse.reverseQueue());
    }
}
