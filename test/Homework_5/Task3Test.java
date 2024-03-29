package Homework_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    Car[] cars = {
            new Car("Truck", 2019, 5.0),
            new Car("Compact", 2017, 1.2),
            new Car("Sports Car", 2021, 4.0),
            new Car("Van", 2019, 3.0),
            new Car("Sedan", 2021, 2.5),
    };

    @Test
    void isFound() {

        // Test when car is found
        assertTrue(Task3.isFound(cars, 2019));

        // Test when car is not found
        assertFalse(Task3.isFound(cars, 2000));
    }

    @Test

    void sortCars() {

        Task3.sortCars(cars);

        // Check if cars are sorted in ascending order by year
        for (int i = 0; i < cars.length - 1; i++) {
            assertTrue(cars[i].getYear() <= cars[i + 1].getYear());
        }
    }
}