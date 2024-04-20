package HM5;

import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int array[] = new int[5];
        int counter = 0;
        System.out.println("Include 5 integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + (i + 1) + "]   " + "\t");
            array[i] = sr.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
                if (counter == 2) {
                    System.out.print("Our second positive element with number " + (i + 1) + " which value is " + array[i]);
                    break;
                }
            }
        }
        if (counter < 2) {
            System.out.println("We don't have a second positive element.");
        }
        FindMin(array);
        System.out.println("The product of all entered even numbers :  " + SumEvenNumbers(array));
    }

    public static void FindMin(int array[]) {
        int min = array[0];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                counter = i;
            }
        }
        System.out.println("\n" + "The position of minimum value is " + (counter + 1) + " and the smallest element is " + min);

    }

    public static int SumEvenNumbers(int array[]) {
        int sumEvenNumb = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                sumEvenNumb += array[i];
            }
        }
        return sumEvenNumb;
    }
}

