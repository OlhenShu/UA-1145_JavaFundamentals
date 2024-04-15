package edu14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public record Person(int age, String name) {
}

class PersonTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(54, "Alice"));
        persons.add(new Person(18, "Bob"));
        persons.add(new Person(32, "Dave"));
        persons.add(new Person(28, "Charlie"));

        persons.stream()
                .reduce((p1, p2) -> p1.age() > p2.age() ? p1 : p2)
                .ifPresent(System.out::println);

        Person result = persons.stream()
                .reduce(new Person(0, ""), (p1, p2) -> new Person(p1.age() + p2.age(), p1.name() + p2.name()));
        System.out.println("Age and names of all persons is " + result);

        Integer ageSum = persons.stream()
                .reduce(0, (sum, p) -> sum + p.age(), Integer::sum);
        System.out.println("Age of all persons is " + ageSum);

        List<String> list = Arrays.asList("Start", "Ok", "Third", "Ok");

        Map<String, Integer> result1 = list.stream()
                .collect(toMap(Function.identity(), String::length, (item, identicalItem) -> item));
        System.out.println(result1);

    }
}