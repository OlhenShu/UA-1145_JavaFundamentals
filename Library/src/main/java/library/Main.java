package library;

import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static DataBase dataBase;
    public static void main(String[] args) {
        dataBase = new DataBase();
        dataBase.getUsers();
        dataBase.getBooks();

        System.out.println("Welcome to Library Management System!\n");
        int choice;
        while (true) {

            System.out.println("0. Exit\n1. Login\n2. New User");
            if (SCANNER.hasNextInt()) {

                choice = SCANNER.nextInt();

                switch (choice) {

                    case 0:
                        System.out.println("Exiting the library system.");
                        return;
                    case 1:
                        login();
                        break;
                    case 2:
                        newUser();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                SCANNER.next();
            }
        }
    }

    private static void newUser() {
        System.out.println("Enter name:");
        String name = SCANNER.next();
        if (!(name.length() >= 2)) {
            System.out.println("Name too short, please input real name");
            return;
        }
        System.out.println("Enter phone number:");
        String phoneNumber = SCANNER.next();
        if (!phoneNumber.matches("^\\+?\\d{1,3}?[- .]?\\(?(\\d{3})\\)?[- .]?(\\d{3})[- .]?(\\d{4})$")) {
            System.out.println("Invalid phone number format. be sure to input it like this \"+380123456789\" ");
            return;
        }
        System.out.println("Enter email:");
        String email = SCANNER.next();
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            System.out.println("Invalid email format.");
            return;
        }
        if (dataBase.userExists(email)) {
            System.out.println("A user with this email or phone number already exists.");
            return;
        }
//ось тут є сумніви, чи є сенс давати цю опцію взагалі
        System.out.println("1. Admin");
        System.out.println("2. Student");
        int n = SCANNER.nextInt();
        User user;
        if (n == 1) {
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new Student(name, email, phoneNumber);
        }
        dataBase.AddUser(user);
        user.menu(dataBase, user);
    }

    private static void login() {
        System.out.println("Enter phone number:");
        String phoneNumber = SCANNER.next().trim();
        //думаю тут провірку не робити, щоб тестити
        System.out.println("Enter email:");
        String email = SCANNER.next().trim();
        int n = dataBase.login(phoneNumber, email);
        if (n != -1) {
            User user = dataBase.getUser(n);
            user.menu(dataBase, user);

        } else {
            System.out.println("User doesn't exist");
        }
    }
}
