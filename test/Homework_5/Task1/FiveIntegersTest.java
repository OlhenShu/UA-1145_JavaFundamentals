package Homework_5.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiveIntegersTest {

    int[] integerNumbers = {5, -3, 8, 0, 12};
    int arraySize = 5;

    @Test
    void checkPositionOfSecond() {

        int positionOfSecond = FiveIntegers.checkPositionOfSecond(arraySize, integerNumbers);
        assertEquals(2, positionOfSecond);
    }

    @Test
    void getMinimumValue() {
        int minValue = FiveIntegers.getMinimumValue(arraySize, integerNumbers);
        assertEquals(-3, minValue);
    }

    @Test
    void getPositionOfMin() {
        int positionOfMin = FiveIntegers.getPositionOfMin(arraySize, integerNumbers, -3);
        assertEquals(1, positionOfMin);
    }

    @Test
    void getProductOfEven() {
        int product = FiveIntegers.getProductOfEven(arraySize, integerNumbers);
        assertEquals(96, product);
    }
}