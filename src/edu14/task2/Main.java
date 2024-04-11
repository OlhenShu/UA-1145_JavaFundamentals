package edu14.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Bob");
        Employee empl2 = new Employee("Din");
        Employee empl3 = new Employee("Sam");
        Employee empl4 = new Employee("Sam");

        List<Employee> employees = Arrays.asList(empl1, empl2, empl3, empl4);

        Optional<String> mostPopular = mostPopularName(employees.stream());
        mostPopular.ifPresent(System.out::println);
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCounts.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}
