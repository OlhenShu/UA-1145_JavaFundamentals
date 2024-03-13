package homework_edu04.homework;

import java.util.Scanner;

public class homeworkTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the first integer: ");
        int number1 = SCANNER.nextInt();
        System.out.println("Input the second integer: ");
        int number2 = SCANNER.nextInt();
        System.out.println("Input the third integer: ");
        int number3 = SCANNER.nextInt();

        int maxNumber = number1;
        if (number2 > maxNumber) {
            maxNumber = number2;
        }
        if (number3 > maxNumber) {

            maxNumber = number3;
        }
        System.out.println("The maximum number is: " + maxNumber);

        int minNumber = number1;
        if (number2 < minNumber) {
            minNumber = number2;
        }
        if (number3 < minNumber) {
            minNumber = number3;
        }
        System.out.println("The minimum number is: " + minNumber);

    }
}
