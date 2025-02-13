package JavaStream.fileHandling;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the source file name: ");
            String sourceFileName = br.readLine().trim();
            System.out.println("Enter the destination file name: ");
            String destinationFileName = br.readLine().trim();

            ReadInputFileAndWrite.readFile(sourceFileName, destinationFileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
