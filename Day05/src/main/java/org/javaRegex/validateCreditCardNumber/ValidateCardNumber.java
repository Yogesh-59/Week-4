package org.javaRegex.validateCreditCardNumber;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCardNumber {
    public static boolean validateCardNumber(String number){
        String regex="^(4[0-9]{15}$|5[0-9]{15}$)";
        Pattern p = Pattern.compile(regex);
        Matcher m=p.matcher(number);
        return m.find();
    }
}
