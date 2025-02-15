package org.javaRegex.capitalizedWordExtractor;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {
    static public List<String> extractCapitalizedWords(String text){
        List<String> words=new ArrayList<>();
        String regex="\\b[A-Z][a-zA-Z]*\\b";
        Pattern p =Pattern.compile(regex);
        Matcher m=p.matcher(text);

        while(m.find()){
            words.add(m.group());
        }
        return words;
    }
}
