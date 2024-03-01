package denys.serdiuk.homework.week1;

import java.util.Scanner;
import java.lang.Math;
//test
public class Week1HW  {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(calculate());
		System.out.println();

		System.out.println(getToKnow());
		System.out.println();

		System.out.println(circleArea());
		System.out.println();

		System.out.println(phoneCalls());

	}

	// Task 3
	public static String calculate() {

		System.out.println("Please enter value a: ");
		int a = scanner.nextInt();
		System.out.println("Please enter value b: ");
		int b = scanner.nextInt();

		int sum = a + b;
		int difference = a - b;
		int product = a * b;
		double fraction = Math.round(a / b);

		return "a + b = " + sum + "\na - b = " + difference + "\na * b = " + product + "\na / b = " + fraction;
	}

	// Task 2.2 + Task 4
	public static String getToKnow() {

		System.out.println("What is your name?");
		String name = scanner.next();

		System.out.println("Where do you live?");
		String address = scanner.next();

		System.out.println("How are you?");
		String answer = scanner.next();

		return "Your name is: " + name + "\nYou live here: " + address + "\nYou are feeling " + answer;
	}

	// Task 2.1
	public static String circleArea() {

		System.out.println("Please input the circle radius: ");
		int radius = scanner.nextInt();

		double area = Math.round(Math.PI * radius * radius);
		double perimeter = Math.round(2 * (Math.PI * radius));

		return "The area is: " + area + "\nThe perimeter is: " + perimeter;
	}

	// Task 2.3
	public static String phoneCalls() {

		System.out.println("Please input cost per minute on call 1: ");
		double c1 = scanner.nextDouble();
		System.out.println("And the duration of call 1 in minutes: ");
		int t1 = scanner.nextInt();

		System.out.println("Please input cost per minute on call 2: ");
		double c2 = scanner.nextDouble();
		System.out.println("And the duration of call 2 in minutes: ");
		int t2 = scanner.nextInt();

		System.out.println("Please input cost per minute on call 3: ");
		double c3 = scanner.nextDouble();
		System.out.println("And the duration of call 3 in minutes: ");
		int t3 = scanner.nextInt();

		scanner.close();

		return "The cost of call 1 is " + (c1 * t1) + "\nThe cost of call 2 is: " + (c2 * t2)
				+ "\nThe cost of call 3 is: " + (c3 * t3);
	}

}
