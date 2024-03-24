package edu05.HomeWork01;

public class FiveIntegers {
    static int[] fiveIntegers = new int[5];

    public static int findSecondPositivePosition(int[] fiveIntegers) {
        int positiveCount = 0;
        for (int i = 0; i < fiveIntegers.length; i++) {
            if (fiveIntegers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    return i + 1; // Повертаю індекс другого позитивного числа в массиві.
                }
            }
        }
        return -1; // Якщо < 2 позитивних чисел, то повертається -1.
    }

    /*
    The method minimumValue prints the minimum value and its position directly,
    which differs in behavior from the other methods that return values.
    For consistency, consider renaming it to reflect its side-effect (e.g., printMinimumValueAndPosition)
    or adjust it to return a value or a result object instead of printing directly.
     */
    public static void minimumValue(int[] fiveIntegers) {
        int min = fiveIntegers[0];
        int imin = 0;
        int i = 0;
        while (i < fiveIntegers.length) {
            if (fiveIntegers[i] < min) {
                min = fiveIntegers[i];
                imin = i;
            }
            i++;
        }
        System.out.println("Мінімальне значення: " + min + ", і воно знаходиться на " + (imin + 1) + " місці.");
    }

    public static int calculateEvenProduct(int[] fiveIntegers) {
        int product = 1;
        boolean foundEven = false;
        for (int num : fiveIntegers) {
            if (num != 0 && num % 2 == 0) {
                product *= num;
                foundEven = true;
            }
        }
        return foundEven ? product : 1; // Returns 1 if no even numbers (excluding 0) were found

    }
}


