package HomeWorks.HW12.Ex2;

import java.util.Scanner;

public class RunnerNumbsInRunge {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //why do you have range from 5 to 50?
        int start = 5;
        int end = 50;

        int numberOfNumbs = 10;

        for (int i = 0; i < numberOfNumbs; i++) {
            boolean is_correct = false;
            while (!is_correct) {
                try {
                    System.out.println("Input a number between " + start + " and " + end);

                    int numb = readNumber(start, end);
                    System.out.println((i + 1) + " number is " + numb);
                    is_correct = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }


    public static int readNumber(int start, int end) throws IllegalArgumentException {

        String str = SCANNER.nextLine();

        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }

        int numb;

        try {
            numb = Integer.parseInt(str);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("It's not a number");
        }
        if (numb < start || numb > end) {
            throw new IllegalArgumentException("The number isn't in the range between " + start + " and " + end);
        }
        return numb;
    }
}

//you need to ensure that each number entered not only fits within a dynamic range that changes as each number is entered but also ensures that each number is strictly greater than the previous one.
// Currently, your code does not enforce that each subsequent number is greater than the last.
//public class RunnerNumbsInRunge {
//    public static final Scanner SCANNER = new Scanner(System.in);
//
//    public static final int START = 1;
//    public static final int END = 99;
//
//    public static void main(String[] args) {
//        int numberOfNumbs = 10;
//        int previousNumber = 0; // Start from 0 to ensure any number from 1 upwards is valid for the first input.
//
//        for (int i = 0; i < numberOfNumbs; i++) {
//            while (true) {
//                try {
//                    System.out.println("Input a number greater than " + previousNumber + " and less than or equal to " + END);
//                    int numb = readNumber(previousNumber + 1, END); // Ensure the number is greater
//                    // than the last number entered
//                    System.out.println((i + 1) + " number is " + numb);
//                    previousNumber = numb; // Update previousNumber to the last successfully entered number
//                    break; // Break the loop once a valid number is entered
//                } catch (IllegalArgumentException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }
//
//    public static int readNumber(int start, int end) throws IllegalArgumentException {
//        String str = SCANNER.nextLine();
//
//        if (str.isEmpty()) {
//            throw new IllegalArgumentException("Empty string!");
//        }
//
//        int numb;
//        try {
//            numb = Integer.parseInt(str);
//        } catch (NumberFormatException exception) {
//            throw new IllegalArgumentException("It's not a number");
//        }
//        if (numb < start || numb > end) {
//            throw new IllegalArgumentException("The number isn't in the range between " + start + " and " + end);
//        }
//        return numb;
//    }
//}
