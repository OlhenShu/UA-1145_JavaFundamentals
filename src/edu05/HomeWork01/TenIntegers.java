package edu05.HomeWork01;

public class TenIntegers {

    public static int sumCalc(int[] tenIntegers) {
        boolean foundPositive = true;
        int result = 0;
        int mult = 1;
        for (int i = 0; i < tenIntegers.length / 2; i++)
            if (tenIntegers[i] < 0) {
                foundPositive = false;
                break;
            }

        if (!foundPositive) {
            for (int i = tenIntegers.length / 2; i < tenIntegers.length - 1; i++) {
                mult *= tenIntegers[i];
            }
            result = mult;
            System.out.print("Ох, бачу, що є негативні значення у п'яти перших числах, тому ось вам множина останніх 5 значень: ");
        } else {
            for (int i = 0; i < tenIntegers.length / 2; i++) {
                result += tenIntegers[i];
            }
            System.out.print("Так-так-так... Перші 5 значень позитивні, тому ось вам сума перших 5 значень: ");
        }
        return result;
    }
}




