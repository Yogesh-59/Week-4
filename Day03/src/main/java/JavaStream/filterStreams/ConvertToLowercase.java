package JavaStream.filterStreams;
import java.io.*;
public class ConvertToLowercase {
    public String inputFilePath;
    public String outputfilePath;
    ConvertToLowercase(String str, String str1){
        this.inputFilePath=str;
        this.outputfilePath=str1;
    }
    public void convertToLowercase(){
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputfilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase
                String lowercaseLine = line.toLowerCase();
                // Write the lowercase line to the output file
                writer.write(lowercaseLine);
                writer.newLine(); // Add a newline after each line
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
