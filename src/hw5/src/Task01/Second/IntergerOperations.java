package Task01.Second;
import java.util.Arrays;
import java.util.Scanner;

public class IntergerOperations {
    private static int[] number = new int[10];

    public static int[] arrayNumberFill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 integer numbers to fill an array");
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            number[i] = scanner.nextInt();
        }
        return number;
    }

    public static int operations() {
        int sum = 0;
        int product = 1;
        boolean arePositive = true;

        for (int i = 0; i < 5; i++) {
            if (number[i] <= 0) {
                arePositive = false;
            }
            sum += number[i];
        } if (arePositive) {
            return sum;
        } else if (!arePositive) {
            for (int i = 5; i < number.length; i++) {
                product *= number[i];
            }
            return product;
        }
        return 0;
    }

    public static void resultOutput() {
        int[] arr = arrayNumberFill();
        int result = operations();
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("Result is: " + result);
    }

    public static int[] getNumber() {
        return number;
    }

    public static void setNumber(int[] number) {
        IntergerOperations.number = number;
    }
}
