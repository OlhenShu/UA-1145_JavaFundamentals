package homework5;

import java.util.Scanner;

public class TenIntegers {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int sumOfFirstFivePositive = calculateSumOfFirstFivePositive(inputTenIntegers());
        System.out.println("Сума перших п'яти позитивних чисел: " + sumOfFirstFivePositive);
        SCANNER.close();
    }
    public static int[] inputTenIntegers(){
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введіть число "+(i+1)+": ");
            arr[i] = SCANNER.nextInt();
        }return arr;
    }
    private static int calculateSumOfFirstFivePositive(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length && count < 5; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        return sum;
    }
}
