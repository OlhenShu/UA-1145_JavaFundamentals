package Project_Budjet_Manager;

import java.util.*;

import static Project_Budjet_Manager.Main.PURCHASE_LIST;
import static Project_Budjet_Manager.Main.PURCHASE_LIST_OBJECT;
import static Project_Budjet_Manager.Menu.displayTypesMenu;
import static Project_Budjet_Manager.Menu.getUserChoice;

public class Analyzer {

    private static final Comparator<Purchase> PURCHASE_COMPARATOR = (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice());

    public static void sortAll() {
        if (PURCHASE_LIST.isEmpty()) {
            PURCHASE_LIST_OBJECT.displayPurchaseList();
            return;
        }
        List<Purchase> listCopy = new ArrayList<>(PURCHASE_LIST);
        listCopy.sort(PURCHASE_COMPARATOR);

        System.out.println("All:");
        for (Purchase purchase : listCopy) {
            System.out.println(purchase);
        }
        System.out.println("Total: $" + PURCHASE_LIST_OBJECT.getTotal() + "\n");
    }

    public static void sortByType() {
        if (PURCHASE_LIST.isEmpty()) {
            System.out.printf("""
                    Types:
                    Food - $0
                    Entertainment - $0
                    Clothes - $0
                    Other - $0
                    Total sum: $0\n
                    """
            );
        } else {
            double foodTotal = PURCHASE_LIST_OBJECT.getTotalByCategory(Category.FOOD);
            double entertainmentTotal = PURCHASE_LIST_OBJECT.getTotalByCategory(Category.ENTERTAINMENT);
            double clothesTotal = PURCHASE_LIST_OBJECT.getTotalByCategory(Category.CLOTHES);
            double otherTotal = PURCHASE_LIST_OBJECT.getTotalByCategory(Category.OTHER);
            double overallTotal = PURCHASE_LIST_OBJECT.getTotal();

            HashMap<String, Double> typesOfPurchases = new HashMap<>();

            typesOfPurchases.put("Food", foodTotal);
            typesOfPurchases.put("Entertainment", entertainmentTotal);
            typesOfPurchases.put("Clothes", clothesTotal);
            typesOfPurchases.put("Other", otherTotal);

            List<Map.Entry<String, Double>> listOfTypes = new ArrayList<>(typesOfPurchases.entrySet());
            listOfTypes.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

            System.out.println("Types:");

            for (Map.Entry<String, Double> entry : listOfTypes) {
                System.out.printf(Locale.US, "%s - $%.2f%n", entry.getKey(), entry.getValue());
            }
            System.out.printf(Locale.US, "Total sum: $%.2f%n%n", overallTotal);
        }
    }

    public static void chooseSortByCertainType() {
        displayTypesMenu();
        int typeChoice = getUserChoice();
        System.out.println();
        switch (typeChoice) {
            case 1 -> sortByCertainType(Category.FOOD);
            case 2 -> sortByCertainType(Category.CLOTHES);
            case 3 -> sortByCertainType(Category.ENTERTAINMENT);
            case 4 -> sortByCertainType(Category.OTHER);
            default -> System.out.println("Invalid choice!\n");
        }
    }

    private static void sortByCertainType(Category category) {
        boolean containsCategory = PURCHASE_LIST
                .stream()
                .anyMatch(purchase -> purchase.getCategory() == category);
        if (containsCategory) {
            System.out.printf("%s:\n", category);
            PURCHASE_LIST.stream()
                    .filter(purchase -> purchase.getCategory() == category)
                    .sorted(PURCHASE_COMPARATOR)
                    .forEach(purchase ->
                            System.out.printf("%s $%.2f%n", purchase.getName(), purchase.getPrice()));
            System.out.printf(Locale.US, "Total sum: $%.2f \n\n", PURCHASE_LIST_OBJECT.getTotalByCategory(category));
        } else {
            PURCHASE_LIST_OBJECT.displayPurchaseList();
        }
    }
}
