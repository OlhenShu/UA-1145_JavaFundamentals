package edu05.task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysInMonthTest {
    DaysInMonth daysInMonth = new DaysInMonth();

    @Test
    void checkYourMonth() {
        assertTrue(daysInMonth.checkYourMonth(1) == 31.0);
        assertTrue(daysInMonth.checkYourMonth(2) == 28.5);
        assertTrue(daysInMonth.checkYourMonth(3) == 31.0);

    }
}