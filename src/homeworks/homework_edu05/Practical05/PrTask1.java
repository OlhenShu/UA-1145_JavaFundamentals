package homework_edu05.Practical05;

import java.util.Arrays;
import java.util.Scanner;

public class PrTask1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Nastia"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        double[] numbers = {5, 6, 18, 20.5, 14, 2, 8};
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("Average = " + average);

        System.out.println("Enter the name to search: ");
        String nameToSearch = SCANNER.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The name " + nameToSearch + " is found.");
        } else {
            System.out.println("The name " + nameToSearch + " is not found.");
        }


        int ix = Arrays.binarySearch(names, nameToSearch);
        System.out.println("Enter the name to search: ");
        nameToSearch = SCANNER.nextLine();
        if (ix >= 0 ) {
            System.out.println("The name " + nameToSearch + " is found.");
        } else {
            System.out.println("The name " + nameToSearch + " is not found.");
        }


    }
}
