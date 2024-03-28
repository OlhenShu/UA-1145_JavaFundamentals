package Homework_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2Test {

    @Test
    public void testSumOfInts() {
        int num1 = 7;
        int num2 = -5;

        int expectedResult = num1 + num2;
        int actualResult = Task2.sumOfInts(num1, num2);

        assertEquals(expectedResult, actualResult);
    }
}