package edu01;

import java.util.Scanner;

public class PhoneCalls {
    //Cost per minute variables "C";
    static double c1, c2, c3;//separate variables on different lines
    //Time variables "T".
    static int t1, t2, t3;// the same
    //Price variables "P";
    static double p1, p2, p3;// the same
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Вам дзвонили з Польщі. Скільки гривень коштує дзвінок за хвилину? ");
        c1 = scanner.nextDouble();
        System.out.print("Скільки хвилин відбувався дзвінок? ");
        t1 = scanner.nextInt();
        //Розраховуємо вартість дзвінка
        p1 = c1 * t1;
        //Виводимо на екран вартість цього дзвінка.
        System.out.println("Дякую, аж підскакую! Давайте тепер підрахуємо вартість цього дзвінка: " + p1 + "грн.");

        System.out.print("Вам дзвонили з Албанії. Скільки гривень коштує дзвінок за хвилину? ");
        c2 = scanner.nextDouble();
        System.out.print("Скільки хвилин відбувався дзвінок? ");
        t2 = scanner.nextInt();
        //Розраховуємо вартість дзвінка
        p2 = c2 * t2;
        //Виводимо на екран вартість цього дзвінка.
        System.out.println("Дякую, аж підскакую! Давайте тепер підрахуємо вартість цього дзвінка: " + p2 + "грн.");

        System.out.print("Вам дзвонили з Еквадору. Скільки гривень коштує дзвінок за хвилину? ");
        c3 = scanner.nextDouble();
        System.out.print("Скільки хвилин відбувався дзвінок? ");
        t3 = scanner.nextInt();
        //Розраховуємо вартість дзвінка
        p3 = c3 * t3;
        //Виводимо на екран вартість цього дзвінка.
        System.out.println("Дякую, аж підскакую! Давайте тепер підрахуємо вартість цього дзвінка: " + p3 + "грн.\n");
        //Рахуємо гривні, витрачені на вхідні (што-а?) дзвінки.
        System.out.println("За сьогодні ви витратили на дзвінки " + (p1 + p2 + p3) + "грн.");
        scanner.close();
    }
// Don't forget to format your code before pushing it.

}
