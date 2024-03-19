package homework_edu05.Homework05.Task2;

import java.util.Scanner;

public class SumOfTwoNumbers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String userAnswer;
        do {

            double[] twoNumbers = new double[2];
            System.out.println("Enter 2 numbers: ");
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                twoNumbers[i] = SCANNER.nextDouble();
            }
            SCANNER.nextLine();

            double sumOfTwo = sumOfTwo(twoNumbers);
            System.out.println("Sum of two numbers: " + sumOfTwo);

            System.out.println("Again? (yes/no) ");
            userAnswer = SCANNER.nextLine();


        } while (userAnswer.equalsIgnoreCase("yes"));


    }

    static double sumOfTwo(double[] twoNumbers) {
        double sum = 0;
        for (int i = 0; i < twoNumbers.length; i++) {
            sum += twoNumbers[i];

        }
        return sum;
    }

}
