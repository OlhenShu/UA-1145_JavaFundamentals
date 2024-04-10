package Task_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.function.Predicate;

import static java.lang.System.in;

public class DateValid {
    static Scanner scanner = new Scanner(in);

    public static String inputDate() {
        System.out.println("Enter the date you want to check: ");
        return scanner.nextLine();
    }
    private static final Predicate<String> dateValidPredicate = dateString -> {
        try {
            // adds a format by which we check the validity of the date
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            LocalDate.parse(dateString, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    };

    public static boolean isValid(String dateString) {
        return dateValidPredicate.test(dateString);
    }
}
