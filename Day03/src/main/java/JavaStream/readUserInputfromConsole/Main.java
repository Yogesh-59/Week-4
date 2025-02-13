package JavaStream.readUserInputfromConsole;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter your name: ");
            String name = br.readLine().trim();
            System.out.println("Enter your age: ");
            int age = Integer.parseInt(br.readLine().trim());
            System.out.println("Enter your proLang: ");
            String proLang = br.readLine().trim();
            System.out.println("Enter the file name: ");
            String fileName = br.readLine().trim();

            UserInputToFile.writeFile(fileName, name, age, proLang);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
