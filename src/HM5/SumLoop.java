package HM5;

import java.util.Objects;
import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {
        int[] array = new int[2];
        SumInTheLoop(array);
    }

    public static void SumInTheLoop(int array[]) {
        Scanner sr = new Scanner(System.in);
        String repeat;
        do {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print("Include the " + (i + 1) + " element of masive: ");
                array[i] = sr.nextInt();
            }
            int sum = array[0] + array[1];
            System.out.println(array[0] + " + " + array[1] + " = " + sum);
            System.out.println("Do you want to perform the operation again? (YES/NO)");
            repeat = sr.next();
        } while (Objects.equals(repeat.toUpperCase(), "YES"));
    }
}
