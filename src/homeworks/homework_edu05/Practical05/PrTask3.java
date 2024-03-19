package homework_edu05.Practical05;

import java.util.Arrays;
import java.util.Random;

public class PrTask3 {
    public static void main(String[] args) {
        int[] arr = randomNumbers(10);

        System.out.println(Arrays.toString(arr));
        System.out.println("Max number is: " + max(arr));
        System.out.println("The sum of positive numbers is: " + sumOfPositives(arr));
        System.out.println("The number of negative numbers is: " + countNegatives(arr));
        int countPositives = countPositives(arr);
        int countNegatives = countNegatives(arr);
        if (countNegatives > countPositives){
            System.out.println("There are more negative values in the array.");
        } else if (countNegatives<countPositives) {
            System.out.println("There are more positive values in the array." );
        }
        else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }


    }

    static int[] randomNumbers(int quantity) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-100, 101);
        }
        return arr;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
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
    static int countNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count ++;
            }
        }
        return count;
    }
    static int countPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count ++;
            }
        }
        return count;
    }
}
