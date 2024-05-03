package denys.serdiuk.ProjectBudgetManager;

import java.util.InputMismatchException;

public class Menu {
	public static String purchaseTypeMenu() {
		System.out.println("Choose the type of purchase");
		System.out.println("1) Food");
		System.out.println("2) Clothes");
		System.out.println("3) Entertainment");
		System.out.println("4) Other");
		System.out.println("5) Back");

		while (true) {
			if (UserInput.scanner.hasNextInt()) {
				int input = UserInput.scanner.nextInt();
				UserInput.scanner.nextLine();
				switch (input) {
				case 1:
					return "Food";
				case 2:
					return "Clothes";
				case 3:
					return "Entertainment";
				case 4:
					return "Other";
				case 5:
					return null; // Back
				default:
					System.out.println("Invalid option. Please choose again.");
					System.out.println();
				}
			} else {
				UserInput.scanner.nextLine();
				System.out.println("Invalid input. Please enter a number.");
				System.out.println();
			}
		}
	}

	public static void specificPurchases(String purchaseType) {
		double totalSum = 0;
		System.out.println(purchaseType + ':');
		for (Purchase purchase : BankAccount.purchases) {
			if (purchase.getCategory().equals(purchaseType)) {
				System.out.println(purchase);
				totalSum += purchase.getPrice();
			}
		}
		if (totalSum == 0) {
			System.out.println("The purchase list is empty!");
			System.out.println();
		} else {
			System.out.println("Total sum: $" + totalSum);
			System.out.println();
		}
	}

	public static void menu(BankAccount bankAccount) {
		while (true) {
			System.out.println("Choose your action:");
			System.out.println("1) Add income");
			System.out.println("2) Add purchase");
			System.out.println("3) Show list of purchases");
			System.out.println("4) Balance");
			System.out.println("0) Exit");

			int answer;
			while (true) {
				try {
					if (UserInput.scanner.hasNextInt()) {
						answer = UserInput.scanner.nextInt();
						UserInput.scanner.nextLine();
						break;
					} else {
						UserInput.scanner.nextLine();
						System.out.println("Invalid input. Please enter a number.");
						System.out.println();
					}
				} catch (InputMismatchException e) {
					System.out.println("Please enter a valid number");
				}
			}
			System.out.println();

			switch (answer) {
			case 1: // add income
				System.out.println();
				System.out.println("Enter income:");
				try {
					double income = UserInput.scanner.nextDouble();
					bankAccount.setBalance(income);
					System.out.println("Income was added!");
					System.out.println();
				} catch (InputMismatchException e) {
					System.out.println();
					System.out.println("Please enter a valid double");
					System.out.println();
				}
				break;

			case 2: // add purchase
				System.out.println();
				boolean validNameEntered = false;
				String purchaseName = "";
				while (!validNameEntered) {
					String purchaseType = purchaseTypeMenu();
					if (purchaseType != null) {
						System.out.println();
						System.out.println("Enter purchase name: ");
						purchaseName = UserInput.scanner.nextLine().trim();

						// Check if the entered name contains any digits
						if (!purchaseName.matches(".*\\d.*") && !purchaseName.isEmpty()) {
							validNameEntered = true; // Exit the loop if the name is valid (no digits)
						} else {
							System.out.println("Please enter a valid non-numeric name for the purchase.");
							System.out.println();
						}
					}
					if (validNameEntered) {
						System.out.println("Enter its price:");
						double purchasePrice = UserInput.scanner.nextDouble();
						Purchase purchase = new Purchase(purchaseName, purchaseType, purchasePrice);
						bankAccount.withdrawIncome(purchasePrice);
						bankAccount.addPurchases(purchase);
						System.out.println();
						System.out.println("Purchase was added!");
						System.out.println();
					}
				}
				System.out.println();
				break;

			case 3: // show list of purchases
				System.out.println();
				System.out.println("Choose the type of purchases");
				System.out.println("1) Food");
				System.out.println("2) Clothes");
				System.out.println("3) Entertainment");
				System.out.println("4) Other");
				System.out.println("5) All");
				System.out.println("6) Back");

				while (true) {
					if (UserInput.scanner.hasNextInt()) {
						double total = 0;
						int inputInt = UserInput.scanner.nextInt();
						UserInput.scanner.nextLine();
						System.out.println();
						switch (inputInt) {
						case 1:
							System.out.println();
							specificPurchases("Food");
							break;
						case 2:
							System.out.println();
							specificPurchases("Clothes");
							break;
						case 3:
							System.out.println();
							specificPurchases("Entertainment");
							break;
						case 4:
							System.out.println();
							specificPurchases("Other");
							break;
						case 5:
							System.out.println();
							System.out.println("All: ");
							for (Purchase purchase : BankAccount.purchases) {
								System.out.println(purchase);
								total = purchase.getPrice() + total;
							}
							System.out.println("Total sum: $" + total);
							System.out.println();
							break;
						case 6:
							break; // Back
						default:
							System.out.println("Invalid option. Please choose again.");
							System.out.println();
						}
						break;
					} else {
						UserInput.scanner.nextLine();
						System.out.println("Invalid input. Please enter a number.");
						System.out.println();
					}
				}
				break;

			case 4: // Show current balance
				System.out.println();
				System.out.println("Balance: $" + bankAccount.getBalance());
				System.out.println();
				break;

			case 0: // exit
				System.out.println();
				System.out.println("Bye!");
				System.out.println();
				return;

			default: // exceptions
				System.out.println();
				System.out.println("Invalid option. Please choose again.");
				System.out.println();
			}
		}
	}
}