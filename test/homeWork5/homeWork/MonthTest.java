package homeWork5.homeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthTest {

    @Test
    void getNumberOFDays() {
        Month m = new Month();
        assertEquals(31, m.getNumberOFDays());
    }
}