package edu16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("file1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedWriter printer = new BufferedWriter(new FileWriter("file2.txt"))) {

            printer.write("Count of lines in file1.txt: " + lines.size() + "\n");


            String longestLine = "";
            for (String line : lines) {
                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
            }
            printer.write("Longest line in file1.txt: " + longestLine + "\n");


            printer.write("My name: Anna\n");
            printer.write("Birthday date: June 25, 1983\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
