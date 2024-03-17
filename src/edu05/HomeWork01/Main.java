package edu05.HomeWork01;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

class Main {
    public static void main(String[] args) {

        //Create a program (in different java documents) that prompts the user to enter:
        //• a month number and calculates the number of days in that month based on an array
        //that contains the number of days in each month.

        Scanner scan = new Scanner(in);
        System.out.println("Введіть номер місяця: ");
        int monthSelected = 0;
        String dayWord = "";
        while (monthSelected < 1 || monthSelected > 12) {
            monthSelected = scan.nextInt();
            if (monthSelected < 1 || monthSelected > 12)
                System.out.println("З 1 до 12 треба вводити, а не усе це, що було. Спробуй ще раз: ");
        }
        //Тут світч-кейс на "день/днів" в залежності від кількості днів у місяці.
        dayWord = switch (MonthDays.daysInMonth[monthSelected - 1]) {
            case (31) -> "день";
            default -> "днів";
        };
        System.out.println("В обраному місяці " + MonthDays.daysInMonth[monthSelected - 1] + " " + dayWord);

        // 10 integers numbers and calculates the sum of the first five elements if they are
        //positive, or the product of the last five elements if they are not and output the result.
        TenIntegers.tenIntegers = new int[10];
        System.out.println("Тепер введіть 10 int-ових значень до масиву: ");

        for (int i = 0; i < 10; i++) {
            TenIntegers.tenIntegers[i] = scan.nextInt();
        }

        System.out.println("Подивимось, що ви нам тут навводили" + Arrays.toString(TenIntegers.tenIntegers));
        System.out.println(TenIntegers.sumCalc(TenIntegers.tenIntegers));

        //5 integer numbers and find:
        //- position of second positive number;
        //- minimum value and its position in the array.
        //- calculate the product of all entered even numbers (exclude 0 from even if entered by
        //user).
        System.out.println("Що ж... Тепер давайте ще 5 інтових значень: ");
        for (int i = 0; i < 5; i++) {
            FiveIntegers.fiveIntegers[i] = scan.nextInt();
        }
        System.out.println("Позиція другого позитивного числа: " + FiveIntegers.findSecondPositivePosition(FiveIntegers.fiveIntegers));
        FiveIntegers.minimumValue(FiveIntegers.fiveIntegers);

        if (FiveIntegers.calculateEvenProduct(FiveIntegers.fiveIntegers) != 1) {
            System.out.println("Добуток усіх введених парних чисел: " + FiveIntegers.calculateEvenProduct(FiveIntegers.fiveIntegers));
        } else {
            System.out.println("Парни числа не знайдені");
        }
    }

}
