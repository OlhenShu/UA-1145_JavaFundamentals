package Homework_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void isNumbersEqual() {
        // Test when inputNumber equals secretNumber
        assertTrue(Task4.isNumbersEqual(5, 5));

        // Test when inputNumber is greater than secretNumber
        assertFalse(Task4.isNumbersEqual(10, 15));

        // Test when inputNumber is less than secretNumber
        assertFalse(Task4.isNumbersEqual(20, 15));

        // Test when inputNumber is negative
        assertFalse(Task4.isNumbersEqual(30, -5));

        // Test when inputNumber is greater than 100
        assertFalse(Task4.isNumbersEqual(40, 105));

        // Test when secretNumber is negative
        assertFalse(Task4.isNumbersEqual(-10, 50));

        // Test when secretNumber is greater than 100
        assertFalse(Task4.isNumbersEqual(105, 60));
    }
}