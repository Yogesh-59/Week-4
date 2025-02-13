package JavaStream.pipedStreams;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            ReadWriteThread readerwriter = new ReadWriteThread(pos,pis);
            readerwriter.runWriter();
            readerwriter.runReader();
        } catch (IOException e) {
            System.out.println("Error initializing pipes: " + e.getMessage());
        }
    }
}
