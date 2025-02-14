package org.multipleCatchBlocks;
import java.util.*;
public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            int[] arr={10,20,30,40,50};
            int index=sc.nextInt();
            System.out.println("Array index element is: "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Please enter valid Index: "+a.getMessage());
        }
        catch(NullPointerException a){
            System.out.println("Array is not initialized!: "+a.getMessage());
        }
        catch(Exception a){
            System.out.println("Please Enter valid number: "+a.getMessage());
        }
    }
}
