package MapInterface.InvertaMap;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        InvertMap mp=new InvertMap(map);
        System.out.println(mp.invertMap());

    }
}
