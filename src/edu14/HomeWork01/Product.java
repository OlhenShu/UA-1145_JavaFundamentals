package edu14.HomeWork01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Product> productList = new ArrayList<>();
        // Create list Product with 20 objects.
        // I've added 20 samples with random generated year and price.
        for (int i = 0; i < 20; i++) {
            productList.add(new Product("Phone", LocalDate.now().minusYears(random.nextInt(0, 6)), random.nextInt(2500, 21000)));
        }
        System.out.println("*=*".repeat(30) + "\nRAW list of products:\n" + "*=*".repeat(30));
        productList.forEach(System.out::println);

        // Obtain a sorted by the price list of products belong to category Phone with
        //price > 3000, and the date of manufacture was more then 1 year ago.
        List<Product> filteredProducts = filterAndSort(productList);
        System.out.println("*=*".repeat(30) + "\nFiltered and sorted products:\n" + "*=*".repeat(30));
        filteredProducts.forEach(System.out::println);
    }

    public static List<Product> filterAndSort(List<Product> products) {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        return products.stream()
                .filter(p -> p.getManufactureCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
