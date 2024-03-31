package edu04.Hometask04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task02 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter three numbers");

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(SCANNER.nextInt());
        myNumbers.add(SCANNER.nextInt());
        myNumbers.add(SCANNER.nextInt());
        Collections.sort(myNumbers);

        System.out.println("The smallest number is " + myNumbers.get(0));
        System.out.println("The biggest number is " + myNumbers.get(2));
    }
}