package org.throwVSThrows;
import java.util.*;
import java.io.*;
public class ExceptionPropagation {
    public static double calculateInterest(double amount,double rate,double time) throws IllegalArgumentException{
        if( amount <0 || time <0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount *rate *time)/100;
    }

    public static void main(String[] args) {
        try{
            double res=calculateInterest(7000,7,-7);
            System.out.println("calculated amount : "+res);
        }
        catch(IllegalArgumentException i){
            System.out.println(i.getMessage());
        }
    }
}
