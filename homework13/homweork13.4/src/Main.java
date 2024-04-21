import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Set your birthday
        LocalDate birthday = LocalDate.of(2005, 7, 9); // Assuming your birthday is January 1, 2000

        printDayOfWeek(birthday);

        LocalDate sixMonthsLater = birthday.plusMonths(6);
        printDayOfWeek(sixMonthsLater);

        LocalDate twelveMonthsLater = birthday.plusMonths(12);
        printDayOfWeek(twelveMonthsLater);
    }

    public static void printDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        String dayOfWeekString = formatter.format(dayOfWeek);
        System.out.println("Date: " + date + ", Day of the week: " + dayOfWeekString);
    }
}
