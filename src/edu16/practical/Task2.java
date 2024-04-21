package edu16.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) throws IOException {
        var file = Path.of("C:\\Users\\oshuty\\Downloads\\pg73411.txt");//my path to file
        // System.out.println(Files.exists(file));
        String vowels = "aeiouy";
        Function<String, Stream<String>> splitter = Pattern.compile("[^a-zA-Z'-]+")::splitAsStream;
        long count = Files.lines(file)
                .flatMap(splitter)
                .filter(w -> !w.isEmpty())
                .filter(w -> vowels.contains(w.substring(0, 1).toLowerCase()))
                //.limit(100)
                //.forEach(System.out::println);
                .count();
        System.out.println(count);

        var wordIterator = Files.lines(file)
                .flatMap(splitter)
                .filter(w -> !w.isEmpty())
                .iterator();

        String prev = wordIterator.next();
        while (wordIterator.hasNext()) {
            String nextWord = wordIterator.next();
            if (nextWord.charAt(0) == prev.charAt(prev.length() - 1)) {
                System.out.println(prev + " " + nextWord);
            }
            prev = nextWord;
        }
    }
}
