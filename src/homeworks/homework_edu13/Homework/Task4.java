package homeworks.homework_edu13.Homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 8, 17);

        System.out.println("Birthday is: " + birthday.format(DateTimeFormatter.ofPattern("d. MM. yyyy")));

        dayOfWeek(birthday);

    }

    public static void dayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        LocalDate after6Month = date.plusMonths(6);
        DayOfWeek dayOfWeekAfter6Month = after6Month.getDayOfWeek();

        LocalDate after12Month = date.plusMonths(12);
        DayOfWeek dayOfWeekAfter12Month = after12Month.getDayOfWeek();

        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Day of week after 6 month: " + dayOfWeekAfter6Month);
        System.out.println("Day of week after 12 month: " + dayOfWeekAfter12Month);

    }
}
