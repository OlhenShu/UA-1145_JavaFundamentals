package Second;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        String line;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {

            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("\\bpublic\\b", "private");
                bufferedWriter.write(line + "\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Something went wrong... " + e.getMessage());
        }
    }
}