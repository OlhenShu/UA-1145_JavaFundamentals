import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {

    private int[] coffeeAttributes;
    private MachineState state;
    private final String fileName = "coffee_machine_resources.txt";

    public CoffeeMachine() {
        this.coffeeAttributes = readFromFile(fileName);
        this.state = MachineState.CHOOSING_ACTION;
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (coffeeMachine.state == MachineState.CHOOSING_ACTION) {
                System.out.println("Enter your desired action (buy - 1, fill - 2, take - 3, remaining - 4, exit - 0):");
            }
            String input = scanner.nextLine();
            coffeeMachine.processInput(input);
        }
    }

    public void processInput(String input) {
        switch (state) {
            case CHOOSING_ACTION:
                handleAction(input);
                break;

            case FILLING_WATER:
                coffeeAttributes[0] += Integer.parseInt(input);
                state = MachineState.FILLING_MILK;
                System.out.println("Write how many ml of milk you want to add:");
                writeToFile(coffeeAttributes, fileName);
                break;
            case FILLING_MILK:
                coffeeAttributes[1] += Integer.parseInt(input);
                state = MachineState.FILLING_COFFEE_BEANS;
                System.out.println("Write how many grams of coffee beans you want to add:");
                writeToFile(coffeeAttributes, fileName);
                break;
            case FILLING_COFFEE_BEANS:
                coffeeAttributes[2] += Integer.parseInt(input);
                state = MachineState.FILLING_CUPS;
                System.out.println("Write how many disposable cups you want to add:");
                writeToFile(coffeeAttributes, fileName);
                break;
            case FILLING_CUPS:
                coffeeAttributes[3] += Integer.parseInt(input);
                state = MachineState.CHOOSING_ACTION;
                System.out.println("Machine refilled.");
                writeToFile(coffeeAttributes, fileName);
                break;
        }
    }

    private void handleAction(String action) {
        switch (action) {
            case "1":
                state = MachineState.CHOOSING_COFFEE;
                processOrder();
                state = MachineState.CHOOSING_ACTION;
                break;
            case "2":
                state = MachineState.FILLING_WATER;
                System.out.println("Write how many ml of water you want to add:");
                break;
            case "3":
                System.out.println("I gave you $" + coffeeAttributes[4]);
                coffeeAttributes[4] = 0;
                writeToFile(coffeeAttributes, fileName);
                break;
            case "4":
                display();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("No such action, sorry.");
                break;
        }
    }

    private void processOrder() {
        Scanner scanner = new Scanner(System.in);
        List<String> orders = new ArrayList<>();
        while (true) {
            System.out.println("Enter the coffee you want (1 - espresso, 2 - latte, 3 - cappuccino, finish order - 0):");
            String coffeeChoice = scanner.nextLine();
            if (coffeeChoice.equals("0")) {
                break;
            }
            orders.add(coffeeChoice);
        }

        if (canFulfillOrder(orders)) {
            for (String coffeeChoice : orders) {
                coffeeMaker(coffeeChoice);
            }
            System.out.println("All coffees have been made!");
            writeToFile(coffeeAttributes, fileName);
        } else {
            System.out.println("Sorry, not enough ingredients to fulfill the order.");
        }
    }

    private boolean canFulfillOrder(List<String> orders) {
        int totalWater = 0, totalMilk = 0, totalCoffee = 0, totalCups = 0;

        for (String coffeeChoice : orders) {
            switch (coffeeChoice) {
                case "1":
                    totalWater += 250;
                    totalCoffee += 16;
                    totalCups += 1;
                    break;
                case "2":
                    totalWater += 350;
                    totalMilk += 75;
                    totalCoffee += 20;
                    totalCups += 1;
                    break;
                case "3":
                    totalWater += 200;
                    totalMilk += 100;
                    totalCoffee += 12;
                    totalCups += 1;
                    break;
                default:
                    System.out.println("Invalid coffee choice: " + coffeeChoice);
                    return false;
            }
        }

        return coffeeAttributes[0] >= totalWater && coffeeAttributes[1] >= totalMilk &&
                coffeeAttributes[2] >= totalCoffee && coffeeAttributes[3] >= totalCups;
    }

    private void coffeeMaker(String coffeeChoice) {
        switch (coffeeChoice) {
            case "1":
                coffeeAttributes[0] -= 250;
                coffeeAttributes[2] -= 16;
                coffeeAttributes[3] -= 1;
                coffeeAttributes[4] += 4;
                break;
            case "2":
                coffeeAttributes[0] -= 350;
                coffeeAttributes[1] -= 75;
                coffeeAttributes[2] -= 20;
                coffeeAttributes[3] -= 1;
                coffeeAttributes[4] += 7;
                break;
            case "3":
                coffeeAttributes[0] -= 200;
                coffeeAttributes[1] -= 100;
                coffeeAttributes[2] -= 12;
                coffeeAttributes[3] -= 1;
                coffeeAttributes[4] += 6;
                break;
        }
    }

    private void display() {
        System.out.println("The coffee machine has:");
        System.out.println(coffeeAttributes[0] + " ml of water");
        System.out.println(coffeeAttributes[1] + " ml of milk");
        System.out.println(coffeeAttributes[2] + " g of coffee beans");
        System.out.println(coffeeAttributes[3] + " disposable cups");
        System.out.println("$" + coffeeAttributes[4] + " of money");
    }



    public static int[] readFromFile(String fileName) {
        int[] coffeeAttributes = new int[5];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File not found. Creating a new file with default values.");
            coffeeAttributes = new int[]{400, 540, 120, 9, 550}; // Default values
            writeToFile(coffeeAttributes, fileName); // Create the file with default values
            return coffeeAttributes;
        }

        try {
            Scanner scanner = new Scanner(file);
            for (int i = 0; i < coffeeAttributes.length; i++) {
                if (scanner.hasNextInt()) {
                    coffeeAttributes[i] = scanner.nextInt();
                } else {
                    throw new IllegalArgumentException("File does not contain enough data");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Using default values.");
            coffeeAttributes = new int[]{400, 540, 120, 9, 550}; // Default values
        }

        return coffeeAttributes;
    }

    public static void writeToFile(int[] coffeeAttributes, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int attribute : coffeeAttributes) {
                writer.write(attribute + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
