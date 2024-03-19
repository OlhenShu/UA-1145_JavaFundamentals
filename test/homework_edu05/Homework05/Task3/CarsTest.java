package homework_edu05.Homework05.Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @Test
    void bubbleSort() {
        Car[] cars = {
                new Car("Sedan", 2000, 6.0),
                new Car("Sedan", 2000, 2.0),
                new Car("Hatchback", 1999, 1.0),
                new Car("Sedan", 2003, 4.0)
        };

        Car[] expectedSortedCars = {
                new Car("Sedan", 2003, 4.0),
                new Car("Sedan", 2000, 6.0),
                new Car("Sedan", 2000, 2.0),
                new Car("Hatchback", 1999, 1.0)
        };

        Cars.bubbleSort(cars);

        assertEquals(expectedSortedCars, expectedSortedCars);
    }
}