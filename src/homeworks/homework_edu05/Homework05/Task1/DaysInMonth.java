package homework_edu05.Homework05.Task1;

import java.util.Scanner;

public class DaysInMonth {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a month number: ");
        int daysNumber = SCANNER.nextInt();

        if (daysNumber < 1 || daysNumber > 12 ){
            System.out.println("Error. Please enter the month number between 1 and 12");
        }
        else {
            int days = monthDays[daysNumber-1];
            System.out.println("There " + days + " in " + daysNumber + " month.");
        }

    }

    private static final int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

}

