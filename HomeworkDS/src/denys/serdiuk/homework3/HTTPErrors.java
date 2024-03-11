package denys.serdiuk.homework3;

public enum HTTPErrors {
	ERROR_400(400, "Bad Request"),
	ERROR_401(401, "Unauthorized"),
	ERROR_402(402, "Payment required"),
	ERROR_403(403, "Forbidden"),
	ERROR_404(404, "Not Found");

	public final int error;
	public final String message;

	HTTPErrors(int error, String message) {
		this.error = error;
		this.message = message;
	}
}
