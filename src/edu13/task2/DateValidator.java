package edu13.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {

    public static boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false);

        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String validDate = "12.31.21";
        String invalidDate = "13.01.21";

        System.out.println("Is " + validDate + " a valid date? " + isValidDate(validDate));
        System.out.println("Is " + invalidDate + " a valid date? " + isValidDate(invalidDate));
    }
}
