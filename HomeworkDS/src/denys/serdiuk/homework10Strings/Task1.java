package denys.serdiuk.homework10Strings;

import java.util.Scanner;

public class Task1 {

	public static String longestWord(String sentence) {
		String[] splitted = sentence.split(" ");

		String longestWord = splitted[0];

		for (String word : splitted) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}

	public static String numLetters(String word) {
		return "The number of letters in the longest word is: " + word.length();
	}

	public static String reverse(String sentence) {
		String words[] = sentence.split(" ");
		if (words.length >= 2) {
			StringBuilder secondWord = new StringBuilder(words[1]);
			return secondWord.reverse().toString();
		} else {
			return "Not enough words to reverse";
		}
	}

	public static String convertToSingleSpace(String sentence) {

		String[] words = sentence.trim().split("\\s+");

		return String.join(" ", words);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your sentence (it must contain 5 words): ");
		String sentence = scanner.nextLine();

		System.out.println("removed spaces: " + convertToSingleSpace(sentence));
		
		sentence = convertToSingleSpace(sentence);
		
		String longest = longestWord(sentence);

		System.out.println(numLetters(longest));

		System.out.println(reverse(sentence));

		System.out.println(convertToSingleSpace(sentence));

	}

}
