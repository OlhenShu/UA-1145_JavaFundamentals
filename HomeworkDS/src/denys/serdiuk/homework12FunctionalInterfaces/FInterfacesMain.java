package denys.serdiuk.homework12FunctionalInterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class FInterfacesMain {
	public static String encrypt(String input, int n) {
		StringBuilder encrypted = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				char base = Character.isLowerCase(c) ? 'a' : 'A';
				char encryptedChar = (char) (((c - base - n + 26) % 26) + base);
				encrypted.append(encryptedChar);
			} else {
				encrypted.append(c);
			}
		}
		return encrypted.toString();
	}

	public static String decrypt(String input, int shift) {
		return encrypt(input, -shift);
	}

	public static boolean isValidDateFormat(String input) {

		String regexPattern = "^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.\\d{2}$";

		Pattern pattern = Pattern.compile(regexPattern);

		java.util.regex.Matcher matcher = pattern.matcher(input);

		return matcher.matches();
	}

	public static boolean isLeap(int year) {
		boolean isLeap = false;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeap = true;
		}

		return isLeap;
	}

	public static void findOutWeekDay(String inputDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse(inputDate, formatter);

		System.out.println("Date: " + date);
		System.out.println("Day of the week: " + date.getDayOfWeek());

		LocalDate dateAfter6Months = date.plusMonths(6);
		LocalDate dateAfter12Months = date.plusYears(1);

		System.out.println("Date after 6 months: " + dateAfter6Months);
		System.out.println("Day of the week after 6 months: " + dateAfter6Months.getDayOfWeek());

		System.out.println("Date after 12 months: " + dateAfter12Months);
		System.out.println("Day of the week after 12 months: " + dateAfter12Months.getDayOfWeek());
	}

	public static void main(String[] args) {
		String originalSentence = "Hello, World!";
		int shift = 3;

		String encryptedSentence = encrypt(originalSentence, shift);
		System.out.println("Original: " + originalSentence);
		System.out.println("Encrypted: " + encryptedSentence);

		String decryptedSentence = decrypt(encryptedSentence, shift);
		System.out.println("Decrypted: " + decryptedSentence);

		String date1 = "12.31.22";
		String date2 = "02.29.21";
		String date3 = "13.01.22";

		System.out.println(date1 + " is valid? " + isValidDateFormat(date1));
		System.out.println(date2 + " is valid? " + isValidDateFormat(date2));
		System.out.println(date3 + " is valid? " + isValidDateFormat(date3));

		int year1 = 2020;
		int year2 = 2021;
		int year3 = 2000;

		System.out.println(year1 + " is a leap year? " + isLeap(year1));
		System.out.println(year2 + " is a leap year? " + isLeap(year2));
		System.out.println(year3 + " is a leap year? " + isLeap(year3));

		findOutWeekDay("21.01.2000");

	}
}
