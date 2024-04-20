package HM5;

import java.util.Scanner;

public class TenIntegers {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Include 10 integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + (i + 1) + "]   " + "\t");
            array[i] = sr.nextInt();
        }

        int sum = 0;
        boolean allPositive = true;

        for (int i = 0; i < 5; i++) {
            if (array[i] <= 0) {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            for (int i = 0; i < 5; i++) {
                sum += array[i];
            }
            System.out.println("Sum of the first five elements: " + sum);
        } else {
            sum = 1;
            for (int i = 5; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println("Product of the last five elements: " + sum);
        }
    }
}

