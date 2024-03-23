package homeWork4;

import java.util.Scanner;

public class InclusiveNumbers {
    private final double[] numbers = new double[3];
    Scanner scanner = new Scanner(System.in);

    public void enterNumbers(Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number: ");
            numbers[i] = scanner.nextDouble();
        }
    }

    public void checkTheRange() {
        double outOfRange = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < -5 || numbers[i] > 5) {
                outOfRange = numbers[i];
            }

        }
        if (outOfRange == 0) {
            System.out.println("All number are in rage of [-5, 5].");
        } else {
            System.out.println("Not all number are in rage of [-5, 5].");
        }
    }
}

class RunInclusiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InclusiveNumbers inclusiveNumbers1 = new InclusiveNumbers();
        inclusiveNumbers1.enterNumbers(sc);
        inclusiveNumbers1.checkTheRange();
    }
}