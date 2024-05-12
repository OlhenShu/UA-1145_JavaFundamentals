package library;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DataBase {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> userNames = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<String> bookNames = new ArrayList<>();

    private File fileUserDetails = new File("C:\\Users\\it05082022\\IdeaProjects\\Library\\Data\\userDetails");
    private File fileBookDetails = new File("C:\\Users\\it05082022\\IdeaProjects\\Library\\Data\\bookDetails");
    private File folder = new File("C:\\Users\\it05082022\\IdeaProjects\\Library\\Data");

    public DataBase() {
        if (!folder.exists()) {
            folder.mkdirs();
        }
        if (!fileUserDetails.exists()) {
            try {
                fileUserDetails.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (!fileBookDetails.exists()) {
            try {
                fileBookDetails.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        getUsers();
        getBooks();
    }

    public boolean userExists(String email) {
        return users.stream().anyMatch(u -> u.getEmail().equals(email));
    }

    public void AddUser(User s) {
        users.add(s);
        userNames.add(s.getName());
        saveUsers();
    }

    public int login(String phoneNumber, String email) {
        int n = -1;
        for (User u : users) {
            if (u.getPhoneNumber().equals(phoneNumber) && u.getEmail().equals(email)) {
                n = users.indexOf(u);
            }
        }
        return n;
    }

    public void getUsers() {
        users.clear();
        userNames.clear();

        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileUserDetails))) {
            String s;
            while ((s = reader.readLine()) != null) {
                fileContent.append(s);
            }
        } catch (FileNotFoundException e) {//
            e.printStackTrace();//
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        if (!fileContent.toString().isEmpty()) {
            String[] userDetailsArray = fileContent.toString().split("<NewUser/>");
            for (String s : userDetailsArray) {

                String[] userAttributes = s.split("<N/>");
                if (userAttributes.length >= 4) {
                    User user;
                    if ("Admin".equals(userAttributes[3].trim())) {
                        user = new Admin(userAttributes[0], userAttributes[1], userAttributes[2]);
                    } else {
                        user = new Student(userAttributes[0], userAttributes[1], userAttributes[2]);
                    }
                    users.add(user);
                    userNames.add(user.getName());
                }
            }
        }
    }
    private void saveUsers() {
        StringBuilder sb = new StringBuilder();

        for (User user : users) {
            sb.append(user.toString()).append("<NewUser/>\n");
        }
        try {
            PrintWriter printWriter = new PrintWriter(fileUserDetails);
            printWriter.print(sb);
            printWriter.close();
            System.out.println("user saved");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public User getUser(int n) {
        return users.get(n);
    }

    public void AddBook(Book book) {
        books.add(book);
        bookNames.add(book.getName());
        saveBooks();
    }

    public Book returnBook(int i) {
        return books.get(i);
    }

    public int getBook(String bookName) {
        for (int i = 0; i < books.size(); i++) {
            if (bookName.equalsIgnoreCase(books.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
    public void deleteBook(String bookName) {
        int index = getBook(bookName);
        if (index >= 0) {
            books.remove(index);
            bookNames.remove(index);
            saveBooks();
        }
    }
    public void saveBooks() {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.printInfo()).append("<NewBook/>\n");
        }
        try {
            FileWriter fileWriter = new FileWriter(fileBookDetails, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(sb);
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 public void getBooks() {
        books.clear();
        bookNames.clear();

        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileBookDetails))) {
            String s;
            while ((s = reader.readLine()) != null) {
                fileContent.append(s);
            }
        } catch ( IOException e) {
            e.printStackTrace();
        }

        if (!fileContent.toString().isBlank()) {
            String[] bookDetailsArray = fileContent.toString().split("<NewBook/>");
            for (String bookInfo : bookDetailsArray) {
                if (!bookInfo.isBlank()) {
                    Book book = parseBook(bookInfo);
                    if (book != null) {
                        books.add(book);
                        bookNames.add(book.getName());
                    }
                }
            }
        }
    }
    public Book parseBook(String bookInfo)  {
        String regex = "<N/>|,|\\|";
        String[] attributes = bookInfo.split(regex);
        if (attributes.length >= 5) {
try {
String name = attributes[0].trim();
                String author = attributes[1].trim();
                String publisher = attributes[2].trim();
                Double price = Double.parseDouble(attributes[3].trim());
                Integer quantity = Integer.parseInt(attributes[4].trim());
 //   bookInfo.readLine();

    return new Book(name, author, publisher, price, quantity);
} catch (NumberFormatException e) {
                System.out.println("Error with bookInfo: " + bookInfo);
                e.printStackTrace();
                return null;
            }
        } else {
            System.out.println("error with "+bookInfo);
            return null;
        }
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
}
