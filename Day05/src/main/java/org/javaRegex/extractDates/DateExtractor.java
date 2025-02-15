package org.javaRegex.extractDates;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
    public static List<String> dateExtractor(String date){
        List<String> extractDate=new ArrayList<>();
       // \\b(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/(\\d{4})\\b
        String regex="\\b(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/(\\d{4})\\b";
        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(date);

        while(m.find()){
            extractDate.add(m.group());
        }
        return extractDate;
    }
}
