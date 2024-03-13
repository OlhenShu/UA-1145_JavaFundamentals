package Practicals.Pr4.Ex4;

import java.util.ArrayList;

public class Product {
    String name;
    double price;
    int quantity;

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

    public static void main(String[] args) {
        Product product1 = new Product("Cola", 15, 3);
        Product product2 = new Product("Fanta", 20, 2);
        Product product3 = new Product("Milk", 10, 5);
        Product product4 = new Product("Water", 5, 10);

        ArrayList<Product> list = new ArrayList<>(); //Чи можна було це зробити без списку?
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);

        Product theMostExpensiveProduct = findTheMostExpensive(list);
        System.out.println("The title of the most expensive product is " + theMostExpensiveProduct.getName() + ". We have " + theMostExpensiveProduct.getQuantity() + " units.");

        Product theBiggestQuantityProduct = findTheBiggestQuantity(list);
        System.out.println("The title of the product, which has the biggest quantity is " + theBiggestQuantityProduct.getName() + ".");

    }

    public static Product findTheMostExpensive(ArrayList list) {
        Product theMostExpensiveProduct = (Product) list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Product temp = (Product) list.get(i);
            if (theMostExpensiveProduct.getPrice() < temp.getPrice()) {
                theMostExpensiveProduct = temp;
            }
        }
       return theMostExpensiveProduct;
    }

    public static Product findTheBiggestQuantity(ArrayList list) {
        Product theBiggestQuantityProduct = (Product) list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Product temp = (Product) list.get(i);
            if (theBiggestQuantityProduct.getQuantity() < temp.getQuantity()) {
                theBiggestQuantityProduct = temp;
            }
        }
        return theBiggestQuantityProduct;
    }
}
