package MapInterface.FindKeyHighestValue;
import java.util.*;
public class KeyHighestValue<K,V extends Comparable<V>> {
    Map<K,V> map;
     KeyHighestValue(Map<K,V>map){
         this.map=map;
     }
     public K keyWithMaxValue(){
         if (map == null || map.isEmpty()) {
             throw new IllegalArgumentException("Map is empty or null");
         }

         K maxKey = null;
         V maxValue = null;

         // Iterate through the map to find the key with the maximum value
         for (Map.Entry<K, V> entry : map.entrySet()) {
             if (maxValue == null || entry.getValue().compareTo(maxValue) > 0) {
                 maxValue = entry.getValue();
                 maxKey = entry.getKey();
             }
         }

         return maxKey;
     }
}
