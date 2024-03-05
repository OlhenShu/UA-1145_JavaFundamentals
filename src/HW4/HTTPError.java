package HW4;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class HTTPError {

    public enum HTTP{
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
    }

    public static void main(String[] args) {
        int error;
        HashMap<Integer, String> errors = new HashMap<>();

        Scanner in=new Scanner(System.in);
        System.out.print("Please input HTTP error code: ");
        error=in.nextInt();
        in.close();
        for (HTTP err : HTTP.values()) {
            int length=err.name().length();
            errors.put(err.getErrorCode(), err.name().charAt(0) + err.name().substring(1,length).replace("_", " ").toLowerCase());
        }
        System.out.println(errors.getOrDefault(error, "Invalid HTTP error code"));
    }
}
