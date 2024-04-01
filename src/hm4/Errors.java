package hm4;

import java.util.Scanner;

public class Errors {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введіть номер помилки HTTP");
        int errorNumber = sc.nextInt();
        HTTPError httpError = HTTPError.getByNumber(errorNumber);
        System.out.println("Опис помилки: " + httpError.description);
    }
}
enum HTTPError {
    ERROR400("Bad Request"),
    ERROR401("Unauthorized"),
    ERROR402("Payment Required"),
    ERROR403("Forbidden");

    public String description;
    HTTPError(String description) {
        this.description = description;
    }

    public static HTTPError getByNumber(int number) {
        return switch (number) {
            case 400 -> ERROR400;
            case 401 -> ERROR401;
            case 402 -> ERROR402;
            case 403 -> ERROR403;
            default -> throw new IllegalArgumentException("Немає у списку");
        };
    }
}


