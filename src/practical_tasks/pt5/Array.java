package practical_tasks.pt5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[]{"Car", "Bear", "Show", "Snow", "Herb", "Data", "Soft", "France", "Jam", "Tall", "Allow"};
        int[] numbers = generateRandomArray(5);

        System.out.println(Arrays.toString(sortStringArray(strings)));

        System.out.println(Arrays.toString(numbers));
        System.out.println(calculateAvgValue(numbers));

        System.out.println(containValueCheck(scanner.nextLine(), strings));
    }

    public static String[] sortStringArray(String... values) {
        return Arrays.stream(values).sorted().toArray(String[]::new);
    }

    public static double calculateAvgValue(int... values) {
        int arraySum = 0;
        for (int value : values) {
            arraySum += value;
        }
        return (double) arraySum / values.length;
    }

    public static boolean containValueCheck(String targetValue, String... values) {
        for (String value : values) {
            if (value.equals(targetValue)) {
                return true;
            }
        }
        return false;
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1001);
        }
        return array;
    }
}
