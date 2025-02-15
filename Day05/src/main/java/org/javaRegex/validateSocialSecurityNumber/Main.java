package org.javaRegex.validateSocialSecurityNumber;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      String text="My SSN is 123-45-6789.";
      ValidateSocialSecurityNumber valid=new ValidateSocialSecurityNumber();
      String result=valid.socialSecurityNumber(text);
      if(result!=null){
          System.out.println(result+" is valid Social Security Number");
      }
      else{
          System.out.println(result+" is Invalid Social Security Number");
      }
    }
}
