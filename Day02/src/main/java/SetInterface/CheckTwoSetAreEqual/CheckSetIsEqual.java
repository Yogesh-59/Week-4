package SetInterface.CheckTwoSetAreEqual;
import java.util.*;
public class CheckSetIsEqual<T> {
    //Creating the instance of class
    Set<T>set1;
    Set<T>set2;
    //using constructor to initialize the instance
     CheckSetIsEqual(Set<T>set1,Set<T>set2){
         this.set1=set1;
         this.set2=set2;
     }
     //Method to check the given two sets are equal or not
    public boolean checkSet(){
         for(T it:set1){
             if(set2.contains(it)){
                 return true;
             }
         }
         return false;
    }
}
