package edu03.task2;

import java.util.Scanner;

import static java.lang.System.in;

//Homework Task2
class HomeworkTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.println("Input the first number");
        double n1 = scanner.nextDouble();

        System.out.println("Input the second number");
        double n2 = scanner.nextDouble();

        System.out.println("Input the third number");
        double n3 = scanner.nextDouble();

        System.out.println("The smallest value is " + smallest(n1, n2, n3) + "\n");
        scanner.close();
    }

    public static double smallest(double n1, double n2, double n3) {
        return Math.min(Math.min(n1, n2), n3);
    }
}
