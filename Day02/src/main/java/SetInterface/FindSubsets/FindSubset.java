package SetInterface.FindSubsets;
import java.util.*;
public class FindSubset {
    //create the instance of class
    Set<Integer> set;
    Set<Integer>set1;
    //using constructor to initialize the instance
     FindSubset(Set<Integer> set,Set<Integer>set1){
         this.set=set;
         this.set1=set1;
     }
    //Method that check the given set is subset of another set
     public boolean findSubSet(){
         for(int st:set){
             if(!set1.contains(st))
                 return false;
         }
         return true;
     }
}
