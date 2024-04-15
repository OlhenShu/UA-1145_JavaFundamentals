package HomeWorks.HW12.Ex2;

import java.util.Scanner;

public class RunnerNumbsInRunge {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
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
