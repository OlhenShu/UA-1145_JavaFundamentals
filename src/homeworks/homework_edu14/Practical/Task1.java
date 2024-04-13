package homeworks.homework_edu14.Practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        Stream<String> stream = list.stream();

        long count = stream.filter(String::isEmpty)
                .count();
        System.out.println("Count of empty strings: " + count);

        List<String> filtered = list.stream()
                .filter(string -> !string.isEmpty())
                .toList();
        System.out.println("List after removing all empty strings: " + filtered);

        String filtered1 = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Uppercase strings joined with comma: " + filtered1);


    }
}
