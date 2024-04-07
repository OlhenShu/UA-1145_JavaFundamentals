package edu05.Practical;

import java.util.Arrays;
import java.util.Random;

public class PrTask03 {
    public static void main(String[] args) {
        int[] arr = generateRandomNumbers();

        System.out.println(Arrays.toString(arr));
        System.out.println("The max value is " + max(arr));
        System.out.println("The sum of positive values is " + sumOfPositives(arr));
        System.out.println("The count of negative values is " + countOfNegatives(arr));
        int countPositives = countOfPositives(arr);
        int countNegatives = countOfNegatives(arr);
        if (countNegatives > countPositives) {
            System.out.println("There are more negative values in array");
        } else if (countNegatives < countPositives) {
            System.out.println("There are more positive values in array");
        } else {
            System.out.println("There are equal number of positive and negatives values.");
        }

    }
    static int max(int[] arr) {
      int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int[] generateRandomNumbers() {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rnd.nextInt(-99, 100);
        }
        return arr;

    }

    static long sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int countOfNegatives(int[] arr)  {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }
    static int countOfPositives(int[] arr)  {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }
}
