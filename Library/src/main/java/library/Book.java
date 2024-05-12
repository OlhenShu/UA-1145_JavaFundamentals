package library;

public class Book {
    //  private final String bookId;
    private String name;
    private String author;
    private String publisher;
    private String status;        //Borrowing Status
    private Double price;
    private Integer quantity;

    public Book() {
    }

    public Book(String bookName, String writerName, String publisher, Double price, Integer quantity) {
        //  this.bookId = UUID.randomUUID().toString();
        this.name = bookName;
        this.author = writerName;
        this.publisher = publisher;

        this.price = price;
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return "Book name: " + name + "\n"+
                " author: " + author + "\n" +
                " publisher: " + publisher + "\n" +
                " price: " + price +"\n"+
                " quantity: " + quantity;
    }
    public String printInfo() {
        return name + "<N/>" + author + "<N/>" + publisher + "<N/>" + price + "<N/>" + quantity;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
