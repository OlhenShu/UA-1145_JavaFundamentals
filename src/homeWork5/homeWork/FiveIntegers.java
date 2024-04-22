package homeWork5.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class FiveIntegers {

    private final int[] fiveNumbersArray = new int[5];

    void inputNumbers(Scanner scanner) {
        for (int i = 0; i < fiveNumbersArray.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number: ");
            fiveNumbersArray[i] = scanner.nextInt();
        }
    }

    void positionOfSecondPositiveNum(Scanner scanner) {
        inputNumbers(scanner);
        int firstPositiveIndex = 0;
        int secondPositiveIndex = 0;
        for (int i = 0; i < fiveNumbersArray.length; i++) {
            if (fiveNumbersArray[i] > 0) {
                if (firstPositiveIndex == 0) {
                    firstPositiveIndex = i + 1;
                } else if (secondPositiveIndex == 0) {
                    secondPositiveIndex = i + 1;
                } else {
                    break;
                }
            }
        }
        System.out.println("Array of integers ->> " + Arrays.toString(fiveNumbersArray));
        System.out.println("The position of second positive number is - >> " + secondPositiveIndex);
    }

    void positionOfMinimumNumber(Scanner scanner) {
        inputNumbers(scanner);
        int minimumValue = Integer.MAX_VALUE;
        int minimumValuePosition = 0;
        for (int i = 0; i < fiveNumbersArray.length; i++) {
            if (fiveNumbersArray[i] < minimumValue) {
                minimumValue = fiveNumbersArray[i];
                minimumValuePosition = i + 1;
            }
        }
        System.out.println("Array of integers ->> " + Arrays.toString(fiveNumbersArray));
        System.out.println("The position of minimum value ->> " + minimumValuePosition);
    }

    void productOfEvenNumbers(Scanner scanner) {
        inputNumbers(scanner);
        int product = 1;
        for (int num : fiveNumbersArray) {
            if (num % 2 == 0 && num != 0) {
                product *= num;
            }
        }
        System.out.println("Array of integers ->> " + Arrays.toString(fiveNumbersArray));
        System.out.println("The product of even numbers ->> " + product);
    }
}

class RunFiveIntegers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        FiveIntegers fiveIntegers = new FiveIntegers();
        fiveIntegers.positionOfSecondPositiveNum(sc);
        fiveIntegers.positionOfMinimumNumber(sc);
        fiveIntegers.productOfEvenNumbers(sc);
    }
}
//Each method calls inputNumbers, which could lead to repeated prompts for input.
// Consider separating the input collection from the processing logic.

//Initialize firstPositiveIndex and secondPositiveIndex to -1 to correctly identify positions.
//The initial values for firstPositiveIndex and secondPositiveIndex should be -1 instead of 0 to correctly handle arrays starting with a positive number.

// Complete the productOfEvenNumbers method to ensure it prints out the result.