package JavaStream.byteArrayStream;
import java.nio.file.Files;
import java.util.*;
import java.io.*;
public class ImageByteArray {
    private String inputFilePath;
    private String outputFilePath;

    public ImageByteArray(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }

    public byte[] convertImageToByteArray() throws IOException {
        File file = new File(inputFilePath);
        return Files.readAllBytes(file.toPath());
    }

    public void writeByteArrayToImage(byte[] imageBytes) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            fos.write(imageBytes);
        }
    }
}
