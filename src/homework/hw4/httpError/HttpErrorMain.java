package homework.hw4.httpError;

import java.util.Scanner;

public class HttpErrorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter error code: ");
        getHttpError(scanner.nextInt());
    }
    public static void getHttpError(int errorCode) {
        switch (errorCode) {
            case 421 -> HttpError.$421.getDescription();
            case 422 -> HttpError.$422.getDescription();
            case 423 -> HttpError.$423.getDescription();
            case 424 -> HttpError.$424.getDescription();
            case 425 -> HttpError.$425.getDescription();
            case 426 -> HttpError.$426.getDescription();
            case 428 -> HttpError.$428.getDescription();
            case 429 -> HttpError.$429.getDescription();

            default -> System.out.println(HttpError.$520);
        }
    }
}
