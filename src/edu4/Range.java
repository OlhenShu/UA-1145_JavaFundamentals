import java.util.Scanner;

public class Range {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

           float a, b, c;
        boolean range = true;

        System.out.println("Input first number: ");
        a = in.nextFloat();
        System.out.println("Input second number: ");
        b = in.nextFloat();
        System.out.println("Input third number: ");
        c = in.nextFloat();


        if ((a < -5 || a > 5) || (b < -5 || b > 5) || (c < -5 || c > 5)) {
            range = false;
        }

        if (range) {
            System.out.print("All three numbers are included into the range");
        } else {
            System.out.print("Not all numbers belong to the range ");
        }

    }
}