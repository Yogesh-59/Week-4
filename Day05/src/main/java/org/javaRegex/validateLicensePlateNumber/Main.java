package org.javaRegex.validateLicensePlateNumber;

public class Main {
    public static void main(String[] args) {
        ValidatePlateNumber validate=new ValidatePlateNumber();
        System.out.println(validate.validatePlateNumber("AB1234"));
        System.out.println(validate.validatePlateNumber("A12B34"));
    }
}
