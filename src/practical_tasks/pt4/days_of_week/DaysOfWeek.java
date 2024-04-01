package practical_tasks.pt4.days_of_week;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DaysOfWeek {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "Пятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String dayOfWeekOnEng;
    private final String dayOfWeekOnUkr;
}
