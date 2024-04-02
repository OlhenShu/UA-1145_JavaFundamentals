package src.edu05.Task1;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write number of month: ");
        int numOfMonth = scanner.nextInt();
        int result = daysOfMonth[numOfMonth - 1];
        System.out.println("In this month there are " + result + " days");

    }
}
