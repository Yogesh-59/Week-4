package org.javaRegex.validateIPAddress;

public class Main {
    public static void main(String[] args) {
        String[] address={"192.168.1.1", "10.0.0.1", "172.16.0.1", "8.8.8.8","205.05.25.07"};
        ValidateIPAddress validate=new ValidateIPAddress();
        for(String str:address){
            System.out.println(validate.validateIP(str));
        }
    }
}
