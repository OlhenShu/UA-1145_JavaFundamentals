package HM12.part1;

import java.util.Scanner;

public class DivNum {
    public static double div(double firstNum, double secondnum) {
        if (secondnum != 0) {
            return firstNum / secondnum;
        } else {
            throw new ArithmeticException("You can't make dividing on zero");
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        try {
            System.out.print("include first numb: ");
            double firstNum = sr.nextDouble();
            System.out.print("include second numb: ");
            double secondNum = sr.nextDouble();

            double result = div(firstNum, secondNum);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sr.close();
        }
    }
}
