package edu12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws MyExceptions {
        div();
    }

    public static void div() throws MyExceptions {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your numbers: ");

        double res;
        try {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            if (num1 == 0 | num2 == 0) {
                throw new MyExceptions();
            }


            res = num1 / num2;
            System.out.println("Result is " + res);
        } catch (InputMismatchException e) {
            System.err.println("Arguments should be a number");

        } catch (MyExceptions e) {
            throw new MyExceptions("The code will compile but in math you can't divide by 0");

        }


    }

    static class MyExceptions extends Exception {
        public MyExceptions(String message) {
            super(message);
        }

        public MyExceptions() {

        }
    }
}
