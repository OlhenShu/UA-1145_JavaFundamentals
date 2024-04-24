package Project_Budjet_Manager;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static Project_Budjet_Manager.Analyzer.*;
import static Project_Budjet_Manager.Category.*;
import static Project_Budjet_Manager.IncomeManager.addToIncome;
import static Project_Budjet_Manager.IncomeManager.getBalance;
import static Project_Budjet_Manager.Menu.*;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in).useLocale(Locale.US);
    static final FileManager FILE_MANAGER = new FileManager("src/Project_Budjet_Manager/purchases.txt");
    static final PurchaseList PURCHASE_LIST_OBJECT = new PurchaseList();
    static final List<Purchase> PURCHASE_LIST = PURCHASE_LIST_OBJECT.getPurchaseList();
    static boolean isRunning = true;

    public static void main(String[] args) {
        do {
            displayMainMenu();
            makeChoice();
        } while (isRunning);
    }

    private static void makeChoice() {
        int userChoice = getUserChoice();
        System.out.println();

        switch (userChoice) {
            case 1 -> addIncome();
            case 2 -> addPurchase();
            case 3 -> checkPurchaseList();
            case 4 -> printBalance();
            case 5 -> saveToFile();
            case 6 -> loadFromFile();
            case 7 -> analyse();
            case 0 -> exit();
            default -> System.out.println("Invalid choice!\n");
        }
    }

    private static void addIncome() {
        System.out.println("Enter income:");
        double income = SCANNER.nextDouble();
        addToIncome(income);
        System.out.println("Income was added!\n");
    }

    private static void addPurchase() {
        while (true) {
            displayCategoryMenu();
            int userCategoryChoice = getUserChoice();
            System.out.println();

            switch (userCategoryChoice) {
                case 1 -> PURCHASE_LIST_OBJECT.addPurchase(FOOD);
                case 2 -> PURCHASE_LIST_OBJECT.addPurchase(CLOTHES);
                case 3 -> PURCHASE_LIST_OBJECT.addPurchase(ENTERTAINMENT);
                case 4 -> PURCHASE_LIST_OBJECT.addPurchase(OTHER);
                case 5 -> {
                    return;
                }
                default -> System.out.println("Invalid choice!\n");
            }
        }
    }

    private static void checkPurchaseList() {
        if (PURCHASE_LIST.isEmpty()) {
            PURCHASE_LIST_OBJECT.displayPurchaseList();
        } else {
            choosePurchaseCategory();
        }
    }

    private static void choosePurchaseCategory() {
        while (true) {
            displayPurchaseMenu();
            int userCategoryChoice = getUserChoice();
            System.out.println();

            switch (userCategoryChoice) {
                case 1 -> PURCHASE_LIST_OBJECT.displayPurchaseListByCategory(FOOD);
                case 2 -> PURCHASE_LIST_OBJECT.displayPurchaseListByCategory(CLOTHES);
                case 3 -> PURCHASE_LIST_OBJECT.displayPurchaseListByCategory(ENTERTAINMENT);
                case 4 -> PURCHASE_LIST_OBJECT.displayPurchaseListByCategory(OTHER);
                case 5 -> PURCHASE_LIST_OBJECT.displayPurchaseListByCategory();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Invalid choice!\n");
            }
        }
    }

    private static void printBalance() {
        System.out.printf(Locale.US, "Balance: $%.2f%n%n", getBalance());
    }

    private static void exit() {
        System.out.println("Bye!\n");
        SCANNER.close();
        isRunning = false;
    }

    private static void saveToFile() {
        try {
            FILE_MANAGER.save(getBalance(), PURCHASE_LIST);
            System.out.println("Purchases were saved!\n");
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    private static void loadFromFile() {
        try {
            FileData fileData = FILE_MANAGER.load();
            IncomeManager.setBalance(fileData.getBalance());
            List<Purchase> purchases = fileData.getPurchases();
            PURCHASE_LIST.clear();
            PURCHASE_LIST.addAll(purchases);
            System.out.println("Purchases were loaded!\n");
        } catch (IOException e) {
            System.err.println("Error loading data from file: " + e.getMessage());
        }
    }

    private static void analyse() {
        while (true) {
            displaySortMenu();
            int userSortChoice = getUserChoice();
            System.out.println();

            switch (userSortChoice) {
                case 1 -> sortAll();
                case 2 -> sortByType();
                case 3 -> chooseSortByCertainType();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice!\n");
            }
        }
    }
}

