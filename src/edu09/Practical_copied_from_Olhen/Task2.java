package edu09.practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter numbers: ");

        String input = scanner.nextLine();

        String[] values = input.split(",\\s*");

        List<Integer> uniqValues = new ArrayList<>();
        for (String numbers : values) {
            int number = Integer.parseInt(numbers.trim());

            if (!uniqValues.contains(number)) {
                uniqValues.add(number);
            }
        }
        System.out.println("Whiteout duplicates");
        for (Integer uniqNumber : uniqValues) {
            System.out.print(uniqValues + " ");
        }
    }
}
