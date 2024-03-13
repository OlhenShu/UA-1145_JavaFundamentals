package Task3;

public enum HTTPError {
    Error400("Bad Request"),
    Error401("Unauthorized"),
    Error402("Payment Required"),
    Error403("Forbidden"),
    Error404("Not Found"),
    Error405("Method Not Allowed"),
    Error406("Not Acceptable"),
    Error407("Proxy Authentication Required"),
    Error408("Request Timeout"),
    Error409("Conflict"),
    Error410("Gone");

    public final String name;

    HTTPError(String name) {
        this.name = name;
    }
}