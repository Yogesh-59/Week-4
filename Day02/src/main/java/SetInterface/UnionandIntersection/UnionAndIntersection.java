package SetInterface.UnionandIntersection;
import java.util.*;
public class UnionAndIntersection<T> {
    //Create the instance of class
    Set<T> set1;
    Set<T> set2;
    //using constructor to initialize the instance
     UnionAndIntersection(Set<T>s,Set<T>t){
         this.set1=s;
         this.set2=t;
     }
     //Method to find out the union of two set
     public Set<T> union(){
         Set<T> ans=new HashSet<>(set1);
         ans.addAll(set2);
         return ans;
     }
     //Method to find intersection of two set
     public Set<T> intersection(){
         Set<T> ans=new HashSet<>();
         for(T st:set1){
             if(set2.contains(st)){
                 ans.add(st);
             }
         }
         return ans;
     }
}
