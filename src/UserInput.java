import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live?");
        String address = scanner.nextLine();
        System.out.println("Your name is: " + name + ". Your address is: " + address);
    }
}
