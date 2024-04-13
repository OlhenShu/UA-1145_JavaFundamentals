package homeworks.homework_edu14.Homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1_2 {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.now(), 2000));
        products.add(new Product("Phone", LocalDate.of(2023, 2, 14), 2100));
        products.add(new Product("Phone", LocalDate.of(2023, 1, 30), 6000));
        products.add(new Product("Phone", LocalDate.of(2022, 2, 10), 2110));
        products.add(new Product("Laptop", LocalDate.of(2023, 2, 14), 2000));
        products.add(new Product("Phone", LocalDate.of(2023, 2, 1), 8110));
        products.add(new Product("Phone", LocalDate.of(2023, 8, 14), 2050));
        products.add(new Product("Tablet", LocalDate.of(2022, 2, 24), 2200));
        products.add(new Product("Phone", LocalDate.of(2023, 8, 15), 8000));
        products.add(new Product("Phone", LocalDate.of(2023, 6, 18), 2520));
        products.add(new Product("Phone", LocalDate.of(2023, 2, 16), 500));
        products.add(new Product("Phone", LocalDate.of(2023, 4, 11), 4000));
        products.add(new Product("Laptop", LocalDate.of(2021, 2, 12), 5900));
        products.add(new Product("Phone", LocalDate.of(2023, 8, 29), 2000));
        products.add(new Product("Phone", LocalDate.of(2023, 2, 14), 2000));
        products.add(new Product("Phone", LocalDate.of(2023, 10, 28), 2250));
        products.add(new Product("Phone", LocalDate.of(2021, 2, 14), 2054));
        products.add(new Product("Tablet", LocalDate.of(2023, 10, 15), 20000));
        products.add(new Product("Phone", LocalDate.of(2023, 2, 22), 2999));
        products.add(new Product("Laptop", LocalDate.of(2023, 12, 14), 4010));
        products.add(new Product("Phone", LocalDate.of(2023, 2, 21), 2584));


        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone") && product.getPrise() > 3000.0)
                .toList();


        System.out.println("Phones with price more than 3000: " + filteredProducts);


        Stream<Employee> employeeStream = Stream.of(
                new Employee("Anna"),
                new Employee("Jane"),
                new Employee("Anna"),
                new Employee("Janifer"),
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("John"),
                new Employee("Janifer"),
                new Employee("Dan"),
                new Employee("John"),
                new Employee("Alice"),
                new Employee("Janifer"));


        Optional<String> mostCommonName = mostPopularName(employeeStream);
        System.out.println("Most common employee name: " + mostCommonName.orElse("No employees"));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));


        return nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}


class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double prise;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double prise) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.prise = prise;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", prise=" + prise +
                '}';
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
