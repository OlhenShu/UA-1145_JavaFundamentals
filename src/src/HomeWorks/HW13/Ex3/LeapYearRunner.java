package HomeWorks.HW13.Ex3;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

public class LeapYearRunner {
    public static void main(String[] args) throws ParseException {

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate localDate = LocalDate.parse("2086.12.31", pattern);

        System.out.println("The year " + localDate.getYear() + " is a leap year? " + isLeapYear(localDate));
    }

    private static boolean isLeapYear(LocalDate localDate) {
        int year = localDate.getYear();
        Predicate<Integer> isDivisibleBy4 = x -> x % 4 == 0;
        return isDivisibleBy4.test(year);
    }
}
