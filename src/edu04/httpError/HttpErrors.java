package edu04.httpError;

public enum HttpErrors {
    ERROR_400(400, "\"Bad Request\", ваш запит скоріш за все не правильно сформульваний"),
    ERROR_401(401, "\"Unauthorized\" вказує, що скоріш за все ваш акаунт не авторизований"),
    ERROR_403(403, "\"Forbidden\", у вас недостатньо прав для доступу"),
    ERROR_404(404, "\"Not Found\", вказує на те що запитуваний ресурс не знайдено"),
    ERROR_501(501, "\"Not Implemented\", функції, для підтримки запиту ще не реалізовано"),
    ERROR_502(502, "\"Bad Gateway\" вказує, що сервер, діючи як шлюз або проксі," +
            " не отримав жодної відповіді від вихідного сервера."),
    ERROR_503(503, "\"Service Unavailable\" вказує на те, що сервер не готовий опрацювати даний запит."),
    ERROR_504(504, "\"Gateway Timeout\" вказує на помилку, що сервер, діючий як шлюз або проксі," +
            " не може отримати відповідь вчасно. ");
    private final int error;
    private final String message;

    HttpErrors(int error, String message) {
        this.error = error;
        this.message = message;
    }

    public int getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public static HttpErrors valueOfMessage(int error) {
        for (HttpErrors message : values()) {
            if (message.getError() == error) {
                return message;
            }
        }
        return null;
    }
}




