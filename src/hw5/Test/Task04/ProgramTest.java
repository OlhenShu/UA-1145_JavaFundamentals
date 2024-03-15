package Task04;

import Task4.Program;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ProgramTest {

    //  Testing generator of a random number between 0 and 9.
    @Test
    public void test_generateRandomNumber() {
        int randomNumber = Program.generateRandomNumber();
        assertTrue(randomNumber >= 0 && randomNumber <= 10);
    }


    // Testing what happens if number will be negative
    @Test
    public void test_findNumber_negativeNumber() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ByteArrayInputStream inContent = new ByteArrayInputStream("-5".getBytes());
        System.setIn(inContent);

        assertThrows(IllegalArgumentException.class, () -> Program.findNumber(5));
    }

    // Testing what happens if number will be higher than 9
    @Test
    public void test_findNumber_Higher9() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ByteArrayInputStream inContent = new ByteArrayInputStream("17".getBytes());
        System.setIn(inContent);

        assertThrows(IllegalArgumentException.class, () -> Program.findNumber(7));
    }

}