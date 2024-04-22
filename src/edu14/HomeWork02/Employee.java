package edu14.HomeWork02;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        // Find the name with the highest count
        Optional<Map.Entry<String, Long>> mostPopularEntry = nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        //  If this stream is empty, Optional.empty should be returned.
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
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    public String getName() {
        return name;
    }
}
