package Second;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public static String mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCount = employees.collect(
                Collectors.groupingBy(
                        Employee::getName,
                        Collectors.counting()
                )
        );

        Optional<Map.Entry<String, Long>> maxEntry = nameCount.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return maxEntry.map(Map.Entry::getKey).orElse(null);
    }

    public String getName() {
        return name;
    }

}
