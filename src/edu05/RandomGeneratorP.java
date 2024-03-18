package edu05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

import static java.lang.System.in;

public class RandomGeneratorP {
    public static Scanner scanner = new Scanner(in);

    public static int anInt = RandomGenerator.getDefault().nextInt(-1000, 1000);

    public static void getChecked(int anInt) {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int lowerBound = -1000;

        // Generate random integers in range 0 to 999
        int lamb[] = new int[10];
        for (int i = 0; i < 10; i++) {
            //int rand_int =
            lamb[i] = lowerBound + rand.nextInt(1000 - lowerBound + 1);
            //  lamb[i] =RandomGenerator.getDefault().nextInt(-1000, 1000);
        }
        System.out.println(Arrays.toString(lamb));
        int max = lamb[0];
        int countNegative = 0;
        int countPositive = 0;
        int sum = 0;
        //int negativeNum[] = new int[10];
        int positiveNum[] = new int[10];
        for (int i = 0; i < lamb.length; i++) {
            if (lamb[i] < 0) {
                countNegative++;
                //negativeNum[i] = lamb[i];

            }
            if (lamb[i] > 0) {
                countPositive++;
            }
        }
        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array.");
        } else if (countNegative == countPositive) {
            System.out.println("There are an equal number of positive and negative values in the array.");
        } else {
            System.out.println("There are more positive values in the array.");
        }


        for (int i = 0; i < lamb.length; i++) {
            if (lamb[i] > 0) {

                positiveNum[i] = lamb[i];
                sum += lamb[i];
            }

        }
        for (int i = 1; i < lamb.length; i++) {
            //    if (lamb[i]<0)negativeNum [i]=lamb[i];
            if (lamb[i] > max) max = lamb[i];
        }

        System.out.println("Max is " + max);
        System.out.println("Sum of positive numbers is " + sum);
        System.out.println("//[for personal use]: positive is " + Arrays.toString(positiveNum));
        System.out.println("Number of negative numbers is " + countNegative);
        // System.out.println("Number of negative numbers is "+ countNegative);

    }


}

