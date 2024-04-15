package edu14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Start", "Ok", "Third", "Fourth");

        Map<String, Integer> result = list.stream()
                .collect(toMap(Function.identity(), String::length));
        System.out.println(result);
    }
}
