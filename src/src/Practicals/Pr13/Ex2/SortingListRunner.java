package Practicals.Pr13.Ex2;

import java.util.ArrayList;
import java.util.List;

public class SortingListRunner {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Peter");
        names.add("Sarah");
        names.add("Mark");
        names.add("Alice");
        names.add("John");

        System.out.println(names);

        names.sort(String::compareToIgnoreCase);
        System.out.println(names);
    }
}
