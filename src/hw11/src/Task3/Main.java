package Task3;

import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the sentence with US format dollar sign ($)" +
                " followed by any number of digits, a dot, and two digits after the dot: ");
        String string = scanner.nextLine();
        USFormatMatcher.findUSCurrency(string);
    }
}
