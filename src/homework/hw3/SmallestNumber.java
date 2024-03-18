package homework.hw3;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("Enter 3 integers:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        System.out.println("The smallest number is " + getSmallestNumber(num1, num2, num3));
    }

    private static int getSmallestNumber(int num1, int num2, int num3) {
      return Math.min(Math.min(num1, num2), num3);
    }
}
