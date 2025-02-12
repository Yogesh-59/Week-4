package SetInterface.SettoaSortedList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //create the set and put the elements
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 5, 7, 3, 2));
        //Make the object of class and call
        SortedTheSet sort = new SortedTheSet(set);
        System.out.println(sort.sortTheSet());
    }
}
