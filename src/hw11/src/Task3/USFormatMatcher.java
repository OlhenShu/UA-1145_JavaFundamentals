package Task3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USFormatMatcher {
    public static void findUSCurrency(String text) {
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
