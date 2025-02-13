package JavaStream.dataStreams;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\india\\OneDrive\\Desktop\\Week-4\\Day03\\src\\main\\java\\JavaStream\\dataStreams\\studentData.txt";
        StudentDataHandler handler = new StudentDataHandler(fileName);

        handler.writeStudentData(49, "Deepraj", 8.47);
        handler.readStudentData();
    }
}
