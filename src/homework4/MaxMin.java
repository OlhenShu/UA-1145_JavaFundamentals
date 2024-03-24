package homework4;
import homework2.minimum;

import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        System.out.println("Enter first int number:");
        number1 = scanner.nextInt();
        System.out.println("Enter second int number:");
        number2 = scanner.nextInt();
        System.out.println("Enter third int number:");
        number3 = scanner.nextInt();
        System.out.println("The minimum number is: " + MaxMin.minimum(number1, number2, number3));
        System.out.println("The maximum number is: " + MaxMin.maximum(number1, number2, number3));
    }
    private static int minimum(int number4, int number5, int number6) {

        int min = 0;
        if (number4 <= number5 && number4 <= number6)
            min = number4;
        else if (number5 <= number4 && number5 <= number6)
            min = number5;
        else min = number6;
        return min;
    }
    private static int maximum(int number7, int number8, int number9) {

        int max = 0;
        if (number7 >= number8 && number7 >= number9)
            max = number7;
        else if (number8 >= number7 && number8 >= number9)
            max = number8;
        else max = number9;
        return max;
    }
}
