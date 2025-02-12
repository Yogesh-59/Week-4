package SetInterface.CheckTwoSetAreEqual;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Create the set that store the integer element
        Set<Integer> set1=new HashSet<>();
        //adding element in set
        set1.add(3);
        set1.add(1);
        set1.add(2);
        Set<Integer> set2=new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(2);
        //Make the object of class and call
        CheckSetIsEqual check=new CheckSetIsEqual(set1,set2);
        System.out.println(check.checkSet());

    }
}
