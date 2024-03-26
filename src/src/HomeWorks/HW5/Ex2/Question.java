package HomeWorks.HW5.Ex2;

import java.util.Locale;

import static HomeWorks.HW5.Ex2.DoWhileLoop.SCANNER;

public class Question {
    public static boolean question() {
        System.out.println("Do you want to sum other numbers? y/n");


        String answer = SCANNER.nextLine().toLowerCase(Locale.ROOT);

        switch (answer) {
            case "y" -> {
                return true;
            }
            case "n" -> {
                return false;
            }
            default -> Question.question();
        }
        return false;
    }
}
