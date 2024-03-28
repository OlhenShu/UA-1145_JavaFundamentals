package Homework_5.Task1;

import Homework_5.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthNumberTest {

    @Test
    void getMonth() {

        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Test for each month
        assertEquals(31, MonthNumber.getMonth(months, 1));
        assertEquals(28, MonthNumber.getMonth(months, 2));
        assertEquals(31, MonthNumber.getMonth(months, 3));
        assertEquals(30, MonthNumber.getMonth(months, 4));
        assertEquals(31, MonthNumber.getMonth(months, 5));
        assertEquals(30, MonthNumber.getMonth(months, 6));
        assertEquals(31, MonthNumber.getMonth(months, 7));
        assertEquals(31, MonthNumber.getMonth(months, 8));
        assertEquals(30, MonthNumber.getMonth(months, 9));
        assertEquals(31, MonthNumber.getMonth(months, 10));
        assertEquals(30, MonthNumber.getMonth(months, 11));
        assertEquals(31, MonthNumber.getMonth(months, 12));
    }
}