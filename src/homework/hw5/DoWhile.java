package homework.hw5;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Sum: " + (a + b));
            System.out.println("One more time? (1 - Yes, 0 - No)");
        } while (scanner.nextInt() != 0);

    }
}
