package MapInterface.FindKeyHighestValue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
        KeyHighestValue value=new KeyHighestValue(map);
        System.out.println(value.keyWithMaxValue());
    }
}
