package org.javaRegex.findRepeatingWords;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWord {
    public static List<String> findWord(String text){
        List<String> repeatedWord=new ArrayList<>();
        String regex="\\b(\\w+)\\s+\\1\\b";
        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(text);
        while(m.find()){
            repeatedWord.add(m.group(1));
        }
        return repeatedWord;
    }
}
