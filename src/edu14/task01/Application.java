package edu14.task01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Car", LocalDate.of(1992, 7, 25), 12_000));
        products.add(new Product("Computer", LocalDate.of(2000, 1, 1), 2999));
        products.add(new Product("Appliance", LocalDate.of(2002, 11, 1), 999));
        products.add(new Product("Phone", LocalDate.of(2005, 2, 4), 2420));
        products.add(new Product("Appliance", LocalDate.of(2008, 12, 1), 2999));
        products.add(new Product("Car", LocalDate.of(2009, 3, 20), 10_000));
        products.add(new Product("Car", LocalDate.of(2010, 4, 12), 30_000));
        products.add(new Product("Phone", LocalDate.of(2011, 2, 14), 499));
        products.add(new Product("Phone", LocalDate.of(2012, 3, 4), 1499));
        products.add(new Product("Appliance", LocalDate.of(2012, 10, 1), 4999));
        products.add(new Product("Appliance", LocalDate.of(2013, 8, 1), 5000));
        products.add(new Product("Appliance", LocalDate.of(2015, 2, 4), 11_299));
        products.add(new Product("Phone", LocalDate.of(2016, 8, 29), 3499));
        products.add(new Product("Car", LocalDate.of(2018, 1, 12), 40_000));
        products.add(new Product("Appliance", LocalDate.of(2020, 2, 4), 12_822));
        products.add(new Product("Car", LocalDate.of(2020, 3, 12), 40_000));
        products.add(new Product("Phone", LocalDate.of(2022, 5, 4), 5499));
        products.add(new Product("Computer", LocalDate.of(2023, 1, 1), 20_999));
        products.add(new Product("Phone", LocalDate.of(2024, 1, 12), 6000));
        products.add(new Product("Computer", LocalDate.of(2024, 1, 1), 23_999));

        List<Product> sortedPhones = products.stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .toList();

        System.out.println(sortedPhones);
    }

}
