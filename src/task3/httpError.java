package task3;

import java.util.Scanner;

public class httpError {

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

        private String description;

        HTTPError(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input a number representing an HTTP error:");
        int inputErrorCode = Integer.parseInt(scanner.nextLine());
        HTTPError[] errors = HTTPError.values();
        HTTPError enumDescription = errors[inputErrorCode - 400];
        String description = enumDescription.getDescription();

        System.out.println("An HTTP error is: " + description);

        scanner.close();
    }
}
