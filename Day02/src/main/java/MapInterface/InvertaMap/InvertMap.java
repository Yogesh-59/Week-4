package MapInterface.InvertaMap;
import java.util.*;
public class InvertMap<K,V>{
    Map<K, V> map;
    InvertMap(Map<K,V>map){
        this.map=map;
    }
    public Map<V,List<K>> invertMap(){
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            // If the value is not already a key in the inverted map, create a new list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return invertedMap;
    }
}
