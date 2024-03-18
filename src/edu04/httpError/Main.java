package edu04.httpError;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int userInput = 0;
        try {
            System.out.println("Введіть 3-значне число помилки:");
            userInput = SCANNER.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Здається ви ввели помилково букви, замість цифер");
        }

        HttpErrors error = HttpErrors.valueOfMessage(userInput);
        if (error != null) {
            System.out.println("Ваша помилка значить: " + error.getMessage());
        } else {
            System.out.println("Помилка з таким номером (" + userInput + ") не знайдена.");
        }
    }
}


