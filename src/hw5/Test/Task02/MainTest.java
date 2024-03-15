package Task02;
import Task2.Main;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    // Testing the method using negative integers
    public void test_negative_integer() {
        // prepare input stream with negative integer, a positive integer, and "no" for user choice
        ByteArrayInputStream inputStream = new ByteArrayInputStream("-5\n3\nno\n".getBytes());
        System.setIn(inputStream);

        // redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // run the main method
        Main.main(new String[]{});

        // normalize line separators in expected and actual output
        String expected = "Enter two numbers to calculate their sum" + System.lineSeparator() +
                "Please, enter first number" + System.lineSeparator() +
                "Please, enter second number" + System.lineSeparator() +
                "Sum of the two given numbers is equal -2" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "Do you want to perform the operation again? Enter yes or no" + System.lineSeparator() +
                "Good luck!" + System.lineSeparator();
        String actual = outputStream.toString();

        // verify that the output matches the expected output
        assertEquals(expected, actual);
    }

    // Testing the method using positive integers
    @Test
    public void test_valid_integers_sum() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("5\n3\nno\n".getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[]{});

        String expectedOutput = "Enter two numbers to calculate their sum" + System.lineSeparator() +
                "Please, enter first number" + System.lineSeparator() +
                "Please, enter second number" + System.lineSeparator() +
                "Sum of the two given numbers is equal 8" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "Do you want to perform the operation again? Enter yes or no" + System.lineSeparator() +
                "Good luck!" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    // Testing perform operation of the method
    @Test
    public void test_perform_operation_again() {
        String input = "5\n3\nyes\n2\n4\nno\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String expectedOutput = "Enter two numbers to calculate their sum" + System.lineSeparator() +
                "Please, enter first number" + System.lineSeparator() +
                "Please, enter second number" + System.lineSeparator() +
                "Sum of the two given numbers is equal 8" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "Do you want to perform the operation again? Enter yes or no" + System.lineSeparator() +
                "Enter two numbers to calculate their sum" + System.lineSeparator() +
                "Please, enter first number" + System.lineSeparator() +
                "Please, enter second number" + System.lineSeparator() +
                "Sum of the two given numbers is equal 6" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "Do you want to perform the operation again? Enter yes or no" + System.lineSeparator() +
                "Good luck!" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }

}