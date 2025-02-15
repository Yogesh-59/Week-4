package org.javaRegex.validateUsername;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidate {
    public static String userName;
    public static boolean validate(String userName){
        if(userName.length() < 5 || userName.length() >15){
            return false;
        }
        if(!Character.isLetter(userName.charAt(0))){
            return false;
        }
        String regex="^[a-zA-Z0-9_]+$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(userName);
        return m.matches();
    }
}
