package HomeWork04.Task3;

import java.util.Scanner;

import static java.lang.System.in;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the HTTPError number: ");
        int errorNumber = scanner.nextInt();
        HTTPErrors httpErrors = HTTPErrors.getByNumber(errorNumber);
        System.out.println("Error message for HTTP Error " + errorNumber + ": " + httpErrors.errorMassage);
    }
}

