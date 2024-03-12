package HW3;

import java.util.Scanner;

public class TheSmallestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Input number 2 : ");
        int number2 = scanner.nextInt();
        System.out.print("Input number 3 : ");
        int number3 = scanner.nextInt();
        scanner.close();

        System.out.printf("The smallest number is %d", findSmallestNumber(number1, number2, number3));

    }

    public static int findSmallestNumber(int number1, int number2, int number3) {

        if (number1 > number2) {
            if (number2 > number3) {
                return number2;
            } else {
                return number2;
            }
        } else if (number1 > number3) {
            return number3;
        }
        return number1;
    }


}
