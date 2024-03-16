package HomeWork03;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int number3 = scanner.nextInt();
        findSmallest(number1, number2, number3);
    }

    public static void findSmallest(int number1, int number2, int number3) {
        int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}
