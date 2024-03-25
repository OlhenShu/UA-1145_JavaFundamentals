package HomeWork04.Task3;

public enum HTTPErrors {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_405("Method Not Allowed"),
    ERROR_406("Not Acceptable"),
    ERROR_407("Proxy Authentication Required"),
    ERROR_408("Request Timeout"),
    ERROR_409("Conflict"),
    ERROR_410("Gone");

    public final String errorMassage;


    HTTPErrors(String errorMassage) {
        this.errorMassage = errorMassage;
    }


    public static HTTPErrors getByNumber(int errorNumber) {
        return switch (errorNumber) {
            case 400 -> HTTPErrors.ERROR_400;
            case 401 -> HTTPErrors.ERROR_401;
            case 402 -> HTTPErrors.ERROR_402;
            case 403 -> HTTPErrors.ERROR_403;
            case 404 -> HTTPErrors.ERROR_404;
            case 405 -> HTTPErrors.ERROR_405;
            case 406 -> HTTPErrors.ERROR_406;
            case 407 -> HTTPErrors.ERROR_407;
            case 408 -> HTTPErrors.ERROR_408;
            case 409 -> HTTPErrors.ERROR_409;
            case 410 -> HTTPErrors.ERROR_410;
            default -> throw new IllegalStateException("Unknown error number: " + errorNumber);
        };
    }
}
