package homework_edu04.Practical04;

import java.util.Scanner;

public class PrTask1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input first number: ");
        int num1 = SCANNER.nextInt();
        System.out.println("Input second number: ");
        int num2 = SCANNER.nextInt();
        System.out.println("Input third number: ");
        int num3 = SCANNER.nextInt();

        int counter = 0;
        if (num1 % 2 != 0) counter++;
        if (num2 % 2 != 0) counter++;
        if (num3 % 2 != 0) counter++;
        System.out.println("There are " + counter + " odd numbers.");


    }

}
