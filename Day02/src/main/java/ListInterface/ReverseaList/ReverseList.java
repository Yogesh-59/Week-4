package ListInterface.ReverseaList;

import java.util.List;

public class ReverseList<T> {
    //Creating instance of class
    List<T> list;
    //using constructor to initialize the instance
    ReverseList(List<T> list){
        this.list=list;
    }
    //Method to reverse the given list
    public void reverseList(){
        int left=0;
        int right=list.size()-1;
        while(left <right){
            T temp= list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    //Method to print the list
    public void printList(){
        reverseList();
        for (T ans:list){
            System.out.print(ans +" ");
        }
        System.out.println();
    }
}
