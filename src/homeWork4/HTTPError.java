package homeWork4;

import java.util.Scanner;

public class HTTPError {
    public void findErrorByCode(Scanner scanner) {
        System.out.println("Please enter the number ->>");
        int errorCode = scanner.nextInt();
        HTTPErrors error = HTTPErrors.getErrorByCode(errorCode);
        if (error != null) {
            System.out.println("The code " + errorCode + " corresponds to the error ->> " + error);
        } else {
            System.out.println("Unknown or unsupported HTTP error code.");
        }
    }

    //private Scanner scanner = new Scanner(System.in);
    enum HTTPErrors {
        BadRequest(400),
        Unauthorized(401),
        PaymentRequired(402),
        Forbidden(403),
        NotFound(404);

        private final int code;

        HTTPErrors(int code) {
            this.code = code;
        }

        private static HTTPErrors getErrorByCode(int code) {
            for (HTTPErrors error : HTTPErrors.values()) {
                if (error.getCode() == code) {
                    return error;
                }
            }
            return null;
        }

        public int getCode() {
            return code;
        }
    }

}

class RunHTTPError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HTTPError httpError = new HTTPError();
        httpError.findErrorByCode(sc);
    }
}
