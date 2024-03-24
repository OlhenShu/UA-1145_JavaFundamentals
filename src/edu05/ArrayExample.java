package edu05;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arrNumbers = {5, -10, 4, 1, 5, 7, 4, -3, -8, 12, 17};
//        Arrays.sort(arrNumbers);
//        int index = Arrays.binarySearch(arrNumbers,7);
//        System.out.println("Position " + index + 1);


        //  System.out.println(Arrays.toString(arrNumbers));

        int maxValue = arrNumbers[0];
        int imax = 0;
        int i = 0;

        while (i < arrNumbers.length) {
            if (arrNumbers[i] > maxValue) {
                maxValue = arrNumbers[i];
                imax = i;
            }
            i++;
        }
        System.out.println("Max value " + maxValue);
        System.out.println("Position " + (imax + 1));

//        int sum = 0;
//        for (int i = 0; i < arrNumbers.length; i++) {
//            sum += arrNumbers[i];
//        }
//        System.out.println("Sum is " + sum);
//
//        int product = 1;
//        for (int arrNumber : arrNumbers) {
//            if (arrNumber < 0) {
//                product = product * arrNumber;
//            }
//        }
//        System.out.println("Product is " + product);
//
//        int amount = 0;
//        for (int nums : arrNumbers) {
//            if (nums >= 5 && nums < 20) {
//                amount++;
//            }
//        }
//        System.out.println("Amount is " + amount);
        String[] names = {"Bob", "Alice", "Anna", "David"};

        System.out.println(Arrays.toString(names));
        var newNames = names.clone();
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(newNames));

        String[] names1 = new String[5];
        int size = 0;
        names1[size++] = "Bob";
        names1[size++] = "Alice";
        names1[size++] = "Anna";
        for (int j = 0; j < size; j++) {
            System.out.println(names1[j]);
        }
    }
}
