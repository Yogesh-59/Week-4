package MapInterface.MergeTwoMaps;
import java.util.*;
public class MergeMaps<K> {
    Map<K,Integer> map1;
    Map<K,Integer> map2;
     MergeMaps(Map<K,Integer> map1,Map<K,Integer> map2){
         this.map1=map1;
         this.map2=map2;
     }
     public Map<K,Integer> mergeMaps(){
         Map<K, Integer> mergedMap = new HashMap<>(map1);

         for (Map.Entry<K, Integer> entry : map2.entrySet()) {
             mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
         }

         return mergedMap;
     }
}
