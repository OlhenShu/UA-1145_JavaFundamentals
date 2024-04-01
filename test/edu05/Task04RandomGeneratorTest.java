package edu05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task04RandomGeneratorTest {
    Task04RandomGenerator randomGenerator = new Task04RandomGenerator();

    @Test
    public void testCorrectGuess() {
        randomGenerator.setTargetNumber(42);
        boolean result = randomGenerator.checkGuess(42);
        assertTrue(result, "Correct guess should return true");

        randomGenerator.setTargetNumber(22);
        boolean result1 = randomGenerator.checkGuess(22);
        assertTrue(result1, "Correct guess should return true");
    }

    @Test
    void testLowerGuess() {
        randomGenerator.setTargetNumber(11);
        boolean result = randomGenerator.checkGuess(5);
        assertFalse(result, "Lower guess should return false");

    }

    @Test
    void testHigherGuess() {
        randomGenerator.setTargetNumber(9);
        boolean result = randomGenerator.checkGuess(98);
        assertFalse(result, "Higher guess should return false");
    }

    @Test
    void testInvalidGuess() {
        randomGenerator.setTargetNumber(28);
        boolean result = randomGenerator.checkGuess(120);
        assertFalse(result, "Invalid guess should return false");
    }

}