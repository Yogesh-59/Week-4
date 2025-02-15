package org.javaRegex.extractLinksFromWebPage;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    public static List<String> linkExtractor(String text){
        List<String> list=new ArrayList<>();
        String regex="\\b(https?://[^\\s]+)\\b";
        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(text);
        while(m.find()){
            list.add(m.group());
        }
        return list;
    }
}
