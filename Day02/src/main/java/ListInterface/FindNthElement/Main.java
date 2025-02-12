package ListInterface.FindNthElement;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Create the List of String
        List<String> string=Arrays.asList("A","B","C","D","E");
        //Give the Nth position
        int n=2;
        //Create the object of class and call
        FindElement find=new FindElement(string, n);
        System.out.println(find.findNthElement());
    }
}
