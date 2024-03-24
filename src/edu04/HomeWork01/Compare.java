package edu04.HomeWork01;

import java.util.Scanner;

import static java.lang.System.in;

public class Compare {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        Scanner scan = new Scanner(in);
        System.out.println("Please, enter the first float numbers: ");
        num1 = scan.nextFloat();
        System.out.println("Please, enter the second float numbers: ");
        num2 = scan.nextFloat();
        System.out.println("Please, enter the third float numbers: ");
        num3 = scan.nextFloat();


        if (num1 >= -5 && num1 <= 5f && num2 >= -5 && num2 <= 5f && num3 >= -5 && num3 <= 5f) {
            System.out.println("All number belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }

    }
}
// Recommendation: Utilize constants for defining range boundaries.
// Implementing constants for boundaries, such as MIN_VALUE and MAX_VALUE, enhances code maintainability and readability.
// This practice is particularly beneficial if the boundary values are used in multiple places within the code or if there's
// a chance they will need to be updated in the future. By using constants, any changes to these values can be made in a single place,
// simplifying updates and reducing the risk of errors. Moreover, constants make the code clearer by providing descriptive names
// for the boundary values, making the logic behind condition checks more understandable at a glance.
/*
import java.util.Scanner;

public class Compare {
    // Constants for the range boundaries
    private static final float MIN_VALUE = -5f;
    private static final float MAX_VALUE = 5f;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please, enter the first float number: ");
        float num1 = scan.nextFloat();

        System.out.println("Please, enter the second float number: ");
        float num2 = scan.nextFloat();

        System.out.println("Please, enter the third float number: ");
        float num3 = scan.nextFloat();

        // Check if all numbers fall within the specified range
        if (num1 >= MIN_VALUE && num1 <= MAX_VALUE &&
            num2 >= MIN_VALUE && num2 <= MAX_VALUE &&
            num3 >= MIN_VALUE && num3 <= MAX_VALUE) {
            System.out.println("All numbers belong to the range [" + MIN_VALUE + ", " + MAX_VALUE + "]");
        } else {
            System.out.println("Not all numbers belong to the range [" + MIN_VALUE + ", " + MAX_VALUE + "]");
        }
    }
}

 */