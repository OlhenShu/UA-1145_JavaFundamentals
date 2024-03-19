package homework_edu05.Homework05.Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {

    @Test
    void randomNumbers() {
        GuessNumber guessNumber = new GuessNumber();
        int[] numbers = guessNumber.randomNumbers(5); // Generate 5 random numbers
        assertEquals(5, numbers.length);
        for (int number : numbers) {
            assertTrue(number >= 1 && number <= 50);
        }
    }
}