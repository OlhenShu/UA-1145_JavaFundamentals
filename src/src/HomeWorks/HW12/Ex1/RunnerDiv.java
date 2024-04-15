package HomeWorks.HW12.Ex1;

import java.util.Scanner;

public class RunnerDiv {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            double a = inputDouble();
            double b = inputDouble();
            System.out.println("Result of dividing is " + div(a, b));

        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
            System.exit(0);
        }
    }

    public static double inputDouble() {
        System.out.print("Input number: ");
        String a = SCANNER.nextLine();
        return Double.parseDouble(a);
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
