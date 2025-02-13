package JavaStream.readaLargeFile;
import java.io.*;
public class LargeFileReader {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java LargeFileReader <filePath>");
            return;
        }

        String filePath = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
