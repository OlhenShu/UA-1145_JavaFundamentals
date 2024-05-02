package HomeWorks.HW4.Ex1;

import java.util.Locale;
import java.util.Scanner;

public class InputThreeNumbers {

    static final double MIN_VALUE = -5;
    static final double MAX_VALUE = 5;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        System.out.println("Hello!");
        System.out.println("How many numbers do you want to input?");
        int quantityOfNumbers = scanner.nextInt();

        boolean is_inDiapason = true;

        for (int i = 0; i < quantityOfNumbers; i++) {
            System.out.print("Input " + (i + 1) + " number: ");
            System.out.println();
            double numbTemp = scanner.nextDouble();

            if (numbTemp < -5 || numbTemp > 5) {//try to do ranges border how constants
                is_inDiapason = false;
            }
//            if (number < MIN_VALUE || number > MAX_VALUE) {
//                allNumbersWithinRange = false;
//            }
        }

        if (is_inDiapason) {
            System.out.println("All your numbers are in diapason [-5; 5]");
        } else {
            System.out.println("Not all your numbers are in diapason [-5; 5]");
        }
    }
}
