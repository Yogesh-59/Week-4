package org.javaRegex.validateColorCode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateColor {
    public static boolean validateColor(String code){
        if(code.length() <=0){
            return false;
        }
        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(code);

        // Check if the color matches the pattern
        return m.matches();
    }
}
