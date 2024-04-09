package denys.serdiuk.homework11Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static double div(double num1, double num2) {
		double result = num1 / num2;

		if(num2 == 0) {
			throw new ArithmeticException("Can't divide by 0");
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1 = 0; 
		double num2 = 0;
		try {
		System.out.println("Please input num1: ");
		num1 = scanner.nextDouble();
		System.out.println("Please input num2: ");
		num2 = scanner.nextDouble();
		System.out.println(div(num1, num2));
		}catch (InputMismatchException i){
		throw new InputMismatchException("Please input the correct values");
		}catch (IllegalArgumentException e) {
			System.out.println("Please input the double number in format \"number.number\"");
		}

		scanner.close();
	}

}
