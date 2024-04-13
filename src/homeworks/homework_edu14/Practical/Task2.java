package homeworks.homework_edu14.Practical;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        long count = primes.size();
        System.out.println("Count of the List: " + count);

        IntSummaryStatistics stats = primes.stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());

    }
}
