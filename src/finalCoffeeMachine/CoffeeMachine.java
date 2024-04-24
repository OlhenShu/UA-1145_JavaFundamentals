package finalCoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    // Initial amounts of resources
    private static int water = 500;
    private static int milk = 600;
    private static int coffeeBeans = 200;
    private static int disposableCups = 10;
    private static int money = 600;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Main loop to keep the machine running until the user exits
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    buyCoffee(scanner);
                    break;
                case "fill":
                    fillSupplies(scanner);
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    displayState();
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid action!");
            }
        }
    }

    //Displays the current state of the coffee machine.
    public static void displayState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void buyCoffee(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1": // espresso
                makeCoffee(250, 0, 16, 4);
                break;
            case "2": // latte
                makeCoffee(350, 75, 20, 7);
                break;
            case "3": // cappuccino
                makeCoffee(200, 100, 12, 6);
                break;
            case "back":
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    //     Makes a cup of coffee with specified resources.

    public static void makeCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int cost) {
        if (water < waterNeeded) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < milkNeeded) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeans < coffeeBeansNeeded) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (disposableCups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            disposableCups--;
            money += cost;
        }
    }

    public static void fillSupplies(Scanner scanner) {
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        disposableCups += scanner.nextInt();
        scanner.nextLine();
    }

    //Allows user to take money from the coffee machine.
    public static void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}

