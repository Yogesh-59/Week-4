package ListInterface.ReverseaList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main<T> {
    public static void main(String[] args) {
        System.out.print("Print reverse List using ArrayList: ");
        //creating the array list using list interface
        List<Integer>arrayList=new ArrayList<>();
        //adding element in list
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //creating the object of class and call
        ReverseList reverse=new ReverseList(arrayList);
        reverse.printList();

        System.out.print("Print reverse List using Linked List: ");
        //Create the Linked list using List interface
        List<Integer>linkedList=new LinkedList<>();
        //adding elements in linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        ReverseList llReverse=new ReverseList(linkedList);
        llReverse.printList();

    }
}
