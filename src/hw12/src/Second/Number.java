package Second;

import java.util.Scanner;

import static java.lang.System.in;

public class Number {
    public static Scanner scanner = new Scanner(in);
    public static int readNumber(int start, int end) {
        int number;
        while(true) {
            try {
                System.out.println("Enter a number between " + start + " and " + end);
                number = Integer.parseInt(scanner.nextLine());
                if(number < start || number > end) {
                    throw new IllegalArgumentException("Entered number must be lower than" + start + " and higher than " + end);
                }
                return number;
            } catch (NumberFormatException e) {
                System.err.println("Entered symbol is non-integer");
            }catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void output(int[] number) {
        System.out.println("Outputed array of numbers for this task: ");
        for(int i = 0; i < number.length; i++ ) {
            if(i == number.length - 1) {
                System.out.print(number[i]);
            } else {
                System.out.print(number[i] + " < ");
            }
        }
    }
}
