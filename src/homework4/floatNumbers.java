package homework4;
import java.util.Scanner;

public class floatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number1;
        float number2;
        float number3;
        System.out.println("Enter first float number using comma as separator if needed :");
        number1 = scanner.nextFloat();
        System.out.println("Enter second float number using comma as separator if needed:");
        number2 = scanner.nextFloat();
        System.out.println("Enter third float number using comma as separator if needed:");
        number3 = scanner.nextFloat();

        if (isInRange(number1) && isInRange(number2) && isInRange(number3)) {
            System.out.println("Numbers belong to the range [-5, 5].");
        } else {
            System.out.println("Not all numbers are in the range [-5, 5].");
        }
    }

    private static boolean isInRange(float number) {
        return number >= -5 && number <= 5;
    }
}
