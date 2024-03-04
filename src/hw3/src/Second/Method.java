package hw3.src.Second;

import java.util.Locale;

import static hw3.src.Second.Main.SCANNER;

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
        }
        if (third < min) {// якщо третє число є меншим ніж перше та друге, третє стає мінімальним
            min = third;
        }
        System.out.println("The smallest number is: " + min);
    }
}
/*
To improve code organization and maintainability, consider separating these concerns into two distinct methods:

Input Method:
Create a separate method, e.g., input(), responsible for obtaining input from the user (for the first, second, and third numbers).
This method can handle user prompts and read integer values.
Smallest Number Calculation Method:
Create another method, e.g., findSmallest(), responsible for finding the smallest of the three input numbers.
In this method, you can use the logic you already have for identifying the smallest number.
 */