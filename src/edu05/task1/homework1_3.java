package edu05.task1;

import java.util.Scanner;

import static java.lang.System.in;

// я цю задачку багато гуглила і копіювала частинки коду, бо вона для мене видалась щось дуже складною, з цими всіма розрахунками і індексами позицій

public class homework1_3 {
    public static int[] numbers;

    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(in);

        int[] numbers = new int[5];
        int positiveCount = 0;
        int secondPositiveIndex = -1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        long productOfEvenNumbers = 1;

        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = SCANNER.nextInt();

            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2 && secondPositiveIndex == -1) {
                    secondPositiveIndex = i;
                }
            }

            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }


            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                productOfEvenNumbers *= numbers[i];
            }
        }

        System.out.println("Position of the second positive number: " + (secondPositiveIndex != -1 ? secondPositiveIndex + 1 : "Not found"));
        System.out.println("Minimum value: " + min + ", and position: " + (minIndex + 1));
        System.out.println("Product of all entered even numbers: " + productOfEvenNumbers);

        SCANNER.close();
    }
}
