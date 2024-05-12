package library;

import java.util.ArrayList;

public class ViewBooks implements Operation {

    @Override
    public void operate(DataBase database, User user) {
        ArrayList<Book> books = database.getAllBooks();
        System.out.println("Book Name\t\t\t AuthorOfBook\t\t\t Publisher \t\tPrice \t\tQuantity");
        for (Book b : books) {
            System.out.println(b.getName() + "\t\t" + b.getAuthor() +
                    "\t\t\t\t" + b.getPublisher() + "\t\t\t" + b.getPrice() + "\t\t\t" + b.getQuantity());
        }
        System.out.println();
        user.menu(database, user);

    }
}
