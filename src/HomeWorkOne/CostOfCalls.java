package HomeWorkOne;

import java.util.Scanner;

public class CostOfCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the duration of 1 call: ");
        int time1 = scanner.nextInt();
        System.out.println("Enter the price per minute of 1 call");
        int cost1 = scanner.nextInt();

        System.out.println("Enter the duration of 2 call: ");
        int time2 = scanner.nextInt();
        System.out.println("Enter the price per minute of 2 call");
        int cost2 = scanner.nextInt();

        System.out.println("Enter the duration of 3 call: ");
        int time3 = scanner.nextInt();
        System.out.println("Enter the price per minute of 3 call");
        int cost3 = scanner.nextInt();

        int sum1 = time1 * cost1;
        int sum2 = time2 * cost2;
        int sum3 = time3 * cost3;
        int totalSum = sum1 + sum2 + sum3;

        System.out.println("Cost of 1 call: " + sum1);
        System.out.println("Cost of 2 call: " + sum2);
        System.out.println("Cost of 3 call: " + sum3);
        System.out.println("Загальна вартість: " + totalSum);
    }
}
