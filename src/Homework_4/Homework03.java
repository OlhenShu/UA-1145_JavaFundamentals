package Homework_4;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter HTTP error number (400, 401, 402, 403, 404, 500, 502, 503): ");
        int errorNumber = scanner.nextInt();

        HTTPError httpError;

        switch (errorNumber) {
            case 400:
                httpError = HTTPError.ERROR_400;
                break;
            case 401:
                httpError = HTTPError.ERROR_401;
                break;
            case 402:
                httpError = HTTPError.ERROR_402;
                break;
            case 403:
                httpError = HTTPError.ERROR_403;
                break;
            case 404:
                httpError = HTTPError.ERROR_404;
                break;
            case 500:
                httpError = HTTPError.ERROR_500;
                break;
            case 502:
                httpError = HTTPError.ERROR_502;
                break;
            case 503:
                httpError = HTTPError.ERROR_503;
                break;
            default:
                System.out.println("The name of the error " + errorNumber + " is unknown");
                httpError = null;
        }

        if (httpError != null) {
            System.out.println("The name of error " + errorNumber + " is: " + httpError.errorMessage);
        }
    }
}
