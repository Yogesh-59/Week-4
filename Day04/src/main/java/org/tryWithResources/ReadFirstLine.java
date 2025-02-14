package org.tryWithResources;
import java.io.*;
public class ReadFirstLine {
    public static void main(String[] args) {
        String fileName = "info.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println(firstLine);
            } else {
                System.out.println("File is empty");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
