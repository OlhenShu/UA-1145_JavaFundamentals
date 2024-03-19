package HomeWorks.HW5.Ex1;

import java.util.Locale;

import static HomeWorks.HW5.Ex1.Interface.scanner;

public class Choose {
    public static boolean makeAChoose() {
        System.out.print("Input your answer. Type here y/n: ");
        char answer = scanner.next().toLowerCase(Locale.ROOT).charAt(0);

        switch (answer) {
            case 'n' -> {
                System.out.println("OK, next time, maybe)");
                return false;
            }
            case 'y' -> {
                return true;
            }
            default -> System.out.println("Incorrect answer");

        }
        return false;
    }
}
