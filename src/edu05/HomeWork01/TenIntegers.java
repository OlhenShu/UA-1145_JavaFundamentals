package edu05.HomeWork01;

public class TenIntegers {
    static int[] tenIntegers = new int[10];

    public static int sumCalc(int[] tenIntegers) {
        boolean foundPositive = true;
        int sumOfFive = 0;
        for (int i = 0; i < 5; i++)
            if (tenIntegers[i] < 0) {
                foundPositive = false;
                break;
            }
        if (!foundPositive) {
            for (int i = 5; i < tenIntegers.length; i++)
                sumOfFive += tenIntegers[i];
            System.out.print("Ох, бачу, що є негативні значення у п'яти перших числах, тому ось вам сума останніх 5 значень: ");
        } else {
            for (int i = 0; i < 5; i++) {
                sumOfFive += tenIntegers[i];
            }
            System.out.print("Так-так-так... Перші 5 значень позитивні, тому ось вам сума перших 5 значень: ");
        }
        return sumOfFive;
    }
}




