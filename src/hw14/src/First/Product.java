package First;

import java.time.LocalDate;
import java.util.List;

public class Product {
    private final String manufactureCategory;
    LocalDate dateOfManufacture;
    double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nInformation about object: " +
                "\nManufacture category of object: " + manufactureCategory +
                "\nDate of manufacture: " + dateOfManufacture +
                "\nPrice of object: " + price
                + "\n";
    }

    public static List<Product> sortedByPriceAndCategory(List<Product> list) {
        return list.stream().
                filter(product -> product.getManufactureCategory().equals("Phone") && product.getPrice() > 3000)
                .toList();
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }


    public double getPrice() {
        return price;
    }
}
