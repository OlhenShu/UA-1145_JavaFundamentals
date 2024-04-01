package homework.hw5.task1;

import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(getPositionOfSecondPositiveNumber(numbers));
        System.out.println(getMinValueInArray(numbers));
        System.out.println(getProductOfAllEnteredEvenNumbers(numbers));
    }

    public static int getPositionOfSecondPositiveNumber(int... values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                result =  i;
            }
        }
        return result + 1;
    }

    public static int getMinValueInArray(int... values) {
        int min = 0;
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int getProductOfAllEnteredEvenNumbers(int... values) {
        int result = 1;
        for (int value : values) {
            if(value % 2 == 0 && value >= 0) {
                result *= value;
            }
        }
        return result;
    }
}
