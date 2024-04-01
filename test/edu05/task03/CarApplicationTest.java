package edu05.task03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarApplicationTest {
    CarApplication application = new CarApplication();

    // Create an array of Car objects
    static Car[] cars = {
            new Car("Mazda Sedan", 2020, 2.0),
            new Car("Mitsubishi Carer", 2018, 2.5),
            new Car("Hyundai Hatchback", 2019, 1.8),
            new Car("Volkswagen Beetle", 2005, 1.6)
    };

    @Test
    void testCheckYearOfModelTrue() {

        assertEquals(true, application.checkYearOfModel(cars, 2020));
        assertEquals(true, application.checkYearOfModel(cars, 2005));
    }

    @Test
    void testCheckYearFalse() {

        assertEquals(false, application.checkYearOfModel(cars, 2000));
        assertEquals(false, application.checkYearOfModel(cars, 0));
        assertEquals(false, application.checkYearOfModel(cars, -1000));
    }


    @Test
    void testSorting() {
        application.sort(cars);

        assertEquals(2005, cars[0].getYearOfProduction());
        assertEquals(2018, cars[1].getYearOfProduction());
        assertEquals(2019, cars[2].getYearOfProduction());
        assertEquals(2020, cars[3].getYearOfProduction());
    }
}

