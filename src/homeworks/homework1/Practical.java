package homework1;

import java.util.Scanner;

public class Practical {
    public static void main(String[] args) {
        //Task 1
        Scanner scann = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scann.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scann.nextLine();
        System.out.print("Enter your age: ");
        double age = (int) scann.nextDouble();

        System.out.println("User age: " + age);
        System.out.println("User surname: " + surname);
        System.out.println("User name: " + name);

        //Task 2
        System.out.print("Input first number: ");
        double num1 = scann.nextDouble();
        System.out.print("Input second number: ");
        double num2 = scann.nextDouble();
        System.out.print("Input third number: ");
        double num3 = scann.nextDouble();

        double result = (num1 + num2 + num3) / 3;
        System.out.println("Average is: " + result);

        //Task 3
        System.out.print("Input first number: ");
        double a = scann.nextDouble();
        System.out.print("Input second number: ");
        double b = scann.nextDouble();

        double sum = a + b;
        double differ = a - b;
        double product = a * b;
        double quotient = a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + differ);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        //Task 4
        System.out.println("How are you? ");
        String answer = scann.nextLine();

        System.out.println("You are " + answer);

    }
}
