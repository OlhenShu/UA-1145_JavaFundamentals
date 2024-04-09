package HomeWork05.Task1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] numbers = new int[10];
        System.out.println("Enter the 10 elements of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(numbers));
        boolean firstFivePositive = true;
        int result = 0;
        for (int i = 0; i < numbers.length - 5; i++) {
            if (numbers[i] <= 0) {
                firstFivePositive = false;
                break;
            }
        }
        if (firstFivePositive) {
            for (int i = 0; i < numbers.length - 5; i++) {
                result += numbers[i];
            }
            System.out.println("The sum of first positive numbers: " + result);
        } else {
            result = 1;
            for (int i = 5; i < numbers.length; i++) {
                result *= numbers[i];
            }
            System.out.println("The product of last 5 numbers: " + result);
        }


    }
}


