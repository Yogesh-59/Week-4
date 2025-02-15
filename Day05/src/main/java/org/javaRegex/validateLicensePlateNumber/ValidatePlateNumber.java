package org.javaRegex.validateLicensePlateNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePlateNumber {

    public static boolean validatePlateNumber(String plateNumber){
        if(plateNumber.length() <=0){
            return false;
        }
        String regex="[A-Z]{2}[0-9]{4}$";
        Pattern p=Pattern.compile(regex);
        Matcher m= p.matcher(plateNumber);
        return m.matches();
    }
}
