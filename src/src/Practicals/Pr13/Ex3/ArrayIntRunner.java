package Practicals.Pr13.Ex3;

import java.util.function.Predicate;

public class ArrayIntRunner {
    public static void main(String[] args) {

        int[] array = {1, -2, 3, 122, 5, -46, 7, 0, -89, 101};

        Predicate<Integer> predicate = x -> x % 3 == 0;
        System.out.println(count(array, predicate));

    }

    private static int count(int[] array, Predicate<Integer> predicate) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i])) {
                count++;
            }
        }
        return count;
    }
}
