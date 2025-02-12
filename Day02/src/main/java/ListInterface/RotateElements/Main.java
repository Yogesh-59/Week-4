package ListInterface.RotateElements;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating list that store the element
        List<Integer> list= Arrays.asList(10,20,30,40,50);
        int position =list.size() /2;
        //creating the object of class and call
        RotateList rotate=new RotateList();
        //call the  method
        rotate.rotateList(list,position);
        rotate.printList();
    }
}
