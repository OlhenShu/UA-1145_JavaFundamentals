package Practicals;

import java.util.Scanner;

public class Pr_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number");
        int number1 = scanner.nextInt();
        System.out.println("Type the second number");
        int number2 = scanner.nextInt();
         scanner.close();

        System.out.printf("The sum of %d and %d is %d", number1, number2, getTotal(number1, number2));
        System.out.println();
        System.out.printf("The average of %d and %d is %.2f", number1, number2, getAverage(number1, number2));

    }

    public static int getTotal (int n1, int n2){
        return n1 + n2;
    }

    public static double getAverage (int n1, int n2){
        return (n1 + n2) / 2.0;
    }


}
