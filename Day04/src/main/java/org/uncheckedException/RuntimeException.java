package org.uncheckedException;
import java.io.*;
import java.util.*;
public class RuntimeException {
    public static void main(String[] args) {
        //Create the object of Scanner and take user input
        Scanner sc=new Scanner(System.in);
         try{
             //Take user input as number
             int num1=sc.nextInt();
             int num2=sc.nextInt();
             //Divide the num1 and num2
             int ans=num1/num2;
         }
         //If Arithmetic Exception is Occurred in try block So catch is handle
         catch(ArithmeticException a){
             System.out.println("Error division is zero is not allow:  "+a.getMessage());
         }
        //If InputMismatch Exception is Occurred in try block So catch is handle
         catch(InputMismatchException i){
             System.out.println("please enter valid number:  "+i.getMessage());
         }
    }
}
