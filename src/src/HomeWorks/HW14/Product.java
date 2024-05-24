package HomeWorks.HW14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Product {
    private String manufactureCategory;
    private LocalDate dateManufacture;
    private int price;

    private Product() {
    }

    public static ArrayList<Product> productsList = new ArrayList<>();

    public static void addProduct(String manufactureCategory, String dateManufacture, int price) {
        Product product = new Product();
        product.manufactureCategory = manufactureCategory;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        try {
            product.dateManufacture = LocalDate.parse(dateManufacture, formatter);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        product.price = price;
        productsList.add(product);
    }

    public static Optional<String> findMostPopularCategory() {
        Set<String> setOfCategories = productsList.stream()
                .map(Product::getManufactureCategory)
                .collect(Collectors.toSet());

        int maxCount = 0;
        int maxDoubleCount = 0;
        String maxCategory = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : setOfCategories) {
            int count = 0;
            for (Product p : productsList) {
                if (p.getManufactureCategory().equals(s)) {
                    count++;
                }
            }
            map.put(s, count);
            if (count > maxCount) {
                maxCount = count;
                maxDoubleCount = 0;
                maxCategory = s;
            } else if (count == maxCount) {
                maxDoubleCount++;
            }
        }

        if (maxDoubleCount > 0) {
            return Optional.of(maxCategory);
        } else {
            return Optional.of(maxCategory);
        }


    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public LocalDate getDateManufacture() {
        return dateManufacture;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateManufacture=" + dateManufacture +
                ", price=" + price +
                '}';
    }
}
