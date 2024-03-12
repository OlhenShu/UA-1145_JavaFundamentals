package task3;

import java.util.Scanner;

public class httpError {
    private static final Scanner SCANNER = new Scanner(System.in);

    public enum HTTPError {
        ERROR_400("Bad Request"),
        ERROR_401("Unauthorized"),
        ERROR_402("Payment Required"),
        ERROR_403("Forbidden"),
        ERROR_404("Not Found"),
        ERROR_405("Method Not Allowed"),
        ERROR_406("Not Acceptable"),
        ERROR_407("Proxy Authentication Required"),
        ERROR_408("Request Timeout"),
        ERROR_409("Conflict"),
        ERROR_410("Gone"),
        ERROR_411("Length Required"),
        ERROR_412("Precondition Failed"),
        ERROR_413("Payload Too Large"),
        ERROR_414("URI Too Long"),
        ERROR_415("Unsupported Media Type"),
        ERROR_416("Range Not Satisfiable"),
        ERROR_417("Expectation Failed");

        public final String description;

        HTTPError(String description) {
            this.description = description;
        }

        public static String getDescription(int number) {
            return switch (number) {
                case 400 -> ERROR_400.description;
                case 401 -> ERROR_401.description;
                case 402 -> ERROR_402.description;
                case 403 -> ERROR_403.description;
                case 404 -> ERROR_404.description;
                case 405 -> ERROR_405.description;
                case 406 -> ERROR_406.description;
                case 407 -> ERROR_407.description;
                case 408 -> ERROR_408.description;
                case 409 -> ERROR_409.description;
                case 410 -> ERROR_410.description;
                case 411 -> ERROR_411.description;
                case 412 -> ERROR_412.description;
                case 413 -> ERROR_413.description;
                case 414 -> ERROR_414.description;
                case 415 -> ERROR_415.description;
                case 416 -> ERROR_416.description;
                case 417 -> ERROR_417.description;
                default -> "Unknown Error";
            };
        }
    }

    public static void main(String[] args) {
        System.out.println("Please, input a number representing an HTTP error:");
        int inputErrorCode = Integer.parseInt(SCANNER.nextLine());
        String description = HTTPError.getDescription(inputErrorCode);

        System.out.println("An HTTP error is: " + description);

        SCANNER.close();
    }
}

