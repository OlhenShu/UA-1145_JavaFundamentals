package denys.serdiuk.homework13StreamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
	
	public static List<Product> generateListOfProducts(int numProducts){
			List<Product> products = new ArrayList<>();
        
        for (int i = 1; i <= numProducts; i++) {
            String manufacturer = "Manufacturer " + i;
            String category = (i % 2 == 0) ? "phone" : "laptop";
            LocalDate manufactureDate = LocalDate.now().minusYears(i); 
            double price = 3000 + i * 100; 

            Product product = new Product(manufacturer, category, manufactureDate, price);
            products.add(product);
        }
        return products;
	}
	
	public static Optional<String> mostPopularName(Stream<Employee> employees) {
        // Group employees by name and count occurrences
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        // Find the name with the maximum count
        if (!nameCounts.isEmpty()) {
            String mostPopularName = Collections.max(nameCounts.entrySet(),
                    Map.Entry.comparingByValue()).getKey();
            return Optional.of(mostPopularName);
        } else {
            return Optional.empty(); // Stream is empty
        }
	}

	public static void main(String[] args) {
        
        List<Product>products = new ArrayList<>(generateListOfProducts(20));
        
        List<Product> filteredProducts = new ArrayList<>();
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase("phone")
                    && product.getPrice() > 3000
                    && product.getManufactureDate().isBefore(oneYearAgo)) {
                filteredProducts.add(product);
            }
        }

        filteredProducts.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        System.out.println("Sorted Products (Category: phone, Price > 3000, Manufactured > 1 year ago):");
        for (Product product : filteredProducts) {
            System.out.println("Manufacturer: " + product.getManufacturer()
                    + ", Category: " + product.getCategory()
                    + ", Manufacture Date: " + product.getManufactureDate()
                    + ", Price: " + product.getPrice());
        }
        
        Employee emp1 = new Employee("Bob");
        Employee emp2 = new Employee("Din");
        Employee emp3 = new Employee("Sam");
        Employee emp4 = new Employee("Sam");

        Stream<Employee> employeeStream = Stream.of(emp1, emp2, emp3, emp4);

        Optional<String> mostPopular = mostPopularName(employeeStream);
        mostPopular.ifPresent(name -> System.out.println("Most Popular Name: " + name));
    }

}
