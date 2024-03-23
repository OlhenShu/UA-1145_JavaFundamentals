package homeWork5.practicalTask;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    private static final Scanner sc = new Scanner(System.in);

    private final String[] stringArray = new String[5];
    private final int[] intArray = new int[5];

    private void readStringInputs() {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Please enter " + (i + 1) + " value:");
            stringArray[i] = ArrayOperations.sc.nextLine();
        }
    }

    private void readIntInputs() {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Please enter " + (i + 1) + " number:");
            intArray[i] = ArrayOperations.sc.nextInt();
        }
    }

    private void sortAndPrintStrings(String[] arr) {
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Here is the sorted list of your inputs ->> " + Arrays.toString(arr));
    }

    private double calculateIntAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public void sortStringInputs() {
        System.out.println("Please enter the 5 words: ");
        readStringInputs();
        sortAndPrintStrings(stringArray);
    }

    public void printIntAverage() {
        System.out.println("Please enter the 5 numbers: ");
        readIntInputs();
        System.out.println("The average value of entered numbers is ->> " +
                calculateIntAverage(intArray));
    }

    public void findAndCountString(Scanner scanner) {
        System.out.println("Enter a word to check its presence in the list: ");
        String inputValue = scanner.nextLine();
        int count = 0;
        for (String value : stringArray) {
            if (inputValue.equalsIgnoreCase(value)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("The word \"" + inputValue + "\" is present in the list " +
                    count + " times.");
        } else {
            System.out.println("The word \"" + inputValue + "\" is not present in the list.");
        }
    }

}

class RunArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperations arrayOperations = new ArrayOperations();
        arrayOperations.sortStringInputs();
        arrayOperations.printIntAverage();
        arrayOperations.findAndCountString(sc);

    }
}