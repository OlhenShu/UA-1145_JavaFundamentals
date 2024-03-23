package homework5;

import java.util.Scanner;

public class FiveIntegers {
    static public final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = inputFiveIntegers();
        int productEvenNumbers = findTheProductOfEvenNumbers(arr);
        int secondPositiveNumber = findSecondPositiveNumberIndex(arr);
        int minimalValueIndex = findMinimalValueIndex(arr);
        System.out.println("Позиція мінімального цисла: " + (minimalValueIndex + 1) + ". Це є номер: " + arr[minimalValueIndex]);
        System.out.println("Добуток всіх парних чисел: " + productEvenNumbers);
        System.out.println("Позиція другого додатнього числа: " + (secondPositiveNumber + 1) + ". Це є номер: " + arr[secondPositiveNumber]);
    }
    public static int[] inputFiveIntegers(){
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введіть число "+(i+1)+": ");
            arr[i] = SCANNER.nextInt();
        }return arr;
    }
    private static int findTheProductOfEvenNumbers(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                prod *= arr[i];
            }
        }
        return prod;
    }
    private static int findSecondPositiveNumberIndex(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
            if (count == 2) {
                return i;
            }
        }
        return -1;
    }
    private static int findMinimalValueIndex(int[] arr) {
        int index = 0;
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                index = i;
            }
        }
        return index;
    }
}
