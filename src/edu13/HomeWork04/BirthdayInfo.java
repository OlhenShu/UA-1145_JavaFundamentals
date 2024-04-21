package edu13.HomeWork04;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BirthdayInfo {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1981, 8, 30);
        printDayOfWeekInfo(birthday);
    }

    // Day of the week info
    public static void printDayOfWeekInfo(LocalDate date) {
        // Print the day of the week of the given date
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week of the given date: " + dayOfWeek);

        // Day of the week after 6 months
        LocalDate after6Months = date.plusMonths(6);
        DayOfWeek dayOfWeekAfter6Months = after6Months.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + dayOfWeekAfter6Months);

        // Day of the week after 12 months
        LocalDate after12Months = date.plusMonths(12);
        DayOfWeek dayOfWeekAfter12Months = after12Months.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + dayOfWeekAfter12Months);
    }
}
