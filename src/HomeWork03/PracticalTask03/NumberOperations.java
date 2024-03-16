package HomeWork03.PracticalTask03;

import java.util.Scanner;

import static java.lang.System.in;

public class NumberOperations {


    public static void main(String[] args) {
        int firstNumber = getNumber("Enter the first number: ");
        int secondNumber = getNumber("Enter the second number: ");
        int sum = getTotal(firstNumber, secondNumber);
        double avarage = getAvarage(firstNumber, secondNumber);
        System.out.println("The sum of " + firstNumber + " " + "and " + secondNumber + " " + "is " + sum);
        System.out.println("The avarage of " + firstNumber + " " + "and " + secondNumber + " " + "is " + avarage);
    }

    private static int getNumber(String prompt){
        Scanner scanner = new Scanner(in);
        System.out.print(prompt);
       return Integer.parseInt(scanner.nextLine());

    }
    private static double getAvarage(int firstNumber, int secondNumber) {
        return getTotal(firstNumber, secondNumber) / 2.0;
    }

    private static int getTotal(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}


