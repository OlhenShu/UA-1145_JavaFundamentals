package homework4;

import java.util.Scanner;

public class HTTPErrorMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int errorCode;
        System.out.print("Enter the HTTP error code: ");
        errorCode = scanner.nextInt();

        HTTPError error = mapErrorCodeToHTTPError(errorCode);

        if (error != null) {
            System.out.println("HTTP error: " + error.toString());
        } else {
            System.out.println("Invalid HTTP error code.");
        }
    }

    private static HTTPError mapErrorCodeToHTTPError(int errorCode) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getCode() == errorCode) {
                return error;
            }
        }
        return null;
    }
}

enum HTTPError {
    ERROR_400(400, "Bad Request"),
    ERROR_401(401, "Unauthorized"),
    ERROR_402(402, "Payment Required"),
    ERROR_403(403, "Forbidden"),
    ERROR_404(404, "Not found");

    private final int code;
    private final String description;

    HTTPError(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + " - " + description;
    }
    }