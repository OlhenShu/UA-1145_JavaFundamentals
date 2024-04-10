package Task_03;
import java.util.Scanner;
import java.util.function.Predicate;

public class Method {
    static Scanner scanner = new Scanner(System.in);
    public static int inputNumber() {
        while (true) {
            try {
                System.out.println("Enter the year");
                return Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Entered number is non-integer. Please enter a correct number");
            }
        }
    }
    public static final Predicate<Integer> isYearLeapPredicate = year -> year % 2 == 0;
}
