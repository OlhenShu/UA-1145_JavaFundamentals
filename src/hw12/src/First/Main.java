package First;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        while(true) {
            try{
                double a = input("Enter first double number: ");
                double b = input("Enter second double number: ");
                double result = div(a, b);
                System.out.println("Result of dividing is: " + result);
                break;
            } catch(NumberFormatException e) {
                System.err.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double input(String prompt) {
        Scanner scanner = new Scanner(in);
        while (true) {
            try {
                System.out.println(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("It should be a number");
            }
        }
    }

    public static double div(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("Second number can`t be 0");
        }
        return a / b;
    }
}
