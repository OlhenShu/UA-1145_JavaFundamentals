package Project_Budjet_Manager;

import java.util.InputMismatchException;

public class Menu {

    public static void displayMainMenu() {
        System.out.println("""
                Choose your action:
                1) Add income
                2) Add purchase
                3) Show list of purchases
                4) Balance
                5) Save
                6) Load
                7) Analyze (Sort)
                0) Exit""");
    }

    public static int getUserChoice() {
        try {
            return Main.SCANNER.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\nIncorrect input. Please enter a valid number.");
            Main.SCANNER.next();
            return 0;
        }
    }

    public static void displayCategoryMenu() {
        System.out.println("""
                Choose the type of purchase
                1) Food
                2) Clothes
                3) Entertainment
                4) Other
                5) Back""");
    }

    public static void displayPurchaseMenu() {
        System.out.println("""
                Choose the type of purchases
                1) Food
                2) Clothes
                3) Entertainment
                4) Other
                5) All
                6) Back""");
    }

    public static void displaySortMenu() {
        System.out.println("""
                How do you want to sort?
                1) Sort all purchases
                2) Sort by type
                3) Sort certain type
                4) Back""");
    }

    public static void displayTypesMenu() {
        System.out.println("""
                Choose the type of purchase
                1) Food
                2) Clothes
                3) Entertainment
                4) Other""");
    }
}
