package org.javaRegex.validateColorCode;

public class Main {
    public static void main(String[] args) {
        ValidateColor validate=new ValidateColor();
        String [] arr={"#FFA500","#ff4500","#123"};
        for(String str:arr) {
            if(validate.validateColor(str)){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
