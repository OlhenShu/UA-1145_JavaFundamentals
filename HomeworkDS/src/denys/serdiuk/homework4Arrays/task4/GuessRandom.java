package denys.serdiuk.homework4Arrays.task4;

import java.util.Scanner;

public class GuessRandom {

	public static void main(String[] args) {
		int randomNum = (int) (Math.random() * 101);
		Scanner scanner = new Scanner(System.in);
		// System.out.println(randomNum);
		System.out.println("Guess what the number is!");
		int input = scanner.nextInt();
		while (input != randomNum) {
			if (input > randomNum) {
				System.out.println("Too high, try again.");
				input = scanner.nextInt();
			} else {
				System.out.println("Too low, try again");
				input = scanner.nextInt();
			}

		}
		System.out.println("Correct!");
		scanner.close();
	}
}
