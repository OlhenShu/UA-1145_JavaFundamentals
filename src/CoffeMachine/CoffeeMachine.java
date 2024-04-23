package CoffeMachine;

public class CoffeeMachine {
    private int money;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private State currentState;

    public CoffeeMachine() {
        this.money = 550;
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.disposableCups = 9;
        this.currentState = State.MAIN_MENU;
    }

    public void processInput(String input) {
        switch (currentState) {
            case MAIN_MENU:
                processMainMenu(input);
                break;
            case BUY_CHOICE:
                buyCoffee(input);
                break;
            case FILL_WATER:
                fillWater(input);
                break;
            case FILL_MILK:
                fillMilk(input);
                break;
            case FILL_COFFEE_BEANS:
                fillCoffeeBeans(input);
                break;
            case FILL_CUPS:
                fillCups(input);
                break;
            default:
                System.out.println("Invalid state.");
        }
    }

    private void processMainMenu(String action) {
        switch (action) {
            case "buy":
                currentState = State.BUY_CHOICE;
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                break;
            case "fill":
                currentState = State.FILL_WATER;
                System.out.println("Write how many ml of water you want to add:");
                break;
            case "take":
                takeMoney();
                break;
            case "remaining":
                printState();
                break;
            default:
                System.out.println("Invalid action. Please try again.");
                break;
        }
    }

    private void buyCoffee(String choice) {

        switch (choice) {
            case "1":
                makeCoffee(250, 0, 16, 4);
                break;
            case "2":
                makeCoffee(350, 75, 20, 7);
                break;
            case "3":
                makeCoffee(200, 100, 12, 6);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        if (choice.equals("back")) {
            currentState = State.MAIN_MENU;
        }
    }

    private void makeCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int cost) {
        if (water < waterNeeded) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < milkNeeded) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeans < coffeeBeansNeeded) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (disposableCups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            disposableCups--;
            money += cost;
        }
        currentState = State.MAIN_MENU;
    }

    private void fillWater(String amount) {
        water += Integer.parseInt(amount);
        currentState = State.FILL_MILK;
        System.out.println("Write how many ml of milk you want to add:");
    }

    private void fillMilk(String amount) {
        milk += Integer.parseInt(amount);
        currentState = State.FILL_COFFEE_BEANS;
        System.out.println("Write how many grams of coffee beans you want to add:");
    }

    private void fillCoffeeBeans(String amount) {
        coffeeBeans += Integer.parseInt(amount);
        currentState = State.FILL_CUPS;
        System.out.println("Write how many disposable cups you want to add:");
    }

    private void fillCups(String amount) {
        disposableCups += Integer.parseInt(amount);
        currentState = State.MAIN_MENU;
    }

    private void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private void printState() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money\n");
    }
}
