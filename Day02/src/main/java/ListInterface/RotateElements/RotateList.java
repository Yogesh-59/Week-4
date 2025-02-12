package ListInterface.RotateElements;

import java.util.ArrayList;
import java.util.List;

public class RotateList<T> {
    //creating the instance of class
    List<T> list1=new ArrayList<>();
    //Method to rotate the list with given position
    public void rotateList(List<T> list,int position){
        int len=list.size();
        if(position ==0){
            return;
        }
        for (int i=position;i<len;++i){
            list1.add(list.get(i));
        }
        for(int i=0;i<position;++i){
            list1.add(list.get(i));
        }
    }
    //Method to print the rotated list
    public void printList(){
        for(T list:list1){
            System.out.print(list +" ");
        }
        System.out.println();
    }
}
