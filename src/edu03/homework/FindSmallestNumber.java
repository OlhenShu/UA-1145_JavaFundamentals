package edu03.homework;

public class FindSmallestNumber {
    public static void main(String[] args) {

        int number1 = 18;
        int number2 = 32;
        int number3 = 54;
        int smallestNumber = getSmallestNumber(number1, number2, number3);
        System.out.println(smallestNumber);
    }

    private static int getSmallestNumber(int number1, int number2, int number3) {
        int result;
        if (number1 <= number2 && number1 <= number3) {
            result = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            result = number2;
        } else {
            result = number3;
        }
        return result;
    }
}
