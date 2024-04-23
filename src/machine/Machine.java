package machine;

import static machine.Beverage.*;

public class Machine {
    private MachineState state;
    private int water;
    private int milk;
    private int coffee;
    private int cups;
    private int money;

    public Machine(int water, int milk, int coffee, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cups = cups;
        this.money = money;

        setMainState();
    }

    public boolean isWorking() {
        return state != MachineState.OFF;
    }

    public void execute(String input) {
        switch (state) {
            case MAIN:
                setState(input);
                break;
            case BUYING:
                handleBuying(input);
                setMainState();
                break;
            case FILLING_WATER:
                water += Integer.parseInt(input);
                System.out.print("Write how many ml of milk do you want to add:\n> ");
                state = MachineState.FILLING_MILK;
                break;
            case FILLING_MILK:
                milk += Integer.parseInt(input);
                System.out.print("Write how many grams of coffee beans do you want to add:\n> ");
                state = MachineState.FILLING_COFFEE;
                break;
            case FILLING_COFFEE:
                coffee += Integer.parseInt(input);
                System.out.print("Write how many disposable cups of coffee do you want to add:\n> ");
                state = MachineState.FILLING_CUPS;
                break;
            case FILLING_CUPS:
                cups += Integer.parseInt(input);
                setMainState();
                break;
            default:
                break;
        }
    }

    public void setState(String command) {
        switch (command) {
            case "remaining":
                printState();
                setMainState();
                break;
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:\n> ");
                state = MachineState.BUYING;
                break;
            case "fill":
                System.out.print("Write how many ml of water do you want to add:\n> ");
                state = MachineState.FILLING_WATER;
                break;
            case "take":
                giveMoney();
                setMainState();
                break;
            case "exit":
                state = MachineState.OFF;
                break;
            default:
                System.out.println("Unexpected action.");
                setMainState();
        }
    }

    private void printState() {
        System.out.printf("The coffee machine has:\n%d of water\n%d of milk\n", water, milk);
        System.out.printf("%d of coffee beans\n%d of disposable cups\n%d of money\n", coffee, cups, money);
    }

    private void setMainState() {
        state = MachineState.MAIN;
        System.out.print("\nWrite action (buy, fill, take, remaining, exit):\n> ");
    }

    private void handleBuying(String input) {
        Beverage recipe;

        switch (input) {
            case "back":
                state = MachineState.MAIN;
                return;
            case "1":
                recipe = ESPRESSO;
                break;
            case "2":
                recipe = LATTE;
                break;
            case "3":
                recipe = CAPPUCCINO;
                break;
            default:
                System.out.println("Unexpected option.");
                return;
        }

        makeCoffee(recipe);
        acceptPayment(recipe.getPrice());
    }

    private void makeCoffee(Beverage recipe) {
        if (water < recipe.needWater()) {
            System.out.println("Sorry, not enough water!");
            return;
        }

        if (milk < recipe.needMilk()) {
            System.out.println("Sorry, not enough milk!");
            return;
        }

        if (coffee < recipe.needCoffee()) {
            System.out.println("Sorry, not enough coffee bean!");
            return;
        }

        if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }

        water -= recipe.needWater();
        milk -= recipe.needMilk();
        coffee -= recipe.needCoffee();
        cups--;

        System.out.println("I have enough resources, making you a coffee!");
    }

    private void acceptPayment(int price) {
        money += price;
    }

    private void giveMoney() {
        System.out.printf("I gave you $%d\n", money);
        money = 0;
    }
}