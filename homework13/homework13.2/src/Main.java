import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        String todayFormatted = formatter.format(today);

        if (isValidDate(todayFormatted)) {
            System.out.println("Today's date is valid: " + todayFormatted);
        } else {
            System.out.println("Today's date is not valid: " + todayFormatted);
        }
    }

    public static boolean isValidDate(String date) {
        String pattern = "^\\d{2}\\.\\d{2}\\.\\d{2}$";
        return date.matches(pattern);
    }
}
