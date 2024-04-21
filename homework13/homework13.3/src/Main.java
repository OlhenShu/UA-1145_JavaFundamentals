import java.time.Year;

public class Main {
    public static void main(String[] args) {
        if (isLeapYear()) {
            System.out.println("Today's date is in a leap year.");
        } else {
            System.out.println("Today's date is not in a leap year.");
        }
    }

    public static boolean isLeapYear() {
        int currentYear = Year.now().getValue();
        return (currentYear % 4 == 0) && (currentYear % 100 != 0 || currentYear % 400 == 0);
    }
}
