package homework16;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class FirstTask {
    public static void main(String[] args) {
        Path inputThing = Path.of("fileOne.txt");
        Path outputThing = Path.of("fileTwo.txt");
        ArrayList<String> lines = readFromFile(String.valueOf(inputThing));
        writeToFile(String.valueOf(outputThing), lines);
    }

    public static ArrayList<String> readFromFile(String nameOfTheFile) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nameOfTheFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        return lines;
    }

    public static void writeToFile(String nameOfTheFile, ArrayList<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameOfTheFile))) {
            writer.write("Кількість стрічок в fileOne.txt: "+lines.size());
            writer.newLine();
            String theLongestLine = "";
            for (String line:lines){
                if (line.length()>theLongestLine.length()){
                    theLongestLine=line;
                }
            }
            writer.write("Найдовна стрічка в fileOne.txt: "+theLongestLine);
            writer.write("Ім'я: Роман");
            writer.write("День народження: 2005.08.02");
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
