package HomeWorks.HW4.Ex1;

import java.util.Locale;
import java.util.Scanner;

public class InputThreeNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.println("How many numbers do you want to input?");
        int quantityOfNumbers = scanner.nextInt();

        boolean is_inDiapason = true;

        for (int i = 0; i < quantityOfNumbers; i++) {
            System.out.print("Input " + (i + 1) + " number: ");
            System.out.println();
            double numbTemp = scanner.nextDouble();

            if (numbTemp < -5 || numbTemp > 5) {
                is_inDiapason = false;
            }
        }
        scanner.close();

        if (is_inDiapason) {
            System.out.println("All your numbers are in diapason [-5; 5]");
        } else {
            System.out.println("Not all your numbers are in diapason [-5; 5]");
        }
    }
}
