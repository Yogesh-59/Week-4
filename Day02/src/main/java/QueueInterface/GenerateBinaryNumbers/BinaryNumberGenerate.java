package QueueInterface.GenerateBinaryNumbers;
import java.util.*;
public class BinaryNumberGenerate <T>{
  int num;
   BinaryNumberGenerate(int num){
       this.num=num;
   }
   public List<String> generateBinaryNum(){
       List<String> result = new ArrayList<>();

       for (int i = 1; i <= num; ++i) {
           StringBuilder str = new StringBuilder();
           int temp = i;

           while (temp != 0) {
               if ((temp & 1) == 1) {
                   str.insert(0, "1"); // Add at the beginning
               } else {
                   str.insert(0, "0");
               }
               temp = temp >> 1;
           }

           result.add(str.toString()); // Store the binary string
       }

       return result;
   }

}
