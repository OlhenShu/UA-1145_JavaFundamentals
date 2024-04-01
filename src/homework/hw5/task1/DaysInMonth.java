package homework.hw5.task1;

import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month number: ");
        int monthNumber = scanner.nextInt();

        System.out.println(calculateDaysInMonthByNumberAndYear(year, monthNumber));
    }

    public static String calculateDaysInMonthByNumberAndYear(int year, int monthNumber) {
        String monthName = Month.of(monthNumber).getDisplayName(TextStyle.FULL, Locale.getDefault());
        int numberOfDaysInMonth = YearMonth.of(year, monthNumber).lengthOfMonth();

        return String.format("In the %d month (%s) of %d - %d days", monthNumber, monthName, year, numberOfDaysInMonth);
    }
}
