package edu14;

import java.util.Arrays;
import java.util.List;

public class ExampleOfStream {
    public static void main(String[] args) {
        List<String> strings = List.of("", "abc", "  ", "bca", "flc", "");
        List<String> filtered = strings.stream()
                .filter(str -> !str.isEmpty())
                //.collect(Collectors.toList());
                .toList();
        //System.out.println(filtered);
        //System.out.println(strings);

//        Random rand = new Random();
//        rand.ints()
//                .limit(20)
//                .sorted()
//                .forEach(System.out::println);

        List<String> string = Arrays.asList("abc", "", "eg", "abcd", "", "jkl");
        // get count of empty string
        long count = strings.stream()
                .filter(String::isEmpty)
                .count();
        // System.out.println(count);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 7, 3);
        int result = numbers.stream()
                .reduce(0, Integer::sum);
        numbers.parallelStream()
                .forEach(num -> System.out.println(num + " " + Thread.currentThread().getName()));
        // System.out.println(result);

        List<String> names = Arrays.asList("Anna", "Bob", "Charley");
        String res = names.stream()
                .reduce((name1, name2) -> name1 + "; " + name2)
                .orElse("");

        //System.out.println(res);


    }
}
