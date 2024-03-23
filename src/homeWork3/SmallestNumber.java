package homeWork3;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumbersOperations numbersOperations = new NumbersOperations();
        numbersOperations.inputNumbers(sc);
        numbersOperations.getSmallestNumber();
    }
}

class NumbersOperations {
    private final int[] numbers = new int[3];

    public void inputNumbers(Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input the number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
    }

    public void getSmallestNumber() {
        int smallestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + smallestNumber);
    }

}
