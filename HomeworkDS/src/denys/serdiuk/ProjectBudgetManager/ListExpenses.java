package denys.serdiuk.ProjectBudgetManager;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListExpenses {
    public static String listExpenses() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> purchases = new ArrayList<>();
        double total = 0;
        String regex = "\\$([0-9]+(\\.[0-9]{1,2})?)";

        Pattern pattern = Pattern.compile(regex);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            purchases.add(line);
        }
        for (String purchase : purchases) {
            if (purchase.isEmpty()) continue;
            System.out.println(purchase);
            purchase = purchase.trim();
            Matcher matcher = pattern.matcher(purchase);
            while (matcher.find()) {
                String nums = matcher.group(1);
                total += Double.parseDouble(nums);
            }
        }
        return "Total: $" + total;
    }
}
