package homework_edu05.Homework05.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoNumbersTest {

    @Test
    void sumOfPositives() {
        double[] numbers = {2.5, 1.5};
        double expectedSum = 4.0;
        assertEquals(expectedSum, SumOfTwoNumbers.sumOfTwo(numbers));
    }
    @Test
    void sumOfNegatives() {
        double[] numbers = {-2.5, -1.5};
        double expectedSum = -4.0;
        assertEquals(expectedSum, SumOfTwoNumbers.sumOfTwo(numbers));
    }
    @Test
    void sumOfDifferent() {
        double[] numbers = {2.5, -1.5};
        double expectedSum = 1.0;
        assertEquals(expectedSum, SumOfTwoNumbers.sumOfTwo(numbers));
    }
}