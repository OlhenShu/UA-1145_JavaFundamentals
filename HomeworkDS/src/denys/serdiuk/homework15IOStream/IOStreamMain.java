package denys.serdiuk.homework15IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class IOStreamMain {

	public static void main(String[] args) {
		String filePath = "D:\\file1.txt.txt";
		int linesSize = 0;
		String longestLine = "";
		int longestLineNumber = 0;
		int lineNumber = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			List<String> lines = new ArrayList<>();
			String line;

			while ((line = reader.readLine()) != null) {
				lineNumber++;
				lines.add(line);
				if (line.length() > longestLine.length()) {
					longestLine = line;
					longestLineNumber = lineNumber;
				}
			}
			System.out.println("Contents of the file:");
			linesSize = lines.size();
			for (String content : lines) {
				System.out.println(content);
			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		}
		String numLines = "Number of lines in file 1 is: " + linesSize;
		System.out.println(numLines);

		System.out.println("The longest line is " + longestLineNumber);

		String myBirthday = "21.01.2000";

		String filePath2 = "D://file2.txt.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath2))) {

			writer.write(numLines);
			writer.newLine();
			writer.write(myBirthday);
			writer.newLine();
			writer.write("The longest line is " + longestLineNumber);
			writer.newLine();

			System.out.println("Strings have been written to the file");

		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}

	}

}
