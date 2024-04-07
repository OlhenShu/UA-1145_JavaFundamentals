package edu05.Hometask;

import java.util.Scanner;

public class ArrayOf10 {
    public static void main(String[] args) {
        ArrayOf10.arrayInt();
    }
    public static void arrayInt() {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Please enter 10 numbers:");
        int[] arrs = new int[10];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = SCANNER.nextInt();
        }

        if (isPositive(arrs)) {
            System.out.println("The sum of the first 5 positive numbers is " + addPositive(arrs));
        } else {
            System.out.println("The product of the five last negatives numbers is " + multNegative(arrs));
        }
    }

    public static int addPositive(int[] arrs) {
        int sum = 0;
        for (int i = 0; i < arrs.length / 2 ; i++) {
             sum =  sum += arrs[i];
        }
        return sum;
    }

    public static long multNegative(int[] arrs) {
        int product = 1;
        for (int i = 5; i <= arrs.length - 1; i++) {
            product = product * arrs[i];
        }
        return product;
    }
    public static boolean isPositive(int[] arrs) {
        for (int i = 0; i <= (arrs.length / 2); i++) {
            if (arrs[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
