package denys.serdiuk.homework10Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyTask {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter text containing US currency formats: ");
		String inputText = scanner.nextLine();
		scanner.close();

		String currencyPattern = "\\$\\d+\\.\\d{2}";

		Pattern pattern = Pattern.compile(currencyPattern);

		Matcher matcher = pattern.matcher(inputText);

		System.out.println("US Currency Formats found in the text:");
		while (matcher.find()) {
			String currencyFormat = matcher.group();
			System.out.println(currencyFormat);
		}
	}
}
