package homework_edu04.Practical04;

public class PrTask4 {
    public static void main(String[] args) {
        Product product1 = new Product("Table", 200, 2);
        Product product2 = new Product("Chair", 100, 1);
        Product product3 = new Product("Laptop", 250, 4);
        Product product4 = new Product("Bed", 150, 3);

        Product mostExpensive = product1;
        if (product2.getPrise() > mostExpensive.getPrise()) {
            mostExpensive = product2;
        }
        if (product3.getPrise() > mostExpensive.getPrise()) {
            mostExpensive = product3;
        }
        if (product4.getPrise() > mostExpensive.getPrise()) {
            mostExpensive = product4;
        }
        System.out.println("The most expensive product is: " + mostExpensive);

        int maxQuantity = product1.getQuantity();
        if (product2.getQuantity() > maxQuantity) {
            maxQuantity = product2.getQuantity();
        }
        if (product3.getQuantity() > maxQuantity) {
            maxQuantity = product3.getQuantity();
        }
        if (product4.getQuantity() > maxQuantity) {
            maxQuantity = product4.getQuantity();
        }
        System.out.println("The product with maximum quantity of " + maxQuantity + " are the following: ");

        if (product1.getQuantity() == maxQuantity) {
            System.out.println("  " + product1.getName());
        }
        if (product2.getQuantity() == maxQuantity) {
            System.out.println("  " + product2.getName());
        }
        if (product3.getQuantity() == maxQuantity) {
            System.out.println("  " + product3.getName());
        }
        if (product4.getQuantity() == maxQuantity) {
            System.out.println("  " + product4.getName());
        }


    }
}

class Product {
    private String name;
    private double prise;
    private int quantity;

    public Product(String name, double prise, int quantity) {
        this.name = name;
        this.prise = prise;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrise() {
        return prise;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", quantity=" + quantity +
                '}';
    }
}
