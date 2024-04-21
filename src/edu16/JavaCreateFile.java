package edu16;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

class JavaCreateFile {
    public static void main(String[] args) throws IOException {
        Path myPath = Path.of("src/myfile.txt");
//        if (Files.exists(myPath)) {
//            System.out.println("File already exists");
//        } else {
//            Files.createFile(myPath);
//            System.out.println("File created");
//        }
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);
        Files.write(myPath, animals, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        System.out.println("Data written");
    }
}
