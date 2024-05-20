package HomeWorks.HW13.Ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidationRunner {
    public static final String DATE_FORMAT = "MM.dd.yy";

    public static void main(String[] args) {
        String date = "02.13.2024";
        System.out.println(isValidDate(date));
    }

    private static boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        sdf.setLenient(false);
        try {
            Date d = sdf.parse(date);
            return true;

        } catch (ParseException e) {
            return false;
        }
    }
}
