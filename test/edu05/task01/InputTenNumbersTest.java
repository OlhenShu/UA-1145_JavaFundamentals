package edu05.task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTenNumbersTest {
InputTenNumbers numbers  =new  InputTenNumbers();


    @Test
    void testCheckIfFirstFivePositive() {
    assertEquals(true,numbers.checkIfFirstFivePositiveN(new int[]{1, 2, 3, 4, 5}));
        assertEquals(true,numbers.checkIfFirstFivePositiveN(new int[]{1, 2, 3, 4, 5, -1, -2, -3, -4, -5}));

    } @Test
    void firstFivePositiveInconsistency() {
    assertEquals(false,numbers.checkIfFirstFivePositiveN(new int[]{1, -2, 3, 4, 5}));
    assertEquals(false,numbers.checkIfFirstFivePositiveN(new int[]{1, 0, 3, 4, 5}));
        assertEquals(false,numbers.checkIfFirstFivePositiveN(new int[]{0, 0, 0, 0, 0}));

    }

    @Test
    void testCheckIfSecondFiveNegative() {
        assertEquals(true,numbers.checkIfSecondFiveNegativeN(new int[]{0, 0, 0, 0, 0, -1, -2, -3, -4, -5}));
        assertEquals(true,numbers.checkIfSecondFiveNegativeN(new int[]{-1, 2, 3, 4, 5, -2, -2, -2, -2, -2}));
        assertEquals(false,numbers.checkIfSecondFiveNegativeN(new int[]{2, 2, 2, 2, 2, -2, -2, -2, -2, 1}));
    }
    @Test
    void testCheckIfSecondFiveNegativeNotPossible() {
        assertEquals(true,numbers.checkIfSecondFiveNegativeN(new int[]{1, 2, 3, 4, 5, -1, -2, -3, -4, -5}));

    }
    @Test
    void secondFiveNegativeInconsistency() {
        assertEquals(false,numbers.checkIfSecondFiveNegativeN(new int[]{1, 2, 3, -4, 5, -1, -2, 3, -4, -5}));
        assertEquals(false,numbers.checkIfSecondFiveNegativeN(new int[]{1, 2, 3, -4, 5, 1, 2, 3, 4, 5}));
        assertEquals(false,numbers.checkIfSecondFiveNegativeN(new int[]{1, 2, 3, -4, 5, 0, 0, 0, 0,0    }));
        assertEquals(false,numbers.checkIfSecondFiveNegativeN(new int[]{1, 2, 3, -4, 5, -0, 0, 3, -4, -5}));

    }

   @Test
    void testSumOfFirstFivePositive() {
        assertEquals(15,numbers.sumOfFirstFivePositiveN(new int[]{1, 2, 3, 4, 5, -1, -2, -3, -4, -5}));
        assertEquals(10,numbers.sumOfFirstFivePositiveN(new int[]{2, 2, 2, 2, 2, -1, -2, -3, -4, -5}));
    }
    @Test
    void testProductOfSecondFiveNegative() {
        assertEquals(-120,numbers.productOfSecondFiveNegativeN(new int[]{1, 2, 3, 4, 5, -1, -2, -3, -4, -5}));
        assertEquals(-32,numbers.productOfSecondFiveNegativeN(new int[]{1, 2, 3, 4, 5, -2, -2, -2, -2, -2}));
        assertEquals(16,numbers.productOfSecondFiveNegativeN(new int[]{2, 2, 2, 2, 2, -2, -2, -2, -2, 1}));
    }


}