package homeWork12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    static Scanner sc = new Scanner(System.in);

    static int readNumber(int start, int end) throws MyException {
        int number;
        System.out.printf("Please enter the number in the range between %d and %d.", start,end);
        try {
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw new MyException("Entered value is not an integer.");
        }
        if (number < start || number > end)
            throw new MyException("Entered value is out of the allowed range! Range starts with " + start);
        return number;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        for (int i = 0; i < 10; i++) {
            try {
                int num = readNumber(start, end);
                System.out.println("The number " + (i + 1) + " == " + num);
                start = num;
            } catch (MyException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
    }

    static class MyException extends Exception {
        public MyException(String s) {
            super(s);
        }
    }
}

