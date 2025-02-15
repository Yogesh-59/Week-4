package org.javaRegex.validateIPAddress;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static boolean validateIP(String text){
        String regex="(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(text);
        return m.find();
    }
}
