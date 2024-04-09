package Task1;
import java.util.InputMismatchException;

import static Task1.Main.SCANNER;
public class Numbers {
    private static float first;
    private static float second;
    private static float third;
    public static void inputNumbers() {
        System.out.println("Attention! For entering the float number please use ' , '");
        while(true) {
            try {
                System.out.println("Enter first float number: ");
                first = SCANNER.nextFloat();
                System.out.println("Enter second float number: ");
                second = SCANNER.nextFloat();
                System.out.println("Enter third float number: ");
                third = SCANNER.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Entered number is non-float. Please enter correct value");
                SCANNER.nextLine();
            }
        }
    }

    public static void checkNumbersInRange() {
        if((first >= -5 && first <= 5) && (second >= -5 && second <= 5) && (third >= -5 && third <= 5)) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else{
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }

}
