package HomeWorks.HW5.Ex1;

import java.util.Arrays;
import java.util.Random;

public class FiveRandomNumbs {

    public static void generateFiveNumbs() {
        Random randomNumb = new Random();

        int[] arrayOfRandomNumbs = new int[5];

        for (int i = 0; i < arrayOfRandomNumbs.length; i++) {
            arrayOfRandomNumbs[i] = (randomNumb.nextInt(100) - 50);
        }
        int secondPositiveNumbIndex = findSecondPositiveNumbIndex(arrayOfRandomNumbs);
        int minValueInd = findMinValueIndex(arrayOfRandomNumbs);
        int prodOfEvenNumbs = findProdOfEvenNumbs(arrayOfRandomNumbs);

        System.out.println("Here are five random numbers: " + Arrays.toString(arrayOfRandomNumbs));

        try {
            System.out.println("The position of the second positive number is " + (secondPositiveNumbIndex + 1) + ". This is number " + arrayOfRandomNumbs[secondPositiveNumbIndex]);
        } catch (Exception e) {
            System.out.println("There are no two positive numbs!");
        }

        System.out.println("The position of the minimum number is " + (minValueInd + 1) + ". This is number " + arrayOfRandomNumbs[minValueInd]);
        System.out.println("The product  of all even number is " + prodOfEvenNumbs);


    }

    private static int findProdOfEvenNumbs(int[] arr) {
        int prod = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                prod *= arr[i];
            }
        }
        return prod;
    }

    private static int findMinValueIndex(int[] arr) {
        int index = 0;
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                index = i;
            }
        }
        return index;
    }

    private static int findSecondPositiveNumbIndex(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
            if (count == 2) {
                return i;
            }
        }
        return -1;
    }
}

