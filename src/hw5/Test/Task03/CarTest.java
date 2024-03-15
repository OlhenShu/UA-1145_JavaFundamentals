package Task03;

import Task3.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    // Testing creation of the object with valid paramaters
    @Test
    public void test_createCarWithValidParameters() {
        Car car = new Car("Sedan", 2000, 1.8);
        assertNotNull(car);
    }

    // Testing creation of the object with invalid paramaters, should return exceptions
    @Test
    public void test_createCarWithInvalidParameters() {
        assertThrows(IllegalArgumentException.class, () -> new Car(null, 2004, 2.0));
        assertThrows(IllegalArgumentException.class, () -> new Car("Sedan", -1999, 1.5));
        assertThrows(IllegalArgumentException.class, () -> new Car("Truck", 2004, -2.0));
    }

    // Testing sorting by year of production, should return the array of objects
    @Test
    public void testSortByYear() {
        Car car1 = new Car("Sedan", 2015, 2.0);
        Car car2 = new Car("SUV", 2018, 3.5);
        Car car3 = new Car("Hatchback", 2010, 1.6);
        Car car4 = new Car("Convertible", 2019, 2.5);

        Car[] sortedCars = Car.sortByYear(car1, car2, car3, car4);

        assertEquals(car3, sortedCars[0]);
        assertEquals(car1, sortedCars[1]);
        assertEquals(car2, sortedCars[2]);
        assertEquals(car4, sortedCars[3]);
    }

    // Testing toString method of the object
    @Test
    public void test_toStringMethod() {
        Car car = new Car("Coupe", 2004, 2.0);
        String expected = "\nCartype: Coupe\nYear of production: 2004\nEngine сapacity: 2.0";
        assertEquals(expected, car.toString());
    }

    //can you help and describe how to test "certainModel" method?
}
