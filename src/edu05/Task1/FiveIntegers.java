package src.edu05.Task1;

import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write 5 integer number: ");
        int[] intArr = new int[5];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scanner.nextInt();
        }

//пошук індекса другого позитивного елемента;
        int count = 0;
        int positionNum = -1;
        while (count != 2) {
            positionNum++;
            if (intArr[positionNum] > 0) {
                count++;
            }
        }
        System.out.println("Position of 2nd positive number is: " + (positionNum + 1));

//пошук мінімума та його індекса;
        int minValue = intArr[0];
        int i = 0;
        while (i < intArr.length) {
            if (intArr[i] < minValue) {
                minValue = intArr[i];
            }
            i++;
        }

        int minPosition = 0;
        int x = 0;
        while (intArr[x] != minValue) {
            minPosition++;
            x++;
        }

        System.out.println("Minimum value of array is " + minValue + ". It's position is: " + (minPosition + 1));

//добуток парних чисел
        int product = 1;
        for (int j : intArr) {
            if ((j % 2) == 0 & (j != 0)) {
                product *= j;

            }
        }

        System.out.println("Product of even number is " + product);

    }


}

