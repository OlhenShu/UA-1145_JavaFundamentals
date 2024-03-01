package denys.serdiuk.homework.week2;

import java.util.Scanner;
import java.lang.Math;

public class TriangleArea {

	public static void main(String[] args) {

		System.out.println(triangleArea());

	}

	public static double triangleArea() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input base: ");
		int base = scanner.nextInt();

		System.out.println("Please input height: ");
		int height = scanner.nextInt();

		scanner.close();

		return Math.round(base * height) / 2;
	}
}
