package Practicals.Pr14.Ex2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatRunner {
    public static void main(String[] args) {

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics stat = primes.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stat);

        long count = primes.size();
        System.out.println("Count: " + count);

        int sum = primes.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        long prod = primes.stream().filter(x -> x < 10)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + prod);

        int max = primes.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Max: " + max);

        int min = primes.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Min: " + min);

        double avg = stat.getAverage();
        System.out.println("Average: " + avg);


    }
}
