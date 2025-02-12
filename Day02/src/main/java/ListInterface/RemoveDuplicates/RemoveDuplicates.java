package ListInterface.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates <T>{
    //creating the instance of class
    List<T> list=new ArrayList<>();
    Set<T> set=new HashSet<>();
    List<T> list1=new ArrayList<>();
    //using constructor to initialize the instances
    RemoveDuplicates(List<T> list){
        this.list=list;
    }
    //Method to remove duplicate element in the list
    public void removeDuplicate(){
        for (T i:list){
            if(!set.contains(i)){
                set.add(i);
                list1.add(i);
            }
        }
    }
    //Method to print the list
    public List<T> printList(){
        removeDuplicate();
        return list1;
    }
}
