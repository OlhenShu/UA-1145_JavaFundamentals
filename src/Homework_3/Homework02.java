package Homework_3;

import java.util.Scanner;

//Homework 3 is in class Homework_3.Person and Homework_3.PersonMain

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();
        int smallestNumber = (calculateMin(firstNumber, secondNumber, thirdNumber));
        System.out.println("The smallest number is " + smallestNumber);
    }

    public static int calculateMin(int number1, int number2, int number3) {
        int firstMinNumber = Math.min(number1, number2);
        int minNumber = Math.min(firstMinNumber, number3);
        return minNumber;
    }
}
