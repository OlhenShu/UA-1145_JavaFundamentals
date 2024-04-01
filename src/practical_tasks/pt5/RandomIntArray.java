package practical_tasks.pt5;

import java.util.Arrays;
import java.util.Random;

public class RandomIntArray {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println("The biggest value in array: " + getTheBiggestNumberInArray(array));
        System.out.println("Sum of positive numbers: " + getSumOfPositiveNumbers(array));
        System.out.println("Count of negative numbers: " + getCountOfNegativeNumbers(array));
        System.out.println(positiveOrNegative(array));
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(2001) - 1000;
        }
        return array;
    }

    public static int getTheBiggestNumberInArray(int... values) {

        //return Arrays.stream(values).max().getAsInt();

        int max = values[0];
        for (int value : values) {
            if (value >= max) {
                max = value;
            }
        }
        return max;
    }

    public static int getSumOfPositiveNumbers(int... values) {
        int sumOfPositive = 0;
        for (int value : values) {
            if (value > 0) {
                sumOfPositive += value;
            }
        }
        return sumOfPositive;
    }

    public static int getCountOfNegativeNumbers(int... values) {
        int counter = 0;
        for (int value : values) {
            if (value < 0) {
                counter++;
            }
        }
        return counter;
    }

    public static String positiveOrNegative(int... values) {
        int negativeNumbersCounter = getCountOfNegativeNumbers(values);

        if (negativeNumbersCounter > 5) {
            return "There are more negative values in the array.";
        } else if (negativeNumbersCounter < 5) {
            return "There are more positive values in the array.";
        } else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }
}
