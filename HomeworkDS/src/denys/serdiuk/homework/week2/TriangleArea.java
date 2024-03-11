package denys.serdiuk.homework.week2;

import java.util.Scanner;

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

		return Math.round(base * height) / 2;//its doesn't correct, you should use a double type for the result
		//return base * height / 2.0;
	}
}
// The code is correct, but this is not the best way to calculate the area of a triangle.
//What will be in case if The user should input the sides of the triangle, not the base and the height.
// And think about the case when the user inputs the base and the height, but the triangle is not a right-angled triangle.
//And also, think about a case when triangle doesn't exist, for example, when the user inputs the sides of the triangle, and the sum of two sides is less than the third side.
