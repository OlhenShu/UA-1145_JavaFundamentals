package homeWork4;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void printMostExpensiveProduct(Product[] products) {
        Product mostExpensive = null;
        for (Product product : products) {
            if (mostExpensive == null || product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }
        if (mostExpensive != null) {
            System.out.println("Most expensive item is ->> " + mostExpensive.getName() +
                    " it's quantity is ->>" + mostExpensive.getQuantity());
        }
    }

    public static void printProductWithBiggestQuantity(Product[] products) {
        Product biggestQuantity = null;
        for (Product product : products) {
            if (biggestQuantity == null || product.getQuantity() > biggestQuantity.getQuantity()) {
                biggestQuantity = product;
            }
        }
        if (biggestQuantity != null) {
            System.out.println("Product with biggest quantity is ->> " + biggestQuantity.getName());
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

class RunProduct {
    public static void main(String[] args) {
        Product pr1 = new Product("product1", 100, 5);
        Product pr2 = new Product("product2", 200, 6);
        Product pr3 = new Product("product3", 300, 7);
        Product pr4 = new Product("product4", 400, 4);

        Product[] products = {pr1, pr2, pr3, pr4};

        Product.printMostExpensiveProduct(products);
        Product.printProductWithBiggestQuantity(products);

    }
}