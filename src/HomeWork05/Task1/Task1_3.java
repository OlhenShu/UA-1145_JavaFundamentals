package HomeWork05.Task1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] numbers = new int[5];
        System.out.println("Enter the 5 different elements of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(numbers));

        int secondPositiveIndex = -1;
        int min = numbers[0];
        int minIndex = 0;
        int productOfEvens = 1;
        int positiveCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            // Find the position of the second positive number
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    secondPositiveIndex = i;
                }
            }
            // Find the minimum value and its position
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
            // Calculate the product of all entered even numbers
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                productOfEvens *= numbers[i];
            }
        }
        System.out.println("Position of the second positive number: " + (secondPositiveIndex + 1)); // Display index as 1-based
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Position of the minimum value: " + (minIndex + 1));

        if (productOfEvens != 1) {
            System.out.println("Product of all entered even numbers (excluding zero): " + productOfEvens);
        } else {
            System.out.println("No even numbers (excluding zero) were entered or product is zero.");
        }
    }
}
