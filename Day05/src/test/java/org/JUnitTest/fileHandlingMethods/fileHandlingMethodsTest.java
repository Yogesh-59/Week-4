package org.JUnitTest.fileHandlingMethods;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class fileHandlingMethodsTest {
    public FileHandling fileProcessor = new FileHandling();
    private final String testFilename = "C:\\Users\\india\\OneDrive\\Desktop\\Week-4\\Day05\\src\\main\\java\\org\\JUnitTest\\fileHandlingMethods\\Input.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, world!";
        fileProcessor.writeToFile(testFilename, content);
        assertEquals(content, fileProcessor.readFromFile(testFilename));
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(testFilename, "Test content");
        assertTrue(Files.exists(Paths.get(testFilename)));
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }
}