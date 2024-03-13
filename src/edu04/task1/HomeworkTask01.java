package edu04.task1;

import java.util.Scanner;

public class HomeworkTask01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        float num1 = SCANNER.nextInt();
        float num2 = SCANNER.nextInt();
        float num3 = SCANNER.nextInt();
        SCANNER.close();

        if ((num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5)) {
            System.out.println("Numbers belongs to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }

    }
}
