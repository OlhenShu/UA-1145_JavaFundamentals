package HomeWork04.PracticalTask04;

public class Product {

    public static void main(String[] args) {
        Product product1 = new Product("bed", 150, 2);
        Product product2 = new Product("chair",  50, 4);
        Product product3 = new Product("door", 70, 3);
        Product product4 = new Product("TV", 170, 1);

        Product mostExpensive = product1;

        if (product2.getPrice() > mostExpensive.getPrice()){
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()){
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice()){
            mostExpensive = product4;
        }
        System.out.println("The most expensive product is: \n " + "Name of product: "
                + mostExpensive.getName() + "\n" + "Quantity of product: " + mostExpensive.getQuantity());

        int maxQuantity = product1.getQuantity();
        if (product2.getQuantity() > maxQuantity){
            maxQuantity = product2.getQuantity();
        }
        if (product3.getQuantity() > maxQuantity){
            maxQuantity = product3.getQuantity();
        }
        if (product4.getQuantity() > maxQuantity){
            maxQuantity = product4.getQuantity();
        }
        System.out.println("Product with max quantity: " + maxQuantity);

        if (product1.getQuantity() == maxQuantity){
            System.out.println(" " + product1.getName());
        }
        if (product2.getQuantity() == maxQuantity){
            System.out.println(" " + product1.getName());
        }
        if (product3.getQuantity() == maxQuantity){
            System.out.println(" " + product1.getName());
        }
        if (product4.getQuantity() == maxQuantity){
            System.out.println(" " + product1.getName());
        }
    }
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}
