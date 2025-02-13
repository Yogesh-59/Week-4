package JavaStream.dataStreams;
import java.io.*;
public class StudentDataHandler {
    public String fileName;

    public StudentDataHandler(String fileName) {
        this.fileName = fileName;
    }

    public void writeStudentData(int rollNumber, String name, double gpa) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeInt(rollNumber);
            dataOutputStream.writeUTF(name);
            dataOutputStream.writeDouble(gpa);
            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    public void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Student Data Retrieved:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}
