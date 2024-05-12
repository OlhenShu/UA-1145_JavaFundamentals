package library;

import java.util.Scanner;

public class DeleteBook implements Operation {
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void operate(DataBase database, User user) {
        System.out.println("Enter book name: ");
        String bookName = SCANNER.nextLine().trim();

        int i = database.getBook(bookName);
        if (i > -1) {
            database.deleteBook(bookName);
            System.out.println("book deleted");
        } else {
            System.out.println("book doesn't exist");

        }
        user.menu(database, user);
    }

}
