package practical_tasks.pt3;

import java.util.Scanner;

public class TotalAndAvgNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstArgument = getNumber("Enter first argument: ", scanner);
        double secondArgument = getNumber("Enter second argument: ", scanner);

        double sumOfArguments = getTotal(firstArgument, secondArgument);

        System.out.println(sumOfArguments);
        System.out.println(getAverage(sumOfArguments));
    }

    private static double getTotal(double firstArgument, double secondArgument) {
        return firstArgument + secondArgument;
    }

    private static double getAverage(double sumOfArguments) {
        return sumOfArguments / 2.0;
    }

    private static double getNumber(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}