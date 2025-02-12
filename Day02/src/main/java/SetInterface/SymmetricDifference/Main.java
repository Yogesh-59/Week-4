package SetInterface.SymmetricDifference;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Creating the set that store the integer number
        Set<Integer> set=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set1=new HashSet<>(Arrays.asList(3,4,5));
        //Create the object of class and call
        FindSymmetricDifference find=new FindSymmetricDifference(set,set1);
        System.out.println(find.symmetricDifference());
    }
}
