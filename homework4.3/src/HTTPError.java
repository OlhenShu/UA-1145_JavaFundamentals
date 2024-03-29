enum HTTPError {
    ERROR_400(400, "Bad Request"),
    ERROR_401(401, "Unauthorized"),
    ERROR_402(402, "Payment Required"),
    ERROR_403(403, "Forbidden"),
    ERROR_404(404, "Not Found");

    private final int errorCode;
    private final String errorDescription;

    // Constructor
    HTTPError(int errorCode, String errorDescription) {
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public int getCode() {
        return errorCode;
    }

    public String getDescription() {
        return errorDescription;
    }

    public static HTTPError getHTTPError(int code) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getCode() == code) {
                return error;
            }
        }
        return null;
    }
}