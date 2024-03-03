
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть радіус кола: ");
        int radius = scanner.nextInt();
        double Perimeter = 2 * 3.14 * radius;
        double area = 3.14 * Math.pow(radius, 2);
        System.out.println("Периметр кола: " + Perimeter);
        System.out.println("Площа кола: " + area);
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Як тебе звати? ");
        String name = scanner.next();
        System.out.println("Де ти живеш? ");
        String address = scanner.next();
        System.out.println(name + " " + address);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тривалість 1 дзвінка: ");
        int c1 = scanner.nextInt();
        System.out.println("Введіть ціну за хвилину 1 дзвінка ");
        int t1 = scanner.nextInt();

        System.out.println("Тривалість 2 дзвінка: ");
        int c2 = scanner.nextInt();
        System.out.println("Введіть ціну за хвилину 1 дзвінка ");
        int t2 = scanner.nextInt();

        System.out.println("Тривалість 3 дзвінка: ");
        int c3 = scanner.nextInt();
        System.out.println("Введіть ціну за хвилину 1 дзвінка ");
        int t3 = scanner.nextInt();

        int sum1 = c1 * t1;
        int sum2 = c2 * t2;
        int sum3 = c3 * t3;
        int totalsum = sum1 + sum2 + sum3;

        System.out.println("Вартість 1 дзвінка: " + sum1);
        System.out.println("Вартість 2 дзвінка: " + sum2);
        System.out.println("Вартість 3 дзвінка: " + sum3);
        System.out.println("Загальна вартість: " + totalsum);
    }


}

