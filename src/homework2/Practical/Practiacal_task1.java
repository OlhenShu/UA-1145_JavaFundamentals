package Practical;

import java.util.Scanner;

public class Practiacal_task1 {
    public static void main(String[] args) {

        int firstNum = getNumber("Enter the first number: ");
        int secondNum = getNumber("Enter the second number: ");
        int sum = getTotal(firstNum, secondNum);
        double average = getAverage(firstNum, secondNum);

        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + sum);
        System.out.println("The average of " + firstNum + " and " + secondNum + " is " + average);
    }

    private static int getNumber(String promt) {
        System.out.print(promt);
        Scanner scann = new Scanner(System.in);
        return Integer.parseInt(scann.nextLine());
    }

    private static int getAverage(int firstNum, int secondNum) {
        return (firstNum + secondNum) / 2;
    }

    private static int getTotal(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
