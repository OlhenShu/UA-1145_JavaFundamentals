package Second;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Employee> stream = Stream.of(
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Max"),
                new Employee("Zack"),
                new Employee("Sam"),
                new Employee("Anna"),
                new Employee("Sam")
        );
        System.out.println(Employee.mostPopularName(stream));
    }
}
