package denys.serdiuk.homework3;

import java.util.Scanner;


public class MaxAndMin {

	public static void main(String[] args) {
		System.out.println(maxMin());
	}

	public static String maxMin() {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[3];

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Please input the number " + (i + 1));
			nums[i] = scanner.nextInt();
		}
		int min = nums[0];
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		scanner.close();
		return "Min number is: " + min + "\nMax number is: " + max;
	}

}
