package edu05.task01;

import java.util.Scanner;

import static java.lang.System.in;

public class InputFiveNumbers {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        InputFiveNumbers fiveNumbers = new InputFiveNumbers();
        System.out.println("You need to input five integer numbers(positive or negative)");
        int[] arrayNumbers = new int[5];
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Input number " + (i + 1) + " out of 5");
            arrayNumbers[i] = SCANNER.nextInt();
            SCANNER.nextLine();
        }

        int secondPositiveIndex = fiveNumbers.findSecondPositive(arrayNumbers);
        System.out.println("Position of second positive number that you input: " + (secondPositiveIndex + 1));

        int[] minValue = fiveNumbers.findMinValue(arrayNumbers);
        System.out.println("The minimum value is: " + minValue[0] + " and its position in the array: " + (minValue[1] + 1));

        int productOfEnteredEven = fiveNumbers.calculateProductOfEvenNumbers(arrayNumbers);
        System.out.println("Product of your even numbers is: " + productOfEnteredEven +
                "\n Notice, if your numbers not contains any integers to multiply, you still get '1'");
    }

    public int findSecondPositive(int[] numbers) {
        int positiveCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    return i;
                }
            }
        }
        return -1; // Return -1 if there is no second positive number
    }

    public int[] findMinValue(int[] fiveNumbers) {
        int minIndex = 0;
        int minValue = fiveNumbers[0];
        for (int i = 1; i < fiveNumbers.length; i++) {
            if (fiveNumbers[i] < minValue) {
                minValue = fiveNumbers[i];
                minIndex = i;
            }

        }
        return new int[]{minValue, minIndex};
    }

    public int calculateProductOfEvenNumbers(int[] fiveNumbers) {
        int product = 1;
        for (int i = 0; i < fiveNumbers.length; i++) {
            if ((fiveNumbers[i] != 0) && (fiveNumbers[i] % 2 == 0)) {
                product *= fiveNumbers[i];
            }
        }
        return product;
    }
}
//It's code with same improvement for your solution
//1. Providing feedback when no second positive number exists or when there are not enough even numbers
// to calculate a product could improve user experience.

//2. The solution currently proceeds directly to finding the second positive number
// and calculating products without ensuring there are enough valid entries to perform these actions.
// It could be beneficial to add checks for these conditions.

// The repeated use of SCANNER.nextLine() after SCANNER.nextInt()
// could be optimized by ensuring that the input buffer
// is cleared more efficiently or by simply using SCANNER.nextLine()
// and parsing the integer with Integer.parseInt().

//public class InputFiveNumbers {
//    private static final Scanner SCANNER = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        System.out.println("You need to input five integer numbers (positive or negative).");
//        int[] arrayNumbers = new int[5];
//        for (int i = 0; i < arrayNumbers.length; i++) {
//            System.out.println("Input number " + (i + 1) + " out of 5:");
//            while (!SCANNER.hasNextInt()) {
//                System.out.println("That's not a number. Please enter a number:");
//                SCANNER.next();
//            }
//            arrayNumbers[i] = SCANNER.nextInt();
//            SCANNER.nextLine();  // Clear the buffer
//        }
//        SCANNER.close();
//
//        InputFiveNumbers fiveNumbers = new InputFiveNumbers();
//
//        int secondPositiveIndex = fiveNumbers.findSecondPositive(arrayNumbers);
//        if (secondPositiveIndex != -1) {
//            System.out.println("Position of second positive number that you input: " + (secondPositiveIndex + 1));
//        } else {
//            System.out.println("There is no second positive number.");
//        }
//
//        int[] minValue = fiveNumbers.findMinValue(arrayNumbers);
//        System.out.println("The minimum value is: " + minValue[0] + " and its position in the array: " + (minValue[1] + 1));
//
//        int productOfEnteredEven = fiveNumbers.calculateProductOfEvenNumbers(arrayNumbers);
//        if (productOfEnteredEven != 1) {
//            System.out.println("Product of your even numbers is: " + productOfEnteredEven);
//        } else {
//            System.out.println("No even numbers to multiply, or all even numbers are zero.");
//        }
//    }
//
//    public int findSecondPositive(int[] numbers) {
//        int positiveCount = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 0) {
//                positiveCount++;
//                if (positiveCount == 2) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public int[] findMinValue(int[] fiveNumbers) {
//        int minIndex = 0;
//        int minValue = fiveNumbers[0];
//        for (int i = 1; i < fiveNumbers.length; i++) {
//            if (fiveNumbers[i] < minValue) {
//                minValue = fiveNumbers[i];
//                minIndex = i;
//            }
//        }
//        return new int[]{minValue, minIndex};
//    }
//
//    public int calculateProductOfEvenNumbers(int[] fiveNumbers) {
//        int product = 1;
//        boolean hasEven = false;
//        for (int number : fiveNumbers) {
//            if (number != 0 && number % 2 == 0) {
//                product *= number;
//                hasEven = true;
//            }
//        }
//        return hasEven ? product : 1;
//    }
//}