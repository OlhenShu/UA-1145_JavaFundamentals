package homeworks.homework_edu13.Practical;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class Task2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, Month.APRIL, 10);
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(firstMonInMonth));
    }
}


