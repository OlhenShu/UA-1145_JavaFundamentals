package Task01.Third;

import Task01.Third.Operations;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OperationsTest {

    // Testing method "minimalValue" should return the smallest number in array
    @Test
    public void test_minimal_value() {
        Operations.setNumber(new int[]{5, 2, 3, 1, 4});
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Operations.minimalValue();
        assertEquals("Minimal number is: 1", out.toString().trim());
    }


    // Testing 'productOfAllEvenNumbers' method should return the product of all even numbers in the array.
    @Test
    public void test_product_of_all_even_numbers() {
            Operations.setNumber(new int[]{1, 2, 3, 4, 5});
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outputStream));

            Operations.productOfAllEvenNumbers();
            System.setOut(originalOut);
            assertEquals("Product of all even numbers is: 8", outputStream.toString().trim());
        }

        // Testing "secondNumberPosition()" method should return position of second positive integer in the array.
    @Test
    public void test_second_number_position() {
        Operations.setNumber(new int[]{5, -2, 3, 1, 4});
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Operations.secondNumberPosition();
        System.setOut(originalOut);
        assertEquals("Position of second positive number is: 3", outputStream.toString().trim());
    }

}
