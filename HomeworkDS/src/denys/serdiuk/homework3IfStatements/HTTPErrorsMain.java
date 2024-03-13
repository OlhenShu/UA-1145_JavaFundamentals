package denys.serdiuk.homework3IfStatements;

import java.util.Scanner;

public class HTTPErrorsMain {

	public static void main(String[] args) {
		defineError();

	}

	public static void defineError() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which error you got today?");
		int error = scanner.nextInt();
		scanner.close();

		switch (error) {
		case 400:
			System.out.println(HTTPErrors.ERROR_400.message);
			break;
		case 401:
			System.out.println(HTTPErrors.ERROR_401.message);
			break;
		case 402:
			System.out.println(HTTPErrors.ERROR_402.message);
			break;
		case 403:
			System.out.println(HTTPErrors.ERROR_403.message);
			break;
		case 404:
			System.out.println(HTTPErrors.ERROR_404.message);
			break;
		default:
			System.out.println("That error is not yet in our guidebook, to be continued...");
		}
	}
}
