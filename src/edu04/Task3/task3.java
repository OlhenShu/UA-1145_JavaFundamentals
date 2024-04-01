package src.edu04.Task3;

import java.util.Scanner;

enum HttpErrors {
    ERROR400("Bad request"),
    ERROR401("Unauthorized"),
    ERROR402("Payment Required");

    private final String errorName;

    HttpErrors(String errorName) {
        this.errorName = errorName;
    }

    public static HttpErrors getError(int num) {
        return switch (num) {
            case 400 -> ERROR400;
            case 401 -> ERROR401;
            case 402 -> ERROR402;

            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
    }

    @Override
    public String toString() {
        return errorName;
    }
}

public class task3 {
    public static void main(String[] args) {
        System.out.println("Please write number of your error: ");
        Scanner numScanner = new Scanner(System.in);
        int num = numScanner.nextInt();
        HttpErrors httpError = HttpErrors.getError(num);
        System.out.println("Error " + num + " mean " + httpError);

    }
}