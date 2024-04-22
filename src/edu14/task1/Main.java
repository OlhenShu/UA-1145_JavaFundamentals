package edu14.task1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        Stream<Employee> employees = Stream.of(
                new Employee("Vitalii"),
                new Employee("Vitalii"),
                new Employee("Vitalii"),
                new Employee("Mike"),
                new Employee("Jane"),
                new Employee("Jane")
        );

        Optional<String> mostPopularName = mostPopularName(employees);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Samsung", "Phone", LocalDate.now().minusYears(2), 4000));
        productList.add(new Product("Apple", "Phone", LocalDate.now().minusYears(1), 5000));
        productList.add(new Product("Huawei", "Phone", LocalDate.now().minusYears(2), 3500));
        productList.add(new Product("Xiaomi", "Phone", LocalDate.now().minusYears(1), 3200));
        productList.add(new Product("OnePlus", "Phone", LocalDate.now().minusYears(2), 3800));
        productList.add(new Product("Google", "Phone", LocalDate.now().minusYears(1), 4500));
        productList.add(new Product("Sony", "Phone", LocalDate.now().minusYears(2), 3700));
        productList.add(new Product("LG", "Phone", LocalDate.now().minusYears(1), 4800));
        productList.add(new Product("Nokia", "Phone", LocalDate.now().minusYears(2), 3300));
        productList.add(new Product("Motorola", "Phone", LocalDate.now().minusYears(1), 4200));
        productList.add(new Product("BlackBerry", "Phone", LocalDate.now().minusYears(2), 3900));
        productList.add(new Product("HTC", "Phone", LocalDate.now().minusYears(1), 4300));
        productList.add(new Product("Asus", "Phone", LocalDate.now().minusYears(2), 3600));
        productList.add(new Product("Lenovo", "Phone", LocalDate.now().minusYears(1), 4100));
        productList.add(new Product("OPPO", "Phone", LocalDate.now().minusYears(2), 3700));
        productList.add(new Product("Vivo", "Phone", LocalDate.now().minusYears(1), 4400));
        productList.add(new Product("Realme", "Phone", LocalDate.now().minusYears(2), 3800));
        productList.add(new Product("ZTE", "Phone", LocalDate.now().minusYears(1), 4600));
        productList.add(new Product("Meizu", "Phone", LocalDate.now().minusYears(2), 3500));
        productList.add(new Product("Honor", "Phone", LocalDate.now().minusYears(1), 4200));

        List<Product> sortedProducts = productList.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Sorted Products:");
        sortedProducts.forEach(System.out::println);

        System.out.println(mostPopularName.get());
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
