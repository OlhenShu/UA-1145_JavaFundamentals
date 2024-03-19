package homework.hw4.httpError;

public enum HttpError {
    $421("Misdirected Request"),
    $422("Unprocessable Content"),
    $423("Locked"),
    $424("Failed Dependency"),
    $425("Too Early"),
    $426("Upgrade Required"),
    $428("Precondition Required"),
    $429("Too Many Requests"),
    $520("Unknown Error");

    private final String ERROR_DESCRIPTION;

    HttpError(String errorDescription) {
        ERROR_DESCRIPTION = errorDescription;
    }

    public void getDescription() {
        System.out.println(ERROR_DESCRIPTION);
    }
}
