package edu13;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "c", "b", "d");
        list.sort(String::compareTo);

        Predicate<Integer> isEven = num -> num % 2 == 0;

        int num1 = 10;
        int num2 = 5;
        System.out.println(isEven.test(num1));
        System.out.println(isEven.test(num2));

        //Function
        Function<Integer, Double> celsiumToFahrenheit =
                x -> Double.valueOf((x * 9 / 5.0) + 32);
        System.out.println(celsiumToFahrenheit.apply(27));

        Consumer<String> printNames = System.out::println;
        String[] names = {"Alice", "Bob", "Charley"};

        for (String str : names) {
            printNames.accept(str);
        }

        Supplier<UUID> genID = UUID::randomUUID;
        System.out.println(genID.get());

    }
}
