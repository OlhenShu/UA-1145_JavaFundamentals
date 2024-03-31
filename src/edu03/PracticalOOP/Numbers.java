package module03.PracticalOOP;

import Practical1.Practical1;

import java.util.Scanner;

public class Numbers {
     static public double getTotal(double a, double b) {
        return a + b;
    }
    static public double getAverage(double a, double b) {
        return getTotal(a, b) / 2;

    }
    static public void getNumber()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        double a = scanner.nextDouble();
        System.out.println("Please enter the second number");
        double b = scanner.nextDouble();
        System.out.println("The first number is " + a + ", the second number is " + b);
        System.out.println("The sum is " + Numbers.getTotal(a, b));
        System.out.println("The average is " + Numbers.getAverage(a, b));


    }
}
