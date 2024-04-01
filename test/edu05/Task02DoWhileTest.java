package edu05;

import edu05.task01.InputFiveNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task02DoWhileTest {
    static Task02DoWhile  task02DoWhile = new Task02DoWhile();


    public static void main(String[] args) {

        double num1 = 5.0;
        double num2 = 3.0;
        double expectedSum = 8.0;

        double actualSum = task02DoWhile.calculateSum(num1, num2);

        if (actualSum == expectedSum) {
            System.out.println("Unit test passed!");
        } else {
            System.out.println("Unit test failed. Expected: " + expectedSum + ", Actual: " + actualSum);
        }
    }








    @Test
    void calculateSum() {
        assertEquals(5.0, task02DoWhile.calculateSum(2.0, 3.0));
        assertEquals(0, task02DoWhile.calculateSum(-5.0, 5.0));
    }


}