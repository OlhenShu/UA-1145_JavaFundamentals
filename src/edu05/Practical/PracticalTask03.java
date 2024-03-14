package edu05.Practical;

import java.util.Arrays;
import java.util.Random;

public class PracticalTask03 {
    public static void main(String[] args) {
        int[] arr = generateRandomNumbers(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value is " + max(arr));
        System.out.println("The sum of positive values is " + sumOfPositives(arr));
        System.out.println("The number of negatives values is " + countOfNegatives(arr));
        System.out.println("The number of negatives values is " + countOfPositives(arr));
        int countPositives = countOfPositives(arr);
        int countNegatives = countOfNegatives(arr);
        if (countPositives > countNegatives) {
            System.out.println("There are more positive values in the array.");
        } else if (countPositives < countNegatives) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }

    static int[] generateRandomNumbers(int quantity) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-99, 100);
        }
        return arr;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int countOfNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    static int countOfPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }
}