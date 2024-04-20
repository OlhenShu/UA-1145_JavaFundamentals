package edu16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
    public static void main(String[] args) {
        String inputFilePath = "file1.txt";
        String outputFilePath = "file2.txt";

        List<String> lines = readFileLines(inputFilePath);
        String longestLine = findLongestLine(lines);
        String name = parseNameFromFile(lines);
        String birthdayDate = parseBirthdayFromFile(lines);

        writeToFile(outputFilePath, lines.size(), longestLine, name, birthdayDate);
    }

    private static List<String> readFileLines(String filePath) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return lines;
    }

    //Find the longest line
    private static String findLongestLine(List<String> lines) {
        String longestLine = "";

        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        return longestLine;
    }

    //Name parsing
    private static String parseNameFromFile(List<String> lines) {
        for (String line : lines) {
            if (line.startsWith("name:")) {
                return line.substring(5).trim();
            }
        }
        return null;
    }

    //HappyBirthday parsing
    private static String parseBirthdayFromFile(List<String> lines) {
        for (String line : lines) {
            if (line.startsWith("Date of birth:")) {
                return line.substring(15).trim();
            }
        }
        return null;
    }

    private static void writeToFile(String filePath, int lineCount, String longestLine, String name, String birthdayDate) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Number of lines in file1.txt: " + lineCount);
            writer.newLine();
            writer.write("The longest line in file1.txt: " + longestLine);
            writer.newLine();
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Birthday Date: " + birthdayDate);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}