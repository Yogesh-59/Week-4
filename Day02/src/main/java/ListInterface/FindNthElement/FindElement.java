package ListInterface.FindNthElement;
import java.util.*;
public class FindElement<T> {
    //Creating the instance of class
      List<T> list;
      int n;
      //using constructor to initialize the instance
      FindElement(List<T> list,int n){
          this.list=list;
          this.n=n;
      }
      //Method to find the N element
    public T findNthElement(){
          int count=0;
          Iterator<T> it=list.iterator() ;
          while(it.hasNext()){
              count++;
              it.next();
          }
          return list.get(count-n);
    }
}
