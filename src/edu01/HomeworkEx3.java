package edu01;

import java.util.Scanner;

public class HomeworkEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть вартість за хвилину для першого дзвінка:");
        double c1 = scanner.nextDouble();
        System.out.println("Введіть вартість за хвилину для другого дзвінка:");
        double c2 = scanner.nextDouble();
        System.out.println("Введіть вартість за хвилину для третього дзвінка:");
        double c3 = scanner.nextDouble();

        System.out.println("Введіть тривалість для першого дзвінка:");
        int d1 = scanner.nextInt();
        System.out.println("Введіть тривалість для другого дзвінка:");
        int d2 = scanner.nextInt();
        System.out.println("Введіть тривалість для третього дзвінка:");
        int d3 = scanner.nextInt();

        scanner.close();

        double cost1 = c1 * d1;
        double cost2 = c2 * d2;
        double cost3 = c3 * d3;
        double totalCost = cost1 + cost2 + cost3;

        System.out.println("Вартість першого дзвінка: " + cost1);
        System.out.println("Вартість другого дзвінка: " + cost2);
        System.out.println("Вартість третього дзвінка: " + cost3);
        System.out.println("Загальна вартість: " + totalCost);
    }
}
