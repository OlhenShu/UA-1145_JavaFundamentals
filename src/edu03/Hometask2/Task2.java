package edu03.Hometask2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        Task2.getSmallest();

    }
    private static int getSmallest() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        System.out.println("Please enter the 1st number:");
        myNumbers.add(scanner.nextInt());
        System.out.println("Please enter the 2d number:");
        myNumbers.add(scanner.nextInt());
        System.out.println("Please enter the 3d number:");
        myNumbers.add(scanner.nextInt());
        Collections.sort(myNumbers);
        System.out.println("The smallest number is " + myNumbers.get(0));
        return myNumbers.get(0);

    }
}
