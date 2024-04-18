package HM3;

import java.util.Scanner;

public class checkNum {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int[] array;
        array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input [" + i + "] element of array: ");
            array[i] = sr.nextInt();
        }
        if ((array[0] >= -5) && (array[1] >= -5) && (array[2] >= -5 && array[0] <= 5) && (array[1] <= 5) && (array[2] <= 5)) {
            System.out.println("All elements belong to gap [-5;5]");
        } else {
            System.out.println("Our array have elements , which don't belong to the gap [-5;5]");
            for (int i = 0; i < 3; i++) {
                if ((array[i] >= -5) && (array[i] <= 5)) {
                    System.out.println("Numb[" + array[i] + "]  belong to the gap [-5;5]");
                } else {
                    System.out.println("Numb[" + array[i] + "]  doesn't belong to the gap[-5;5]");
                }
            }
        }

    }

}
