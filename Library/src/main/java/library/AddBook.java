package library;

import java.util.Scanner;

public class AddBook implements Operation {
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void operate(DataBase database, User user) {
        System.out.println("Enter book name: ");
        String name = SCANNER.nextLine().trim();

        if (database.getBook(name) > -1) {
            System.out.println("Book with this name already exists.");
        } else {
            Book book = new Book();
            book.setName(name);

            System.out.println("Enter book author: ");
            book.setAuthor(SCANNER.nextLine().trim());
            System.out.println("Enter book Publisher: ");
            book.setPublisher(SCANNER.nextLine().trim());
            System.out.println("Enter book price: ");
            book.setPrice(Double.parseDouble(SCANNER.nextLine().trim()));
            System.out.println("Enter book quantity: ");
            book.setQuantity(Integer.parseInt(SCANNER.nextLine().trim()));
            database.saveBooks();
            database.AddBook(book);
            System.out.println("Book added successfully.");
        }
        user.menu(database, user);
    }
}