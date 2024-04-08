import java.util.InputMismatchException;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String addressStreet = scanner.nextLine();
        while (true) {
            try {
                System.out.println("Number of house, where do you live " + name + "?");
                String input = scanner.nextLine();
                if (input.matches("\\d+")) { // check if the user entered the integer value
                    int addressNumber = Integer.parseInt(input);
                    System.out.println("So, your name is " + name + " and you live at " + addressStreet + " " + addressNumber);
                } else {
                    throw new NumberFormatException("Entered value is non-integer");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}