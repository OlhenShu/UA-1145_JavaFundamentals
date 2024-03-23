package homeWork5.homeWork;

import java.util.Scanner;

public class TenIntegers {

    private final int[] tenNumbersArray = new int[10];

    private void inputNumbers(Scanner scanner) {
        for (int i = 0; i <= tenNumbersArray.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number: ");
            tenNumbersArray[i] = scanner.nextInt();
        }
    }

    void integerOperations(Scanner scanner) {
        boolean areFirstFivePositive = true;
        for (int i = 0; i < 5; i++) {
            if (tenNumbersArray[i] <= 0) {
                areFirstFivePositive = false;
                break;
            }
        }
        int sumFiveFirstNumbers = 0;
        int productOfNumbers = 1;
        if (areFirstFivePositive) {
            for (int i = 0; i < 5; i++) {
                sumFiveFirstNumbers += tenNumbersArray[i];
            }
            System.out.println("The sum of first five numbers equals to " + sumFiveFirstNumbers);
        } else {
            for (int j = 5; j < tenNumbersArray.length; j++) {
                productOfNumbers *= tenNumbersArray[j];
            }
            System.out.println("The product of last five numbers equals to " + productOfNumbers);
        }
    }
}

class RunTenIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TenIntegers tenIntegers = new TenIntegers();
        tenIntegers.integerOperations(sc);
    }

}