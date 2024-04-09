package denys.serdiuk.homework10Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
	
	public static boolean sentenceCheck(String sentence) {
		String pattern = "^[a-zA-Z\\s-]+$";
		Pattern regex = Pattern.compile(pattern);
		Matcher matcher = regex.matcher(sentence);
		
		return matcher.matches();
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, please input your first and last name: ");
		String userInput = scanner.nextLine();
		if(!sentenceCheck(userInput)) {
		do{
			System.out.println("Your first and last name must contain english letters, hyphens and spaces: ");
			userInput = scanner.nextLine();
		}
		while(!sentenceCheck(userInput));
		}
		
		System.out.printf("Hi, %s, nice to meet you!", userInput);

	}

}
