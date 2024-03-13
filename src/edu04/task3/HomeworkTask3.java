package edu04.task3;

import java.util.Scanner;

public class HomeworkTask3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of error: ");
        String error = SCANNER.nextLine();
        HTTPError httpErrorError = HTTPError.getForError(error);
        System.out.println("Error number " + error + " belongs to " + httpErrorError);
    }
}

enum HTTPError {
    Informational_Responses, Success_Responses, Redirection_Responses, Client_Error_Responses, Server_Error_Responses;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static HTTPError getForError(String error) {
        return switch (error) {
            case "100" -> Informational_Responses;
            case "200", "201", "204", "205", "206" -> Success_Responses;
            case "300", "301", "304", "307" -> Redirection_Responses;
            case "400", "401", "402", "403", "404" -> Client_Error_Responses;
            case "500", "503" -> Server_Error_Responses;
            default -> throw new IllegalArgumentException("Unknown status code " + error);
        };
    }
}