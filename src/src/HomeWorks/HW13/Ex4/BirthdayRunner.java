package HomeWorks.HW13.Ex4;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class BirthdayRunner {

    public static void main(String[] args) {

        LocalDate myBD = LocalDate.of(1994, 8, 26);

        System.out.println("My birthday is " + myBD.getDayOfMonth() + " " + myBD.getMonth().getDisplayName(TextStyle.FULL, new Locale("gb")) + " " + myBD.getYear());

        System.out.println(myBD.getDayOfWeek());

        LocalDate plus6Months = myBD.plusMonths(6);
        System.out.println(plus6Months.getDayOfWeek());
        LocalDate plus12Months = myBD.plusMonths(12);
        System.out.println(plus12Months.getDayOfWeek());
    }
}
