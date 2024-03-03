package Homework_3;

import java.util.Scanner;

//Task 3 is in class Homework_3.Person and Homework_3.PersonMain

public class TaskFirstAndSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 1
        System.out.print("Input Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = scanner.nextDouble();
        double area = (calculateArea(side1, side2, side3));
        System.out.printf("The area of the triangle is %.2f", area);

        //task 2
        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();
        int smallestNumber = (calculateMin(firstNumber, secondNumber, thirdNumber));
        System.out.println("The smallest number is " + smallestNumber);
    }

    public static double calculateArea(double side1, double side2, double side3) {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    public static int calculateMin(int number1, int number2, int number3) {
        int firstMinNumber = Math.min(number1, number2);
        int minNumber = Math.min(firstMinNumber, number3);
        return minNumber;
    }
}
