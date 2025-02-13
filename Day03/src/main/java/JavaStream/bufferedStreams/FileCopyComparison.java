package JavaStream.bufferedStreams;
import java.io.*;
public class FileCopyComparison {
    public String filePath;
    public String destination;
    FileCopyComparison(String filePath,String destination){
        this.filePath=filePath;
        this.destination=destination;
    }
    public long copyFileUsingBuffer(){
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
    }
    public long copyFileUsingUnBufferes(){
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(filePath);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
    }

}
