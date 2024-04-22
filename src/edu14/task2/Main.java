package edu14.task2;

import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("Vitalii"),
                new Employee("Ann"),
                new Employee("Vitalii"),
                new Employee("Ann")
        );

        Optional<String> mostPopularName = mostPopularName(employees);
        mostPopularName.ifPresent(System.out::println);
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCountMap = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        if (nameCountMap.isEmpty()) {
            return Optional.empty();
        }

        OptionalLong maxCount = nameCountMap.values().stream().mapToLong(Long::valueOf).max();

        Map<String, Long> maxCountEntries = nameCountMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(maxCount.orElse(0L)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        String result = String.join(" ", maxCountEntries.keySet());

        return Optional.of(result);

    }
}