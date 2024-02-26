import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Where do you live, " + name + " ?");
        String address = scanner.next();
        int addressNumber = scanner.nextInt();
        System.out.println("So, your name is " + name + " and you live at " + address + " " + addressNumber);
        scanner.close();
    }
}