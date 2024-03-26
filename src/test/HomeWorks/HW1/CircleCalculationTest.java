package HomeWorks.HW1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleCalculationTest {
    // НЕ змогла створити тести до дз №5, оскільки неи зрозуміла як там що робити, тому зробила тільки тест для 1 дз :(

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
        double perimeter = 2 * radius * Math.PI;
        assertEquals(perimeter, 62.83185307179586);
    }

    @Test
    void findPerimeterZero() {
        double radius = 0;
        double perimeter = 2 * radius * Math.PI;
        assertEquals(perimeter, 0);
    }

    @Test
    void findArea() {
        double radius = 10;
        double area = Math.pow(radius, 2) * Math.PI;
        assertEquals(area, 314.1592653589793);
    }

    @Test
    void findZero() {
        double radius = 0;
        double area = Math.pow(radius, 2) * Math.PI;
        assertEquals(area, 0);
    }

}