package HM3;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] array;
        array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input [" + i + "] element of array: ");
            array[i] = sr.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

