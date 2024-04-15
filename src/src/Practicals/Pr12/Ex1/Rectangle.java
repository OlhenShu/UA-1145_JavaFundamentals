package Practicals.Pr12.Ex1;

import java.util.Scanner;

public class Rectangle {
    public static final Scanner SCANNER = new Scanner(System.in);

    private int height;
    private int width;

    private Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static Rectangle createRectangle() {
        System.out.println("Input a height of rectangle.");
        int height = inputCorrectNumber();

        System.out.println("Input a width of rectangle.");
        int width = inputCorrectNumber();

        return new Rectangle(height, width);
    }

    private static int inputCorrectNumber() {
        String a = "";
        String regex = "(^-?\\d+$)";

        boolean is_correct = false;

        while (!is_correct) {
            System.out.print("Input here number greater than zero: ");
            a = SCANNER.nextLine();
            is_correct = a.matches(regex);
        }
        return Integer.parseInt(a);
    }

    public int squareRectangle() {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException("The side of the rectangle must be greater than zero!");
        }
        return (height * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}