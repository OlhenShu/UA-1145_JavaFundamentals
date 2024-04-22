import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        // Create list of Product with 20 objects
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Manufacturer1", "Phone", LocalDate.of(2020,7,28), 3500));
        productList.add(new Product("Manufacturer2", "Phone", LocalDate.of(2024,1,12), 2500));
        productList.add(new Product("Manufacturer3", "Phone", LocalDate.of(2023,3,16), 4500));
        productList.add(new Product("Manufacturer4", "Phone", LocalDate.of(2022,3,13), 3500));
        productList.add(new Product("Manufacturer5", "Phone", LocalDate.of(2021,9,5), 5000));
        productList.add(new Product("Manufacturer6", "Phone", LocalDate.of(2019,10,3), 2800));
        productList.add(new Product("Manufacturer7", "Phone", LocalDate.of(2018,5,22), 3600));
        productList.add(new Product("Manufacturer8", "Phone", LocalDate.of(2005,11,20), 4500));
        productList.add(new Product("Manufacturer9", "Phone", LocalDate.of(2021,9,9), 2500));
        productList.add(new Product("Manufacturer10", "Phone", LocalDate.of(2022,5,27), 9500));
        productList.add(new Product("Manufacturer11", "Phone", LocalDate.of(2017,9,18), 8500));
        productList.add(new Product("Manufacturer12", "Phone", LocalDate.of(2010,11,23), 3900));
        productList.add(new Product("Manufacturer13", "Phone", LocalDate.of(2008,1,17), 2800));
        productList.add(new Product("Manufacturer14", "Phone", LocalDate.of(2009,6,15), 4000));
        productList.add(new Product("Manufacturer15", "Phone", LocalDate.of(2020,3,1), 2500));
        productList.add(new Product("Manufacturer16", "Phone", LocalDate.of(2008,11,14), 6100));
        productList.add(new Product("Manufacturer17", "Phone", LocalDate.of(2002,12,22), 3100));
        productList.add(new Product("Manufacturer18", "Phone", LocalDate.of(2021,6,1), 7400));
        productList.add(new Product("Manufacturer19", "Phone", LocalDate.of(2024,4,10), 2800));
        productList.add(new Product("Manufacturer20", "Phone", LocalDate.of(2020,1,26), 3000));

        // Obtain a sorted list of products belonging to category Phone with price > 3000
        // and date of manufacture more than 1 year ago
        LocalDate today = LocalDate.now();

        // Calculate the date one year ago from today's date
        LocalDate oneYearAgo = today.minusYears(1);

        // Obtain a sorted list of products belonging to category Phone with price > 3000
        // and date of manufacture more than 1 year before the specified date
        List<Product> filteredProducts = productList.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        // Print the filtered products
        System.out.println("Filtered products:");
        filteredProducts.forEach(System.out::println);


        List<Employee> employees = Arrays.asList(
                new Employee("Viktoria"),
                new Employee("Bogdan"),
                new Employee("Viktoria"),
                new Employee("Vitaliy"),
                new Employee("Viktoria"),
                new Employee("Bogdan"),
                new Employee("Viktoria"),
                new Employee("Ivan"),
                new Employee("Viktoria")
        );

        if(employees.isEmpty()) {
            Optional<String> emptyResult = mostPopularName(Stream.empty());
            System.out.println(emptyResult.orElse("\nNo employees in list"));

        }
        else {
            Optional<String> mostPopular = mostPopularName(employees.stream());
            System.out.println("\nMost popular name from the list is:");
            mostPopular.ifPresent(System.out::println);
        }
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}