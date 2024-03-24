package edu05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calc = new Calculator();

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @Test
    void addPositiveNumber() {
        //assertTrue(calc.add(1, 3) == 4);
        assertEquals(4, calc.add(1, 3));
    }

    @Test
    void addNegativeNumber() {
        //assertTrue(calc.add(1, 3) == 4);
        assertEquals(-4, calc.add(-1, -3));
    }

    @Test
    void div() {
        int actual = 2;
        int expected = calc.div(7, 3);
        assertEquals(actual, expected);
    }

    @Test
    void testDivZero() {
        Exception trown = Assertions.assertThrows(Exception.class, () -> {
            int actual = calc.div(5, 0);
        });
    }
}