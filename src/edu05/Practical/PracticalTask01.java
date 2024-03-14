package edu05.Practical;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTask01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Jack"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names); //binarySearch does not work for non sorted arrays
        System.out.println(Arrays.toString(names));

        double[] numbers = {1, 2, 2.5, 3, 5};
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("The average value is: " + average);

        System.out.println("Enter the name to search: ");
        String nameToSearch = SCANNER.nextLine();
//        boolean found = false;
//        for (var name : names) {
//            if (name.equals(nameToSearch)) {
//                found = true;
//                break;
//            }
//        }
//        if (found) {
//            System.out.println("The name '" + nameToSearch + "' is on the list");
//        } else {
//            System.out.println("The name '" + nameToSearch + "' is not found");
//        }

//        System.out.println("Enter the name to search: ");
//        nameToSearch = SCANNER.nextLine();

        int ix = Arrays.binarySearch(names, nameToSearch);
        if (ix >= 0) {
            System.out.println("The name '" + nameToSearch + "' is on the list");
        } else {
            System.out.println("The name '" + nameToSearch + "' is not found");
        }
    }
}
