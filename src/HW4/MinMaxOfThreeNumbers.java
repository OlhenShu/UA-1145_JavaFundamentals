package HW4;

import java.util.Scanner;

public class MinMaxOfThreeNumbers {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int first, second, third, minNum, maxNum;//separate variables in different lines
        //int first;
        //int second;
        //int third;
        //int minNum;
        //int maxNum;

        System.out.print("Please input first number: ");
        first = in.nextInt();
        System.out.print("Please input second number: ");
        second = in.nextInt();
        System.out.print("Please input third number: ");
        third = in.nextInt();

        minNum = Math.min(Math.min(first, second), third);
        maxNum = Math.max(Math.max(first, second), third);

        System.out.println("Minimum: " + minNum);
        System.out.println("Maximum: " + maxNum);
    }
}
