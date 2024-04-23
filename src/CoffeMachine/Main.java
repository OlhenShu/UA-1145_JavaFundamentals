package CoffeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            if (action.equals("exit")) {
                break;
            }

            coffeeMachine.processInput(action);
        }

        scanner.close();
    }
}
