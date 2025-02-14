package org.checkedException;

import java.io.*;
import java.io.FileReader;

public class CompileTimeException {
    public static void main(String[] args) {
        //Define String filePath they have to take file path
        String filePath="data.txt";
        //Using exception handling to handle abnormal condition
        try(BufferedReader br =new BufferedReader(new FileReader(filePath))){
            String line ;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
        //catch block is take exception and handle
        catch(FileNotFoundException e){
            System.out.println("File not fount"+e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error is occurred in file reading");
        }
    }
}
