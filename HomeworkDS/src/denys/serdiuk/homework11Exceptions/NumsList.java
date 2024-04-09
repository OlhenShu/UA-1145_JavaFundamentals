package denys.serdiuk.homework11Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumsList {
	public static boolean readNumber(int start, int end) {
		int[] nums = new int[end - start + 1];
		int temp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your number: ");
		int userInput;
		try {
			userInput = scanner.nextInt();
		} catch (InputMismatchException a) {
			throw new InputMismatchException("You must enter a valid number");
		}
		boolean numberIsPresent = false;
		for (int i = start; i <= end; i++) {
			nums[temp] = i;
			temp++;
			try {
				if (userInput == i) {

					numberIsPresent = true;
					return numberIsPresent;
				}
			} catch (InputMismatchException b) {
				throw new InputMismatchException("Number not found in range");
			}
		}
		return numberIsPresent;
	}

	public static void main(String[] args) {
		System.out.println(readNumber(2, 10));

	}

}
