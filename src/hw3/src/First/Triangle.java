package First;

import java.util.Locale;

import static First.Main.SCANNER;
public class Triangle {
    private static int firstSide;
    private static int secondSide;
    private static int thirdSide;
    public static void input() {
        Locale.setDefault(Locale.ROOT);
        System.out.println("Input side 1: ");
        firstSide = SCANNER.nextInt();
        System.out.println("Input side 2: ");
        secondSide = SCANNER.nextInt();
        System.out.println("Input side 3: ");
        thirdSide = SCANNER.nextInt();
        System.out.println(" ");
    }

    // check if the triangle can be created using the triangle existence rule
    public static void triangleExistence() {
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            System.out.println("This triangle can be created");
            System.out.println(" ");
        } else {
            System.out.println("Triangle can't be created");
            // exiting the program with status code 0 (indicating successful termination)
            System.exit(0);
        }
    }


    public static void calculateArea() {
        // finds the half perimeter for using Heron`s formula
        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2.0;

        // finds the area with Heron`s formula
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        System.out.printf("The area of the triangle is: %.2f%n", area);
    }
}
