package JavaStream.filterStreams;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String filePath="C:\\Users\\india\\OneDrive\\Desktop\\Week-4\\Day03\\src\\main\\java\\JavaStream\\filterStreams\\input.txt";
        String outputFile="src\\main\\java\\JavaStream\\filterStreams";

        ConvertToLowercase convert=new ConvertToLowercase(filePath,outputFile);
        convert.convertToLowercase();
        System.out.println("File converted successfully ");
    }
}
