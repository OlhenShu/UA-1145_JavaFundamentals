package Project_Budjet_Manager;

import java.util.*;

import static Project_Budjet_Manager.IncomeManager.subtractBalance;

public class PurchaseList {

    private final List<Purchase> purchaseList;

    public PurchaseList() {
        this.purchaseList = new ArrayList<>();
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void displayPurchaseList() {
        if (purchaseList.isEmpty()) {
            System.out.println("The purchase list is empty!\n");
        } else {
            for (Purchase purchase : purchaseList) {
                System.out.println(purchase);
            }
            System.out.printf(Locale.US, "Total sum: $%.2f \n\n", getTotal());
        }
    }

    public void displayPurchaseListByCategory(Category category) {
        boolean containsCategory = purchaseList
                .stream()
                .anyMatch(purchase -> purchase.getCategory() == category);

        if (containsCategory) {
            System.out.printf("%s:\n", category);
            purchaseList.stream()
                    .filter(purchase -> purchase.getCategory() == category)
                    .forEach(System.out::println);

            System.out.printf(Locale.US, "Total sum: $%.2f \n\n", getTotalByCategory(category));
        } else {
            System.out.printf("%s:\n", category);
            System.out.println("The purchase list is empty!\n");
        }
    }

    public void displayPurchaseListByCategory() {
        System.out.println("All:");
        displayPurchaseList();
    }

    public void addPurchase(Category category) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Enter purchase name:");
            String inputName = scanner.nextLine();

            System.out.println("Enter its price:");
            double inputPrice = scanner.nextDouble();
            scanner.nextLine();

            if (inputPrice < 0) {
                throw new IllegalArgumentException("Price cannot be negative.\n");
            }

            subtractBalance(inputPrice);

            Purchase purchase = new Purchase(inputName, inputPrice, category);
            purchaseList.add(purchase);

            System.out.println("Purchase was added!\n");

        } catch (InputMismatchException ime) {
            System.out.println("Invalid input. Please enter a valid number for price.\n");
            scanner.next();
        } catch (IllegalArgumentException iae) {
            System.out.println("Error: " + iae.getMessage());
        }
    }

    public double getTotal() {
        double sum = 0.00;
        for (Purchase purchase : purchaseList) {
            sum += purchase.getPrice();
        }
        return sum;
    }

    public double getTotalByCategory(Category category) {
        double sum = 0.00;
        for (Purchase purchase : purchaseList) {
            if (purchase.category == category) {
                sum += purchase.getPrice();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "PurchaseList{" +
                " purchaseList = " + purchaseList +
                '}';
    }
}
