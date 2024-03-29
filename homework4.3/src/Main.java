import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the HTTP error code: ");
        int errorCode = scanner.nextInt();

        HTTPError httpError = HTTPError.getHTTPError(errorCode);

        if (httpError != null) {
            System.out.println("HTTP error name: " + httpError.name());
            System.out.println("HTTP error description: " + httpError.getDescription());
        } else {
            System.out.println("Invalid HTTP error code.");
        }

        scanner.close();
    }
}