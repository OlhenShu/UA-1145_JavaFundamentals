package First;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of(2019, 2, 14), 2000));
        products.add(new Product("Mouse", LocalDate.of(2024, 4, 10), 1000));
        products.add(new Product("Phone", LocalDate.of(2017, 10, 15), 3500));
        products.add(new Product("Phone", LocalDate.of(2024, 1, 5), 4000));
        products.add(new Product("Monitor", LocalDate.of(2020, 2, 5), 5000));
        products.add(new Product("Tablet", LocalDate.of(2023, 12, 5), 2000));
        products.add(new Product("Phone", LocalDate.of(2021, 8, 22), 4499.99));
        products.add(new Product("TV", LocalDate.of(2022, 7, 18), 5000));
        products.add(new Product("Laptop", LocalDate.of(2023, 11, 30), 3500));
        products.add(new Product("Keyboard", LocalDate.of(2024, 3, 10), 2000));
        products.add(new Product("Chair", LocalDate.of(2023, 9, 8), 15000));
        products.add(new Product("Phone", LocalDate.of(2020, 4, 1), 6000));
        products.add(new Product("Smartwatch", LocalDate.of(2023, 12, 20), 4000));
        products.add(new Product("Phone", LocalDate.of(2022, 1, 12), 7000));
        products.add(new Product("Phone", LocalDate.of(2019, 10, 5), 6000));
        products.add(new Product("Printer", LocalDate.of(2023, 7, 18), 2500));
        products.add(new Product("Phone", LocalDate.of(2022, 2, 5), 10000));
        products.add(new Product("Scanner", LocalDate.of(2023, 11, 10), 200));
        products.add(new Product("Microphone", LocalDate.of(2022, 3, 20), 10000));
        products.add(new Product("Phone", LocalDate.of(2018, 1, 25), 6000));
        System.out.println(Product.sortedByPriceAndCategory(products));
    }
}
