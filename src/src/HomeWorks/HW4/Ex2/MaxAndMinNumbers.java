package HomeWorks.HW4.Ex2;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.println("How many numbers do you want to input?");
        int quantityOfNumbers = scanner.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < quantityOfNumbers; i++) {
            System.out.print("Input " + (i + 1) + " number: ");
            System.out.println();
            int numbTemp = scanner.nextInt();

            if (numbTemp > maxNumber) {
                maxNumber = numbTemp;
            }
            if (numbTemp < minNumber) {
                minNumber = numbTemp;
            }
        }
        scanner.close();

        System.out.printf("The biggest number you have input is %d and the smallest is %d!", maxNumber, minNumber);
    }
}
