package homeworks.homework_edu13.Practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 5, 1, 7, 8, 2, 9, 4, 6, 5));

        Predicate<Integer> predicate = num -> num % 2 == 0;

        System.out.println("Result is: " + result(integerList, predicate));


    }

    public static int result(List<Integer> integerList, Predicate<Integer> predicate) {
        int res = 0;
        for (Integer num : integerList) {
            if (predicate.test(num)) {
                res++;
            }
        }
        return res;


    }
}
