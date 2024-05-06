package edu12;


import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int start = input();
        int end = input();
        int[] MyArray = readNumber(start, end);
        String myArrayString = Arrays.toString(MyArray);

        System.out.println(myArrayString.replaceAll(",", " >"));
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            int temp = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("It should be a number.");
            return false;
        }
        return true;
    }

    public static int[] readNumber(int start, int end) {
        int length = (end - start) + 1;
        int[] tempArray;
        try {
            tempArray = new int[length];
            for (int i = 0; i < length; i++) {
                tempArray[i] = start;
                start++;
            }
        } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Wrong arguments for Array.");
            return null;
        }
        return tempArray;
    }


    public static int input() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int arg;
        if (isNumeric(str)) {
            arg = Integer.parseInt(str);
        } else {
            return 0;
        }
        return arg;
    }

}


