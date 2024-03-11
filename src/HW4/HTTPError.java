package HW4;

import java.util.HashMap;
import java.util.Scanner;

public class HTTPError {
    static Scanner in = new Scanner(System.in);//better

    public enum HTTP {
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        PAYMENT_REQUIRED(402),
        FORBIDDEN(403);
        private final int errorCode;

        HTTP(int errorCode) {
            this.errorCode = errorCode;
        }

        public int getErrorCode() {
            return errorCode;
        }

//        @Override
//        public String toString() {
//            // Replace underscores with spaces and capitalize the first letter of each word
//            return name().charAt(0) + name().substring(1).replace("_", " ").toLowerCase();
//        }
    }


    public static void main(String[] args) {
        int error;
        HashMap<Integer, String> errors = new HashMap<>();


        System.out.print("Please input HTTP error code: ");
        error = in.nextInt();
        for (HTTP err : HTTP.values()) {
            int length = err.name().length();
            errors.put(err.getErrorCode(), err.name().charAt(0) + err.name().substring(1, length).replace("_", " ").toLowerCase());
        }
//        for (HTTP err : HTTP.values()) {
//            errors.put(err.getErrorCode(), err.toString());
//        }
        System.out.println(errors.getOrDefault(error, "Invalid HTTP error code"));
    }
}
