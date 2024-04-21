package edu16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.IntStream;

public class TestFileOutput {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try (FileInputStream inFile = new FileInputStream(fileName)) {
            System.out.println("Input file was opened.");
            int bytesAvailable = inFile.available();
            byte[] readFromFile = new byte[bytesAvailable];
            // Bytes count
            System.out.println("Bytes count: " + bytesAvailable + " Bytes");
            int count = inFile.read(readFromFile, 0, bytesAvailable);
            System.out.println("Was readied: " + count + " bytes.");
            IntStream.range(0, readFromFile.length)
                    .map(i -> readFromFile[i]).forEach(System.out::println);
            System.out.println("Input stream was closed.");

        } catch (FileNotFoundException e) {
            System.out.println("File Read/Write Error: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}