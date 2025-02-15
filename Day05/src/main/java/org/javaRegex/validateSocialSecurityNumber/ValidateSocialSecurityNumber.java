package org.javaRegex.validateSocialSecurityNumber;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSocialSecurityNumber {
    //"\\b\\d{3}-\\d{2}-\\d{4}\\b"
    public static String socialSecurityNumber(String text){
        String regex="\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(text);
        while(m.find()){
            return m.group();
        }
       return null;
    }
}
