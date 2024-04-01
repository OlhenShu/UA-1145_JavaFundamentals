package src.edu04.hwTask2;

import java.util.Scanner;

import static java.lang.Math.min;

public class Task2 {
    public static void main(String[] args) {
        Scanner numberScan = new Scanner(System.in);
        System.out.println("Please write three integer numbers: ");
        int num1 = numberScan.nextInt();
        int num2 = numberScan.nextInt();
        int num3 = numberScan.nextInt();

        int minNum = 0;
        int maxNum = 0;

        if ((num1 > num2) && (num1 > num3)) {
            maxNum = num1;
            minNum = min(num2, num3);
        }
        if ((num2 > num1) && (num2 > num3)) {
            maxNum = num2;
            minNum = min(num1, num3);
        }
        if ((num3 > num1) && (num3 > num2)) {
            maxNum = num3;
            minNum = min(num1, num2);
        }

        System.out.print("Maximum number is " + maxNum + "\n" +
                "minimum number is " + minNum);
    }
}
