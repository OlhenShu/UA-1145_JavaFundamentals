package homeWork14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private final String manufacturerCategory;
    private final LocalDate manufactureDate;
    private final double price;

    public Product( String manufacturerCategory, LocalDate manufactureDate, double price) {
        this.manufacturerCategory = manufacturerCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufacturerCategory() {
        return manufacturerCategory;
    }


    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturerCategory='" + manufacturerCategory + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product( "Phone"
                , LocalDate.of(2020, 3, 15), 2000));
        products.add(new Product( "Phone"
                , LocalDate.of(2019, 5, 10), 3500));
        products.add(new Product( "Laptop"
                , LocalDate.of(2015, 8, 20), 5000));

        List<Product> filteredProducts = products.stream()
                .filter(item -> item.getManufacturerCategory().equalsIgnoreCase("Phone"))
                .filter(item -> item.getPrice() > 3000)
                .filter(item -> item.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        filteredProducts.forEach(System.out::println);
    }
}
