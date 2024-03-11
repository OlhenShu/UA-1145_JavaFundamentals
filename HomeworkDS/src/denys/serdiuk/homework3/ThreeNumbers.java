package denys.serdiuk.homework3;

import java.util.Scanner;

public class ThreeNumbers {

	public static void main(String[] args) {
		System.out.println(checkNums());

	}

	public static String checkNums() {
		float[] nums = new float[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Please input the " + (i + 1) + " number: ");
			nums[i] = scanner.nextFloat();
			if (nums[i] >= -5 && nums[i] <= 5) {
				continue;
			} else {
				scanner.close();
				return "Not all numbers belong to the [5, -5] range.";
			}
		}
		scanner.close();
		return "All numbers belong to the range [-5,5].";
	}

}
