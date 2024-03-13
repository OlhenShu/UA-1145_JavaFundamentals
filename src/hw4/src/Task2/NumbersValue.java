package Task2;

import static Task2.Main.SCANNER;

public class NumbersValue {
    private static int first;
    private static int second;
    private static int third;

    public static void inputNumbers() {
        System.out.println("Enter first number: ");
        first = SCANNER.nextInt();
        System.out.println("Enter second number: ");
        second = SCANNER.nextInt();
        System.out.println("Enter third number: ");
        third = SCANNER.nextInt();
    }

    public static void minimalValue() {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }

        // Also we can use this method:
        // int min = Math.min(Math.min(first, second), third);
        System.out.println("The minimal number of three specified is: " + min);
    }

    public static void maximalValue() {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }

        // Also we can use this method:
        // int max = Math.max(Math.max(first, second), third);
        System.out.println("The maximal number of three specified is: " + max);
    }

}
