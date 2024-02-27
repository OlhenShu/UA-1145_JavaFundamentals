import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, address;
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Where do you live?");
        address = scanner.nextLine();
        System.out.println("so you`r name is "+name+"\nAnd you`r address is "+address);
    }
}