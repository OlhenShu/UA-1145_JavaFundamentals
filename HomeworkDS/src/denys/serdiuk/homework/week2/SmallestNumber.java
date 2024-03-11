package denys.serdiuk.homework.week2;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(smallestNumber());

	}

	public static String smallestNumber() {
		int[] numArr = new int[3];

		for (int i = 0; i < 3; i++) {//use numArr.length instead of 3
			System.out.println("Please input the " + (i + 1) + " number in the list:");
			numArr[i] = scanner.nextInt();
		}
		return "The smallest number is: " + Arrays.stream(numArr).min().getAsInt();
	}
}
