package HomeWorks.HW11.Ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunnerFindMoney {

    public static void main(String[] args) {
        String text = "I have $10000.00. Mary has $555.00. We have 2.00 cats. Bob has $546464.22222";

        Pattern pattern = Pattern.compile("(\\$(\\d+)\\.(\\d{2}\\b))");
        Matcher matcher = pattern.matcher(text);

        System.out.print("We find such amounts of money: ");
        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end())
                    + " starts at the index " + matcher.start() + " and finish at index " + matcher.end() + " * ");
        }

    }
}
