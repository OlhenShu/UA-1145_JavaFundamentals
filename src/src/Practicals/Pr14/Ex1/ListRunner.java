package Practicals.Pr14.Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListRunner {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        long emptyStrings = list.stream()
                .filter(String::isEmpty)
                .count();

        System.out.println("Empty strings: " + emptyStrings);
        System.out.println();

        List<String> filteredList = list.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Filtered list: " + filteredList);
        System.out.println();

        String listAsString = list.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining("; "));

        System.out.println("List as string: " + listAsString);


    }
}
