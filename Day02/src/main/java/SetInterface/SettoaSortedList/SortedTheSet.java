package SetInterface.SettoaSortedList;
import java.util.*;
public class SortedTheSet {
    //Creating the instance of class
    Set<Integer> set;
    //using constructor to initialize the instance
     SortedTheSet(Set<Integer> set){

         this.set=set;
     }
     //Method to sort the Set and return in sorted List
     public List<Integer> sortTheSet(){
         List<Integer> list=new ArrayList<>(set);
         int len =list.size();
         for (int i=0;i<len-1;++i){
             for(int j=i+1;j<len;++j){
                 if(list.get(i) > list.get(j)){
                     int temp=list.get(i);
                     list.set(i,list.get(j));
                     list.set(j,temp);

                 }
             }
         }
         return list;
     }
}
