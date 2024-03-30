package HomeWorks.HW1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleCalculationTest {
    // НЕ змогла створити тести до дз №5, оскільки не зрозуміла як там що робити, тому зробила тільки тест для 1 дз :(
    @BeforeEach
    void setUp() {
        System.out.println("Some words before test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Some words after test");
    }

    @Test
    void findPerimeter() {
        double radius = 10;
        double expected = 62.83185307179586;

        double actual = CircleCalculation.findPerimeter(radius);

        assertEquals(expected, actual);
    }

    @Test
    void findArea() {

        double radius = 10;
        double expected = 314.1592653589793;

        double actual = CircleCalculation.findArea(radius);

        assertEquals(expected, actual);
    }
}