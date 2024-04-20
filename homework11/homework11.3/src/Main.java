import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing US currency format:");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");

        Matcher matcher = pattern.matcher(text);

        System.out.println("US currency format occurrences:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}
