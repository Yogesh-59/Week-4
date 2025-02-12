package ListInterface.FindFrequency;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //create the list of words
        List<String> words= Arrays.asList("apple", "banana", "apple", "orange");
        //Make the object of class and call
        FindFrequencyOfElements freq=new FindFrequencyOfElements();
        Map<String,Integer> result=freq.countFreq(words);
        //display the frequency of words
        System.out.println(result);

    }
}
