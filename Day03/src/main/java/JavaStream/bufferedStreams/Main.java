package JavaStream.bufferedStreams;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String filePath="C:\\Users\\india\\OneDrive\\Desktop\\Week-4\\Day03\\src\\main\\java\\JavaStream\\bufferedStreams\\input.txt";
        String destBuffer="src/main/java/JavaStream/bufferedStreams/destBufferFile.txt";
        String UndestBuffer="src/main/java/JavaStream/bufferedStreams/unDestBufferedFile.txt";

        FileCopyComparison file=new FileCopyComparison(filePath,destBuffer);
        System.out.println("Time taken by Bufferd file: "+file.copyFileUsingBuffer());

        FileCopyComparison file1=new FileCopyComparison(filePath,UndestBuffer);
        System.out.println("Time taken by Bufferd file: "+file1.copyFileUsingUnBufferes());

    }
}
