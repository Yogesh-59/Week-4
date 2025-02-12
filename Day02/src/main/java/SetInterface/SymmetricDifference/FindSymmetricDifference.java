package SetInterface.SymmetricDifference;
import java.util.*;
public class FindSymmetricDifference<T> {
    //creating the instance of class
    Set<T> set;
    Set<T> set1;
    //using constructor to initialize the instance
     FindSymmetricDifference(Set<T> set,Set<T> set1){
         this.set=set;
         this.set1=set1;
     }
     //Method to find out the symmetric Difference
     public Set<T> symmetricDifference(){
         Set<T> temp=new HashSet<>(set);

         for(T st:set1){
             if(!temp.add(st)){
                temp.remove(st);
             }
         }
         return temp;
     }
}
