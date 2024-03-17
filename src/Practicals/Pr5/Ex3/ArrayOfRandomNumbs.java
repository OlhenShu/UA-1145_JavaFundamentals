package Practicals.Pr5.Ex3;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfRandomNumbs {
    public static void main(String[] args) {
        int[] arrayOfRandomNumbers = new int[10];
        Random randomNumb = new Random();
        int countPositiveNumb = 0;
        int countNegativeNumb = 0;
        long totalPosSum = 0;

        for (int i = 0; i < 10; i++) {
            arrayOfRandomNumbers[i] = randomNumb.nextInt(200)-100;

            if (arrayOfRandomNumbers[i] > 0) {
                countPositiveNumb++;
                totalPosSum += arrayOfRandomNumbers[i];
            }
            if (arrayOfRandomNumbers[i] < 0) {
                countNegativeNumb++;
            }
        }
        System.out.println(Arrays.toString(arrayOfRandomNumbers));

        System.out.println("The biggest number in random array is " + findMaxNumb(arrayOfRandomNumbers));
        System.out.println("The sum of positive numbers is " + totalPosSum);
        System.out.println("The number of negative numbers are " + countNegativeNumb);
        if (countNegativeNumb > countPositiveNumb) {
            System.out.println("There are more negative values in the array.");
        } else if (countPositiveNumb > countNegativeNumb) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }

    public static int findMaxNumb(int[] array) {
        int maxNumb = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumb) {
                maxNumb = array[i];
            }
        }
        return maxNumb;
    }


}
