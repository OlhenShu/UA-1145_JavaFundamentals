package practical_tasks.pt4.product_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Soap", 5.2, 154);
        Product p2 = new Product("Shampoo", 3.2, 343);
        Product p3 = new Product("Deodorant", 10.1, 45);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        getTheMostExpensiveItem(productList);
        getItemWhichHaveTheBiggestQuantity(productList);
    }

    public static void getTheMostExpensiveItem(List<Product> productList) {
        Product mostExpensive = productList.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);

        System.out.println("Name of product: " + mostExpensive.getName() + "\n" +
                "Quantity of product: " + mostExpensive.getQuantity());
    }

    public static void getItemWhichHaveTheBiggestQuantity(List<Product> productList) {
        Product biggestQuantity = productList.stream()
                .max(Comparator.comparingInt(Product::getQuantity))
                .orElse(null);

        System.out.println("Name of product with the biggest quantity: " + biggestQuantity.getName());
    }
}
