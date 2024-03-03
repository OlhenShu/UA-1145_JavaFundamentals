package Second;
import java.util.Locale;

import static Second.Main.SCANNER;
public class Method {
    public static void smallestNumber() {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Input the first number: ");
        int first = SCANNER.nextInt();
        System.out.println("Input the second number: ");
        int second = SCANNER.nextInt();
        System.out.println("Input the third number: ");
        int third = SCANNER.nextInt();


        // прирівнює перше задане число до мінімального
        int min = first;
        if (second < min) { // якщо друге число є меншим ніж перше, друге стає мінімальним
            min = second;
        } if(third < min) {// якщо третє число є меншим ніж перше та друге, третє стає мінімальним
            min = third;
        }

        System.out.println("The smallest number is: " + min);
    }
}