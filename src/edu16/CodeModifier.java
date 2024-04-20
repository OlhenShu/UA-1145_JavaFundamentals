package edu16;

import java.io.*;

public class CodeModifier {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFilePath = "input.java";
        String outputFilePath = "output.java";

        try {
            // Open input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            // Open output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            // Read input file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                // Replace "public" with "private" for class attributes and methods
                if (line.contains("public class") || line.contains("public void") || line.contains("public int") || line.contains("public String")) {
                    line = line.replace("public", "private");
                }
                // Write modified line to output file
                writer.write(line);
                writer.newLine();
            }

            // Close the reader and writer
            reader.close();
            writer.close();

            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file: " + e.getMessage());

        }
    }
}
