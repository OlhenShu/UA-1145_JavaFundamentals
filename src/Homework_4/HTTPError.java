package Homework_4;

// Task 3

public enum HTTPError {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_500("Internal Server Error"),
    ERROR_502("Bad Gateway"),
    ERROR_503("Service Unavailable");

    String errorMessage;

    HTTPError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
