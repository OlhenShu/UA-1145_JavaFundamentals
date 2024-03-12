package edu04;

import java.util.Scanner;

public class CheckRangeForThreeNumbers {
    final static int MIN_RANGE = -5;
    final static int MAX_RANGE = 5;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        float first, second, third;//don't write variables in one line
        boolean check = true;

        System.out.print("Please input first number: ");
        first = in.nextFloat();
        System.out.print("Please input second number: ");
        second = in.nextFloat();
        System.out.print("Please input third number: ");
        third = in.nextFloat();
        in.close();//don't need if u use scanner how field

        if ((first < -5 || first > 5) || (second < -5 || second > 5) || (third < -5 || third > 5)) {
            check = false;
        }
        //try don't use concrete numbers for range and use variables
        //I created two variables for range
        //and now your if statement looks like this
        //if ((first < MIN_RANGE || first > MAX_RANGE) || (second < MIN_RANGE || second > MAX_RANGE) || (third < MIN_RANGE || third > MAX_RANGE)) {...}

        if (check) {
            System.out.print("All three numbers are included into the range");
        } else {
            System.out.print("At least one of three numbers is not included into the range");
        }

    }
}
