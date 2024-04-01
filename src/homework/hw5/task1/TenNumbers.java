package homework.hw5.task1;

import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(calculateSumOrProduct(numbers));
    }

    public static int calculateSumOrProduct(int... values) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (values[i] <= 0) {
                result = 1;
                break;
            }
            result += values[i];
        }

        if (result == 1) {
            for (int i = 5; i < 10; i++) {
                result *= values[i];
            }
        }
        return result;
    }
}
