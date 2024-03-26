package Practicals.Pr4.Ex1;

import java.util.Scanner;

public class NumberOfOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = new int[3];
        int numberOfOdd = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            arrayOfNumbers[i] = scanner.nextInt();

            if (Math.abs(arrayOfNumbers[i]) % 2 == 1)
                numberOfOdd++;
        }
        scanner.close();

        System.out.printf("The number of odd numbers: %d", numberOfOdd);
    }
}
