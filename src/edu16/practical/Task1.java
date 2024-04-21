package edu16.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) throws IOException {
        var file = Path.of("myfile.txt");
        String[] lines = Files.lines(file).toArray(String[]::new);
        System.out.println("There are " + lines.length + " lines.");
        for (int i = 0; i < lines.length; i++) {
            System.out.format("%2d : %3d : %s%n", i, lines[i].length(), lines[i]);
        }

        System.out.println("*-*".repeat(10));
        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

        System.out.println("*-*".repeat(10));

        Arrays.stream(lines)
                .filter(w -> w.contains("was"))
                .forEach(System.out::println);

        System.out.println("***".repeat(10));

        Arrays.stream(lines)
                .filter(w -> w.trim().startsWith("by"))
                .forEach(System.out::println);
    }
}
