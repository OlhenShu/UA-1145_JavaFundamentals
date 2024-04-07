package edu05.Hometask;

import java.util.Scanner;

public class ArrayOf05 {
    public static void main(String[] args) {
        ArrayOf05.createAndHandleArrey();
    }
    public static void createAndHandleArrey() {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        int[] arrs = new int[5];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = SCANNER.nextInt();
        }

        int position = getPositionOfSecondPositive(arrs);
        if (position != -1) {
            System.out.println("The position of the second positive number is [" +
                    position + "]. This number is " + arrs[position]);
        }

        int minPosition = positionOfMinValue(arrs);
        System.out.println("The position of the minimum number is [" +
                minPosition + "]. This number is " + arrs[minPosition]);

        long product = calculateProductOfEvenNumber(arrs);
        if (product != 1) {
           System.out.println("The product of all entered even numbers is " + product);
       } else {
            System.out.println("All entered numbers are odd, that is why product was not calculated.");
        }
    }

    public static int getPositionOfSecondPositive(int[] arr) {
        int count = 0;
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > 0)) {
                count++;
                position = i;
                if (count >= 2) {
                    break;
                }
            }
        }
        return position;
    }

    public static int positionOfMinValue(int[] arr) {
        int min = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                position = i;
            }
        }
        return position;
    }

    public static long calculateProductOfEvenNumber(int[] arr) {
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                product = product;
            } else if (arr[i] % 2 == 0) {
                product = product * arr[i];
            }
        }
        return product;
    }
}
