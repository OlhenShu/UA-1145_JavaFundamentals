package edu16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOExample {
    public static void main(String[] args) throws IOException {
        //old example
//        var br = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("test.txt")));
//        String line = null;
//        while ((line = br.readLine()) != null){
//            System.out.println(line);
//        }

//        var br = new BufferedReader(
//                new FileReader("test.txt")
//        );
//        var br = Files.newBufferedReader(Path.of("test.txt"));
//        br.lines().forEach(System.out::println);

        try (var stream = Files.lines(Path.of("test.txt"))) {
            stream.forEach(System.out::println);
        }


    }
}
