package org.javaRegex.extractAllEmailAddresses;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail{
     public static List<String> extractMail(String text){
        List<String> mail=new ArrayList<>();
        String regex="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
         Pattern p=Pattern.compile(regex);
         Matcher m=p.matcher(text);

         while(m.find()){
             mail.add(m.group());
         }
         return mail;
    }
}
