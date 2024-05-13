package library;

import java.util.ArrayList;

public class ViewBooks implements Operation {

     ArrayList<Book> books = database.getAllBooks();
        System.out.printf("%-30s %-30s %-30s %-10s %-10s%n", "Book Name", "AuthorOfBook", "Publisher", "Price", "Quantity");
        for (Book b : books) {
            System.out.printf("%-30s %-30s %-30s %-10.2f %-10d%n", b.getName(), b.getAuthor(), b.getPublisher(), b.getPrice(), b.getQuantity());
        }
        System.out.println();
        user.menu(database, user);
    }
}
