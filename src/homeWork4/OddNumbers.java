package homeWork4;

import java.util.Scanner;

public class OddNumbers {
    private final int[] numbers = new int[3];

    public void inputNumbers(Scanner scanner) {
        for (int i = 0; i < this.numbers.length; ++i) {
            System.out.println("Please enter the " + (i + 1) + " number: ");
            this.numbers[i] = scanner.nextInt();
        }

    }

    public void getNumberOfOddNumbers() {
        int numberOfOddNumbers = 0;

        for (int i = 0; i < this.numbers.length; ++i) {
            if (this.numbers[i] % 2 != 0) {
                ++numberOfOddNumbers;
            }
        }

        System.out.println("The number of odd numbers is: " + numberOfOddNumbers);
    }
}

class RunOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OddNumbers oddNumbers = new OddNumbers();
        oddNumbers.inputNumbers(sc);
        oddNumbers.getNumberOfOddNumbers();

    }
}