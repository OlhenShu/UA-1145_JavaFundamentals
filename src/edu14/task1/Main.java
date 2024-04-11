package edu14.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
    private String manufacturer;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacturer, String category, LocalDate dateOfManufacture, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Category: " + category + ", Date of Manufacture: " + dateOfManufacture + ", Price: " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        // Populating the list with 20 objects (for demonstration purposes)
        for (int i = 0; i < 20; i++) {
            productList.add(new Product("Manufacturer " + i, "Phone", LocalDate.now().minusYears(2).plusMonths(i), 3000 + i * 100));
        }

        // Obtaining sorted list of products based on filter criteria
        List<Product> filteredProducts = getProductsWithCriteria(productList);
        filteredProducts.forEach(System.out::println);
    }

    public static List<Product> getProductsWithCriteria(List<Product> products) {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        return products.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
    }
}
