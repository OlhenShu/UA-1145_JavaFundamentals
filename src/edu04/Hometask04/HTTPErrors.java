package edu04.Hometask04;

import java.util.Scanner;

class Task03 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the number of an error from your screen: ");
        int numberOfError = SCANNER.nextInt();
        HTTPErrors httpErrors = HTTPErrors.getTheError(Integer.toString(numberOfError));
        System.out.println("The error: " + numberOfError + " belongs to the http error " + httpErrors.getNameOfError());


    }
}

public enum HTTPErrors{
    _101("Switching Protocols"),
    _102("Processing (WebDAV; RFC 2518)"),
    _204("No Content"),
    _304("Not Modified"),
    _305("Use Proxy (since HTTP/1.1)"),
    _400("Bad Request"),
    _401("Unauthorized"),
    _402("Payment Required"),
    _403("Forbidden"),
    _404("Not Found");

    public final String nameOfError;

    HTTPErrors(String nameOfError) {
        this.nameOfError = nameOfError;
    }

    public String getNameOfError() {
        return nameOfError;
    }


    public static HTTPErrors getTheError(String error) {
        return switch (error){
            case "101" -> _101;
            case "102" -> _102;
            case "204" -> _204;
            case "304" -> _304;
            case "305" -> _305;
            case "400" -> _400;
            case "401" -> _401;
            case "402" -> _402;
            case "403" -> _403;
            case "404" -> _404;
            default -> throw new IllegalArgumentException("Unknown error code " +
                    error + ", please contact us by email.");
        };
    }
 }



