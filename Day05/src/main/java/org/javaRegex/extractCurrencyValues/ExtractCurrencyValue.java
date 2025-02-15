package org.javaRegex.extractCurrencyValues;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValue {
    public static List<String> currencyValue(String text){
        List<String> currency=new ArrayList<>();
        String regex="\\$?\\d+(\\.\\d+)?";
        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(text);
        while(m.find()){
            currency.add(m.group());
        }
        return currency;
    }
}
