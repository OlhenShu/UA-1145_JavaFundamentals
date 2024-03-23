package homeWork4;

import java.util.Scanner;

public class MaxMinNumber {
    private final double[] numbers = new double[3];
    private Scanner scanner = new Scanner(System.in);

    public void getNumbers(Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Pleas enter the number " + (i + 1) + ":");
            numbers[i] = scanner.nextDouble();
        }
    }

    private double getMaxNumber() {
        double maxNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    private double getMinNumber() {
        double minNumber = Double.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }

    public void printMaxMinNumber() {
        System.out.println("The Max number is " + getMaxNumber() +
                " and the Min number is " + getMinNumber());
    }

}

class RunMaxMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxMinNumber maxMinNumber = new MaxMinNumber();
        maxMinNumber.getNumbers(sc);
        maxMinNumber.printMaxMinNumber();

    }
}
