package library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin extends User {
    private static final Scanner SCANNER = new Scanner(System.in);
    public Admin( String name, String email, String phoneNumber) {
        super(Role.ADMIN, name, email, phoneNumber);
        this.operations=new Operation[]{
                new ViewBooks(),
                new AddBook(),
                new Search(),
                new DeleteBook(),
                new ViewOrders(),
                new Exit()
        };
    }
    @Override
    public void menu(DataBase dataBase, User user) {
        while (true) {
            try {
                System.out.println("1. View Books");
                System.out.println("2. Add Book");
                System.out.println("3. Search");
                System.out.println("4. Delete Book");
                System.out.println("5. View Orders");
                System.out.println("6. Exit");
                int choice = SCANNER.nextInt();
                if (choice >= 1 && choice <= operations.length) {
                    this.operations[choice-1].operate(dataBase, user);
                    break;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                SCANNER.next();
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                break;
            }
        }
    }
    @Override
    public String toString() {
        return name+"<N/>"+email+"<N/>"+phoneNumber+"<N/>"+getClass().getSimpleName();
    }
}
