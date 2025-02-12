package MapInterface.WordFrequencyCounter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FrequencyCounter {
    public String filePath;
    Map<String, Integer> wordFrequencyMap ;
     FrequencyCounter(String str){
         this.filePath=str;
         wordFrequencyMap = new HashMap<>();
     }
     public void frequencyCounter(){
         int count=0;
         try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
             String line;
             while ((line = reader.readLine()) != null) {
                 // Normalize the line: convert to lowercase and remove punctuation
                 String normalizedLine = line.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

                 // Split the line into words
                 String[] words = normalizedLine.split("\\s+");

                 // Count the frequency of each word
                 for (String word : words) {
                     if (!word.isEmpty()) {
                         wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                     }
                 }
             }
         } catch (IOException e) {
             System.err.println("Error reading the file: " + e.getMessage());
         }

         // Print the word frequencies
         System.out.println(wordFrequencyMap);
     }
}
