package edu13.HomeWork02;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataValidator {
    public static void main(String[] args) {
        System.out.println(validateDate("13.07.24"));   //Wrong month
        System.out.println(validateDate("02.31.24"));   //Wrong day (february 31)
        System.out.println(validateDate("02.29.24"));   //Correct day (leap year)
        System.out.println(validateDate("30.08.81"));   //Wrong month
        System.out.println(validateDate("08.30.81"));   //Correct date
    }

    static boolean validateDate(String mmddyy) {
        final var formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            var date = LocalDate.parse(mmddyy, formatter);
            return date.format(formatter).equals(mmddyy);

        } catch (DateTimeException e) {
            return false;
        }
    }
}
