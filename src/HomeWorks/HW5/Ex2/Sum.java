package HomeWorks.HW5.Ex2;

import static HomeWorks.HW5.Ex2.DoWhileLoop.SCANNER;

public class Sum {

    public static void sumOfTwoNumbs() {

        System.out.println("Input here 2 numbers.");
        System.out.print("The first number: ");
        int numb1 = SCANNER.nextInt();
        System.out.print("The second number: ");
        int numb2 = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.println("The sum of these two number is " + (numb1 + numb2));
    }
}
