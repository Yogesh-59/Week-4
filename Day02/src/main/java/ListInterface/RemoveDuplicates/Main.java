package ListInterface.RemoveDuplicates;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating a list that contains element
        List<Integer> list= Arrays.asList(3, 1, 2, 2, 3, 4);
        //creating the object of class
        RemoveDuplicates duplicate=new RemoveDuplicates(list);
        //calling the method and print the result
        System.out.println(duplicate.printList());
    }
}
