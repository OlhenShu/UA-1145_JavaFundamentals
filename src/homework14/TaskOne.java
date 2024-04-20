package homework14;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskOne {
    private String category;
    private LocalDate manufactureDate;
    private double price;

    public TaskOne(String category, LocalDate manufactureDate, double price) {
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TaskOne{" +
                "category='" + category + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<TaskOne> products = new ArrayList<>();
        for (int i=0; i<20; i++){
            products.add(new TaskOne("Smartphone",
                    LocalDate.now().minusYears(2).plusDays(i),
                    2500+i*200));
        }
        List<TaskOne> productsSorted = products.stream()
                .filter(product->product.getCategory().equals("Smartphone"))
                .filter(product->product.getPrice()>3000)
                .filter(product->product.getManufactureDate().
                        isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(TaskOne::getPrice))
                .toList();
        productsSorted.forEach(System.out::println);
        Stream<Employee> personStream = Stream.of(
          new Employee("Danylo"),
          new Employee("Ivan"),
          new Employee("Mykola"),
          new Employee("Danylo"),
          new Employee("Mykola"),
          new Employee("Mykola")
        );
        Optional<String> popularName = findingPopularName(personStream);
        popularName.ifPresent(System.out::println);
    }
    static Optional<String> findingPopularName(Stream<Employee> employeeStream){
        return employeeStream
                .collect(Collectors.groupingBy(Employee::getName,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
    }
}
class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
