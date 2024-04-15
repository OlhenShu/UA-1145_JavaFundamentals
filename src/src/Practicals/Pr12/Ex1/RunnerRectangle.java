package Practicals.Pr12.Ex1;

public class RunnerRectangle {

    public static void main(String[] args) {

        Rectangle r1 = Rectangle.createRectangle();

        try {
            System.out.println("The square of rectangle is " + r1.squareRectangle());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
