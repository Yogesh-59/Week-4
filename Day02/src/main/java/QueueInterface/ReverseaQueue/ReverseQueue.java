package QueueInterface.ReverseaQueue;
import java.util.*;
public class ReverseQueue<T> {
    Queue<T> queue;
     ReverseQueue(Queue<T>q){
         this.queue=q;
     }
     public Queue<T> reverseQueue(){
         if(queue.isEmpty()){
             return queue;
         }
         Stack<T> temp=new Stack<>();
         while(!queue.isEmpty()){
             temp.add(queue.peek());
             queue.remove();
         }
         while(!temp.isEmpty()){
             queue.offer(temp.peek());
             temp.pop();
         }
         return queue;
     }
}
