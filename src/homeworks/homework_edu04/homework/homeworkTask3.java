package homework_edu04.homework;

import java.util.Scanner;

public class homeworkTask3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input an HTTP error code: ");
        int errorCode = SCANNER.nextInt();
        HTTPErrorsCode httpError = HTTPErrorsCode.goToHTTPErrors(errorCode);
        System.out.println("The corresponding name of the error is: "+ httpError.getDescription());

    }

}

enum HTTPErrorsCode {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_405("Method Not Allowed"),
    ERROR_409("Conflict"),
    ERROR_500("Internal Server Error");

    public final String description;

    HTTPErrorsCode(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static HTTPErrorsCode goToHTTPErrors(int errorCode) {
        return  switch (errorCode){
            case 400 -> ERROR_400;
            case 401 -> ERROR_401;
            case 402 -> ERROR_402;
            case 403 -> ERROR_403;
            case 404 -> ERROR_404;
            case 405 -> ERROR_405;
            case 409 -> ERROR_409;
            case 500 -> ERROR_500;
            default -> throw new IllegalArgumentException(
                    "Unknown HTTP error number ");
        };

    }
}

