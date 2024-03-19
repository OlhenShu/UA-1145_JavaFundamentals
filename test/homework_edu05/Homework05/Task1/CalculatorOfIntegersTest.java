package homework_edu05.Homework05.Task1;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorOfIntegersTest {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @org.junit.jupiter.api.Test
    void ifPositive_AllPositive() {
        int[] numbers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        assertTrue(CalculatorOfIntegers.ifPositive(numbers));
    }

    @org.junit.jupiter.api.Test
    void ifPositive_SomeNegative() {
        int[] numbers = {1, 2, -3, 4, 5, -1, -2, -3, -4, -5};
        assertFalse(CalculatorOfIntegers.ifPositive(numbers));
    }

    @org.junit.jupiter.api.Test
    void ifPositive_AllNegative() {
        int[] numbers = {-1, -2, -3, -4, -5, -1, -2, -3, -4, -5};
        assertFalse(CalculatorOfIntegers.ifPositive(numbers));
    }

    @org.junit.jupiter.api.Test
    void sumOfFirstPositive() {
        int[] numbers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        assertEquals(15, CalculatorOfIntegers.sumOfFirstPositive(numbers));
    }

    @org.junit.jupiter.api.Test
    void productOfTheLast() {
        int[] numbers = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};
        assertEquals(-120, CalculatorOfIntegers.productOfTheLast(numbers));
    }
}