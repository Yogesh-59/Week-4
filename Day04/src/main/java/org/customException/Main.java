package org.customException;
import java.util.*;
import java.io.*;
public class Main {
    static public void validateAge(int age) throws InvalidAgeException{
        if(age <18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            int age=sc.nextInt();
            validateAge(age);
        }
        catch(InvalidAgeException a){
            System.out.println(a.getMessage());
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
