package task4;
//10 integers numbers and calculates the sum of the first five elements if they are
//positive, or the product of the last five elements if they are not and output the result.

import java.util.Scanner;

public class EnterTenInt {
    private static final Scanner SCANNER = new Scanner(System.in);
    static int sum;
    static int array[] = new int[10];

    public static void promptUserTenTimes() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Please, enter the " + (i + 1) + "th number: ");
            int arrayValue = Integer.parseInt(SCANNER.nextLine());
            array[i] = arrayValue;
        }
        checkForPositiveNumbers(array);
    }
        static void checkForPositiveNumbers (int[] arr){
            boolean positiveNumbers = false;
            for (int i = 0; i <= 4; i++) {
                if (arr[i] >= 0) {
                    positiveNumbers = true;
                } else {
                    positiveNumbers = false;
                }
            }
            if (positiveNumbers) {
                calculateTheSum(array);
            } else {
                calculateTheProduct(array);
            }

        }
        static int calculateTheSum ( int[] arr){
            for (int i = 0; i < 4; i++) {
                sum = sum + arr[i];
            }
            return sum;
        }
        static int calculateTheProduct ( int[] arr){
            for (int i = 0; i < 4; i++) {
                sum = sum * arr[i];
            }
            return sum;
        }
        public static void main (String[]args){
            promptUserTenTimes();
            System.out.println("Your result is" + sum);
        }

}
