package HomeWorkOne;

import java.util.Scanner;

public class CostOfCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тривалість 1 дзвінка: ");
        int time1 = scanner.nextInt();
        System.out.println("Введіть ціну за хвилину 1 дзвінка ");
        int cost1 = scanner.nextInt();

        System.out.println("Тривалість 2 дзвінка: ");
        int time2 = scanner.nextInt();
        System.out.println("Введіть ціну за хвилину 1 дзвінка ");
        int cost2 = scanner.nextInt();

        System.out.println("Тривалість 3 дзвінка: ");
        int time3 = scanner.nextInt();
        System.out.println("Введіть ціну за хвилину 1 дзвінка ");
        int cost3 = scanner.nextInt();

        int sum1 = time1 * cost1;
        int sum2 = time2 * cost2;
        int sum3 = time3 * cost3;
        int totalsum = sum1 + sum2 + sum3;

        System.out.println("Вартість 1 дзвінка: " + sum1);
        System.out.println("Вартість 2 дзвінка: " + sum2);
        System.out.println("Вартість 3 дзвінка: " + sum3);
        System.out.println("Загальна вартість: " + totalsum);
    }
}
