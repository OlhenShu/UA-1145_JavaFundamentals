package edu04;

public class PracticalTask05 {
    public static void main(String[] args) {
        Product product1 = new Product("Lamp", 10, 1);
        Product product2 = new Product("Table", 100, 2);
        Product product3 = new Product("Chair", 500, 4);
        Product product4 = new Product("Cup", 5, 4);


        Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }
        System.out.println("The most expensive product is:\n"
                + " name = " + mostExpensive.getName() + "\n" +
                " quantity = " + mostExpensive.getQuantity());


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
        System.out.println("The products with maximum quantity of " + maxQuantity +
                "are the following: ");
        if (product1.getQuantity() == maxQuantity) {
            System.out.println(" " + product1.getName());
        }
        if (product2.getQuantity() == maxQuantity) {
            System.out.println(" " + product2.getName());
        }
        if (product3.getQuantity() == maxQuantity) {
            System.out.println(" " + product3.getName());
        }
        if (product4.getQuantity() == maxQuantity) {
            System.out.println(" " + product4.getName());
        }
    }

}
