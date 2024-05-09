package edu16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AttributeModifier {

    public static void main(String[] args) {
        String inputFile = "input.java";
        String outputFile = "output.java";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter printer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
               line = line.replaceAll("\\bpublic\\b", "private");
                printer.write(line);
                printer.newLine();
            }

            reader.close();
            printer.close();

            System.out.println("File modification complete.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}