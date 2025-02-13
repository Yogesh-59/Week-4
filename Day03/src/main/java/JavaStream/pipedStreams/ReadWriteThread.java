package JavaStream.pipedStreams;
import java.io.*;
public class ReadWriteThread {
    public PipedOutputStream pos;
    public PipedInputStream pis;
    public ReadWriteThread(PipedOutputStream pos,PipedInputStream pis) {
        this.pos = pos;
        this.pis=pis;
    }
    public void runWriter() {
        try {
            String message = "Hello from WriterThread!";
            pos.write(message.getBytes());
            pos.close();
        } catch (IOException e) {
            System.out.println("Error in WriterThread: " + e.getMessage());
        }
    }
    public void runReader() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            pis.close();
        } catch (IOException e) {
            System.out.println("Error in ReaderThread: " + e.getMessage());
        }
    }
}
