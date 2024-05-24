package HomeWorks.HW14;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ProductRunner {

    // Create class Product with fields manufacture category, date of manufacture and price. Add all needed methods
    // Create list Product with 20 objects
    // Obtain a sorted by the price list of products belong to category Phone with price > 3000, and the date of manufacture was more then 1 year ago.

    public static void main(String[] args) {

        Product.addProduct("Laptop", "2020.01.01", 1000);
        Product.addProduct("Phone", "2008.03.14", 500);
        Product.addProduct("Phone", "2017.03.14", 5000);
        Product.addProduct("Phone", "2019.08.29", 3000);
        Product.addProduct("Phone", "2024.03.14", 5000);
        Product.addProduct("Phone", "2007.03.14", 100);
        Product.addProduct("Phone", "2022.08.29", 4000);
        Product.addProduct("Phone", "2013.03.14", 5000);
        Product.addProduct("Phone", "2023.12.29", 4000);
        Product.addProduct("Mouse", "2019.08.29", 50);
        Product.addProduct("Keyboard", "2012.02.20", 100);
        Product.addProduct("Monitor", "2019.05.29", 400);
        Product.addProduct("Monitor", "2023.08.31", 1000);

        List<Product> filteredList = Product.productsList.stream()
                .filter(p -> p.getPrice() >= 3000)
                .filter(p -> p.getDateManufacture().isBefore(LocalDate.now().minusYears(1)))
                .filter(p -> p.getManufactureCategory().equals("Phone"))
                .sorted(Comparator.comparingInt(Product::getPrice))
                .toList();

        filteredList.forEach(System.out::println);
        Optional<String> mostPopularCategory = Product.findMostPopularCategory();
        System.out.println("The most popular category is: " + mostPopularCategory.get()); // а как обрабатывать когда пустой контейнер?

    }
}
