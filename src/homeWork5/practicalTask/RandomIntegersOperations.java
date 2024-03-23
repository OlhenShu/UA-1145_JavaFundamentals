package homeWork5.practicalTask;

import java.util.Arrays;
import java.util.Random;

public class RandomIntegersOperations {
    private final static int[] intArray = new int[10];

    public void generateRandomIntegers() {
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(-100, 100);
        }
    }

    public void comparePositiveNegativeCounts() {
        int positive = 0;
        int negative = 0;
        for (int num : intArray) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }
        if (positive > negative) {
            System.out.println("There are more positive values in the array.");
        } else if (negative > positive) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There is an equal number of positive and negative values in the array.");
        }
    }

    public void printNumOfNegativeNumbers() {
        int number = 0;
        for (int num : intArray) {
            if (num > 0) {
                number++;
            }
        }
        System.out.println("The number of negative numbers is ->>" + number);

    }

    public void printSumOfPositiveNumbers() {
        int sum = 0;
        for (int num : intArray) {
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println("The sum of positive numbers is ->>" + sum);
    }

    public void printBiggestInteger() {
        int biggestNum = 0;
        for (int num : intArray) {
            if (num > biggestNum) {
                biggestNum = num;
            }
        }
        System.out.println("Array of integers ->> " + Arrays.toString(intArray));
        System.out.println("The biggest number in the Array is: " + biggestNum);
    }

}

class RunRandomIntegersOperations {
    public static void main(String[] args) {
        RandomIntegersOperations intOperations = new RandomIntegersOperations();
        intOperations.generateRandomIntegers();
        intOperations.printBiggestInteger();
        intOperations.printSumOfPositiveNumbers();
        intOperations.printNumOfNegativeNumbers();
        intOperations.comparePositiveNegativeCounts();
    }
}
