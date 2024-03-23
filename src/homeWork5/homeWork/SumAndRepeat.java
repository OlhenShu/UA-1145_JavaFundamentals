package homeWork5.homeWork;

import java.util.Objects;
import java.util.Scanner;

public class SumAndRepeat {

    void sumTwoNumbers(Scanner scanner) {
        double firstNum;
        double secondNum;
        String repeat;
        do {
            System.out.println("Please enter the first number: ");
            firstNum = scanner.nextDouble();
            System.out.println("Please enter the second number: ");
            secondNum = scanner.nextDouble();
            double sum = firstNum + secondNum;
            System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + sum);
            System.out.println("Do you want to perform the operation again? (Y/N)");
            repeat = scanner.next();
        } while (Objects.equals(repeat, "Y"));
    }

}

class RunSumAndRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumAndRepeat sumAndRepeat = new SumAndRepeat();
        sumAndRepeat.sumTwoNumbers(sc);
    }
}