package Homework_5.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenIntegersTest {

    @Test
    void calculateSum() {
        assertEquals( 15, TenIntegers.calculateSum(new int[]{1, 2, 3, 4, 5, 6, 4, -6, 3, 5}, 5));
    }

    @Test
    void calculateProduct() {
        assertEquals( -2160, TenIntegers.calculateSum(new int[]{1, 2, 3, 4, 5, 6, 4, -6, 3, 5}, 5));
    }
}