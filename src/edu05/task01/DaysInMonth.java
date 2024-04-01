package edu05.task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class DaysInMonth {

    private static final Scanner SCANNER = new Scanner(in);
    public static void main(String[] args) {
        DaysInMonth checkYourMonth = new DaysInMonth();
        System.out.println("Input number of your month");
        int inputMonth = SCANNER.nextInt();
        SCANNER.nextLine();

        double yourAnswer = checkYourMonth.checkYourMonth(inputMonth);
        if (inputMonth > 1 && inputMonth <= 12) {
            System.out.print("Your Month has accordingly " + yourAnswer + " days");
        } else {
            System.out.println("Suddenly you input the wrong number. Please try again");
        }
    }

    public double checkYourMonth(int month) {
        Map<Integer, Double> months = new HashMap<>();
        months.put(1, 31.0);
        months.put(2, 28.5);//february can be 28(common year) or 29 days
        months.put(3, 31.0);
        months.put(4, 30.0);
        months.put(5, 31.0);
        months.put(6, 30.0);
        months.put(7, 31.0);
        months.put(8, 31.0);
        months.put(9, 30.0);
        months.put(10, 31.0);
        months.put(11, 30.0);
        months.put(12, 31.0);
        months.toString();

        return months.get(month);
    }
}
