package edu04.HomeWork03;

import java.util.Scanner;

import static java.lang.System.in;

public class HttpErrorCode {
    private static final Scanner scan = new Scanner(in);

    public static void main(String[] args) {
        System.out.println("Enter the error code between 400-409");
        int errorCode = scan.nextInt();
        HttpError httpError = HttpError.getByNumber(errorCode);
        System.out.println("This error code corresponds to " + httpError.errorName);
    }
}

enum HttpError {
    $400("Bad Request"),
    $401("Unauthorized"),
    $402("Payment Required"),
    $403("Forbidden"),
    $404("Not Found"),
    $405("Method Not Allowed"),
    $406("Not Acceptable"),
    $407("Proxy Authentication Required"),
    $408("Request Timeout"),
    $409("Conflict");

    public final String errorName;

    HttpError(String errorName) {
        this.errorName = errorName;
    }

    public static HttpError getByNumber(int number) {
        return switch (number) {
            case 400 -> $400;
            case 401 -> $401;
            case 402 -> $402;
            case 403 -> $403;
            case 404 -> $404;
            case 405 -> $405;
            case 406 -> $406;
            case 407 -> $407;
            case 408 -> $408;
            case 409 -> $409;
            default -> throw new IllegalArgumentException(
                    "There is only 400-409 numbers in the list, " + number + " is out of bounds.");
        };
    }
}
