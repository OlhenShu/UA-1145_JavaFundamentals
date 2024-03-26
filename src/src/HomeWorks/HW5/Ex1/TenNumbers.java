package HomeWorks.HW5.Ex1;

import java.util.Arrays;
import java.util.Random;

public class TenNumbers {
    public static void generateTenNumbs() {
        Random randomNumb = new Random();

        int[] arrayOfRandomNumbs = new int[10];

        for (int i = 0; i < arrayOfRandomNumbs.length; i++) {
            arrayOfRandomNumbs[i] = randomNumb.nextInt(200) - 100;
        }
        System.out.println("Here are ten random numbers: " + Arrays.toString(arrayOfRandomNumbs));

        boolean is_5Positive = true;
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < arrayOfRandomNumbs.length; i++) {
            if (arrayOfRandomNumbs[i] > 0 && i <= 4) {
                sum += arrayOfRandomNumbs[i];
            } else if (arrayOfRandomNumbs[i] <= 0 && i <= 4) {
                is_5Positive = false;
            } else if (is_5Positive && i > 4) {
                break;
            } else if (arrayOfRandomNumbs[i] != 0) {
                prod *= arrayOfRandomNumbs[i];
            }
        }
        if (is_5Positive) {
            System.out.println("Here is the sum of the first five numbs: " + sum);
        } else {
            System.out.println("Here is the product of the last five numbs: " + prod);
        }
    }
}