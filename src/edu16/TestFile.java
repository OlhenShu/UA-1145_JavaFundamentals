package edu16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        byte[] w = {48, 49, 50};
        String fileName = "test.txt";
        try (FileOutputStream outFile = new FileOutputStream(fileName)) {
            System.out.println("Output file was opened.");
            outFile.write(w);
            System.out.println("Saved: " + w.length + " bytes.");
            System.out.println("Output stream was closed.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
