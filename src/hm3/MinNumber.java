package hm3;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        int num1 = scanner.nextInt();
        System.out.println("Second number:");
        int num2 = scanner.nextInt();
        System.out.println("Third number:");
        int num3 = scanner.nextInt();

        scanner.close();

        int MinNumber = (CalculateMin(num1, num2, num3));
        System.out.println("The smallest number: " + MinNumber);
    }
    static int CalculateMin(int num1, int num2, int num3){
        int min1 = Math.min(num1, num2);
        return Math.min(min1, num3);
    }
}
