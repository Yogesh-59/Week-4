package JavaStream.byteArrayStream;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ImageByteArray <inputImagePath> <outputImagePath>");
            return;
        }

        ImageByteArray imageProcessor = new ImageByteArray(args[0], args[1]);
        try {
            byte[] imageBytes = imageProcessor.convertImageToByteArray();
            imageProcessor.writeByteArrayToImage(imageBytes);
            System.out.println("Image successfully converted to byte array and written back.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
