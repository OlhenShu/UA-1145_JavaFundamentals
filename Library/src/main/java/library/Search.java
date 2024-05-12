package library;

import java.util.Scanner;

public class Search implements Operation {
    private static final Scanner SCANNER = new Scanner(System.in);
    @Override
    public void operate(DataBase database, User user) {
        System.out.println("\nEnter book name");
        String name = SCANNER.next();
        int i = database.getBook(name.trim());
        if (i > -1) {
            System.out.println("\n" + database.returnBook(i).toString() + "\n");
        } else {
            System.out.println("Book doesn't exist!");
        }
        user.menu(database, user);
    }
}
