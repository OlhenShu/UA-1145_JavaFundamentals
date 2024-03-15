package Task01.First;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MonthTest {

    @Before
    public void setUp() {
        Month.monthNumber = 0; // Reset monthNumber before each test
    }

    // Test for January, which has 31 days
    @Test
    public void test_january() {
        Month.monthNumber = 1;
        int expectedDays = 31;
        int actualDays = Month.dayAmountCalculate(2024);
        assertEquals(expectedDays, actualDays);
    }

    // Test for February in a leap year (e.g., 2020), which has 29 days
    @Test
    public void test_february_leap_year() {
        Month.monthNumber = 2;
        int expectedDays = 29;
        int actualDays = Month.dayAmountCalculate(2024);
        assertEquals(expectedDays, actualDays);
    }

    // Test for April, which has 30 days
    @Test
    public void test_april() {
        Month.monthNumber = 4;
        int expectedDays = 30;
        int actualDays = Month.dayAmountCalculate(2024);
        assertEquals(expectedDays, actualDays);
    }

    // Test for December, which has 31 days
    @Test
    public void test_december() {
        Month.monthNumber = 12;
        int expectedDays = 31;
        int actualDays = Month.dayAmountCalculate(2024);
        assertEquals(expectedDays, actualDays);
    }

    // Test for month number 0 (invalid)
    @Test
    public void test_invalid_month_number_zero() {
        Month.monthNumber = 0;
        int actualDays = Month.dayAmountCalculate(2024);
        assertTrue(actualDays < 0);
    }

    // Test for month number greater than 12
    @Test
    public void test_invalid_month_number_greater_than_12() {
        Month.monthNumber = 13;
        int expectedDays = -1; // Define an expected value for an invalid month
        int actualDays = Month.dayAmountCalculate(2024);
        assertEquals(expectedDays, actualDays);
    }
}