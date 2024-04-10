package edu13.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BirthdayDayOfWeek {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1988, 5, 21);
        printDayOfWeekInfo(birthday);
    }

    public static void printDayOfWeekInfo(LocalDate date) {
        System.out.println("Day of the week for " + formatDate(date) + ": " + date.getDayOfWeek());
        LocalDate after6Months = date.plusMonths(6);
        System.out.println("Day of the week after 6 months: " + after6Months.getDayOfWeek());
        LocalDate after12Months = date.plusMonths(12);
        System.out.println("Day of the week after 12 months: " + after12Months.getDayOfWeek());
    }

    private static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}

