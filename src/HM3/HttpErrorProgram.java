package HM3;

import java.util.Scanner;

public class HttpErrorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an HTTP error code (400, 401, 402, etc.): ");
        int errorCode = scanner.nextInt();
        HTTPError error = HTTPError.getError(errorCode);
        System.out.println("The corresponding error is: " + error);
    }
}

enum HTTPError {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_405("Method Not Allowed"), // Add more error codes as needed

    // Default error for unknown codes
    UNKNOWN_ERROR("Unknown Error");

    private final String errorMessage;

    HTTPError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static HTTPError getError(int errorCode) {
        for (HTTPError error : HTTPError.values()) {
            if (error.ordinal() == errorCode - 400) {
                return error;
            }
        }
        return UNKNOWN_ERROR;
    }

    @Override
    public String toString() {
        return errorMessage;
    }
}