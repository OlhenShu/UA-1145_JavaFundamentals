package denys.serdiuk.homework15IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PublicToPrivateUpdater {
	public static String publicToPrivateUpdater(String inputFilePath, String outputFilePath) {
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

			String line;
			while ((line = reader.readLine()) != null) {
				line = line.replaceAll("\\bpublic\\b", "private");
				writer.write(line);
				writer.newLine();
			}

			return "File processed successfully.";

		} catch (IOException e) {
			return "Error processing file: " + e.getMessage();
		}
	}
}
