package edu05.task01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputFiveNumbersTest {
    InputFiveNumbers fiveNumbers = new InputFiveNumbers();

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @Test
    void testFindSecondPositive() {
        assertTrue(fiveNumbers.findSecondPositive(new int[]{1, -2, 3, 4, 5}) == 2);
        assertTrue(fiveNumbers.findSecondPositive(new int[]{1, -2, -3, -4, -5}) == -1);
        assertTrue(fiveNumbers.findSecondPositive(new int[]{-1, -2, -3, 2, 3}) == 4);
    }

    @Test
    void testFindMinValue() {
        assertArrayEquals(new int[]{-2, 0}, fiveNumbers.findMinValue(new int[]{-2, 2, 4, 6, 8}));
        assertArrayEquals(new int[]{-3, 2}, fiveNumbers.findMinValue(new int[]{2, 4, -3, 4, 5}));
        assertArrayEquals(new int[]{-5, 4}, fiveNumbers.findMinValue(new int[]{1, 3, 6, 9, -5}));
        assertArrayEquals(new int[]{-3, 2}, fiveNumbers.findMinValue(new int[]{-1, -2, -3, 2, 3}));
    }

    @Test
    void testCalculateProductOfEvenNumbers() {
        assertEquals(16, fiveNumbers.calculateProductOfEvenNumbers(new int[]{1, 2, 3, 8, -5}));
        assertEquals(8, fiveNumbers.calculateProductOfEvenNumbers(new int[]{1, 2, 0, 4, 5}));
        assertEquals(8, fiveNumbers.calculateProductOfEvenNumbers(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-4, fiveNumbers.calculateProductOfEvenNumbers(new int[]{-1, -2, -3, 2, 3}));

    }

    @Test
    void testMultiplyZero() {
        assertEquals(1, fiveNumbers.calculateProductOfEvenNumbers(new int[]{0, -0, 0, 0, 0}));
        assertEquals(1, fiveNumbers.calculateProductOfEvenNumbers(new int[]{0, 0, 0, 0, 0}));

    }

    @Test
    void testMultiplyWithoutEven() {
        assertEquals(1, fiveNumbers.calculateProductOfEvenNumbers(new int[]{1, 1, 0, 0, 7}));

    }
}