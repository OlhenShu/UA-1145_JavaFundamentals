package denys.serdiuk.homework4Arrays.task2;

import java.util.Scanner;

public class DoWhile {
	public static void sum() {
		String answer = "yes";
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		do {
		System.out.println("Please enter the 1st number: ");
		num1 = scanner.nextInt();
		System.out.println("Please enter the 2nd number: ");
		num2 = scanner.nextInt();
		System.out.println("The sum is: "+ (num1 + num2));
		System.out.println("Would you like to perform operation again? ");
		answer = scanner.next();
		} while (answer.equalsIgnoreCase("yes"));
		System.out.println("Calculator closed");
		scanner.close();
	}

	public static void main(String[] args) {
		sum();
	}
}
