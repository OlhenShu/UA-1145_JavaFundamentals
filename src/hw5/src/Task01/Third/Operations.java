package Task01.Third;

import java.util.Arrays;

public class Operations {
    private static int[] number = new int[5];

    public static void arrayNumberFill() {
        System.out.println("Please enter 5 integer numbers to fill an array");
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
            number[i] = Main.SCANNER.nextInt();
        }
        System.out.println("Given array: " + Arrays.toString(number));
    }

    public static void secondNumberPosition() {
        int positionCount = 0;
        int secondPosition = -1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                positionCount++;
                if (positionCount == 2) {
                    secondPosition = i + 1;
                    break; // no need to continue iterating when the second positive number is found
                }
            }
        }
        if (secondPosition != -1) {
            System.out.println("Position of second positive number is: " + secondPosition);
        } else {
            System.out.println("There is no second positive number in the array.");
        }
    }

    public static int minimalValue() {
        int[] sortedArray = Arrays.copyOf(number, number.length);
        Arrays.sort(sortedArray);
        System.out.println("Minimal number is: " + sortedArray[0]);
        return sortedArray[0];
    }

    public static int productOfAllEvenNumbers() {
        int product = 1;
        boolean foundEven = false;
        for(int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 0 && number[i] != 0) {
                foundEven = true;
                product *= number[i];
            }
        }
        if(foundEven) {
            System.out.println("Product of all even numbers is: " + product);
        } else {
            product = 0; // set product to 0 if there are no even numbers
            System.out.println("There is no even number in array");
        }
        return product;
    }

    public static int[] getNumber() {
        return number;
    }

    public static void setNumber(int[] number) {
        Operations.number = number;
    }
}
