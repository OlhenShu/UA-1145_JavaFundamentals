package library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student extends User {
    private static final Scanner SCANNER = new Scanner(System.in);

    public Student(String name, String email, String phoneNumber) {
        super(Role.STUDENT, name, email, phoneNumber);
        this.operations = new Operation[]{
                new ViewBooks(),
                new Search(),
                new BorrowBook(),
                new ReturnBook(),
                new Exit(),
        };
    }
    @Override
    public void menu(DataBase dataBase, User user) {
        while (true) {
            try {
                System.out.println("1. View Books");
                System.out.println("2. Search");
                System.out.println("3. Borrow Book");
                System.out.println("4. Return book");
                System.out.println("5. Exit");

                int choice = SCANNER.nextInt();
                if (choice >= 1 && choice <= operations.length) {
                    this.operations[choice - 1].operate(dataBase, user);
                    break;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                SCANNER.next();
            }
        }
    }

    @Override
    public String toString() {
        return name + "<N/>" + email + "<N/>" + phoneNumber + "<N/>" + getClass().getSimpleName();
    }
}
