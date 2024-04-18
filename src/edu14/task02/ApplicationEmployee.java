package edu14.task02;


import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ApplicationEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob", 25, "IT"));
        employees.add(new Employee("Sam", 42, "SALES"));
        employees.add(new Employee("Din", 34, "HR"));
        employees.add(new Employee("Sam", 59, "IT"));

        System.out.println("The class with a duplicated name, if it's present: " +
                mostPopularName(employees.stream()));

    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
//it can be silly, but it works
                .reduce((s, s2) -> s);
    }

}
