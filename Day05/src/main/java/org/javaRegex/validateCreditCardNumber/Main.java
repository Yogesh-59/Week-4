package org.javaRegex.validateCreditCardNumber;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       String[] visaCardNumber={"4504481742333", "4111111120052505"};
       String[] masterCardNumber={"5000333641352301","8000446413523017"};
        ValidateCardNumber validate=new ValidateCardNumber();
        for(String num:visaCardNumber){
            System.out.println(validate.validateCardNumber(num));
        }
        System.out.println("-------------------");
        for(String num:masterCardNumber){
            System.out.println(validate.validateCardNumber(num));
        }
    }
}
