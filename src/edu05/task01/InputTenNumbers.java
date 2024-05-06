package edu05.task01;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class InputTenNumbers {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        System.out.println("You need to input ten positive or negative integers for the next processing result.");

        int[] arrayNumbers = new int[10];
        for (int i = 0; i < arrayNumbers.length; i++) {

            System.out.println("Input number " + (i + 1) + " out of 10");
            arrayNumbers[i] = SCANNER.nextInt();
            SCANNER.nextLine();
            // System.out.println("Input number " + (i + 1) + " out of 10:");
            //            while (!SCANNER.hasNextInt()) {
            //                System.out.println("That's not a number. Please enter a number:");
            //                SCANNER.next();
            //            }
            //            arrayNumbers[i] = SCANNER.nextInt();
            //            SCANNER.nextLine();
            //Use Scanner.hasNextInt() to check if the next input is an integer
            // before calling Scanner.nextInt() to prevent InputMismatchException.
        }

        System.out.println("your numbers is: " + Arrays.toString(arrayNumbers));
        InputTenNumbers inputTenNumbers = new InputTenNumbers();
        boolean first = inputTenNumbers.checkIfFirstFivePositiveN(arrayNumbers);
        boolean second = inputTenNumbers.checkIfSecondFiveNegativeN(arrayNumbers);

//Please give me feedback on that part
        if (first) {
            System.out.println("The sum of first half numbers is: '" +
                    inputTenNumbers.sumOfFirstFivePositiveN(arrayNumbers) + "'");
        } else if (second) {
            System.out.println("The product of second five numbers is: '" +
                    inputTenNumbers.productOfSecondFiveNegativeN(arrayNumbers) + "'");
        } else {
            System.out.println("Your input is inconsistent. Perhaps you need to change the combination of numbers" +
                    " or avoid using zero.");
        }
        // The current use of else if in your output logic assumes that only one of the conditions
        // can be true and ignores the possibility of both conditions being met.
        // If both halves meet their respective conditions (first half all positive,
        // second half all negative), only the sum of the first half will be reported.
        // This might be intended, but if not,
        // adjusting this logic to handle and report both outcomes when applicable could be beneficial.

        //if (first) {
        //            System.out.println("The sum of first half numbers is: '" +
        //                    inputTenNumbers.sumOfFirstFivePositiveN(arrayNumbers) + "'");
        //        }
        //        if (second) {
        //            System.out.println("The product of second five numbers is: '" +
        //                    inputTenNumbers.productOfSecondFiveNegativeN(arrayNumbers) + "'");
        //        }
        //        if (!first && !second) {
        //            System.out.println("Your input is inconsistent. Perhaps you need to change the combination of numbers" +
        //                    " or avoid using zero.");
        //        }
    }

    public boolean checkIfFirstFivePositiveN(int[] numbers) {
        for (int i = 0; i < (numbers.length / 2); i++) {
            if (numbers[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOfFirstFivePositiveN(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < (numbers.length / 2); i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public boolean checkIfSecondFiveNegativeN(int[] numbers) {
        for (int i = numbers.length / 2; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                return false;
            }
        }
        return true;
    }

    public int productOfSecondFiveNegativeN(int[] numbers) {
        int product = 1;
        for (int i = numbers.length / 2; i < numbers.length; i++) {

            product *= numbers[i];
        }
        return product;
    }

    private static boolean checkPositiveHalf(int[] numbers) {
        boolean checkPositive = true;

        for (int i = 0; i < numbers.length / 2; i++) {

            if (numbers[i] < 0) {
                checkPositive = false;
                break;
            }
        }
        return checkPositive;
    }
}
