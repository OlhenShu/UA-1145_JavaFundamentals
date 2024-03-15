package Task01.Second;

import Task01.Second.IntergerOperations;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntergerOperationsTest {

    // Testing when the array contains a mix of positive and negative numbers.
    @Test
    public void test_operations_mixedNumbers() {
        int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        IntergerOperations.setNumber(numbers);
        int result = IntergerOperations.operations();
        assertEquals(-30240, result);
    }

    // Testing when all numbers are zero.
    @Test
    public void test_operations_allZeros() {
        int[] numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        IntergerOperations.setNumber(numbers);
        int result = IntergerOperations.operations();
        assertEquals(0, result);
    }

    // Testing when the array contains both positive and negative numbers, but the product of negative numbers is 0.
    @Test
    public void test_operations_zeroProduct() {
        int[] numbers = {-1, -2, -3, -4, -5, 0, 1, 2, 3, 4};
        IntergerOperations.setNumber(numbers);
        int result = IntergerOperations.operations();
        assertNotEquals(15, result);
    }

    // Testing when all numbers are the same positive number.
    @Test
    public void test_operations_samePositiveNumbers() {
        int[] numbers = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        IntergerOperations.setNumber(numbers);
        int result = IntergerOperations.operations();
        assertEquals(25, result);
    }

    // Testing when all numbers are the same negative number.
    @Test
    public void test_operations_sameNegativeNumbers() {
        int[] numbers = {-5, -5, -5, -5, -5, -5, -5, -5, -5, -5};
        IntergerOperations.setNumber(numbers);
        int result = IntergerOperations.operations();
        assertEquals(-3125, result);
    }
}
