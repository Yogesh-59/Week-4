package ListInterface.FindFrequency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfElements{
    //creating the instance of class
    Map<String, Integer> map=new HashMap<>();
    //Method to find the frequency of words
     public Map<String,Integer> countFreq(List<String> words){
         for( String item:words){
             if(map.containsKey(item)){
                 map.put(item, map.get(item)+1);
             }
             else{
                 map.put(item,1);
             }
         }
         //return the map
         return map;
     }
}
