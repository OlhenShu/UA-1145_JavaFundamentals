package Project;

import java.util.Scanner;


public class CoffeeMachine {

    public static Scanner SCANNER = new Scanner(System.in);
    private static double waterAmount = 400;
    private static double milkAmount = 540;
    private static double coffeeBeansAmount = 120;
    private static int disposalCups = 9;
    private static double money = 550;


    public static void main(String[] args) {
        actions();
    }

    public static void actions() {
        boolean flag = true;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = SCANNER.nextLine().toLowerCase().trim();
            switch (action) {
                case "buy":
                    buyAct();
                    continue;
                case "fill":
                    fillAct();
                    continue;
                case "take":
                    takeAct();
                    continue;
                case "remaining":
                    remainingAct();
                    continue;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong command, please choose right");
            }
        } while (flag);
    }

    public static void buyAct() {
        System.out.println(
                """ 
                        What do you want to buy?
                                                
                        1. Espresso
                        2. Latte
                        3. Cappuccino
                        4. Back""");

        String input = SCANNER.nextLine();

        int chosenDrink = returnMethod(input);

        switch (chosenDrink) {
            case 1:
                coffeeAct(Ingredients.espresso);
                break;
            case 2:
                coffeeAct(Ingredients.latte);
                break;
            case 3:
                coffeeAct(Ingredients.cappuccino);
                break;
            case 4:
                break;
            default:
                System.out.println("Something went wrong, try again.");

        }
    }


    public static void coffeeAct(Ingredients drink) {
        boolean possibility = true;
        if ((waterAmount - drink.getWater()) < 0) {
            System.out.println("Sorry not enough water");
            possibility = false;
        }
        if ((milkAmount - drink.getMilk()) < 0) {
            System.out.println("Sorry not enough milk");
            possibility = false;
        }
        if ((coffeeBeansAmount - drink.getCoffeeBeans()) < 0) {
            System.out.println("Sorry not enough coffee beans");
            possibility = false;
        }
        if (disposalCups - 1 < 0) {
            System.out.println("Sorry not enough cups");
            possibility = false;
        }

        if (possibility) {
            System.out.println("I have enough resources, making you a coffee!");
            waterAmount -= drink.getWater();
            milkAmount -= drink.getMilk();
            coffeeBeansAmount -= drink.getCoffeeBeans();
            disposalCups -= 1;
            money += drink.getPrice();

        }
    }

    public static void fillAct() {

        if (SecurityCheckMethod()) {
            System.out.println("Write how many ml of water you want to add: ");
            waterAmount += input();
            System.out.println("Write how many ml of milk you want to add: ");
            milkAmount += input();
            System.out.println("Write how many grams of coffee beans you want to add: ");
            coffeeBeansAmount += input();
            System.out.println("Write how many disposable cups you want to add: ");
            disposalCups += input();
        }
    }

    public static void takeAct() {
        if (SecurityCheckMethod()) {
            System.out.println("I gave you " + "$" + money);
            money = 0;
        }
    }

    public static void remainingAct() {

        if (SecurityCheckMethod()) {
            System.out.println("The coffee Project has:\n" +
                    waterAmount + " ml of water\n" +
                    milkAmount + " ml of milk\n" +
                    coffeeBeansAmount + " g of coffee beans\n" +
                    disposalCups + " disposable cups\n" +
                    "$" + money + " of money\n");

        }
    }

    public static int input() {
        String input = SCANNER.nextLine();
        int checkedInput = returnMethod(input);
        if (checkedInput < 2000) {
            return checkedInput;
        } else {
            System.out.println("There is no space for so much to fill in.");
            return 0;

        }
    }

    public static boolean isNumeric(String input) {
        if (input == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Wrong input.");
            return false;
        }
        return true;
    }

    public static int returnMethod(String input) {
        int number = 0;
        if (isNumeric(input)) {
            number = Integer.parseInt(input);
        }
        return number;
    }

    public static boolean SecurityCheckMethod() {
        System.out.println("""
                You have three attempts.
                Please write a pin:""");
        String pin = "1111";
        int count = 3;
        boolean flag = false;
        while (count > 0 & !flag) {
            String pinInput = SCANNER.nextLine();

            if (pinInput.equals(pin)) {
                flag = true;
            } else {
                count -= 1;
                System.out.println("Wrong pin. There are " + (count) + " attempt(s) left");
            }
        }
        return flag;
    }

}

