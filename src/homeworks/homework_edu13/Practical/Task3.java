package homeworks.homework_edu13.Practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("f", "s", "a", "d", "k"));

//        list.stream().sorted().forEachOrdered(System.out::println);
// or

        list = list.stream().sorted().toList();
        System.out.println("Sorted list: " + list);
    }
}
