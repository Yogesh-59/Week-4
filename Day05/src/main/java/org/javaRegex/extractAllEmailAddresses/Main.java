package org.javaRegex.extractAllEmailAddresses;

public class Main {
    public static void main(String[] args) {
        ExtractEmail extract=new ExtractEmail();
        String text="deepraj@CG.com and aryan@CG.com" ;
        System.out.println(extract.extractMail(text));
    }
}
