package Practicals.Pr13.Ex1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class TodayRunner {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String day = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("uk"));
        System.out.println("Today is: " + day);


        LocalDate firstMondayOfMonth = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMondayOfMonth);
    }
}
