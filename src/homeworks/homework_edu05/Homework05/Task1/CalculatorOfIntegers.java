package homework_edu05.Homework05.Task1;

import java.util.Scanner;

public class CalculatorOfIntegers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer numbers: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = SCANNER.nextInt();
        }

        int resultOfOperation;
        if(ifPositive(numbers)){
            resultOfOperation = sumOfFirstPositive(numbers);
            System.out.println("Sum of the first positive numbers is: " + resultOfOperation);
        }
        else {
            resultOfOperation= productOfTheLast(numbers);
            System.out.println("Product of the last numbers is: " + resultOfOperation);
        }


    }

     static boolean ifPositive(int[] numbers) {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfFirstPositive(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static int productOfTheLast(int[] numbers){
        int product = 1;
        for (int i = 5; i < 10; i++) {
            product =  product * numbers[i];
        }
        return product;
    }
}


