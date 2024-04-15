package homeWork14;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostPopularEntry = nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        return mostPopularEntry.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopularName = mostPopularName(employeeStream);
        mostPopularName.ifPresent(System.out::println);
    }
}
