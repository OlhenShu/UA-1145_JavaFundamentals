package Task_04;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006,7,10);
        daysOfWeek(birthday);
    }

    public static void daysOfWeek(LocalDate date) {
        DayOfWeek dateOfWeek = date.getDayOfWeek();

        LocalDate dateAfter6Month = date.plusMonths(6);
        DayOfWeek dayOfWeekAfter6Month = dateAfter6Month.getDayOfWeek();

        LocalDate dateAfter12Month = date.plusYears(1);
        DayOfWeek dayOfWeekAfter12Month = dateAfter12Month.getDayOfWeek();
        System.out.printf("""
               Your entered day of week is: %s,
               Your entered day after 6 months: %s,
               Your entered day after 12 months: %s
                """, dateOfWeek, dayOfWeekAfter6Month, dayOfWeekAfter12Month);
    }
}
