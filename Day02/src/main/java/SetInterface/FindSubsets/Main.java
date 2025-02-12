package SetInterface.FindSubsets;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Create the set and put the element
        Set<Integer> set1=new HashSet<>(Arrays.asList(2,3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(1,2,3,4));
        //Make the object of class and call
        FindSubset subSet=new FindSubset(set1,set2);
        System.out.println(subSet.findSubSet());
    }
}
