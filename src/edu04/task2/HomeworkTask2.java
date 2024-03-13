package edu04.task2;

import java.util.Scanner;

public class HomeworkTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = SCANNER.nextInt();
        int num2 = SCANNER.nextInt();
        int num3 = SCANNER.nextInt();
        SCANNER.close();

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("Max value is: " + max);
        System.out.println("Min value is: " + min);
    }
}
