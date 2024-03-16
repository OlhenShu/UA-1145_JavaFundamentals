package Practicals.Pr5.Ex2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer here: ");
        int number = scanner.nextInt();

        boolean is_prime = checkIsPrimeNumb(number);

        if (is_prime){
            System.out.println("This number is prime!");
        }
        else {
            System.out.println("This number isn't prime!");
        }
    }

    public static boolean checkIsPrimeNumb (int numb){
        if (numb == 1 || numb == 2) {
            return true;
        }
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}
